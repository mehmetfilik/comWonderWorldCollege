package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CommonPage;
import pages.FilikPage;

public class FilikStepdefinition {

    FilikPage filikPage = new FilikPage();
    CommonPage commonPage = new CommonPage();


    @Then("User Should Navigate to homepage")
    public void userShouldNavigateToHomepage() {
        commonPage.navigateToHomepage();
    }

    @Then("Verify and Click on the Login Button on the Homepage")
    public void verifyAndClickOnTheLoginButtonOnTheHomepage() {
        commonPage.verifyAndClickOnTheLoginButtonOnTheHomepage();
    }

    @When("Verification of User Redirection to the User Login Page upon Clicking the Login Button")
    public void verificationOfUserRedirectionToTheUserLoginPageUponClickingTheLoginButton() {
        filikPage.verificationOfWindowAndInformationOnUserLoginPage();
    }


    @And("User Logs in with {string} and {string}")
    public void userLogsInWithAnd(String username, String password) {
        commonPage.loginUsername(username);
        commonPage.loginPassword(password);
        commonPage.clickSignInButton();
    }

    @And("Verify and Click on the Forgot Password Button on the User Login Page")
    public void verifyAndClickOnTheForgotPasswordButtonOnTheUserLoginPage() {
        filikPage.verifyAndClickOnTheForgotPasswordButtonOnTheUserLoginPage();
    }

    @And("Verify Password Reset Functionality on the Forgot Password Page")
    public void verifyPasswordResetFunctionalityOnTheForgotPasswordPage() {
        filikPage.verifyPasswordResetFunctionalityOnTheForgotPasswordPage();
    }

    @And("Verify and Click on the User Login Button on the Forgot Password Page")
    public void verifyAndClickOnTheUserLoginButtonOnTheForgotPasswordPage() {
        filikPage.verifyAndClickOnTheUserLoginButtonOnTheForgotPasswordPage();
    }

    @And("Verify and Click on the Front Site Button on the User Login Page")
    public void verifyAndClickOnTheFrontSiteButtonOnTheUserLoginPage() {
        filikPage.forgotPasswordMethod();
    }

    @Then("Close the browser")
    public void closeTheBrowser() {
        commonPage.closeTheBrowser();
    }
}
