package supplierPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage  {
    private WebDriver driver;

   @FindBy(name = "email")
   WebElement emailLocator;

   @FindBy(name = "password")
   WebElement passwordLocator;

   @FindBy(className = "btn-primary")
   WebElement submitLocator;


    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public WorkeroHomePage loginAsSupplier(String email,String password) {
        emailLocator.sendKeys(email);
        passwordLocator.sendKeys(password);
        submitLocator.click();
        return new WorkeroHomePage(driver);
    }
}
