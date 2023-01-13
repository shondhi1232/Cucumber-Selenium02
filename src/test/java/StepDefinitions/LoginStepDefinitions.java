package StepDefinitions;

import Pages.loginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import setup.Setup;

public class LoginStepDefinitions extends Setup {
    loginPage login;
    @Given("User visited the portal")
    public void user_visited_the_portal() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }
    @When("User inputs valid {string} and {string}")
    public void user_inputs_valid_and(String username, String password) {
        login = new loginPage(driver);
        login.dologin(username,password);
    }
    @Then("User can see dashboard")
    public void user_can_see_dashboard() {
        String ActualUrl = driver.getCurrentUrl();
        Assert.assertTrue(ActualUrl.contains("dashboard"));
        driver.close();
    }

}
