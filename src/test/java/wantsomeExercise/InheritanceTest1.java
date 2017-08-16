package wantsomeExercise;

import org.junit.Test;
import org.junit.runners.Suite;

/**
 * Created by Andrei on 7/17/2017.
 */
public class InheritanceTest1 extends InheritanceExercises {

    static  int age;
    public InheritanceTest1(){
        super("Andrei","Raschitor");
    }

    @Test
    public void getName(){
        System.out.println("My name is : " + firstame + " " + lastname + "\nMy age is " + age);

    }

    @Test
    public void getAge(){

        System.out.println(age);
    }

}
