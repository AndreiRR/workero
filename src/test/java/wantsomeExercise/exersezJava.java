package wantsomeExercise;

import org.junit.Test;

/**
 * Created by Andrei on 7/17/2017.
 */



public class exersezJava {



}

class Exemplu {
    int x;                  // Variabila de instanta
    static long n;          // Variabila de clasa


    public Exemplu() {

        Exemplu o1 = new Exemplu();
        Exemplu o2 = new Exemplu();
        n = 100;

        System.out.println(n);       // Afiseaza 100
        n = 200;

        System.out.println(n);       // Afiseaza 200
        System.out.println(Exemplu.n); // Afiseaza 200
        // o1.n, o2.n si Exemplu.n sunt referinte la aceeasi valoare


    }
}

class Exemplu1 {

    int x ;                             // Variabila de instanta
    public static long n;
                                        // Variabila de clasa

    public void metodaDeInstanta() {
        n ++;                           // Corect
        x --;                           // Corect
    }

    public static void metodaStatica() {
        n ++;                               // Corect
        //x --;                           // Eroare la compilare !
    }
}

class MathSqrt{

    public MathSqrt(){

        Math.sqrt(121);
    }
}


class Test1{
    // Declaratii de variabile statice
    static int x = 0,y,z;

    //Bloc static de initializare

    static void myMethod(){
        int t = 1;
        x = 2;
        z = x + y + t;
    }

    Test1(){

    }
}

class SupplierLogin{

    private static String enterUsername = "Andrei";
    private static int password;

    public SupplierLogin(String enterUsername,int password){
        SupplierLogin supplierLogin = new SupplierLogin("Andrei",2);
    }

    static void supplierLogin(){
        System.out.println(enterUsername);
    }
}


class ClasaImbricata{

    class Imbricata1{

        void metoda(){

        }

        class ClasaImbricata2{

        }
    }
}

class ClasaDeAcoperire{

    private int x=1;

    class ClasaImbricata1 {
        int a=x;
    }

    void metoda() {

        final int y=2;
        int z=3;
        class ClasaImbricata2 {
            int b=x;
            int c=y;
            //int d=z; // Incorect
        }
    }

   // ClasaDeAcoperire.ClasaImbricata1.

}

//abstract  class ClasaAbstracta extends SupplierLogin{
//
//}

class Inheritance{}


class StaticClassWithStaticFields{
  static int x;

    public  StaticClassWithStaticFields(){

        StaticClassWithStaticFields numbeObj = new StaticClassWithStaticFields();
        numbeObj.x = 100;

    }

    public static void returnX(){
        System.out.println(x);
    }
}
