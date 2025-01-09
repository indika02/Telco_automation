package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjects.SettingsPage;
import utillities.BaseClass;
import utillities.ActionCommands;

public class SettingsPageSteps extends ActionCommands {

    SettingsPage settingsPage = new SettingsPage(BaseClass.steupBrowser());

    @Then("Click the settings button")
    public void click_the_settings_button() {
        settingsPage.clickSettingsButton();

    }

    @Then("Click the Organization Details form")
    public void clickTheOrganizationDetailsForm() {
        settingsPage.clickOrganizationDetailsForm();
    }

    @Then("Click the Benificiary details tab")
    public void Click_the_Benificiary_details_tab(){
        settingsPage.clickbenificiarytab();
    }

    @And("Verify the Basic Details form UI elements")
    public void verifyTheBasicDetailsFormUIElements() {
        settingsPage.verifyBasicDetailsFormElements();
    }

    @And("Verify the Organization Details UI elements")
    public void verifyTheOrganizationDetailsUIElements() {
        settingsPage.verifyOrganizationDetailsFormElements();

    }

    @And("Click the Terms and Conditions form")
    public void clickTheTermsAndConditionsForm() {
        settingsPage.clicktermsAndConditionsForm();

    }

    @Then("Click the download button")
    public void clickTheDownloadButton() {
        settingsPage.clickdownloadbtn();
    }

    @Then("Click the Contact person form")
    public void clickTheContactPersonForm() {
        settingsPage.clickContactPersonForm();
        
    }

    @And("Verify the Contact person UI elements")
    public void verifyTheContactPersonUIElements() {
        settingsPage.verifyContactPersonFormElements();
    }

    @Then("Click the Reconciliation Details form")
    public void clickTheReconciliationDetailsForm() {
        settingsPage.clickreconciliationDetailsForm();
        
    }

    @And("Verify the Reconciliation Details UI elements")
    public void verifyTheReconciliationDetailsUIElements() {
        settingsPage.verifyReconciliationDetailsFormElements();
    }

    @Then("Navigate to security tab")
    public void navigateToSecurityTab() throws InterruptedException {
        Thread.sleep(3000);
        settingsPage.clickSecurityTab();

    }

    @And("Verify the Change Password form")
    public void verifyTheChangePasswordForm() {
        settingsPage.verifyChangePasswordFormElements();

    }

    @And("click the edit button")
    public void clickTheEditButton() {
        settingsPage.clickEditBtn();
    }

    @Then("click the change button")
    public void clickTheChangeButton() {
        settingsPage.clickChangePasswordBtn();

    }

    @And("^Enter the current password as (.*)$")
    public void enterTheCurrentPasswordAs(String currentpassword) {
        settingsPage.enterCurrentPassword(currentpassword);

    }

    @And("^Enter the new password as (.*)$")
    public void enterTheNewPasswordAs(String newpassword) {
        settingsPage.enterNewPassword(newpassword);
    }


    @Then("^Verify the validation message when current and new password are different (.*)$")
    public void verifyTheValidationMessageWhenCurrentAndNewPasswordAreDifferent(String expectedValidationMsg) throws InterruptedException {
        Thread.sleep(3000);
        settingsPage.verifyValidationMsg(expectedValidationMsg);
    }

    @Then("^Enter the Re-enter new password as (.*)$")
    public void enterTheReEnterNewPasswordAs(String reenternewpassword) {
        settingsPage.enterReEnterNewPassword(reenternewpassword);
    }

    @And("Verify the validation message when Re-enter new password is an invalid format")
    public void verifyTheValidationMessageWhenReEnterNewPasswordIsAnInvalidFormat() throws InterruptedException {
        Thread.sleep(3000);
        String expectedValidationMsg = " Enter alphanumeric with special characters.Password length 10-20";
        settingsPage.verifyInvalidValidationMsg(expectedValidationMsg);

    }

    @Then("Click the yes button")
    public void clickTheYesButton() {
        settingsPage.clickYesBtn();
    }


    @Then("^verify the Benificiary name error message as (.*)$")
    public void verifybnameerrormsg(String error){
        settingsPage.verifybnameerrormsg(error);
    }
    @Then("^Enter bname as (.*)$")
    public void enterbname(String bname){
        settingsPage.enterbname(bname);
    }

    @Then("Click the benificary form save button")
    public void clicksavebtnbform(){
        settingsPage.clicksavebtnbform();
    }

    @Then("^Verify the bankname error message in benificiary form as (.*)$")
    public void verifybankerror(String text){
        settingsPage.verifybankerror(text);
    }
}
