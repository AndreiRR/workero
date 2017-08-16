package selenium.support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory  {

    protected static WebDriver driver;

    public static WebDriver getBrowser(String browserType){
        switch(browserType) {
            case "Firefox":
                driver = new FirefoxDriver();
                break;

            case "Chrome":
                driver = new ChromeDriver();
                break;

            case "Edge":
                driver = new EdgeDriver();
                break;
        }

        return driver;
    }
}
