package wantsomeExercise;

import org.junit.Test;

import java.io.Serializable;

/**
 * Created by Andrei on 7/13/2017.
 */
public class Car extends BaseCar implements ICar,ICar1{

   @Test
   public void drive(){

       System.out.println(horsePower);
       System.out.println(color);
       System.out.println(torque);

   }

   public void park(){
       //code
   }

   @Test
    public void startsEngine() {
        System.out.println("metoda1 din ICar1");
        horsePower = 200;
       System.out.println(horsePower);
    }


    @Test
    public void stopEngine() {
        System.out.println("metoda2 din ICar2");
    }
}
