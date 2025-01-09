package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjects.DashboardPage;
import utillities.BaseClass;

public class DashboardPageSteps {

    DashboardPage dashboardPage = new DashboardPage(BaseClass.steupBrowser());

    @Then("^Verify username as (.*)$")
    public void verifyUseranme(String username) {
        dashboardPage.verifyProfileName(username.toUpperCase());
    }


    @And("Click the user management icon")
    public void clickTheUserManagementIcon() {
        dashboardPage.clickUserManagementIcon();
    }

    @And("Click the sys admin user management icon")
    public void clickTheUserManagementIconsysadmin() {
        dashboardPage.clickUserManagementIconsysadmin();
    }

    @And("Click the complete banner button")
    public void clickTheCompleteBannerButton() {
        dashboardPage.clickCompleteBtn();
    }

    @And("verify the modules for system admin")
    public void verifyTheModulesForSystemAdmin() {
        dashboardPage.verifySystemAdminModules();

    }

    @And("verify the modules for SDP admin")
    public void verifyTheModulesForSDPAdmin() {
        dashboardPage.verifySDPAdminModules();

    }

//    @Then("Logout from the application")
//    public void logoutFromTheApplication() {
//        dashboardPage.clickLogoutButton();
//    }

    @Then("Hover over the profile dropdown")
    public void hoverOverProfileDropdown() {
        dashboardPage.hoverOverProfileDropdown();
    }

    @And("Click the Logout button")
    public void clickLogoutButton() {
        dashboardPage.clickLogoutButton();
    }

    @Then("Verify ideamart logo is align in center")
    public void verifylogoposition(){
        dashboardPage.verifylogoposition();
    }

    @Then("Click the Home button")
    public void clickhomebtn(){
        dashboardPage.clickhomebtn();
    }
}
