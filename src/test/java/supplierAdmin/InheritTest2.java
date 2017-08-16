package supplierAdmin;

import org.junit.Test;
import wantsomeExercise.InheritFromMe;

/**
 * Created by Andrei on 7/10/2017.
 */
public class InheritTest2 extends InheritTest {
    public InheritTest2(){
        super();
    }

    @Test
    public void anotherInheritTest(){
        System.out.println("Here is the 5 inherited method");
    }

    @Test
    public void callingMethods(){
        this.sum();
        this.multiply();
        this.division();
        this.anotherMethod6();
        this.anotherInheritTest();
    }
}
