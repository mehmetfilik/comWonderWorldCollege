package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.SametPage;
import utilities.ConfigReader;
import utilities.Driver;

public class SametStepdefinitons {

SametPage sametPage = new SametPage();

    @Given("The user goes to the WonderWorldCollege homepage.")
    public void the_user_goes_to_the_wonder_world_college_homepage() {

        Driver.getDriver().get(ConfigReader.getProperty("wonderUrl"));
    }
    @Then("The user tests if the homepage is visible.")
    public void the_user_tests_if_the_homepage_is_visible() {

        Assert.assertTrue(sametPage.pageLogo.isDisplayed());
    }
    @Then("The user closes the page")
    public void the_user_closes_the_page() {

        Driver.closeDriver();
    }

}
