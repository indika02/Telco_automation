package utillities;

import com.epam.healenium.SelfHealingDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BrowserFactory {

    private static WebDriver driver;

    // Method to start the browser based on the browser name
    public static WebDriver startApplication(String browserName) {
        WebDriver delegate;

        if (browserName.equalsIgnoreCase("chrome")) {
            String projectLocation = System.getProperty("user.dir");
            System.setProperty("webdriver.chrome.driver", projectLocation + "/drivers/chromedriver");
            delegate = new ChromeDriver();  // Initialize ChromeDriver
        } else if (browserName.equalsIgnoreCase("firefox")) {
            String projectLocation = System.getProperty("user.dir");
            System.setProperty("webdriver.gecko.driver", projectLocation + "/drivers/geckodriver");

            // Initialize Firefox in private mode
            FirefoxOptions options = new FirefoxOptions();
            options.addArguments("-private");
            options.setHeadless(true);
            delegate = new FirefoxDriver(options);  // Initialize FirefoxDriver
        } else {
            throw new IllegalArgumentException("Browser not supported: " + browserName);
        }

        // Wrap the original WebDriver with SelfHealingDriver
        WebDriver driver = SelfHealingDriver.create(delegate);

        return driver;  // Return the self-healing driver instance
    }
    // Method to quit the browser
    public static void quitBrowser(WebDriver driver) {
        if (BrowserFactory.driver != null) {
            BrowserFactory.driver.quit();  // Quit WebDriver instance
            BrowserFactory.driver = null;  // Set to null after quitting
        }
    }
}