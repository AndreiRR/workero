package seleniumWantsome;

import com.google.common.base.Function;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

//DropDown example2

public class DropdownTest extends BaseTest{

   @Test
    public void dropdownTest() throws InterruptedException {

        driver.get("http://practica.wantsome.ro/automation/ajax/dropdown/");

        //WebElement screen
        Select screen = new Select(driver.findElement(By.cssSelector("#example2 .step1")));
        screen.selectByVisibleText("4.7\"");

        new FluentWait<>(driver)
                .withTimeout(10, TimeUnit.SECONDS)
                .pollingEvery(100, TimeUnit.MILLISECONDS)
                .until(new Function<WebDriver, Object>() {
                    @Override
                    public Boolean apply(WebDriver driver) {
                        return driver.findElement(By.cssSelector("#example2 .step2"))
                                .isEnabled() && driver.findElements(By.cssSelector("#example2 .step2 option")).size() > 1;
                    }
                });

        Select resolution = new Select(driver.findElement(By.cssSelector("#example2 .step2")));
        resolution.selectByVisibleText("720p");

        new FluentWait<>(driver)
                .withTimeout(10, TimeUnit.SECONDS)
                .pollingEvery(100, TimeUnit.MILLISECONDS)
                .until(new Function<WebDriver, Boolean>() {
                    @Override
                    public Boolean apply(WebDriver driver) {
                        return driver.findElement(By.cssSelector("#example2 .step3"))
                                .isEnabled() && driver.findElements(By.cssSelector("#example2 .step3 option")).size() > 1;
                    }
                });

        Select storage = new Select(driver.findElement(By.cssSelector("#example2 .step3")));
        storage.selectByVisibleText("16 GB");

        new FluentWait<>(driver)
                .withTimeout(10, TimeUnit.SECONDS)
                .pollingEvery(100, TimeUnit.MILLISECONDS)
                .until(new Function<WebDriver, Boolean>() {
                    @Override
                    public Boolean apply(WebDriver driver) {
                        return driver.findElements(By.cssSelector("#example2 > ul li")).size() > 0;
                    }
                });

        List<WebElement> matches = driver.findElements(By.xpath("//div[@id='example2']/ul/li"));
        List<String> matchedPhones = new ArrayList<>();

        for (WebElement match : matches) {
            matchedPhones.add(match.getText());
        }

        assertTrue(matchedPhones.contains("Motorola Droid RAZR HD"));
        assertTrue(matchedPhones.contains("LG Optimus 4X HD"));
        assertTrue(matchedPhones.contains("Motorola Moto X"));
    }
}
