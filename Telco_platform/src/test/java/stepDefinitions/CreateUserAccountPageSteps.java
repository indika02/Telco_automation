package stepDefinitions;

import io.cucumber.java.en.*;
import pageObjects.CreateUserAccountPage;
import utillities.BaseClass;

public class CreateUserAccountPageSteps {
    CreateUserAccountPage createUserAccountPage = new CreateUserAccountPage(BaseClass.steupBrowser());

    @And("^Enter the firstname as (.*)$")
    public void enterTheFirstname(String firstname) {
        createUserAccountPage.enterFirstName(firstname);
    }

    @And("^Enter the lastname as (.*)$")
    public void enterTheLastname(String lastname) {
        createUserAccountPage.enterLastName(lastname);
    }

    @And("^Enter the designation as (.*)$")
    public void enterTheDesignation(String designation) {
        createUserAccountPage.enterDesignation(designation);
    }

    @And("^Enter the email as (.*)$")
    public void enterTheEmail(String email) {
        createUserAccountPage.enterEmail(email);

    }

    @And("^Enter the username as (.*)$")
    public void enterTheUsername(String username) {
        createUserAccountPage.enterUsername(username);
    }

    @And("^Enter the address as (.*)$")
    public void enterTheAddressAs(String address) {
        createUserAccountPage.enterAddress(address);
    }

    @And("^Enter the mobilenumber as (.*)$")
    public void enterTheMobilenumberAs(String mobilenumber) {
        createUserAccountPage.enterMobileNumber(mobilenumber);
    }

//    @And("Click the user group dropdown")
//    public void clickTheUserGroupDropdown() {
//        createUserAccountPage.clickUserGroup();
//    }

    @And("^Select the system admin user$")
    public void selectTheCustomerCareUser() {
        createUserAccountPage.clickUserGroup();
    }

    @Then("click the submit button")
    public void clickTheSubmitButton() {
        createUserAccountPage.clickSubmitBtn();
    }

    @And("Click the cancel button")
    public void clickTheCancelButton() {
        createUserAccountPage.clickCancelBtn();
    }



}
