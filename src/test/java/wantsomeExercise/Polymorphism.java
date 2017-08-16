package wantsomeExercise;

import org.junit.Test;

/**
 * Created by Andrei on 7/10/2017.
 */
public class Polymorphism {

    public static void main(String[] args){
        Polymorphism polymorphism = new Polymorphism();
        polymorphism.buy(5);
    }


    public void buy(){
        System.out.println("myFirstMethod");
    }


    public void buy(int i){
        System.out.println("mySecondMethod : " + i);
    }

}
