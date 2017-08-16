package wantsomeExercise;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

/**
 * Created by Andrei on 7/10/2017.
 */
public class InheritFromMe {

//    public int myInt = 3;
//    public int mySecondInt = 3;

    public InheritFromMe(){


    }

    @Test
    public void sum(){

        System.out.println("Here is the 1 method inherited");
    }

    @Test
    public void multiply(){

        System.out.println("Here is the 2 method inherited");
    }

    @Test
    public void division(){

        System.out.println("here is the 3 method inherited");
    }
}
