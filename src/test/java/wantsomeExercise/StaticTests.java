package wantsomeExercise;

import org.junit.Test;

public class StaticTests {

    int x;                  //variabila de instanta=> sistemul aloca memorie de fiecare data la initializarea lui x
    static long y = 1000; //variabila de clasa(globala)=> sistemul aloca memorie o singura data

    StaticTests obj1 = new StaticTests();
    StaticTests obj2 = new StaticTests();

    @Test
    public void metoda(){
        obj1.x = 12;
        getObj2();


    }


    public StaticTests getObj2() {
        return obj2;
    }
}
