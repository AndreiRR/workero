package Polymorphism;

public class B extends A {

    public static void main(String[] args) {
        A numeObjA = new A();
        numeObjA.show();
        numeObjA.show("\n**********");
        numeObjA.show();
        numeObjA.show("\n**************");
        numeObjA.show("show with string");
    }

    public void show(){
        //A numeObjB = new B();

        System.out.println("here is override ");
    }
}


