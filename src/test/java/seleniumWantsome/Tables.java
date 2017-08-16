package seleniumWantsome;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Tables  extends BaseTest{

//    WebElement table = driver.findElement(By.id("myTable"));
//    List<WebElement> allRows = table.findElements(By.tagName("tr")); // get all table rows
//    WebElement elementWeAreLookingFor;
//
//        for(WebElement row :allRows) {                              // iterate over rows, get the cells
//        List<WebElement> cells = row.findElements(By.tagName("td"));
//        for (WebElement cell : cells) {
//            if (cell.getText().equals(“value”)) {
//                elementWeAreLookingFor = cell; // find the web element based on cell value
//            }
//        }
//    }

    @Test
    public void tableTest() {
        driver.get("http://practica.wantsome.ro/automation/table/");
        WebElement table = driver.findElement(By.id("cities"));

        List<WebElement> table_rows = table.findElements(By.tagName("tr"));

        for (int row = 0; row < table_rows.size(); row++) {
            List<WebElement> columns = table_rows.get(row).findElements(By.tagName("td"));

            for (int column = 0; column < columns.size(); column++) {
                System.out.println("Value of row number " + row + " and value of column number " + column
                        + " is " + columns.get(column).getText());
            }
        }

        driver.findElement(By.xpath("//table/tbody/tr/td[contains(text(), 'Iasi')]/../td/a")).click();
        Assert.assertEquals(driver.getTitle(), "Iași - Wikipedia");
    }

    @Test
    public void tableTest2(){
        driver.get("http://practica.wantsome.ro/automation/table/buildings-table.html");
        WebElement taipei = driver.findElement(By.className("tsc_table_s13"));

        List<WebElement> tableColumns = taipei.findElements(By.tagName("th"));

        for(WebElement taipeiCity : tableColumns){
            System.out.println(taipeiCity.getText());
        }
    }
}