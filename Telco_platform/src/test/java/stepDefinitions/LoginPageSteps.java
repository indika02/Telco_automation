package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pageObjects.LoginPage;
import utillities.BaseClass;
import utillities.OperatorConfigDataProvider;

public class LoginPageSteps {
    private static final Logger log = LoggerFactory.getLogger(LoginPageSteps.class);
    LoginPage loginPage = new LoginPage(BaseClass.steupBrowser());

    OperatorConfigDataProvider operatorConfigDataProvider = new OperatorConfigDataProvider();

    @Given("^Load UI$")
    public void loadUI() throws InterruptedException {
        loginPage.openPage(operatorConfigDataProvider.getURL());
    }

    @When("^type username as (.*)$")
    public void typeUsername(String username) throws InterruptedException {

        loginPage.typeUsername(username);
    }

    @When("^type password as (.*)$")
    public void typePassword(String password) throws InterruptedException {
        loginPage.typePassword(password);
    }


    @And("^Click on Login Button$")
    public void clickonLogin() throws InterruptedException {
        loginPage.clickOnLoginButton();
    }

    @When("^Verify login as (.*)$")
    public void Login(String userType) throws InterruptedException {
        String username="";
        String password="";
        if(userType.toLowerCase().equals("sp")){
            username=operatorConfigDataProvider.getSPUsername();
            password=operatorConfigDataProvider.getSPPassword();

        }else if (userType.toLowerCase().equals("sdpadmin")){
            username=operatorConfigDataProvider.getSDPAdminUsername();
            password=operatorConfigDataProvider.getSDPAdminPassword();

        }else if (userType.toLowerCase().equals("system admin")){
            username=operatorConfigDataProvider.getSystemAdminUsername();
            password=operatorConfigDataProvider.getSystemAdminPassword();
        } else if(userType.toLowerCase().equals("dialog limited admin")) {
            username=operatorConfigDataProvider.getLimitedAdminUsername();
            password=operatorConfigDataProvider.getLimitedAdminPassword();
        }
        typeUsername(username);
        typePassword(password);
        clickonLogin();
        DashboardPageSteps dashboardPageStep = new DashboardPageSteps();
        dashboardPageStep.verifyUseranme(username);
    }

    @When("^User click on new user registration link")
    public void clickonNewRegLink() {
        loginPage.clickonNewUserLink();
    }

    @And("^Close browser$")
    public void closeBrowser() {
        BaseClass.tearDown();
    }


    @Then("User click on forget password link")
    public void userClickOnForgetPasswordLink() {
        loginPage.clickonForgotPassowrdLink();
    }

    @And("^Enter username as (.*)$")
    public void enterUsernameAs(String username) {
        loginPage.enterUsername(username);
    }

    @And("^Enter fogotpassword username as (.*)$")
    public void enterusername(String uname){
        loginPage.enterforgotpasswordUsername(uname);
    }

    @And("^Enter password as (.*)$")
    public void enterPasswordAs(String password) {
        loginPage.enterPassword(password);
    }

    @And("click back to login")
    public void clickBackToLogin() {
        loginPage.clickOnLoginLink();
    }


    @And("click loginbtn")
    public void clickLoginbtn() {
        loginPage.clickOnLoginBtn();
    }

    @Then("^Verify the error message of login as (.*)$")
    public void Verify_the_error_message_of_login(String text){
        loginPage.verifyErrorMessage(text);
    }

    @Then("Click the back")
    public void Click_the_back(){
        loginPage.clickback();
    }

    @Then("Click the learn more link")
    public void Click_the_learnmore(){
        loginPage.clicklearnmore();
    }
}
