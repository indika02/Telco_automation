package utillities;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TemporaryEmailInteractor {
    private WebDriver driver;

    public TemporaryEmailInteractor() {
        // Initialize WebDriver (example using ChromeDriver)
        String projectLocation = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectLocation + "/drivers/chromedriver");
        driver = new ChromeDriver();
    }

    public String getGeneratedEmail() {
        driver.get("https://temp-mail.org/en/");

        // Wait for the email to be loaded
        WebDriverWait wait = new WebDriverWait(driver, 10); // Adjust the timeout as needed
        //WebElement emailInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("eposta_adres")));
        WebElement emailInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='mail']")));


        // Retrieve the dynamically generated email
        String generatedEmail = emailInput.getAttribute("value");

        return generatedEmail;
    }

//    public String getOtpFromEmail(String senderEmail, String expectedSubject) {
//        // Wait for the email to arrive
//        WebDriverWait wait = new WebDriverWait(driver, 120); // Adjust the timeout as needed
//        WebElement emailDiv = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='gonderen' and text()='" + senderEmail + "']")));
//
//        // Click the email to open it
//        emailDiv.click();
//
//        // Wait for the email body to load
//        WebElement emailBody = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='mail-icerik']")));
//
//        /// Extract the OTP value from the specific <td> with class 'footerContent'
//        WebElement footerContentElement = emailBody.findElement(By.xpath("//iframe[@id='iframe']"));
//        String otp = footerContentElement.getText().trim();
//
//        return otp;
//    }


    public String getOtpFromEmail(String senderEmail, String expectedSubject) throws InterruptedException {
        // ... existing code ...

        // Wait for the email to arrive
        WebDriverWait wait = new WebDriverWait(driver, 180, 1000); // Wait for 180 seconds with a 1000-millisecond interval

        try {
            // Click the email to open it
            WebElement emailDiv = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='gonderen' and text()='" + senderEmail + "']")));
            emailDiv.click();

            // Wait for the email body to be loaded
            WebElement emailBodyElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body")));
            String emailBody = emailBodyElement.getText();

            // Extract OTP from the email body using Java code
            int startIndex = emailBody.indexOf("class=\"footerContent\"");
            int endIndex = emailBody.indexOf("</td>", startIndex);

            if (startIndex != -1 && endIndex != -1) {
                String otp = emailBody.substring(startIndex + 21, endIndex).trim();
                return otp;
            } else {
                // Handle the case where OTP is not found in the email body
                System.out.println("OTP not found in the email body.");
                return null;
            }
        } catch (TimeoutException e) {
            // Handle timeout exception
            System.out.println("Timed out waiting for elements to be present.");
            return null;
        }
    }
}
