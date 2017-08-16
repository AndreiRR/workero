package interfaces;

import org.junit.Test;


/***
 * CLASA CARE IMPLEMETEAZA MAI MULTE INTERFETE
 */


public class Erou extends BaseErou implements Inotator,Zburator,Luptator {

    @Test
    public void inoata(){

        System.out.println("Stil Inot: " + stilInot);
        System.out.println("Numar Stroke-uri: " + numarStrokeuri);
    }

    @Test
    public void zboara() {

        System.out.println("Zboara la inaltime mare");
    }

    @Test
    public void lupta(){
        System.out.println("boxeaza bine");
    }
}
