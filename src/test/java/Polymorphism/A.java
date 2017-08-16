package Polymorphism;

public class A {

    public void show(){
        System.out.println("I am in class A " + " first show method");
    }

    public void show(String localization){
        System.out.println("Overloading show method: " + " second show method " + localization);
    }

    public void show(int i,String y){

        System.out.println();
    }
    public void show(String y,int x){

    }
}
