package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CommonPage;
import pages.FilikPage;
import utilities.ConfigReader;
import utilities.Driver;

import static org.junit.Assert.assertEquals;

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
        filikPage.verifyPasswordResetFunctionalityOnTheUserForgotPasswordPage();
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

    @Then("Click on the Admin Login Button")
    public void clickOnTheAdminLoginButton() {
        commonPage.clickAdminLoginButton();
    }

    @When("Verification of User Redirection to the Admin Login Page upon Clicking the Login Button")
    public void verificationOfUserRedirectionToTheAdminLoginPageUponClickingTheLoginButton() {
        filikPage.verificationOfWindowAndInformationOnAdminLoginPage();
    }

    @And("Admin Logs in with {string} and {string}")
    public void adminLogsInWithAnd(String username, String password) {
        commonPage.adminLoginUsername(username);
        commonPage.adminLoginPassword(password);
        commonPage.clickSignInButton();
    }

    @And("Verify and Click on the Forgot Password Button on the Admin Login Page")
    public void verifyAndClickOnTheForgotPasswordButtonOnTheAdminLoginPage() {
        filikPage.verifyAndClickOnTheForgotPasswordButtonOnTheAdminLoginPage();
    }

    @Given("Navigate to adminLoginUrl page")
    public void navigateToAdminLoginUrlPage() {
        commonPage.navigateToAdminLoginUrl();
    }

    @And("Verify Password Reset Functionality on the Admin Forgot Password Page")
    public void verifyPasswordResetFunctionalityOnTheAdminForgotPasswordPage() {
        filikPage.verifyPasswordResetFunctionalityOnTheAdminForgotPasswordPage();
    }

    @And("verify StudentParent Dashboard Page")
    public void verifyStudentParentDashboardPage() {
        filikPage.verifyStudentParentDashboardPage();
    }


    @And("verify Admin Dashboard Page")
    public void verifyAdminDashboardPage() {
        filikPage.verifyAdminDashboardPage();
    }

    @Given("Teacher Logs in with {string} and {string}")
    public void teacherLogsInWithAnd(String teacherEmail, String password) {
        commonPage.teacherLoginMethod(ConfigReader.getProperty(teacherEmail), ConfigReader.getProperty(password));
    }

    @When("Go to Exam Result Page in the Teacher Panel")
    public void goToExamResultPageInTheTeacherPanel() {
        filikPage.goToExamResultPageInTheTeacherPanel();
    }

    @Given("Verification of Select Criteria")
    public void verificationOfSelectCriteria() {
        filikPage.verificationOfSelectCriteria();
    }

    @Given("Verification of the list of Exam Result")
    public void verificationOfTheListOfExamResult() {
        filikPage.verificationOfExamResultTableHeader();
    }

    @Given("Verification of User Redirection to Student's Profile Page")
    public void verificationOfUserRedirectionToStudentSProfilePage() {
        filikPage.verificationOfUserRedirectionToStudentSProfilePage();
    }


}
