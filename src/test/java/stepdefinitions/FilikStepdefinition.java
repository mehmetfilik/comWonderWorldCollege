package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FilikPage;

public class FilikStepdefinition {

    FilikPage filikPage = new FilikPage();

    @Then("User Should Navigate to the {string}")
    public void user_should_navigate_to_the(String url) {
        filikPage.navigateToHomepage();
    }
    @Then("Verification of Visibility of the Login Button on the Homepage")
    public void verification_of_visibility_of_the_login_button_on_the_homepage() {

    }
    @When("Verification of User Redirection to the {string} Page upon Clicking the Login Button")
    public void verification_of_user_redirection_to_the_page_upon_clicking_the_login_button(String string) {

    }
}
