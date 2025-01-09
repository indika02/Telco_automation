package pageObjects;

import gherkin.lexer.Th;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utillities.ActionCommands;

public class SPRegistrationPage extends ActionCommands {
    WebDriver driver;
    private By usernameTextBox = By.name("username");
    private By emailTextBox = By.name("email");
    private By mobileNumberTextBox = By.name("msisdn");
    private By passwordTextBox = By.name("password");
    private By termsCheckBox = By.name("terms");
    private By termsValues = By.className("margin-left-1");
    private By continueButton = By.cssSelector("primary-btn");
    private By verificationMethodLable = By.className("sub-text");
    private By confirmPasswordTextBox = By.name("retypePassword");
    private By loginLink = By.xpath("//a[contains(text(),'Login')]");

    private By emailVerificaationRadioBtn =By.xpath("//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/ul[1]/li[1]/label[1]/span[1]");
    private By smsVerificaationRadioBtn =By.xpath("//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/ul[1]/li[2]/label[1]/span[1]");

    private By termsAndConditionsCheckBox = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]/div[1]/label[1]/input[1]");

    private By continueBtn = By.xpath("//button[contains(text(),'Continue')]");
    private By resendLink = By.xpath("//a[contains(text(),'Resend')]");
    private By otpTextBox = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]");
    public SPRegistrationPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    //Common
    public void verifyElementUsername(){
        checkVisibility(driver,usernameTextBox);
        assetString("Username",getAttribute(driver,usernameTextBox,"placeholder"));
    }
    public void verifyElementEmail(){
        checkVisibility(driver,emailTextBox);
        assetString("Email",getAttribute(driver,emailTextBox,"placeholder"));
    }
    public void verifyElementPassword(){
        checkVisibility(driver,passwordTextBox);
        assetString("Password",getAttribute(driver,passwordTextBox,"placeholder"));
    }
    public void verifyElementMobile(String mobilePlaceholder){
        checkVisibility(driver,mobileNumberTextBox);
        assetString(mobilePlaceholder,getAttribute(driver,mobileNumberTextBox,"placeholder"));
    }
    public void typeUsername(String username) throws InterruptedException {
        Thread.sleep(2000);
        type(driver,usernameTextBox,username);
    }
//    public void typeEmail(String email) throws InterruptedException {
//        Thread.sleep(2000);
//        type(driver,emailTextBox,email);
//    }

    public void typeEmail(String email){
        type(driver,emailTextBox,email);
    }
    public void typeMobileNumber(String mobileNumber) throws InterruptedException {
        Thread.sleep(2000);
        type(driver,mobileNumberTextBox,mobileNumber);
    }

    public void typePassword(String password) throws InterruptedException {
        Thread.sleep(2000);
        type(driver,passwordTextBox,password);
    }

    public void typeConfirmPassword(String password) throws InterruptedException {
        Thread.sleep(2000);
        type(driver,confirmPasswordTextBox,password);
    }

    public void clickEmailVerification() throws InterruptedException {
        Thread.sleep(2000);
        click(driver,emailVerificaationRadioBtn);
    }

    public void clickSmsVerification() throws InterruptedException {
        Thread.sleep(2000);
        click(driver,smsVerificaationRadioBtn);
    }

    public void clickTermsandConditions() throws InterruptedException {
        Thread.sleep(2000);
        click(driver,termsAndConditionsCheckBox);
    }


    public void clickOnLoginLink() throws InterruptedException {
        Thread.sleep(2000);
        click(driver,loginLink);
    }

    public void clickContinueBtn() throws InterruptedException {
        Thread.sleep(2000);
        click(driver,continueBtn);
    }

    public void typeOtp(String otp) throws InterruptedException {
        Thread.sleep(2000);
        type(driver,otpTextBox,otp);
    }
    public void clickResendLink() throws InterruptedException {
        Thread.sleep(2000);
        click(driver,resendLink);
    }

    // mSpace
    public void verifyElementTermCheckbox(){
        checkVisibility(driver,termsCheckBox);
        checkboxValidity(driver,termsCheckBox,false);
    }
    public void verifyTermsValues(String expectTermsMessage) {
        assetString(expectTermsMessage,driver.findElement(termsValues).getText().trim());
    }
    //Robi & Banglalink
    public void verifyVerificationMethodLable(String expectMessage){
        assetString(expectMessage,getText(driver,verificationMethodLable));
    }
    //Need to add verification for Email and SMS radio buttons

    //Banglalink
    public void verifyConfirmPasswordTextBox(){
        System.out.println(getAttribute(driver,confirmPasswordTextBox,"placeholder"));
    }



}
