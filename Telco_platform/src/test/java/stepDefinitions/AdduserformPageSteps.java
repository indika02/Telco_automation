package stepDefinitions;

import io.cucumber.java.en.Then;
import pageObjects.AdduserformPage;
import pageObjects.CompleteSPAccountPage;
import utillities.BaseClass;

public class AdduserformPageSteps {

    AdduserformPage AdduserformPage = new AdduserformPage(BaseClass.steupBrowser());

    @Then("^Enter first name for new admin as (.*)$")
    public void enterfirstname(String fname){
        AdduserformPage.enterfirstname(fname);
    }

    @Then("^Enter last name for new admin as (.*)$")
    public void enterlastname(String lname){
        AdduserformPage.enterlastname(lname);
    }

    @Then("^Enter designation for new admin as (.*)$")
    public void enterdesignation(String designation){
        AdduserformPage.enterdesignation(designation);
    }

    @Then("^Enter email for new admin as (.*)$")
    public void enteremail(String email){
        AdduserformPage.enteremail(email);
    }

    @Then("Enter username for new admin")
    public void enterusername(){
        AdduserformPage.enterusername();
    }

    @Then("^Enter mobileno for new admin as (.*)$")
    public void entermobileno(String mob){
        AdduserformPage.entermobno(mob);
    }

    @Then("^Enter address for new admin as (.*)$")
    public void enteraddress(String addr){
        AdduserformPage.enteraddress(addr);
    }

    @Then("^Select usergroup for new admin as (.*)")
    public void enterusergroup(String group){
        AdduserformPage.selectusergroup(group);
    }

    @Then("Click the submit button of adduser form")
    public void clicksubmit(){
        AdduserformPage.clicksubmit();
    }

    @Then("Click the cancel button of adduser form")
    public void clickcancel(){
        AdduserformPage.clickcancel();
    }

}
