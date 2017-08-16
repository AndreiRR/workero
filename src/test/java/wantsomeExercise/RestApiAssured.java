package wantsomeExercise;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.Is.is;

public class RestApiAssured {

    // use this in Swagger to create a Pet resource before running these tests

    String createPetBody = "{ \"id\": 12345, \"category\": { \"id\": 54321, \"name\": \"WantsomeCategory\" }, " +
            "\"name\": \"wantsomeDog\", \"photoUrls\": [ \"http://wantsome.ro/img/logos/wantsome.png\" ], \"tags\": [ { \"id\": 123, " +
            "\"name\": \"tagName\" }, { \"id\": 45, \"name\": \"wantsomePetTag2\" } ], \"status\": \"available\"}";

    @BeforeClass
    public static void setUp() {
        // this means that a request like get("12345" ) goes to http://petstore.swagger.io/v2/pet/12345
        RestAssured.baseURI = "http://petstore.swagger.io/v2/pet/";
    }

    @Test
    public void restAssuredTest() {
        get("12345").then().assertThat().body("category.name", equalTo("WantsomeCategory"));
        get("12345").then().assertThat().body("tags.name", hasItems("wantsomePetTag2", "wantsomePetTag2"))
                    .and().assertThat().statusCode(200);
    }

    @Test
    public void filterJsonResults() {
        get("12345").then().body("tags.findAll { it.id > 100 }.name", hasItems("wantsomePetTag2"));
    }

    @Test
    public void givenWhenThenTest() {
         given().contentType("application/json").when().get("12345")
                .then().body("id", is(12345))
                .body("category.name", is("WantsomeCategory"))
                .body("status", is("available")).statusCode(200);
    }

    @Test
    public void getJSONResponseData() {
        Response response = getPet("12345");

        response.prettyPrint();

        int id = response.path("id");
        assertThat(id, is(12345));

        String jsonResponse = response.asString();
        JsonPath jsonPath = new JsonPath(jsonResponse);
        String categoryName = jsonPath.getString("category.name");
        assertThat(categoryName, is("WantsomeCategory"));
    }

    @Test
    public void getXMLResponseData() {
        Response response = given().accept("application/xml")
                .when().get("12345");

        String responseBody = response.asString();

        XmlPath xmlPath = new XmlPath(responseBody).setRoot("Pet");
        String categoryName = xmlPath.getString("category.name");
        assertThat(categoryName, is("WantsomeCategory"));
    }

    @Test
    public void getAdditionalData() {
        Response response = getPet("12345");

        // Get all headers
        Headers allHeaders = response.getHeaders();

        // Get a single header value:
        assertThat(allHeaders.get("Content-Type").getValue(), is("application/json"));
        assertThat(response.getHeader("Content-Type"), is("application/json"));

        // Get status code
        int statusCode = response.getStatusCode();
        assertThat(response.getStatusCode(), is(200));
    }

    @Test
    public void pathParameterTest() {
        Response response = getPet("12345");
        response.prettyPrint();

        response = given().pathParam("petId", "12345").accept("application/json")
                .get("{petId}");
        response.prettyPrint();
    }

    @Test
    public void measureTime() {
        long timeInMs = get("12345").time();
        System.out.println(timeInMs);

        long timeInSeconds = get("12345").timeIn(TimeUnit.SECONDS);
        System.out.println(timeInSeconds);

        get("12345").then().assertThat().time(lessThan(2000L), TimeUnit.MILLISECONDS);
        get("12345").then().assertThat().time(lessThan(2L), TimeUnit.SECONDS);
    }

    public Response getPet(String petId) {
        Response response = given().contentType("application/json").
                when().get(petId);

        return response;
    }
}
