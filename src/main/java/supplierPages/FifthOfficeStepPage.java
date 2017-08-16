package supplierPages;

import locators.CreateOfficeLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class FifthOfficeStepPage  extends CreateOfficeLocators {
    private WebDriver driver;



    public FifthOfficeStepPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public SubmitToReviewEditModePage setProductType(String numberOfDesk,String floor) {
        productDDLocator.click();
        numberOfProductLocator.sendKeys(numberOfDesk);
        floorLocator.sendKeys(floor);
        saveProductLocator.click();
        submitToReview.click();
        driver.switchTo().alert().accept();

        return new SubmitToReviewEditModePage(driver);
    }
}
