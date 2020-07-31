package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Controller {
    private WebDriver driver;
    
    public WebDriver getDriver() {
        return driver;
    }
    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
    
    public void setupChrome() {
    	System.setProperty("webdriver.chrome.driver","C://Work//DriverNew//chromedriver.exe");
        this.driver = new ChromeDriver();
    }
    
    public void teardownController() {
        if (driver != null) {
            driver.quit();
        }
    }
}