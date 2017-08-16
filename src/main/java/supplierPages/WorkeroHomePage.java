package supplierPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class WorkeroHomePage {
    private WebDriver driver;

    @FindBy(xpath = "//a[@href='http://workero.expn-demo.eu/supplier/offices']")
    WebElement officeSetupLocator;

    @FindBy(css = ".bigPlus")
    WebElement addNewOfficeBtnLocator;


    public WorkeroHomePage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }


    public FirstOfficeStepPage addOffice() {
        officeSetupLocator.click();
        addNewOfficeBtnLocator.click();

        return new FirstOfficeStepPage(driver);
    }
}
