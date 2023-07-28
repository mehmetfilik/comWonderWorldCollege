package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.OmerPage;
import utilities.ConfigReader;
import utilities.Driver;

public class OmerStepdefinitons {

    OmerPage omerPage = new OmerPage();

    @Given("Navigate to the {string}")
    public void navigate_to_the(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }

    @Then("Click on the Teacher Login Button and sign in")
    public void clickOnTheTeacherLoginButtonAndSignIn() {
        omerPage.teacherAdminSignIn();
    }

/*
    @Then("Click on the Teacher Login Button")
    public void clickOnTheTeacherLoginButton() {
        omerPage.teacherLoginButton.click();
    }

    @Then("Click on the sign In buttton")
    public void clickOnTheSignInButtton() {
        omerPage.teacherLoginSinginButton.click();
    }

    @And("Enter the username and Password")
    public void enterTheUsernameAndPassword() {
        String username = "omer.faruk.unal@teacher.wonderworldcollege.com";
        String password = "wonderworld123";
        omerPage.teacherLoginUsernameBox.sendKeys(username);
        omerPage.teacherLoginPasswordBox.sendKeys(password);
    }
 */


}
