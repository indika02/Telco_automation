package stepDefinitions;
import io.cucumber.java.en.*;

import pageObjects.ViewUserAccountPage;
import utillities.BaseClass;

public class ViewUserAccountPageSteps {

    ViewUserAccountPage viewUserAccountPage = new ViewUserAccountPage(BaseClass.steupBrowser());

    @Then("Click the suspend button")
    public void click_the_suspend_button() {
       viewUserAccountPage.clickSuspendBtn();
    }


    @And("Click the delete button")
    public void clickTheDeleteButton() {
        viewUserAccountPage.clickDeleteBtn();
        
    }

    @And("Click the unlock button")
    public void clickTheUnlockButton() {
        viewUserAccountPage.clickUnlockBtn();


    }

    @And("Click the edit button")
    public void clickTheEditButton() {
        viewUserAccountPage.clickEditBtn();
    }

    @Then("^Delete the existing text (.*)$")
    public void deleteTextinBox(String textboxname){
        viewUserAccountPage.deleteTextinBox(textboxname);
    }

    @Then("^Enter invalid email as (.*)$")
    public void enterinvalidemail(String invalidemail){
        viewUserAccountPage.enterinvalidemail(invalidemail);
    }

    @Then("^verify the firstname error message as (.*)$")
    public void verifyfnameerrormsg(String msg){
        viewUserAccountPage.verifyfnameerrormsg(msg);
    }

    @Then("^verify the laststname error message as (.*)$")
    public void verifylnameerrormsg(String msg){
        viewUserAccountPage.verifylnameerrormsg(msg);
    }

    @Then("^verify the email error message as (.*)$")
    public void verifyemailerrormsg(String msg){
        viewUserAccountPage.verifyemailerrormsg(msg);
    }



    @Then("Click the verify button")
    public void clickTheVerifyButton() {
        viewUserAccountPage.clickverifySPAccountBtn();

    }

    @Then("^Enter comment to verify as (.*)$")
    public void enterCommentToVerify(String comment) {
        viewUserAccountPage.enterComment(comment);
    }

    @Then("Click the Security tab")
    public void clickTheSecurityTab() {
        viewUserAccountPage.clicksecurityDetailsForm();
    }

    @Then("Click the top-Security tab")
    public void clickThetopSecurityTab() {
        viewUserAccountPage.clicktopsecuritytab();
    }

    @And("Click the Reset Password button")
    public void clickTheResetPasswordButton() {
        viewUserAccountPage.clickResetPasswordBtn();
    }
}
