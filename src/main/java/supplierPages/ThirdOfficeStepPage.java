package supplierPages;

import locators.CreateOfficeLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ThirdOfficeStepPage extends CreateOfficeLocators {
    private WebDriver driver;



    public ThirdOfficeStepPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }


    public void setWifiOn() {
        wifiLocator.click();
    }

    public void setParkingOn() {
        parkingLocator.click();
    }


    public void setParkingPrice(String parkingPrice) {
        priceParkingLocator.sendKeys(parkingPrice);
    }


    public void parkingDd() {
        parkingDDLocator.click();
        parkingDpdDwnOptionLocator.click();
//        Select select = new Select(driver.findElement(parkingDDLocator));
//        select.selectByIndex(1);
    }


    public FourthOfficeStepPage setAmenitiesAndServices(String parkingPrice) {
        this.setWifiOn();
        this.setParkingOn();
        this.parkingDd();
        this.setParkingPrice(parkingPrice);
        continueBtnLocator.click();
        return  new FourthOfficeStepPage(driver);
    }


}
