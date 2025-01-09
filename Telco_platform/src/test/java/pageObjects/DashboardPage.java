package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import utillities.ActionCommands;

public class DashboardPage extends ActionCommands {


    protected By profileName = By.className("main-header__right-profile-name");
    //protected By userManagementIcon =By.xpath("//div[@class='common-modules__title' and text()='User Management']");
   // protected By userManagementIcon =By.className("common-modules__title");
    protected By userManagementIcon =By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]/div[1]/img[1]");
    protected By userManagementIconsysadmin =By.xpath("/html/body/div/div/div/div/div[2]/div/ul/li/a/div/img");
    protected By provisioningIcon =By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]/div[1]/img[1]");
    protected By reportingIcon =By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]/div[1]/img[1]");

    protected By completeButton =By.xpath("//button[contains(text(),'Complete')]");
   // protected By logoutButton = By.xpath("//header/div[1]/ul[2]/li[3]/div[1]/ul[1]/li[1]/a[1]");
   protected By logoutButton = By.xpath("//a[contains(@class, 'main-header__dropdown-menu-link') and contains(text(), 'Log Out')]");
   protected By logo=By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div/div/div/img");
   protected By dashboard=By.xpath("//*[@id=\"root\"]");
   protected By homebtn=By.xpath("//*[@id=\"common-header\"]/div/ul[2]/li[1]/a");




    WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }



    public void verifyProfileName(String username) {
        waitTime(driver, profileName);
        verifyText(driver, profileName, username);
    }

    public void clickUserManagementIcon(){
        waitTime(driver, userManagementIcon);
        click(driver, userManagementIcon);
    }

    public void clickUserManagementIconsysadmin(){
        waitTime(driver, userManagementIconsysadmin);
        click(driver, userManagementIconsysadmin);
    }

    public void clickCompleteBtn(){
        waitTime(driver, completeButton);
        click(driver, completeButton);
    }

    public void verifySystemAdminModules() {
        waitTime(driver, userManagementIcon);
        assertElementExists(driver, userManagementIcon, "User Management module");
    }

    public void verifySDPAdminModules() {
        waitTime(driver, userManagementIcon);
        assertElementExists(driver, userManagementIcon, "User Management");
        assertElementExists(driver, provisioningIcon, "Provisioning");
        assertElementExists(driver, reportingIcon, "Reporting");


    }

//    public void clickLogoutButton() {
//        waitTime(driver, logoutButton);
//        click(driver, logoutButton);
//    }

    public void hoverOverProfileDropdown() {
        WebElement profileDropdown = driver.findElement(By.xpath("//header/div[1]/ul[2]/li[3]/a[1]/span[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(profileDropdown).build().perform();
    }

    public void clickLogoutButton() {
        waitTime(driver, logoutButton);
        click(driver, logoutButton);
    }

    public void verifylogoposition(){

        try {
            WebElement logo = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div/div/div/img"));
            WebElement dashboard = driver.findElement(By.xpath("//*[@id=\"root\"]"));

            // Get the logo's position and size
            int logoX = logo.getLocation().getX();
            int logoY = logo.getLocation().getY();
            int logoWidth = logo.getSize().getWidth();
            int logoHeight = logo.getSize().getHeight();

            // Calculate the center of the logo
            int logoCenterX = logoX + (logoWidth / 2);
            int logoCenterY = logoY + (logoHeight / 2);

            // Get the dashboard's position and size
            int dashboardX = dashboard.getLocation().getX();
            int dashboardY = dashboard.getLocation().getY();
            int dashboardWidth = dashboard.getSize().getWidth();
            int dashboardHeight = dashboard.getSize().getHeight();

            // Calculate the center of the dashboard
            int dashboardCenterX = dashboardX + (dashboardWidth / 2);
            int dashboardCenterY = dashboardY + (dashboardHeight / 2);

            // Verify if the logo is aligned at the center
            int tolerance = 5; // Allow a small tolerance for alignment differences
            if (Math.abs(logoCenterX - dashboardCenterX) <= tolerance &&
                    Math.abs(logoCenterY - dashboardCenterY) <= tolerance) {
                System.out.println("The logo is centered on the dashboard.");
            } else {
                System.out.println("The logo is NOT centered on the dashboard.");
            }
        } finally {
            // Close the browser
            driver.quit();
        }
    }

   public void clickhomebtn(){
        waitTime(driver,homebtn);
        click(driver,homebtn);
   }


}
