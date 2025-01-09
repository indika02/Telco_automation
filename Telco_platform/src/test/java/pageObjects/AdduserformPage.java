package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utillities.ActionCommands;

public class AdduserformPage extends ActionCommands {

    public By fname=By.xpath("//*[@id=\"add-account\"]/div/div[2]/div/form/div/div[1]/div[1]/div[1]/div/div[1]/div/input");
    public By lname=By.xpath("//*[@id=\"add-account\"]/div/div[2]/div/form/div/div[1]/div[1]/div[2]/div/div[1]/div/input");
    public By designation=By.xpath("//*[@id=\"add-account\"]/div/div[2]/div/form/div/div[1]/div[2]/div[1]/div/div/div/input");
    public By email=By.xpath("//*[@id=\"add-account\"]/div/div[2]/div/form/div/div[1]/div[2]/div[2]/div/div[1]/div/input");
    public By username=By.xpath("//*[@id=\"add-account\"]/div/div[2]/div/form/div/div[1]/div[3]/div[1]/div/div[1]/div/input");
    public By mobileno=By.xpath("//*[@id=\"add-account\"]/div/div[2]/div/form/div/div[1]/div[3]/div[2]/div/div/div/input");
    public By address=By.xpath("//*[@id=\"add-account\"]/div/div[2]/div/form/div/div[1]/div[4]/div[1]/div/div/div/input");
    public By usergroup=By.xpath("//*[@id=\"add-account\"]/div/div[2]/div/form/div/div[1]/div[4]/div[2]/div/div[1]/select");
    public By submitbtn=By.xpath("//*[@id=\"add-account\"]/div/div[2]/div/form/div/div[2]/div/div[2]/button");
    public By cancelbtn=By.xpath("//*[@id=\"add-account\"]/div/div[2]/div/form/div/div[2]/div/div[1]/button");


    WebDriver driver;

    public AdduserformPage(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver,this);
    }

    public void enterfirstname(String firstname){
        waitTime(driver,fname);
        type(driver,fname,firstname);
    }

    public void enterlastname(String lastname){
        waitTime(driver,lname);
        type(driver,lname,lastname);
    }

    public void enterdesignation(String desig){
        waitTime(driver,designation);
        type(driver,designation,desig);
    }

    public void enteremail(String mail){
        waitTime(driver,email);
        type(driver,email,mail);
    }

    public void enterusername(){
        waitTime(driver,username);
        genarateusername(driver,username);
    }

    public void entermobno(String tel){
        waitTime(driver,mobileno);
        type(driver,mobileno,tel);
    }

    public void enteraddress(String add){
        waitTime(driver,address);
        type(driver,address,add);
    }

    public void selectusergroup(String ugroup){
        waitTime(driver,usergroup);
        selectItem(driver,usergroup,ugroup);
    }

    public void clicksubmit(){
        waitTime(driver,submitbtn);
        click(driver,submitbtn);
    }

    public void clickcancel(){
        waitTime(driver,cancelbtn);
        click(driver,cancelbtn);
    }

}
