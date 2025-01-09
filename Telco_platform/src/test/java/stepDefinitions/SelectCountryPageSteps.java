package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjects.SelectCountryPage;
import utillities.BaseClass;

public class SelectCountryPageSteps {

    SelectCountryPage selectCountryPage = new SelectCountryPage(BaseClass.steupBrowser());

    @Then("Select a country")
    public void selectACountry() {
        selectCountryPage.selectCountry();
        selectCountryPage.clickRememberCountry();

    }

    @And("Click the continue button")
    public void clickTheContinueButton() {
        selectCountryPage.clickContinueButton();
    }




}
