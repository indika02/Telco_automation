package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utillities.ActionCommands;

public class UserManagementPage extends ActionCommands {

    public By addUserBtn = By.className("sub-menu__actions-item-link");
    public By viewSystemUser = By.xpath("//tbody/tr[2]/td[1]");
    public By statusDropDown = By.xpath("//button[@id='dropdownMenu2']");
    public By appCreatorsTab = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[2]/li[1]/a[1]");
   public By searchBar = By.xpath("//input[@placeholder='Search for...']");
    public By search = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/input[1]");


    public By userNameColumn = By.xpath("//th[contains(text(),'User Name')]");
    public By firstNameColumn = By.xpath("//th[contains(text(),'First Name')]");
    public By lastNameColumn = By.xpath("//th[contains(text(),'Last Name')]");
    public By statusColumn = By.xpath("//th[contains(text(),'Status')]");
    public By userGroupColumn = By.xpath("//th[contains(text(),'User Group')]");
    public By emailColumn = By.xpath("//th[contains(text(),'Email')]");
    public By profileStatusColumn = By.xpath("//th[contains(text(),'Profile Status')]");
    public By mobileNumberColumn = By.xpath("//th[contains(text(),'Mobile Number')]");
    public By paginationBar = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/nav[1]/ul[1]");

    public By header = By.xpath("//header/div[1]");
    public By footer = By.xpath("//body/div[@id='root']/div[1]/footer[1]/span[1]");
    public By sptablerow=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]");
    public By bankdetailtab=By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]");
    public  By badgeLocator = By.xpath("/html/body/div/div/div/div[1]/div/ul[1]/li/a/span");

    WebDriver driver;

    public UserManagementPage(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver,this);
    }

    public void clickAddUserBtn(){
        waitTime(driver, addUserBtn);

        click(driver, addUserBtn);
    }

    public void clickAppCreatorsTab(){
        waitTime(driver, appCreatorsTab);
        click(driver, appCreatorsTab);


    }

    public void clickViewSystemUser(){
        waitTime(driver, viewSystemUser);
        click(driver, viewSystemUser);


    }

    public void clickInitialStatus(){
        waitTime(driver, statusDropDown);

        click(driver, statusDropDown);
        By initialOption = By.xpath("//ul[@class='dropdown-menu']//a[contains(., 'Initial')]");
        click(driver, initialOption);
    }

    public void clickActiveStatus(){
        waitTime(driver, statusDropDown);
        click(driver, statusDropDown);
        By activeOption = By.xpath("//ul[@class='dropdown-menu']//a[contains(., 'Active')]");
        click(driver, activeOption);
    }

    public void clickDisabledStatus(){
        waitTime(driver, statusDropDown);

        click(driver, statusDropDown);
        By disabledOption = By.xpath("//ul[@class='dropdown-menu']//a[contains(., 'Disabled')]");
        click(driver, disabledOption);
    }

    public void clickAnyStatus(){
        waitTime(driver, statusDropDown);
        click(driver, statusDropDown);
        By AnyOption = By.xpath("//ul[@class='dropdown-menu']//a[contains(., 'Any Status')]");
        click(driver, AnyOption);
    }




    public void clickUsernameFilter() {
        By usernameFilter = By.xpath("//li[@class='application-id']/a[text()='Username']");
        waitTime(driver, usernameFilter);
        click(driver, usernameFilter);
    }

    public void enterSearchText(String searchText) {
        waitTime(driver, searchBar);
       type(driver,searchBar,searchText);
    }

    public void searchByFirstName(String firstname) {
        waitTime(driver, search);
        type(driver,search,firstname);


    }

    public void verifyPagination(){
        waitTime(driver, paginationBar);
        assertElementExists(driver, paginationBar, "Pagination");
    }

    public void verifyHeader(){
        waitTime(driver, header);
        assertElementExists(driver, header, "header");
    }

    public void verifyFooter(){
        waitTime(driver, footer);
        assertElementExists(driver, footer, "footer");
    }

    public void verifyusercountbadge(){
        waitTime(driver,badgeLocator);
        WebElement badgeElement = driver.findElement(badgeLocator);
        Assert.assertTrue("Badge is not displayed.", badgeElement.isDisplayed());
    }



    public void verifySystemUsersColumn() {
        waitTime(driver, userNameColumn);
        assertElementExists(driver, userNameColumn, "User Name");
        assertElementExists(driver, firstNameColumn, "First Name");
        assertElementExists(driver, lastNameColumn, "Last Name");
        assertElementExists(driver, statusColumn, "Status");
        assertElementExists(driver, userGroupColumn, "User Group");
        assertElementExists(driver, emailColumn, "Email");
    }

    public void verifyAppCreatorsColumn() {
        waitTime(driver, userNameColumn);
        assertElementExists(driver, userNameColumn, "User Name");
        assertElementExists(driver, statusColumn, "Status");
//        assertElementExists(driver, profileStatusColumn, "Profile Status");
        assertElementExists(driver, emailColumn, "Email");
        assertElementExists(driver, mobileNumberColumn, "Mobile Number");

    }

    public void clickfirstrowsptable(){
        click(driver,sptablerow);
    }

    public void clickbankdetailtab(){
        click(driver,bankdetailtab);
    }

}
