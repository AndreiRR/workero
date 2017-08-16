package supplierPages;

import locators.CreateOfficeLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SubmitToReviewEditModePage extends CreateOfficeLocators {
    private WebDriver driver;

    public SubmitToReviewEditModePage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }
}
