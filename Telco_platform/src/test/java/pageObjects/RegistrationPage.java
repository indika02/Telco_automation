package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utillities.ActionCommands;

public class RegistrationPage extends ActionCommands {

    WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    private By registerNewUser = By.xpath("//a[normalize-space()='Register as a New User']");
    private By username=By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div/div/div/div[2]/div/div/form/div/div[1]/div[1]/div/div/div[1]/div/input");
    private By usernameapplink=By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div/div/div/div[2]/div/div/form/div/div[1]/div[1]/div/div/div[1]/div/input");
    private By email = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]");
    private By mobileNUmber = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]");
    private By password = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/input[2]");
    private By confirmPassword = By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/input[2]");
    private By agreement = By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div/div/div/div[2]/div/div/form/div/div[1]/div[4]/div[2]/div/div/div/label/input");
    private By continueButton = By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div/div/div/div[2]/div/div/form/div/div[2]/div/div/button");
    private By forgetPassword =  By.xpath("/html/body/div[3]/div/div/div/div/div[2]/form/div/div/div[3]/div[2]/a");
    private By forgotPasswordUserName = ByIdOrName.xpath("/html/body/div/div/div/div/div/div[3]/div/div/div/div/div[2]/div/div/form/div/div[1]/div/div/div/div/div/input");
    private By submit = By.xpath("/html/body/div/div/div/div/div/div[3]/div/div/div/div/div[2]/div/div/form/div/div[2]/div/div/button");
    private By profile = By.xpath("/html/body/div/div/header/div/ul[2]/li[3]/a");
    private By settings = By.xpath("//*[@id=\"profile-settings-link\"]");
    private By bankDetails = By.xpath("/html/body/div/div/div/div[2]/div/div/div/div/div/div[2]/div/ul/li[4]/a");
    private By editButton = By.xpath("/html/body/div/div/div/div[2]/div/div/div/div/div/div[3]/div/div/div/div[1]/div/ul/li/a");
    private By benifitName = By.xpath("/html/body/div/div/div/div[2]/div/div/div/div/div/div[3]/div/div/div/div[2]/form/div/div[1]/div[1]/div/div/div[1]/div/input");
    private By emailError=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]");
    private By mobnoError=By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div/div/div/div[2]/div/div/form/div/div[1]/div[2]/div/div/div[2]");
    private By saveBtn=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[2]/button[1]");
    private By pwderror=By.xpath("//*[@id=\"root\"]/div/div/div[3]/div/div/div/div/div[2]/div/div/form/div/div[1]/div[4]/div[1]/div/div[2]");
    public void registerNewUser(){
        moveMouseVisuallyAndClick(driver,registerNewUser);
    }

    public void setusername(String uname){
        humanLikeTyping(driver,username,uname);
    }

    public void setEmail(String input){
        humanLikeTyping(driver,email,input);
    }

    public void setunameapplink(String uname){
        humanLikeTyping(driver,usernameapplink,uname);
    }

    public void setMobileNumber(String input){
        humanLikeTyping(driver,mobileNUmber,input);
    }

    public void setPassword(String input){
        humanLikeTyping(driver,password,input);
    }

    public void setConfirmPassword(String input){
        humanLikeTyping(driver,confirmPassword,input);
    }

    public void verifypwdmatcherror(String text){
        verifyText(driver,pwderror,text);
    }

    public void tickAgreement(){
        moveMouseVisuallyAndClick(driver, agreement);
    }

    public void clickContinueButton(){
        moveMouseVisuallyAndClick(driver, continueButton);
    }

    public void clickForgetPassword(){
        moveMouseVisuallyAndClick(driver, forgetPassword);
    }

    public void giveForgotPasswordUserName(String input){
        humanLikeTyping(driver,forgotPasswordUserName,input);
    }

    public void clickSubmit() {
        moveMouseVisuallyAndClick(driver, submit);
    }

    public void hoverOverProfile(){
        hover(driver,profile);
    }

    public void clickSettings(){
       waitTime(driver,settings);
        click(driver,settings);
    }

    public void clickBankDetails(){
        click(driver,bankDetails);
    }

    public void clickEditButton(){
        moveMouseVisuallyAndClick(driver, editButton);
    }

    public void clickOnBnameField(){
       type(driver,benifitName,"dshfdjsfh");
    }

    public void clickSaveBtn(){
        click(driver,saveBtn);
    }

    public void isItNotEditable(){
        verifyElementEditable(driver,benifitName,false);
    }

public void validateEmailError(String error){
   verifyText(driver,emailError,error);
}

    public void validatemobnoError(String error){
       verifyText(driver,mobnoError,error);
    }

public void refreshPage(){
    driver.navigate().refresh();
}







}
