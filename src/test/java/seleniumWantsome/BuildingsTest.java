package seleniumWantsome;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BuildingsTest extends BaseTest {

    @Test
    public void rank4(){
        driver.get("http://practica.wantsome.ro/automation/table/buildings-table.html");

        //Get the city that has the 'Taipei 101' building structure
        WebElement table = driver.findElement(By.className("tsc_table_s13"));
        List<WebElement> rows = table.findElements(By.tagName("th"));
        for (WebElement structure : rows){
            if(structure.getText().equals("Taipei 101")){
                System.out.println(structure.findElement(By.xpath("../td[2]")).getText());
            }
        }
    }
}
