package supplierAdmin;

import org.junit.Test;
import wantsomeExercise.InheritFromMe;

/**
 * Created by Andrei on 7/10/2017.
 */
public class InheritTest extends InheritFromMe {

   public InheritTest(){
       super();
   }



   @Test
   public void anotherMethod6(){
       System.out.println("here is the 4 method inherited");
   }

    @Test
    public void callMethods(){
        this.sum();
        this.multiply();
        this.division();
        this.anotherMethod6();
    }
}
