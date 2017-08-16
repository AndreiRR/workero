package supplierAdmin;

import org.junit.Test;
import wantsomeExercise.PolymorphismInheritFrom;

/**
 * Created by Andrei on 7/10/2017.
 */
public class PolymorphismInheritTest extends PolymorphismInheritFrom{

    public PolymorphismInheritTest(){

        PolymorphismInheritFrom polymorphismInheritFrom = new PolymorphismInheritFrom();

        polymorphismInheritFrom.method1();
        polymorphismInheritFrom.method2();
        polymorphismInheritFrom.method3();
        polymorphismInheritFrom.method4();
    }

    @Test
    public void callMethod1(){
        System.out.println("MyHelloMethods : ");

    }
}
