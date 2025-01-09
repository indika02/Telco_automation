package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utillities.ActionCommands;

public class CompleteSPAccountPage extends ActionCommands{

    public By organizationNameTextBox = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]");
    public By organizationSizeDropDown = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/select[1]");
    public By industryDropDown = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/select[1]");
    public By contactNumberTextBox = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/input[1]");
    public By faxNumbersTextBox = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/input[1]");
    public By countryDropDown = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/select[1]");
    public By divisionDropDown = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]/select[1]");
    public By districtDropDown = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]");
    public By postCodeTextBox = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[6]/div[2]/div[1]/div[1]/div[1]/input[1]");
    public By addressTextBox = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/input[1]");
    // locators for contact person form
    public By nameTextBox = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]");
    public By genderDropDown = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/select[1]");
    public By nationalIDTextBox = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/div[1]/input[1]");
    public By passportNumberTextBox = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[1]/input[1]");
    public By permanentAddressTextBox = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[4]/div[2]/div[1]/div[1]/div[1]/input[1]");
    public By nicUploadInput = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]");
    public By datepicker=By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div/div/div[2]/div/div/form/div/div[2]/div[3]/div[1]/div/div/div");
    // locators for Reconciliation Details form
    public By taxIdentificationNumberTextBox = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]");

    public By beneficiaryNameTextBox = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]");

    public By bankNameDropDown = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]");
    public By branchDistrictNameDropDown = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]");
    public By bankBranchNameDropDown = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]");

    //public By bankRoutingNumberTextBox = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[4]/div[2]/div[1]/div[1]/div[1]/input[1]");
    public By bankAccountNumberTextBox = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/input[1]");
    public By businessAccountNumberTextBox = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[5]/div[2]/div[1]/div[1]/div[1]/input[1]");
    public By businessLicenseNumberTextBox = By.xpath("//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/input[1]");





    public By nextBtn = By.xpath("//button[contains(text(),'Next')]");
    public By completeBtn = By.xpath("//button[contains(text(),'Complete')]");
    public By cancelBtn = By.xpath("//button[contains(text(),'Cancel')]");
    public By Completeprofilebtn=By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div/div/div/div/div/div[2]/button");
    public By legalEntity=By.xpath("//*[@id=\"react-select-8-input\"]");
    public By province=By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div/div/div[2]/div/div/form/div/div[1]/div[5]/div[2]/div/div/div/div/div[1]");
    public By city=By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div/div/div[2]/div/div/form/div/div[1]/div[6]/div[1]/div/div/div/div/div[1]");



    WebDriver driver;


    public CompleteSPAccountPage(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver,this);
    }

    public void enterOrganizationName(String organizationname) {
        waitTime(driver, organizationNameTextBox);
        type(driver, organizationNameTextBox, organizationname);
    }

    public void selectlegalentity(String legalentity){
        waitTime(driver,legalEntity);
        click(driver,legalEntity);
        type(driver,legalEntity,legalentity);
        click(driver,legalEntity);
    }

    public void selectprovince(String pro){
        waitTime(driver,province);
        type(driver,province,pro);
    }

    public void selectcity(String City){
        waitTime(driver,city);
        type(driver,city,City);
    }

    public void selectOrganizationSize(){
        waitTime(driver, organizationSizeDropDown);
        Select dropdown = new Select(driver.findElement(organizationSizeDropDown));
        dropdown.selectByIndex(1);
    }

    public void selectIndustry(){
        waitTime(driver, industryDropDown);
        Select dropdown = new Select(driver.findElement(industryDropDown));
        dropdown.selectByIndex(1);
    }

    public void enterContactNumber(String contactnumber){
        waitTime(driver, contactNumberTextBox);
        type(driver, contactNumberTextBox, contactnumber);
    }

    public void enterFaxNumber(String faxnumber){
        waitTime(driver, faxNumbersTextBox);
        type(driver, faxNumbersTextBox, faxnumber);
    }

    public void selectCountry(){
        waitTime(driver, countryDropDown);
        Select dropdown = new Select(driver.findElement(countryDropDown));
        dropdown.selectByIndex(1);
    }

    public void selectDivision(){
        waitTime(driver, divisionDropDown);
        Select dropdown = new Select(driver.findElement(divisionDropDown));
        dropdown.selectByIndex(2);
    }

    public void selectDistrict() {
        waitTime(driver, districtDropDown);
        click(driver, districtDropDown);


    }

    public void enterPostCode(String postcode){
        waitTime(driver, postCodeTextBox);
        type(driver, postCodeTextBox, postcode);
    }

    public void enterAddress(String address) throws InterruptedException {
        //waitTime(driver, addressTextBox);
        Thread.sleep(2000);

        type(driver, addressTextBox, address);
    }

    //Contact form
    public void enterName(String name){
        waitTime(driver, nameTextBox);
        type(driver, nameTextBox, name);
    }

    public void enterBirthday(String date) {

        WebElement birthdayCombo = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]"));
        birthdayCombo.click();
        birthdayCombo.sendKeys(date);

    }

    public void selectGender(){
        waitTime(driver, genderDropDown);
        Select dropdown = new Select(driver.findElement(genderDropDown));
        dropdown.selectByIndex(2);
    }

    public void enterNationalId(String nationalid){
        waitTime(driver, nationalIDTextBox);
        type(driver, nationalIDTextBox, nationalid);
    }

    public void enterPassportNum(String passportnum){
        waitTime(driver, passportNumberTextBox);
        type(driver, passportNumberTextBox, passportnum);
    }

    public void enterPermanentAdd(String address){
        waitTime(driver, permanentAddressTextBox);
        type(driver, permanentAddressTextBox, address);
    }

    public void uploadNIC(){
        waitTime(driver, nicUploadInput);
        click(driver, nicUploadInput);
    }

    // Reconciliation Details form
    public void entertaxIdentificationNumber(String taxidentificationnum){
        waitTime(driver,taxIdentificationNumberTextBox);
        type(driver,taxIdentificationNumberTextBox,taxidentificationnum);
    }

    public void enterBeneficiaryName(String beneficiaryname){
        waitTime(driver,beneficiaryNameTextBox);
        type(driver,beneficiaryNameTextBox,beneficiaryname);
    }

    public void enterBankName(){
        waitTime(driver, bankNameDropDown);
        click(driver, bankNameDropDown);

    }

    public void enterBranchDistrictName(){
        waitTime(driver, branchDistrictNameDropDown);
        click(driver, branchDistrictNameDropDown);

    }

    public void enterBankBranchName(){
        waitTime(driver, bankBranchNameDropDown);
        click(driver, bankBranchNameDropDown);
    }

//    public void enterBankRoutingNumber(String bankroutingnumber){
//        waitTime(driver,bankRoutingNumberTextBox);
//        type(driver,bankRoutingNumberTextBox,bankroutingnumber);
//    }

    public void enterBankAccountNumber(String bankAccountNumber){
        waitTime(driver,bankAccountNumberTextBox);
        type(driver,bankAccountNumberTextBox,bankAccountNumber);
    }

    public void enterBusinessAccountNumber(String businessAccountNumber){
        waitTime(driver,businessAccountNumberTextBox);
        type(driver,businessAccountNumberTextBox,businessAccountNumber);
    }

    public void enterBusinessLicenseNumber(String businessLicenseNumber){
        waitTime(driver,businessLicenseNumberTextBox);
        type(driver,businessLicenseNumberTextBox,businessLicenseNumber);
    }


    public void clickNextBtn(){
        waitTime(driver, nextBtn);
        click(driver, nextBtn);
    }

    public void clickCompleteBtn(){
        waitTime(driver,completeBtn);
        click(driver,completeBtn);
    }

public void clickprofileCompleteBtn(){
        click(driver,Completeprofilebtn);
}

    public void clickCancelBtn(){
        waitTime(driver, cancelBtn);
        click(driver, cancelBtn);
    }




}
