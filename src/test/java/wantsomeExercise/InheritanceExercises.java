package wantsomeExercise;

import org.junit.Test;

/**
 * Created by Andrei on 7/17/2017.
 */
public class InheritanceExercises {

    protected String firstame = "Andrei";
    protected String lastname  = "Raschitor";
    protected int age = 28;

    public InheritanceExercises(String firstame,String lastname){

        this.firstame = firstame;
        this.lastname = lastname;
    }

    @Test
    public void setYourName(){

    }

    @Test
    public void getAge(){

    }


}


class D{

    int x;
     final String myStr ="";

    public D(int x){
        this.x = x;
    }

    void myAbstractMethod(){
        System.out.println("i am in class D");
    }
}


class E extends D{

    final String myStr ="";


    public E(){
        super(2);

        D objOfD = new D(2);
        E objOfE = new E();
    }

    protected E(int x){
        super(x);
    }


     void myAbstractMethod(){
          final String myStr ="";
    }
}


class MyClass{

    protected int x;
    protected String y;

}

class My2Class{
    protected int x;
    protected String y;

    void metod(MyClass params){

        this.x = x;
        this.y = y;
    }
}
