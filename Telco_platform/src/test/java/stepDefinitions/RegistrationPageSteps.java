package stepDefinitions;



import io.cucumber.java.en.Then;
import pageObjects.RegistrationPage;
import utillities.BaseClass;
import utillities.OperatorConfigDataProvider;

public class RegistrationPageSteps {
    RegistrationPage registrationPage = new RegistrationPage(BaseClass.steupBrowser());
    OperatorConfigDataProvider operatorConfigDataProvider = new OperatorConfigDataProvider();




@Then("^Register as a new user")
public void registerAsNewUser(){
    registrationPage.registerNewUser();
}

@Then("^Set username as (.*)$")
public void setusername(String username){
    registrationPage.setusername(username);
}

@Then("^Set Email as (.*)$")
    public void setEmail(String email){
    registrationPage.setEmail(email);
}

@Then("^Set Username as (.*)$")
public void setunameapplink(String uname){
    registrationPage.setunameapplink(uname);
}

@Then("Set Mobile number as (.*)$")
    public void setMobileNumber(String mobileNumber){
    registrationPage.setMobileNumber(mobileNumber);
}

@Then("Set Password as (.*)$")
    public void setPassword(String password){
    registrationPage.setPassword(password);
}

@Then("Confirm password as (.*)$")
    public void confirmPassword(String password){
    registrationPage.setConfirmPassword(password);
}

@Then("^Confirm the password match error msg as (.*)$")
public void verifypwdmatcherror(String text){
    registrationPage.verifypwdmatcherror(text);
}
@Then("Agree the agreement")
    public void agreeTheAgreement(){
    registrationPage.tickAgreement();
}

@Then("Continue")
    public void continueAgreement(){
    registrationPage.clickContinueButton();
}

@Then("Click Forget password Button")
    public void forgetPasswordButton(){
    registrationPage.clickForgetPassword();
}

@Then("Search For user name (.*)$")
    public void searchForUserName(String userName){
    registrationPage.giveForgotPasswordUserName(userName);
}

@Then("Click Submit Button")
    public void submitButton(){
    registrationPage.clickSubmit();
}

@Then("Hover Over Profile")
    public void hoverOnProfile(){
    registrationPage.hoverOverProfile();
}

@Then("Click Settings Button")
    public void clickSettingsButton(){
    registrationPage.clickSettings();
}

@Then("Click Bank Details")
    public void clickBankDetails(){
    registrationPage.clickBankDetails();
}

@Then("Click Edit Button")
    public void clickEditButton(){
    registrationPage.clickEditButton();
}

@Then("Click the Benificiary's name field")
public void Click_the_Benificiarys_name_field(){
    registrationPage.clickOnBnameField();
}

@Then("Click save Button")
public void click_save_button(){
    registrationPage.clickSaveBtn();
}

@Then("Verify Report is not Editable")
    public void notEditable(){
    registrationPage.isItNotEditable();
}

@Then("^Verify the error message as (.*)$")
    public void verify_the_error_message(String text){
    registrationPage.validateEmailError(text);
}

@Then("^Verify the mobileno error message as (.*)$")
public void verify_mobileno_error_msg(String text){
    registrationPage.validatemobnoError(text);
}


}
