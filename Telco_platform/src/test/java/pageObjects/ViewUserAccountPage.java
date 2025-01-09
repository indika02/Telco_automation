package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import utillities.ActionCommands;

import java.util.HashMap;
import java.util.Map;

public class ViewUserAccountPage extends ActionCommands {

    public By suspendBtn = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]/i[1]");
    public By deleteBtn = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]/i[1]");
    public By unlockBtn = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]/i[1]");
    public By editBtn = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/i[1]");
    public By fnametxtbox=By.xpath("//*[@id=\"add-account\"]/div/div[2]/div/form/div/div[1]/div[1]/div[1]/div/div/div/input");
    public By lnametxtbox=By.xpath("//*[@id=\"add-account\"]/div/div[2]/div/form/div/div[1]/div[1]/div[2]/div/div/div/input");
    public By emailbox=By.xpath("//*[@id=\"add-account\"]/div/div[2]/div/form/div/div[1]/div[2]/div[2]/div/div[1]/div/input");
    public By fnamemsg=By.xpath("//*[@id=\"add-account\"]/div/div[2]/div/form/div/div[1]/div[1]/div[1]/div/div[2]");
    public By lnamemsg=By.xpath("//*[@id=\"add-account\"]/div/div[2]/div/form/div/div[1]/div[1]/div[2]/div/div[2]");
    public By emailmsg=By.xpath("//*[@id=\"add-account\"]/div/div[2]/div/form/div/div[1]/div[2]/div[2]/div/div[2]");


    public By contactPersonForm = By.xpath("//a[contains(text(),'Contact person')]");
    public By reconciliationDetailsForm = By.xpath("//a[contains(text(),'Reconciliation Details')]");
    public By securityDetailsForm = By.xpath("//a[contains(text(),'Security')]");
    public By topsecuritytab=By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/ul/li[2]/a");
    public By resetPasswordBtn = By.xpath("//a[contains(text(),'Reset Password')]");

    //Verify SP account
    public By verifySPAccountButton = By.xpath("//button[contains(text(),'Verify')]");
    public By commentTextBox = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/textarea[1]");


    Map<String,By>textboxmap=new HashMap<>();
    Map<String,By>textboxerrormap=new HashMap<>();



    WebDriver driver;

    public ViewUserAccountPage(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver,this);
        textboxmap.put("firstName",fnametxtbox);
        textboxmap.put("lastName",lnametxtbox);
        textboxmap.put("email",emailbox);
        textboxerrormap.put("First Name is required",fnamemsg);
        textboxerrormap.put("First Name is required",lnamemsg);
        textboxerrormap.put("First Name is required",emailmsg);
    }

    public void clickSuspendBtn(){
        waitTime(driver, suspendBtn);
        click(driver, suspendBtn);
    }

    public void clickDeleteBtn(){
        waitTime(driver, deleteBtn);
        click(driver, deleteBtn);
    }

    public void clickUnlockBtn(){
        waitTime(driver, unlockBtn);
        click(driver, unlockBtn);
    }

    public void clickEditBtn(){
        waitTime(driver, editBtn);
        click(driver, editBtn);
    }

    public void deleteTextinBox(String textboxname){
        By locator=textboxmap.get(textboxname);
        WebElement textbox=driver.findElement(locator);
        textbox.clear();
    }

    public void enterinvalidemail(String invalidemail)
    {
        waitTime(driver,emailbox);
        type(driver,emailbox,invalidemail);
    }
    public void verifyfnameerrormsg(String msg){
        verifyText(driver,fnamemsg,msg);
    }

    public void verifylnameerrormsg(String msg){
        verifyText(driver,lnamemsg,msg);
    }


    public void verifyemailerrormsg(String msg){
        verifyText(driver,emailmsg,msg);
    }

    public void clickverifySPAccountBtn(){
        waitTime(driver, verifySPAccountButton);
        click(driver, verifySPAccountButton);
    }


    public void clicksecurityDetailsForm(){
        waitTime(driver, securityDetailsForm);
        click(driver, securityDetailsForm);
    }

    public void clicktopsecuritytab(){
        waitTime(driver,topsecuritytab);
        click(driver,topsecuritytab);
    }

    public void clickResetPasswordBtn(){
        waitTime(driver, resetPasswordBtn);
        click(driver, resetPasswordBtn);
    }

    public void enterComment(String comment){
        waitTime(driver, commentTextBox);
        type(driver,commentTextBox,comment);
    }







}
