package stepDefinitions;

import io.cucumber.java.en.*;
import pageObjects.CompleteSPAccountPage;
import utillities.BaseClass;

public class CompleteSPAccountPageSteps {

    CompleteSPAccountPage completeSPAccountPage = new CompleteSPAccountPage(BaseClass.steupBrowser());



    @And("^Enter the organization name as (.*)$")
    public void enterTheOrganizationNameAs(String organizationname) {
        completeSPAccountPage.enterOrganizationName(organizationname);
    }

    @Then("^Enter the legal entity as (.*)$")
    public void selectlegalentity(String legalentity){
        completeSPAccountPage.selectlegalentity(legalentity);
    }

    @Then("^Select the Province as (.*)$")
    public void selectprovince(String province){
        completeSPAccountPage.selectprovince(province);
    }

    @Then("^Select the City as (.*)$")
    public void selectcity(String city){
        completeSPAccountPage.selectcity(city);
    }

    @And("^Select the organization size$")
    public void selectTheOrganizationSize() {
        completeSPAccountPage.selectOrganizationSize();
    }

    @And("Select the industry")
    public void selectTheIndustry() {
        completeSPAccountPage.selectIndustry();
    }

    @And("^Enter the contact number as (.*)$")
    public void enterTheContactNumberAs(String contactnumber) {
        completeSPAccountPage.enterContactNumber(contactnumber);
    }


    @And("^Enter the fax number as (.*)$")
    public void enterTheFaxNumberAs(String faxnumber) {
        completeSPAccountPage.enterFaxNumber(faxnumber);
    }

    @And("Select the country")
    public void selectTheCountry() {
        completeSPAccountPage.selectCountry();
    }

    @And("Select the division")
    public void selectTheDivision() {
        completeSPAccountPage.selectDivision();
    }

    @And("Select the district")
    public void selectTheDistrict() {
        completeSPAccountPage.selectDistrict();
    }


    @And("^Enter Post code as (.*)$")
    public void enterPostCodeAs(String postcode) throws InterruptedException {
        Thread.sleep(5000);
        completeSPAccountPage.enterPostCode(postcode);
    }

    @And("^Enter Address as (.*)$")
    public void enterAddressAs(String address) throws InterruptedException {
        completeSPAccountPage.enterAddress(address);
    }

    @And("^Enter the name as (.*)$")
    public void enterTheNameAs(String name) {
        completeSPAccountPage.enterName(name);

    }


    @And("Select the gender")
    public void selectTheGender() {
        completeSPAccountPage.selectGender();

    }

    @And("^Enter the National ID as (.*)$")
    public void enterTheNationalIDAs(String nationalid) {
        completeSPAccountPage.enterNationalId(nationalid);

    }

    @And("^Enter the Passport Number as (.*)$")
    public void enterThePassportNumberAs(String passportnum) {
        completeSPAccountPage.enterPassportNum(passportnum);

    }

    @And("^Enter the Permanent Address as (.*)$")
    public void enterThePermanentAddressAs(String address) {
        completeSPAccountPage.enterPermanentAdd(address);
    }

    @And("^Enter the birthday as (.*)$")
    public void enterTheBirthdayAs(String date) {
        completeSPAccountPage.enterBirthday(date);
    }

    @And("Upload the NIC")
    public void uploadTheNIC() {
        completeSPAccountPage.uploadNIC();    }


    @Then("Click the next button")
    public void click_the_next_button() throws InterruptedException {
        Thread.sleep(2000);
        completeSPAccountPage.clickNextBtn();
    }

    @Then("Click the cancel btn")
    public void clickTheCancelBtn() {
        completeSPAccountPage.clickCancelBtn();
    }


    @Then("click the complete button")
    public void clickTheCompleteButton() {
        completeSPAccountPage.clickCompleteBtn();
    }

    @And("^Enter the Tax Identification Number as (.*)$")
    public void enterTheTaxIdentificationNumberAs(String taxidentificationnum) {
        completeSPAccountPage.entertaxIdentificationNumber(taxidentificationnum);
    }

    @And("^Enter the Beneficiary Name as (.*)$")
    public void enterTheBeneficiaryNameAs(String beneficiaryname) {
        completeSPAccountPage.enterBeneficiaryName(beneficiaryname);
    }

    @Then("^Select the legal entity as (.*)")

    @And("Select the Bank Name")
    public void selectTheBankName() {
        completeSPAccountPage.enterBankName();
    }

    @And("Select the Branch District Name")
    public void selectTheBranchDistrictName() throws InterruptedException {
        Thread.sleep(5000);
        completeSPAccountPage.enterBranchDistrictName();
    }

    @And("Select the Bank Branch Name")
    public void selectTheBankBranchName() throws InterruptedException {
        Thread.sleep(5000);
        completeSPAccountPage.enterBankBranchName();
    }

//    @And("^Enter the Bank Routing Number as (.*)$")
//    public void enterTheBankRoutingNumberAs(String bankroutingnumber) throws InterruptedException {
//        Thread.sleep(5000);
//        completeSPAccountPage.enterBankRoutingNumber(bankroutingnumber);
//    }

    @And("^Enter the Bank Account Number as (.*)$")
    public void enterTheBankAccountNumberAs(String bankAccountNumber) throws InterruptedException {
        Thread.sleep(5000);
        completeSPAccountPage.enterBankAccountNumber(bankAccountNumber);
    }

    @And("^Enter the Business Account Number as (.*)$")
    public void enterTheBusinessAccountNumberAs(String businessAccountNumber) {
        completeSPAccountPage.enterBusinessAccountNumber(businessAccountNumber);
    }

    @And("^Enter the Business License Number as (.*)$")
    public void enterTheBusinessLicenseNumberAs(String businessLicenseNumber) {
        completeSPAccountPage.enterBusinessLicenseNumber(businessLicenseNumber);
    }

    @Then("click the complete button on dashboard")
    public void clickcompletebtn(){
        completeSPAccountPage.clickprofileCompleteBtn();
    }


}
