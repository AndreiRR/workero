package supplierPages;

import locators.CreateOfficeLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FourthOfficeStepPage extends CreateOfficeLocators {
    private WebDriver driver;



    public FourthOfficeStepPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }



    public FifthOfficeStepPage houseRule(String houseRuleName) {
        addAnotherHouseRuleLocator.click();
        houseRuleNameLocator.sendKeys(houseRuleName);
        saveBtn.click();
        continueBtn.click();

        return new FifthOfficeStepPage(driver);
    }
}
