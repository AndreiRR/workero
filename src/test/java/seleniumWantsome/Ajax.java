package seleniumWantsome;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.Is.is;
public class Ajax  extends BaseTest{

    @Test
    public void ajaxCall() throws InterruptedException {
        driver.get("http://www.seleniumeasy.com/test/ajax-form-submit-demo.html");

        WebElement name =  driver.findElement(By.id("title"));
        name.sendKeys("Andrei");

        WebElement description = driver.findElement(By.id("description"));
        description.sendKeys("Description");

        WebElement submit = driver.findElement(By.id("btn-submit"));
        submit.click();

        WebElement succesMessage = driver.findElement(By.xpath("//div[@id='submit-control'][text()='Form submited Successfully!']"));

        //Implicit Wait
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Assert.assertThat(driver.findElement(By
                .xpath("//div[@id='submit-control'][text()='Form submited Successfully!']"))
                .getText(),is("Form submited Successfully!"));


        //Explicit Wait
//        WebDriverWait wait = new WebDriverWait(driver,10);
//        wait.until(ExpectedConditions.textToBePresentInElement()
    }
}
