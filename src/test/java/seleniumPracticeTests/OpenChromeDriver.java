package seleniumPracticeTests;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

/**
 * Created by Andrei on 7/19/2017.
 */
public class OpenChromeDriver {

    WebDriver driver;

   @Test
    public void setUp(){

       System.setProperty("webdriver.chrome.driver","D:\\chromedriver\\chromedriver.exe");
       driver = new ChromeDriver();
       driver.get("http://workero.expn-demo.eu/supplier/login");
       driver.manage().window().maximize();

       String pageTitle = driver.getTitle();
       String username = "andrei.raschitor@expertnetwork.ro";
       String password = "secret";

       driver.findElement(By.name("email")).sendKeys(username);
       driver.findElement(By.name("password")).sendKeys(password);
       try {
           driver.manage().wait(2000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
       driver.findElement(By.partialLinkText("Login")).click();



       assertThat(pageTitle,is("Hi Andrei, how are you today? Great weather outside!"));

   }





   @Test
   public void openBrowserAndLogin(){

        //this.setUp();
   }


   @After
    public void tearDown(){
       // driver.close();
   }
}
