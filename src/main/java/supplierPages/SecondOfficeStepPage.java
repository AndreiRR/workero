package supplierPages;

import locators.CreateOfficeLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;

public class SecondOfficeStepPage extends CreateOfficeLocators {
    private WebDriver driver;


    public SecondOfficeStepPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public ThirdOfficeStepPage setCalendarManagement() {
        mondayLocator.click();
        fridayLocator.click();
        this.openHoursDd();
        continueLocator.click();
        return new ThirdOfficeStepPage(driver);
    }

    public void openHoursDd() {
        Select startProgram = new Select(startProgramLocator);
        startProgram.selectByIndex(2);

        Select endProgram = new Select(endProgramLocator);
        endProgram.selectByIndex(3);
    }
}
