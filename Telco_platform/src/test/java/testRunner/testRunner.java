package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //features = "Features/",
        //features = "Features/03Complete_sp_account.feature",
//        features = "Features/Dashboard.feature",
//         features = "Features/02Login.feature",
        //features = "Features/Settings.feature",
//        features = "Features/Registration.feature",
        features = "Features/User_management.feature",

        glue = {"stepDefinitions"},
        plugin = {"json:target/cucumber.json"},
        tags = {"@ideamart"},
        monochrome = true

)
public class testRunner {

}
