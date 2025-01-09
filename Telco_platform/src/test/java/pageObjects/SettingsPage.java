package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utillities.ActionCommands;


public class SettingsPage extends ActionCommands {


    protected By settingsButton = By.xpath("//a[@id='profile-settings-link']");

    // locators for the Basic Details Form
    public By userNameTextBox = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]");
    public By emailTextBox = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]");
    public By mobileNumberTextBox = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/input[1]");

    // locators for the organizational Form
    public By organizationDetailsForm = By.xpath("//a[contains(text(),'Organization Details')]");
    public By organizationNameTextBox = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]");
    public By organizationSizeDropDown= By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/select[1]");
    public By industryDropDown = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/select[1]");
    public By countryDropDown= By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/select[1]");
    public By divisionDropDown= By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/select[1]");
    public By districtDropDown= By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]");
    public By postCodeTextBox = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/input[1]");
    public By addressTextBox = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/input[1]");
    public By contactNumberTextBox = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/input[1]");
    public By faxNumberTextBox = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]/div[1]/input[1]");

    // locators for Contact Person Form
    public By contactPersonForm = By.xpath("//a[contains(text(),'Contact person')]");
    public By nameTextBox = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]");
    public By birthdayComboBox = By.xpath("//input[@id='rw_4_input']");
    public By genderDropDown = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/select[1]");
    public By nationalIdTextBox = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]");
    public By passportNumberTextBox = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/input[1]");
    public By permanentAddressTextBox = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/input[1]");

    //locators for Reconciliation Details form
    public By reconciliationDetailsForm = By.xpath("//a[contains(text(),'Reconciliation Details')]");
    public By taxIdentificationNumberTextBox = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]");
    public By beneficiaryNameTextBox = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div/div/div[3]/div/div/div/div[2]/form/div/div[1]/div[1]/div/div/div[1]/div/input");
    public By bankNameDropDown = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]");
    public By branchDistrictNameDropDown = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]");
    public By bankBranchNameDropDown = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]");
    public By bankRoutingNumberTextBox = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/input[1]");
    public By bankAccountNumberTextBox = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/input[1]");
    public By businessAccountNumberTextBox = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/input[1]");
    public By businessLicenseNumberTextBox = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/input[1]");
    public By savebtn=By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div/div/div[3]/div/div/div/div[2]/form/div/div[2]/div/div[2]/button");
    public By bankerror=By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div/div/div[3]/div/div/div/div[2]/form/div/div[1]/div[2]/div/div/div[2]");

    // locators for terms & conditions
    public By termsAndConditionsForm = By.xpath("//a[contains(text(),'Terms And Conditions')]");
    public By downloadbtn = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]");

    // locators for the security form
    public By editBtn = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/i[1]");
    public By securityTab = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]");
    public By loginNameTexBox = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]");
    public By currentPasswordTextBox =By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[2]");
    public By newPasswordTextBox = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/input[2]");
    public By reEnterNewPasswordTextBox = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/input[2]");
    public By changePasswordBtn = By.xpath("//button[contains(text(),'Change')]");
    public By yesBtn = By.xpath("//button[contains(text(),'Yes')]");
    public By benificiaryTab=By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div/div/div[2]/div/ul/li[4]/a");
    public By bnameError=By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div/div/div/div[3]/div/div/div/div[2]/form/div/div[1]/div[1]/div/div/div[2]");



    WebDriver driver;

    public SettingsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void clickSettingsButton() {
        waitTime(driver, settingsButton);
        click(driver, settingsButton);
    }


    public void clicktermsAndConditionsForm(){
        waitTime(driver, termsAndConditionsForm);
        click(driver, termsAndConditionsForm);
    }
    public void clickdownloadbtn(){
        waitTime(driver, downloadbtn);
        click(driver, downloadbtn);
    }

    public void verifyBasicDetailsFormElements() {
        waitTime(driver, userNameTextBox);
        assertElementExists(driver, userNameTextBox, "User Name");
        assertElementExists(driver, emailTextBox, "Email");
        assertElementExists(driver, mobileNumberTextBox, "Mobile Number");
    }

    public void clickOrganizationDetailsForm(){
        waitTime(driver, organizationDetailsForm);
        click(driver, organizationDetailsForm);
    }

    public void clickbenificiarytab(){
        click(driver,benificiaryTab);
    }

    public void verifyOrganizationDetailsFormElements() {
        waitTime(driver, organizationNameTextBox);
        assertElementExists(driver, organizationNameTextBox, "organizationName");
        assertElementExists(driver, organizationSizeDropDown, "Organization Size");
        assertElementExists(driver, industryDropDown, "Industry");
        assertElementExists(driver, countryDropDown, "Country");
        assertElementExists(driver, divisionDropDown, "Division");
        assertElementExists(driver, districtDropDown, "District");
        assertElementExists(driver, postCodeTextBox, "Post Code");
        assertElementExists(driver, addressTextBox, "Address");
        assertElementExists(driver, contactNumberTextBox, "Contact Number");
        assertElementExists(driver, faxNumberTextBox, "Fax Number");
    }

    public void clickContactPersonForm(){
        waitTime(driver, contactPersonForm);
        click(driver, contactPersonForm);
    }

    public void verifyContactPersonFormElements() {
        waitTime(driver, nameTextBox);
        assertElementExists(driver, nameTextBox, "name");
        assertElementExists(driver, birthdayComboBox, "birthday");
        assertElementExists(driver, genderDropDown, "gender");
        assertElementExists(driver, nationalIdTextBox, "nationalId");
        assertElementExists(driver, passportNumberTextBox, "passportNumber");
        assertElementExists(driver, permanentAddressTextBox, "permanentAddress");
    }

    public void clickreconciliationDetailsForm(){
        waitTime(driver, reconciliationDetailsForm);
        click(driver, reconciliationDetailsForm);
    }

    public void verifyReconciliationDetailsFormElements() {
        waitTime(driver, taxIdentificationNumberTextBox);
        assertElementExists(driver, taxIdentificationNumberTextBox, "tax Identification Number");
        assertElementExists(driver, beneficiaryNameTextBox, "beneficiary Name");
        assertElementExists(driver, bankNameDropDown, " bank Name");
        assertElementExists(driver, branchDistrictNameDropDown, "Branch District Name");
        assertElementExists(driver, bankBranchNameDropDown, "bank Branch Name");
        assertElementExists(driver, bankRoutingNumberTextBox, "bank Routing Number");
        assertElementExists(driver, bankAccountNumberTextBox, "bank Account Number");
        assertElementExists(driver, businessAccountNumberTextBox, " business Account Number");
        assertElementExists(driver, businessLicenseNumberTextBox, " business License Number");
    }

    public void clickSecurityTab(){
        waitTime(driver, securityTab);
        click(driver, securityTab);
    }

    public void verifyChangePasswordFormElements() {
        waitTime(driver, loginNameTexBox);
        assertElementExists(driver, loginNameTexBox, "Login Name");
        assertElementExists(driver, currentPasswordTextBox, "Enter your current password ");
        assertElementExists(driver, newPasswordTextBox, "Choose a new password ");
        assertElementExists(driver, reEnterNewPasswordTextBox, "Re-enter new password ");

    }



    public void clickEditBtn(){
        waitTime(driver, editBtn);
        click(driver, editBtn);
    }

    public void enterCurrentPassword(String currentpassword){
        waitTime(driver, currentPasswordTextBox);
        type(driver,currentPasswordTextBox,currentpassword);
    }

    public void enterNewPassword(String newpassword){
        waitTime(driver, newPasswordTextBox);
        type(driver,newPasswordTextBox,newpassword);
    }

    public void enterReEnterNewPassword(String reenternewpassword){
        waitTime(driver, reEnterNewPasswordTextBox);
        type(driver,reEnterNewPasswordTextBox,reenternewpassword);
    }

    public void clickChangePasswordBtn(){
        waitTime(driver, changePasswordBtn);
        click(driver, changePasswordBtn);
    }

    public void verifyValidationMsg(String expectedValidationMsg) {
        By validationMessage = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]");
        String actualValidationMsg = getText(driver, validationMessage);
        assetString(expectedValidationMsg, actualValidationMsg);
    }

    public void verifyInvalidValidationMsg(String expectedValidationMsg) {
        By validationMessage = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[2]");
        String actualValidationMsg = getText(driver, validationMessage);
        assetString(expectedValidationMsg, actualValidationMsg);
    }

    public void clickYesBtn(){
        waitTime(driver, yesBtn);
        click(driver, yesBtn);
    }

    public void verifybnameerrormsg(String error){
        waitTime(driver,bnameError);
        verifyText(driver,bnameError,error);
    }

    public void enterbname(String bname){
        waitTime(driver,beneficiaryNameTextBox);
        type(driver,beneficiaryNameTextBox,bname);
    }

    public void clicksavebtnbform(){
        waitTime(driver,savebtn);
        click(driver,savebtn);
    }

    public void verifybankerror(String text){
        waitTime(driver,bankerror);
        verifyText(driver,bankerror,text);
    }

}
