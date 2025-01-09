package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utillities.ActionCommands;

public class LoginPage extends ActionCommands {

    WebDriver driver;
    private By usernameTextBox = By.id("username");
    private By forgotpwdusernamebox=By.xpath("//*[@id=\"root\"]/div/div/div/div/div[3]/div/div/div/div/div[2]/div/div/form/div/div[1]/div/div/div/div/div/input");
    private By passwordTextBox = By.id("password");
    private By loginButton = By.xpath("//*[@id=\"fm1\"]/div/div/button");
    private By newUserLink = By.xpath("//a[contains(text(),'Register as a New User')]");

    private By forgotPasswordLink = By.xpath("//a[contains(text(),'Forgot Password?')]");
    private By loginLink = By.xpath("//a[contains(text(),'Back to Login')]");
    private By usernameT = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]");
    private By errormsg=By.xpath("/html/body/div[1]/div[2]/h6");
    private By backlink=By.linkText("Back");
    private By learnmorelik=By.linkText("Learn More");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openPage(String URL) throws InterruptedException {
        Thread.sleep(5000);
        openurl(driver, URL);
    }

    public void typeUsername(String username) throws InterruptedException {
        Thread.sleep(4000);

        type(driver, usernameTextBox, username);
    }

    public void typePassword(String password) throws InterruptedException {
        Thread.sleep(4000);
        type(driver, passwordTextBox, password);
    }

    public void clickOnLoginButton() throws InterruptedException {
        Thread.sleep(3000);

        //  waitTime(driver, loginButton);
        click(driver, loginButton);
    }



    public void clickonNewUserLink() {
        click(driver, newUserLink);
    }

    public void clickonForgotPassowrdLink() {
        click(driver, forgotPasswordLink);
    }

    public void clickOnLoginLink(){
        click(driver,loginLink);
    }

    public void clickOnLoginBtn() {
        waitTime(driver, loginButton);
        click(driver,loginButton);
    }

    public void enterUsername(String username){
        waitTime(driver, usernameTextBox);
        type(driver,usernameTextBox,username);
    }

    public void enterforgotpasswordUsername(String username){
        waitTime(driver, forgotpwdusernamebox);
        type(driver,forgotpwdusernamebox,username);
    }


    public void enterPassword(String password){
        waitTime(driver, passwordTextBox);
        type(driver,passwordTextBox,password);
    }


    public void verifyErrorMessage(String error){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement errorMessageElement = wait.until(
                ExpectedConditions.visibilityOfElementLocated(errormsg)
        );
        String actualErrorMessage = errorMessageElement.getText();
        Assert.assertEquals(actualErrorMessage, error);
    }

    public void clickback(){

        click(driver,backlink);
    }

    public void clicklearnmore(){
        click(driver,learnmorelik);
    }
}
