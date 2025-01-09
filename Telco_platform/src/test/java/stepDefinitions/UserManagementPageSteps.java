package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageObjects.UserManagementPage;
import utillities.BaseClass;

public class UserManagementPageSteps {

    UserManagementPage userManagementPage = new UserManagementPage(BaseClass.steupBrowser());
    WebDriver driver = BaseClass.steupBrowser(); // Add this line

    @Then("Click the add user button")
    public void clickAddUserBtn() {
        userManagementPage.clickAddUserBtn();
    }

    @Then("Click the view system user list")
    public void clickTheViewSystemUserList() {
        userManagementPage.clickViewSystemUser();
    }

    @Then("select the initial status")
    public void selectTheInitialStatus() {
        userManagementPage.clickInitialStatus();

    }

    @Then("select the active status")
    public void selectTheActiveStatus() {
        userManagementPage.clickActiveStatus();
    }

    @Then("select the disabled status")
    public void selectTheDisabledStatus() {
        userManagementPage.clickDisabledStatus();

    }

    @Then("select the any status")
    public void selectTheAnyStatus() {
        userManagementPage.clickAnyStatus();
    }


//    @Then("enter the word {string} in the searchbar")
//    public void enterTheWordInTheSearchbar(String searchText) {
//        userManagementPage.enterSearchText(searchText);
//
//    }

    @Then("Click the App Creators tab")
    public void clickTheAppCreatorsTab() {
        userManagementPage.clickAppCreatorsTab();
    }

    @Then("Verify user count in tab")
    public void verifyUserCountInTab() {
       userManagementPage.verifyusercountbadge();
    }

    @Then("Verify the column headers for system users")
    public void verifyTheColumnHeadersForSystemUsers() {
        userManagementPage.verifySystemUsersColumn();

    }

    @Then("Verify the column headers for App Creators")
    public void verifyTheColumnHeadersForAppCreators() {
        userManagementPage.verifyAppCreatorsColumn();

    }

    @Then("Click the Username filter")
    public void clickTheUsernameFilter() {
        userManagementPage.clickUsernameFilter();
    }

    @Then("^Enter the word sysad in the searchbar (.*)$")
    public void enterTheWordInTheSearchbar(String text) {
        userManagementPage.enterSearchText(text);
    }

    @Then("Search by first name as (.*)$")
    public void searchByFirstName(String firstname) {
        userManagementPage.searchByFirstName(firstname);
    }


    @Then("Verify pagination")
    public void verifyPagination() {
        userManagementPage.verifyPagination();
    }

    @Then("Verify the header")
    public void verifyTheHeader() {
        userManagementPage.verifyHeader();


    }

    @Then("Verify the footer")
    public void verifyTheFooter() {
        userManagementPage.verifyFooter();
    }

    @Then("Click on the sp user's data row")
    public void click_on_the_sp_user_data_row(){
        userManagementPage.clickfirstrowsptable();
    }

    @Then("Click Benificiary bank details tab")
    public void Click_Benificiary_bank_details_tab(){
        userManagementPage.clickbankdetailtab();
    }
}
