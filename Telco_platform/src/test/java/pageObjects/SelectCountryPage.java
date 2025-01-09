package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utillities.ActionCommands;

public class SelectCountryPage extends ActionCommands {

    WebDriver driver;

    private By selectCountryDropDown = By.xpath("//*[@id=\"country\"]");
    private By continueButton = By.xpath("//button[contains(text(),'Continue')]");
    private By checkbox=By.id("rememberCountry1");

    public SelectCountryPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void selectCountry(){
        waitTime(driver, selectCountryDropDown);
        Select dropdown = new Select(driver.findElement(selectCountryDropDown));
        dropdown.selectByIndex(1);
    }

    public void clickRememberCountry(){
        waitTime(driver, checkbox);
        click(driver, checkbox);
    }

    public void clickContinueButton(){
        waitTime(driver, continueButton);
        click(driver, continueButton);
    }


}
