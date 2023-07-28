package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.CommonPage;
import pages.FilikPage;
import pages.HamzaPage;
import utilities.ConfigReader;
import utilities.Driver;

public class HamzaStepdefinition {

    HamzaPage hamzaPage = new HamzaPage();
    @Given("User goes to {string}")
    public void goesToAdminPage(String requestedUrl){
        Driver.getDriver().get(ConfigReader.getProperty(requestedUrl));
    }


    @Given("User clicks on the {string} button")
    public void userClicksOnTheButton(String adminLoginButton) {

    }

    @Then("The user enters the email and password and clicks the sign in button.")
    public void theUserEntersTheEmailAndPasswordAndClicksTheSignInButton() {
    }
}
