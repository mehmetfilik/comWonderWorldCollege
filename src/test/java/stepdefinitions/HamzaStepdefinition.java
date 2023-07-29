package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CommonPage;
import pages.FilikPage;
import pages.HamzaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class HamzaStepdefinition {

    HamzaPage hamzaPage = new HamzaPage();
    CommonPage commonPage = new CommonPage();

    @Given("User goes to {string}")
    public void goesToAdminPage(String requestedUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(requestedUrl));
    }


    @Given("User clicks on the {string} button")
    public void userClicksOnTheButton(String adminLoginButton) {
        hamzaPage.adminLoginButton.click();
        ReusableMethods.switchToWindow("Login : Wonder World College");

    }

    @Then("The user enters the email and password and clicks the sign in button.")
    public void theUserEntersTheEmailAndPasswordAndClicksTheSignInButton() {
        hamzaPage.adminEmailBox.sendKeys(ConfigReader.getProperty("validHamzaAdminEmail"));
        hamzaPage.adminPasswordBox.sendKeys(ConfigReader.getProperty("validHamzaAdminPassword"));
        hamzaPage.signInButton.click();
    }


    @When("User verifies that the Student Details link is visible under the Student Information section in the admin page")
    public void userVerifiesThatTheStudentDetailsLinkIsVisibleUnderTheStudentInformationSectionInTheAdminPage() {
        hamzaPage.studentInformationLink.click();
        hamzaPage.studentDetailsLink.isDisplayed();
        
    }

    @And("User clicks on the Student Details link")
    public void userClicksOnTheStudentDetailsLink() {
        hamzaPage.studentDetailsLink.click();
    }

    @Then("User is redirected to the search page")
    public void userIsRedirectedToTheSearchPage() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedIcerik = "search";

        Assert.assertTrue(actualTitle.contains(expectedIcerik));
    }

    @And("Search page displays Class and Section dropdowns and two search buttons which are visible and active")
    public void searchPageDisplaysClassAndSectionDropdownsAndTwoSearchButtonsWhichAreVisibleAndActive() {
    hamzaPage.classDropDownElement.isDisplayed();
    hamzaPage.classDropDownElement.isEnabled();
    hamzaPage.sectionDropDownElement.isDisplayed();
    hamzaPage.sectionDropDownElement.isEnabled();
    hamzaPage.classSectionSearchButton.isDisplayed();
    hamzaPage.classSectionSearchButton.isEnabled();
    hamzaPage.searchByKeywordSearchButton.isDisplayed();
    hamzaPage.searchByKeywordSearchButton.isEnabled();



    }
}

    
