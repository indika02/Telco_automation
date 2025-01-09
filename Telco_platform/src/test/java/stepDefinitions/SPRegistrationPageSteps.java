package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjects.SPRegistrationPage;
import utillities.BaseClass;
import utillities.ConfigDataProvider;
import utillities.OperatorConfigDataProvider;
import utillities.TemporaryEmailInteractor;

public class SPRegistrationPageSteps {

    SPRegistrationPage spRegistrationPage = new SPRegistrationPage(BaseClass.steupBrowser());
    TemporaryEmailInteractor temporaryEmailInteractor = new TemporaryEmailInteractor();
    private String generatedEmail;

    OperatorConfigDataProvider operatorConfigDataProvider = new OperatorConfigDataProvider();
    ConfigDataProvider configDataProvider = new ConfigDataProvider();

    @And("^Check common form elements$")
    public void checkCommonUI() {
        spRegistrationPage.verifyElementUsername();
        spRegistrationPage.verifyElementEmail();
        spRegistrationPage.verifyElementMobile(operatorConfigDataProvider.getmsisdnPlaceholder());
        spRegistrationPage.verifyElementPassword();
    }

    @And("^Check operator base form elements$")
    public void checkOperatorUI() {
        String operator = configDataProvider.getOperator();
        if (operator.equals("mspace")) {
            spRegistrationPage.verifyElementTermCheckbox();
            spRegistrationPage.verifyTermsValues(operatorConfigDataProvider.getTermsMessage());
        } else if (operator.equals("robi")) {
            spRegistrationPage.verifyVerificationMethodLable(operatorConfigDataProvider.getVerificationMethodMessage());
        } else if (operator.equals("banglalink")) {
            spRegistrationPage.verifyVerificationMethodLable(operatorConfigDataProvider.getVerificationMethodMessage());
            spRegistrationPage.verifyConfirmPasswordTextBox();
        }else if (operator.equals("digimart")) {
            spRegistrationPage.verifyVerificationMethodLable(operatorConfigDataProvider.getVerificationMethodMessage());
            spRegistrationPage.verifyConfirmPasswordTextBox();
        }else if (operator.equals("ideamart")) {
            spRegistrationPage.verifyVerificationMethodLable(operatorConfigDataProvider.getVerificationMethodMessage());
            spRegistrationPage.verifyConfirmPasswordTextBox();
        }

    }
    @Then("^Type username as (.*)$")
    public void typeUsername(String username) throws InterruptedException {
        spRegistrationPage.typeUsername(username);
    }

//    @Then("Type email as")
//    public void typeEmail() throws InterruptedException {
//        generatedEmail = temporaryEmailInteractor.getGeneratedEmail();
//        spRegistrationPage.typeEmail(generatedEmail);
//    }

    @Then("^Type email as (.*)$")
    public void typeEmail(String email){
        spRegistrationPage.typeEmail(email);
    }

    @Then("^Type mobilenumber as (.*)$")
    public void typeMobileNumber(String mobileNumber) throws InterruptedException {
        spRegistrationPage.typeMobileNumber(mobileNumber);
    }

    @Then("^Type password as (.*)$")
    public void typePassword(String password) throws InterruptedException {
        spRegistrationPage.typePassword(password);
    }

    @And("^Type confirm password as (.*)$")
    public void typeConfirmPasswordAsTesting(String password) throws InterruptedException {
        spRegistrationPage.typeConfirmPassword(password);
    }

    @And("Choose verification method {string}")
    public void chooseVerificationMethod(String method) throws InterruptedException {
        if ("email".equalsIgnoreCase(method)) {
            spRegistrationPage.clickEmailVerification();
        } else if ("sms".equalsIgnoreCase(method)) {
            spRegistrationPage.clickSmsVerification();
        }
    }

    @And("Select the TermsandConditions")
    public void selectTheTermsandConditions() throws InterruptedException {
        spRegistrationPage.clickTermsandConditions();
    }

    @And("click the login link")
    public void clickTheLoginLink() throws InterruptedException {
        spRegistrationPage.clickOnLoginLink();
    }


    @And("click the continue button")
    public void clickTheContinueButton() throws InterruptedException {
            spRegistrationPage.clickContinueBtn();
        }

    @Then("click the resend link")
    public void clickTheResendLink() throws InterruptedException {
        spRegistrationPage.clickResendLink();
    }


    @Then("^Enter invalid OTP as (.*)$")
    public void typeOtp(String otp) throws InterruptedException {
        spRegistrationPage.typeOtp(otp);

    }

    @Then("enter the valid otp")
    public void enterTheValidOtp() throws InterruptedException {
        String senderEmail = "tapsender@hsenidmobile.com";
        String expectedSubject = "Please use the below One Time Password (OTP) to verify your mSpace account.";

        // Wait for the email to arrive
        Thread.sleep(5000); // Adjust the delay as needed
        String otp = temporaryEmailInteractor.getOtpFromEmail(senderEmail, expectedSubject);

        if (otp != null) {
            // Enter the extracted OTP into the OTP text box
            spRegistrationPage.typeOtp(otp);
        } else {
            // Handle the case where OTP is not found
            System.out.println("Unable to extract OTP from the email.");
        }
    }



}
