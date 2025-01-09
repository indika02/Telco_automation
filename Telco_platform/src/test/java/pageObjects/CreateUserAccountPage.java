package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utillities.ActionCommands;

public class CreateUserAccountPage extends ActionCommands {

    public By firstNameTextBox = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]");
    public By lastNameTextBox = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]");
    public By designationTextBox = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]");
    public By emailTextBox = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]");
    public By userNameTextBox = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/input[1]");
    public By addressTextBox = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/input[1]");
    public By mobileNumberTextBox = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/input[1]");
    public By userGroupDropBox = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/select[1]");
    public By cancelBtn = By.xpath("//button[contains(text(),'Cancel')]");
    public By submitBtn = By.xpath("//button[contains(text(),'Submit')]");


    WebDriver driver;

    public CreateUserAccountPage(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver,this);
    }

    public void enterFirstName(String firstname){
        waitTime(driver, firstNameTextBox);

        type(driver,firstNameTextBox,firstname);
    }

    public void enterLastName(String lastname){
        waitTime(driver, lastNameTextBox);

        type(driver,lastNameTextBox,lastname);
    }

    public void enterDesignation(String designation){
        waitTime(driver, designationTextBox);

        type(driver,designationTextBox,designation);
    }

    public void enterEmail(String email){
        waitTime(driver, emailTextBox);

        type(driver,emailTextBox,email);
    }

    public void enterUsername(String username){
        waitTime(driver, userNameTextBox);
        type(driver,userNameTextBox,username);
    }

    public void enterAddress(String address){
        waitTime(driver, addressTextBox);
        type(driver,addressTextBox,address);
    }

    public void enterMobileNumber(String mobilenumber){
        waitTime(driver, mobileNumberTextBox);
        type(driver,mobileNumberTextBox,mobilenumber);
    }

    public void clickUserGroup(){
        waitTime(driver, userGroupDropBox);
       // click(driver, userGroupDropBox);
        Select dropdown = new Select(driver.findElement(userGroupDropBox));  // Locate the dropdown element using the userGroupDropBox locator
        dropdown.selectByIndex(2);  // Select the third option in the dropdown (index starts from 0)
    }


    public void clickCancelBtn(){
        waitTime(driver, cancelBtn);
        click(driver, cancelBtn);

    }

    public void clickSubmitBtn(){
        waitTime(driver, submitBtn);
        click(driver, submitBtn);

    }



}
