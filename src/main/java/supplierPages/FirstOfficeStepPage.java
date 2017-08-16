package supplierPages;

import locators.CreateOfficeLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstOfficeStepPage extends CreateOfficeLocators {
    private WebDriver driver;
    private WebElement continueBtn;



    public FirstOfficeStepPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }


    public void setOfficeName(String officeName) {
        officeNameLocator.sendKeys(officeName);
    }

    public void setOfficeVat(String officeVat) {
        vatNumberLocator.sendKeys(officeVat);
    }

    public SecondOfficeStepPage setContactInfo() {
        WebDriverWait wait = new WebDriverWait(driver,10);
        continueBtn = wait.until(ExpectedConditions
                .elementToBeClickable(By.className("btnOpacity")));
        continueButtonLocator.click();

        return new SecondOfficeStepPage(driver);
    }
}
