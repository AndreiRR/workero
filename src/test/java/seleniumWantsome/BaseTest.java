package seleniumWantsome;


import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    WebDriver driver;
    String baseUrl = "http://practica.wantsome.ro/automation/ajax/dropdown/";
    @Before
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
       // driver.quit();
    }

}
