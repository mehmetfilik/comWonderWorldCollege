package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.AliPage;

public class AliStepdefinition {

    AliPage aliPage = new AliPage();

    @Then("The user tests if {string} section on the homepage is visible.")
    public void theUserTestsIfSectionOnTheHomepageIsVisible(String arg0) {

        Assert.assertTrue(aliPage.ourExperiencedStaffs.isDisplayed());


    }

    @Then("The user tests if in the {string} section Anthony Carter is displayed")
    public void theUserTestsIfInTheSectionAnthonyCarterIsDisplayed(String arg0) {

        Assert.assertTrue(aliPage.anthonyCarter.isDisplayed());


    }

    @Then("The user tests if in the {string} section Ava Turner is displayed")
    public void theUserTestsIfInTheSectionAvaTurnerIsDisplayed(String arg0) {

        Assert.assertTrue(aliPage.avaTurner.isDisplayed());
    }

    @Then("The user tests if in the {string} section Davidson Morgan is displayed")
    public void theUserTestsIfInTheSectionDavidsonMorganIsDisplayed(String arg0) {

        Assert.assertTrue(aliPage.davidMorgan.isDisplayed());

    }

    @Then("The user tests if in the {string} section Lily Peterson is displayed")
    public void theUserTestsIfInTheSectionLilyPetersonIsDisplayed(String arg0) {

        Assert.assertTrue(aliPage.lilyPeterson.isDisplayed());
    }

    @Then("The user tests if WHAT PEOPLE SAY section on the homepage is visible.")
    public void theUserTestsIfWHATPEOPLESAYSectionOnTheHomepageIsVisible() {

        Assert.assertTrue(aliPage.whatPeopleSays.isDisplayed());
    }

    @Then("The user tests if there are testimonials or comments from different individuals")
    public void theUserTestsIfThereAreTestimonialsOrCommentsFromDifferentIndividuals() {

        Assert.assertTrue(aliPage.testimonial.isDisplayed());


    }

    @When("I click on the Academics dropdown menu")
    public void iClickOnTheAcademicsDropdownMenu() {

        Select select= new Select(aliPage.academicsDDM);
        aliPage.academicsDDM.click();
        aliPage.academicsDdmTeacher.click();

    }
}