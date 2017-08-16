package wantsomeExercise;

/**
 * Created by Andrei on 7/11/2017.
 */
public class SomeInheritanceTests {

    public static void main(String[] args){

        B bObj = new B(2);
        A cObj = new C();
    }
}

class A {
    public A(){
        System.out.println("constructor A");
    }
}

class B {
    public B(){
        System.out.println("constructor B");
    }

    public B(int j){
        System.out.println("B constructor with j int");
    }
}

class C extends A{

    public C(){

        System.out.println("constructor C");
    }
}
