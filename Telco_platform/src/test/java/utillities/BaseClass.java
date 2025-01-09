package utillities;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    // Getter to retrieve the current WebDriver instance
    @Getter
    protected static WebDriver driver = null;  // Static WebDriver instance
    protected static ConfigDataProvider config;  // Config provider instance

    // Method to initialize and set up the browser
    public static WebDriver steupBrowser() {
        if (driver == null) {
            config = new ConfigDataProvider();  // Load configuration
            String browserName = config.getBrowser();  // Get browser name from config
            driver = BrowserFactory.startApplication(browserName);  // Start browser using factory
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  // Set implicit wait
            driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);  // Set page load timeout
            driver.manage().window().maximize();  // Maximize browser window
        }
        return driver;
    }

    // Method to tear down the browser instance
    public static void tearDown() {
        if (driver != null) {
            BrowserFactory.quitBrowser(driver);  // Quit the browser using factory
            driver = null;  // Nullify the WebDriver after quitting
        }
        try {
            Thread.sleep(1000);  // Pause for a second after browser teardown
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}