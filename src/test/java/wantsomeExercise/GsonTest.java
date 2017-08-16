package wantsomeExercise;

import com.google.gson.Gson;
import org.junit.Test;

/**
 * Created by Andrei on 7/13/2017.
 */
public class GsonTest {


    @Test
    public void gsonTests(){

        Gson gson = new Gson();

        //serialization
        System.out.println(gson.toJson(101));
        System.out.println(gson.toJson("name"));
        System.out.println(gson.toJson(new Long(1234)));


        //deserialization
       int number =  gson.fromJson("1",int.class);
       String myStr = gson.fromJson("name",String.class);

        System.out.println(number);
        System.out.println(myStr);
    }
}
