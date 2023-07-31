package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.Base;
import pages.CommonPage;
import pages.RamazanPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class RamazanStepdefinitons extends Base {

    CommonPage common = new CommonPage();

    RamazanPage ramazanPage = new RamazanPage();


    @Given("User goes to wonderUrl page")
    public void user_goes_to_wonder_url_page() {
        common.teacherLoginMethod("ramazan.dalciçek@teacher.wonderworldcollege.com","wonderworld123");
    }
    @Then("Click on the Teacher Login Button.")
    public void click_on_the_teacher_login_button() {

    }
    @Then("Enter the username and password, then click on the {string} button.")
    public void enter_the_username_and_password_then_click_on_the_button(String string) {

    }
    @Then("clicks on the Homework page link in the sidebar")
    public void clicks_on_the_homework_page_link_in_the_sidebar() {

        ramazanPage.homeworkLink.click();

    }
    @Then("clicks on the Add Homework page link")
    public void clicks_on_the_add_homework_page_link() {
        ramazanPage.addHomeworkLink.click();
    }
    @Then("the teacher should be redirected to the Add Homework page successfully")
    public void the_teacher_should_be_redirected_to_the_add_homework_page_successfully() {
        String expectedUrl = "https://qa.wonderworldcollege.com/homework";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(expectedUrl,actualUrl);
        Driver.quitDriver();
    }

    @Then("Verify that Class, Section, Subject Group,Subject Dropdown menus and Search button are visible and enabled.")
    public void verifyThatClassSectionSubjectGroupSubjectDropdownMenusAndSearchButtonAreVisibleAndEnabled() {
        // Class Dropdown menu is visible and enabled
        Assert.assertTrue(ramazanPage.classDropdownMenu.isDisplayed());
        Assert.assertTrue(ramazanPage.classDropdownMenu.isEnabled());

        // Section Dropdown menu is visible and enabled
        Assert.assertTrue(ramazanPage.sectionDropdownMenu.isDisplayed());
        Assert.assertTrue(ramazanPage.sectionDropdownMenu.isEnabled());

        //Subject Group Dropdown menu is visible and enabled
        Assert.assertTrue(ramazanPage.subjectGroupDropdownMenu.isDisplayed());
        Assert.assertTrue(ramazanPage.subjectGroupDropdownMenu.isEnabled());

        //Subject Dropdown menu is visible and enabled
        Assert.assertTrue(ramazanPage.subjectDropdownMenu.isDisplayed());
        Assert.assertTrue(ramazanPage.subjectDropdownMenu.isEnabled());

        //Search Button  is visible and enabled
        Assert.assertTrue(ramazanPage.searchButton.isDisplayed());
        Assert.assertTrue(ramazanPage.searchButton.isEnabled());

        Driver.quitDriver();
    }


    @And("The teacher makes selections from the dropdown menus, then clicks on the Search button.")
    public void theTeacherMakesSelectionsFromTheDropdownMenusThenClicksOnTheSearchButton() {

        //Teacher selects Class 3 from Class dropdown menu
        Select classSelect = new Select(ramazanPage.classDropdownMenu);
        classSelect.selectByVisibleText("Class 3");

        //Teacher selects A from Section dropdown menu
        Select sectionSelect = new Select(ramazanPage.sectionDropdownMenu);
        sectionSelect.selectByVisibleText("A");

        //Teacher selects Class 3rd Subject Group from Subject Group dropdown menu
        Select subjectGroupSelect = new Select(ramazanPage.subjectGroupDropdownMenu);
        subjectGroupSelect.selectByVisibleText("Class 3rd Subject Group");

        //Teacher selects French from Subject dropdown menu
        Select subjectSelect = new Select(ramazanPage.subjectDropdownMenu);
        subjectSelect.selectByVisibleText("French (231)");

        ramazanPage.searchButton.click();

    }

    @And("Verify that the Homework List is visible in the opened menu.")
    public void verifyThatTheHomeworkListIsVisibleInTheOpenedMenu() {

        Assert.assertTrue(ramazanPage.evaluationIcon.isDisplayed());
    }

    @And("Click on the Evaluation icon under the Action heading.")
    public void clickOnTheEvaluationIconUnderTheActionHeading() {
        ramazanPage.evaluationIcon.click();
    }


    @Then("Verify that the Evaluate Homework page is opened.")
    public void verifyThatTheEvaluateHomeworkPageIsOpened() {
        ramazanPage.evaluateDetailsPage.isDisplayed();
    }

    @And("Verify that the Summary text is visible in the Evaluate Homework window.")
    public void verifyThatTheSummaryTextIsVisibleInTheEvaluateHomeworkWindow() {
        ramazanPage.summaryText.isDisplayed();
    }

    @And("Write a note in the textbox below the message and click on the Save button.")
    public void writeANoteInTheTextboxBelowTheMessageAndClickOnTheSaveButton() {

    }

    @Then("Verify that the Homework Evaluation Completed Successfully. alert message is visible.")
    public void verifyThatTheHomeworkEvaluationCompletedSuccessfullyAlertMessageIsVisible() {
    }


    @And("Click on the Edit icon under the Action heading.")
    public void clickOnTheEditIconUnderTheActionHeading() {
        ramazanPage.editIcon.click();
    }

    @And("Write your message in the text box under Description and click on the Save button.")
    public void writeYourMessageInTheTextBoxUnderDescriptionAndClickOnTheSaveButton() throws InterruptedException {
        Driver.getDriver().switchTo().frame(ramazanPage.iFrameElement);
        Thread.sleep(1000);
        ramazanPage.textBox.clear();
        ramazanPage.textBox.sendKeys("Well Done!!!");
        Driver.getDriver().switchTo().defaultContent();
        ramazanPage.saveButton.click();
    }

    @Then("Verify that the Record Saved Successfully alert message is visible.")
    public void verifyThatTheRecordSavedSuccessfullyAlertMessageIsVisible() {
        String expectedMessage = "Record Saved Successfully";
        String actualMessage = ramazanPage.successMessageElement.getText();
        Assert.assertEquals(expectedMessage,actualMessage);

    }

    @And("Click on the delete icon under the Action heading.")
    public void clickOnTheDeleteIconUnderTheActionHeading() {
        ramazanPage.deleteIcon.click();
    }

    @And("Click on the OK button in the opened alert.")
    public void clickOnTheOKButtonInTheOpenedAlert() throws InterruptedException {
        Driver.getDriver().switchTo().alert().accept();
        Thread.sleep(1000);
        Driver.getDriver().switchTo().defaultContent();
    }


    @Then("Verify that the message No data available in the table is displayed in the Homework List.")
    public void verifyThatTheMessageNoDataAvailableInTheTableIsDisplayedInTheHomeworkList() {
        ramazanPage.noDataInHomeworkList.isDisplayed();
    }

    @And("Add button should be visible and enable.")
    public void addButtonShouldBeVisibleAndEnable() {
        ramazanPage.addHomeworkButton.isDisplayed();
        ramazanPage.addHomeworkButton.isEnabled();
        ramazanPage.addHomeworkButton.click();
    }

    @And("Fill in the mandatory fields on the Add Homework window and click on the Save button.")
    public void fillInTheMandatoryFieldsOnTheAddHomeworkWindowAndClickOnTheSaveButton() throws InterruptedException {

        //Teacher selects Class 3 from Class dropdown menu
        Select addClassSelect = new Select(ramazanPage.addPageClassDropdown);
        addClassSelect.selectByVisibleText("Class 3");

        //Teacher selects A from Section dropdown menu
        Select addSectionSelect = new Select(ramazanPage.addPageSectionDropdown);
        addSectionSelect.selectByVisibleText("A");

        //Teacher selects Class 3rd Subject Group from Subject Group dropdown menu
        Select addSubjectGroupSelect = new Select(ramazanPage.addPageSubjectGroupDropdown);
        addSubjectGroupSelect.selectByVisibleText("Class 3rd Subject Group");

        //Teacher selects French from Subject dropdown menu
        Select addSubjectSelect = new Select(ramazanPage.addPageSubjectDropdown);
        addSubjectSelect.selectByVisibleText("French (231)");

        ramazanPage.homeworkMarks.sendKeys("100");

        Driver.getDriver().switchTo().frame(ramazanPage.iFrameElement);
        Thread.sleep(1000);
        ramazanPage.textBox.clear();
        ramazanPage.textBox.sendKeys("French Study!!!");
        Driver.getDriver().switchTo().defaultContent();
        ramazanPage.saveButton.click();

    }

    @Then("Verify that there are two separate lists, Upcoming Homework and Closed Homework displayed on the opened page.")
    public void verifyThatThereAreTwoSeparateListsUpcomingHomeworkAndClosedHomeworkDisplayedOnTheOpenedPage() {
        ramazanPage.closedHomework.isDisplayed();
        ramazanPage.upcomingHomework.isDisplayed();
    }

    @And("Make selections from the dropdown menus under Select Criteria, then click on the Search button")
    public void makeSelectionsFromTheDropdownMenusUnderSelectCriteriaThenClickOnTheSearchButton() {

        //Teacher selects Class 1 from Class dropdown menu
        Select classSelect = new Select(ramazanPage.classDropdownMenu);
        classSelect.selectByVisibleText("Class 1");

        //Teacher selects A from Section dropdown menu
        Select sectionSelect = new Select(ramazanPage.sectionDropdownMenu);
        sectionSelect.selectByVisibleText("A");

        //Teacher selects Class 1st Subject Group from Subject Group dropdown menu
        Select subjectGroupSelect = new Select(ramazanPage.subjectGroupDropdownMenu);
        subjectGroupSelect.selectByVisibleText("Class 1st Subject Group");

        //Teacher selects English (210) from Subject dropdown menu
        Select subjectSelect = new Select(ramazanPage.subjectDropdownMenu);
        subjectSelect.selectByVisibleText("English (210)");

        ramazanPage.searchButton.click();
    }

    @And("Click on the Closed Homework element below the Homework List.")
    public void clickOnTheClosedHomeworkElementBelowTheHomeworkList() {
        ramazanPage.closedHomework.click();
    }

    @And("Select the Select All icon to mark all homework entries, then click on the Delete button.")
    public void selectTheSelectAllIconToMarkAllHomeworkEntriesThenClickOnTheDeleteButton() throws InterruptedException {
        ramazanPage.checkBox.click();
        ramazanPage.deleteButton.click();

        Driver.getDriver().switchTo().alert().accept();
        Thread.sleep(1000);
        Driver.getDriver().switchTo().defaultContent();
    }

    @Then("Verify that the message Record deleted successfully is displayed.")
    public void verifyThatTheMessageRecordDeletedSuccessfullyIsDisplayed() {

        String expectedMessage = "Record Deleted Successfully";
        String actualMessage = ramazanPage.deleteMessageElement.getText();
        Assert.assertEquals(expectedMessage,actualMessage);
    }



    // ===============================US_049=========================
    @Given("User goes to Login page")
    public void userGoesToLoginPage() {
        common.parentOrStudentLoginMethod("std141","wonderworld123");
    }

    @And("Click on the Student Login button")
    public void clickOnTheStudentLoginButton() {

    }

    @And("Enter the username and password, then click on the Sign In button.")
    public void enterTheUsernameAndPasswordThenClickOnTheSignInButton() {
    }

    @And("Click on the Apply Leave link in the sidebar.")
    public void clickOnTheApplyLeaveLinkInTheSidebar() {
        ramazanPage.appleLeaveLink.click();
    }
    @Then("Verify that the Leave List header is visible on the opened page.")
    public void verifyThatTheLeaveListHeaderIsVisibleOnTheOpenedPage() {
        ramazanPage.leaveLinkHeader.isDisplayed();

    }

    @Then("Verify that the Class, Section, Apply Date, From Date, To Date, Reason, Status, and Action columns are visible on the opened page.")
    public void verifyThatTheClassSectionApplyDateFromDateToDateReasonStatusAndActionColumnsAreVisibleOnTheOpenedPage() {
        ramazanPage.classColumn.isDisplayed();
        ramazanPage.sectionColumn.isDisplayed();
        ramazanPage.applyDateColumn.isDisplayed();
        ramazanPage.fromDateColumn.isDisplayed();
        ramazanPage.toDateColumn.isDisplayed();
        ramazanPage.reasonColumn.isDisplayed();
        ramazanPage.statusColumn.isDisplayed();
        ramazanPage.actionColumn.isDisplayed();
    }

    @And("Click on the Edit button under the Action section on the opened page.")
    public void clickOnTheEditButtonUnderTheActionSectionOnTheOpenedPage() {
        ramazanPage.editIcon.click();
    }

    @And("Make updates in the textbox below the Reason in the opened window, then click on the Save button.")
    public void makeUpdatesInTheTextboxBelowTheReasonInTheOpenedWindowThenClickOnTheSaveButton() {
        ramazanPage.textAreaEditLeavePage.click();
        ramazanPage.textAreaEditLeavePage.clear();
        ramazanPage.textAreaEditLeavePage.sendKeys("Sick");
        ramazanPage.saveButtonEditLeavePage.click();
    }

    @And("Click on the Delete button under the Action section on the opened page.")
    public void clickOnTheDeleteButtonUnderTheActionSectionOnTheOpenedPage() {
        ramazanPage.deleteIcon.click();
    }

    @Then("Verify that the message Successfully Deleted is visible.")
    public void verifyThatTheMessageSuccessfullyDeletedIsVisible() {
    }

    @And("Click on the Add button located at the top right corner.")
    public void clickOnTheAddButtonLocatedAtTheTopRightCorner() {
        ramazanPage.addButtonLeavePage.click();
    }

    @And("Enter the required information in the opened window, then click on the Save button.")
    public void enterTheRequiredInformationInTheOpenedWindowThenClickOnTheSaveButton() {

        ramazanPage.fromDateElement.sendKeys("14/07/2023");
        ramazanPage.toDateElement.sendKeys("19/07/2023");
        ramazanPage.textAreaEditLeavePage.sendKeys("Holiday");
        ramazanPage.saveButtonEditLeavePage.click();
    }

    @Then("Verify the Record Saved Successfully alert message and the added leave request in the Leave table.")
    public void verifyTheRecordSavedSuccessfullyAlertMessageAndTheAddedLeaveRequestInTheLeaveTable() {

    }

    //===========================US_053===========================
    @Given("User is on the Login page")
    public void userIsOnTheLoginPage() {
        Driver.getDriver().get(ConfigReader.getProperty("parentLoginUrl"));
        ramazanPage.loginButton.click();
        ReusableMethods.switchToWindow("Login : Wonder World College");
    }

    @Then("User should see the username and password fields in the form")
    public void userShouldSeeTheUsernameAndPasswordFieldsInTheForm() {
        ramazanPage.parentLoginEmailBox.isDisplayed();
        ramazanPage.parentLoginPasswordBox.isDisplayed();
    }

    @And("User should be able to enter username and password in the respective fields")
    public void userShouldBeAbleToEnterUsernameAndPasswordInTheRespectiveFields() {
        ramazanPage.parentLoginEmailBox.isEnabled();
        ramazanPage.parentLoginPasswordBox.isEnabled();
    }

    @And("User should see the login-submit button in the Login form")
    public void userShouldSeeTheLoginSubmitButtonInTheLoginForm() {
        ramazanPage.parentLoginSubmitButton.isDisplayed();
    }

    @And("Enter incorrect username and password and click on the submit button.")
    public void enterIncorrectUsernameAndPasswordAndClickOnTheSubmitButton() {
        ramazanPage.parentLoginEmailBox.sendKeys("parent1422");
        ramazanPage.parentLoginPasswordBox.sendKeys("wonder");
        ramazanPage.parentLoginSubmitButton.click();

    }

    @Then("Then User should see the error message The username or password incorrect on the Login page")
    public void thenUserShouldSeeTheErrorMessageTheUsernameOrPasswordIncorrectOnTheLoginPage() {
        ramazanPage.invalidPasswordAlert.isDisplayed();
    }

    @And("User clicks on the Forgot password link on the login page.")
    public void userClicksOnTheForgotPasswordLinkOnTheLoginPage() {
        ramazanPage.parentLoginForgotButton.click();
    }

    @Then("Verify that the user is redirected to the Forgot Password page.")
    public void verifyThatTheUserIsRedirectedToTheForgotPasswordPage() {
        ramazanPage.forgotPasswordPage.isDisplayed();
    }

    @And("Enter the correct username and password, then click on the Sign In button.")
    public void enterTheCorrectUsernameAndPasswordThenClickOnTheSignInButton() {
        ramazanPage.parentLoginEmailBox.sendKeys("par");
        ramazanPage.parentLoginPasswordBox.sendKeys("wonderworld123");
        ramazanPage.parentLoginSubmitButton.click();

    }

    @Then("Verify that the user has successfully logged in.")
    public void verifyThatTheUserHasSuccessfullyLoggedIn() {
       ramazanPage.dashboardElement.isDisplayed();
    }

    @Given("User logs in to the parent panel")
    public void userLogsInToTheParentPanel() {
        common.parentOrStudentLoginMethod("par","wonderworld123");
    }

    @And("Click on the profile photo in the top right corner.")
    public void clickOnTheProfilePhotoInTheTopRightCorner() {
        ramazanPage.profilImageIcon.click();
    }

    @And("User should see the Change Password link is visible in the menu.")
    public void userShouldSeeTheChangePasswordLinkIsVisibleInTheMenu() {
        ramazanPage.changePasswordIcon.isDisplayed();
    }

    @And("Click on the Change Password link.")
    public void clickOnTheChangePasswordLink() {
        ramazanPage.changePasswordIcon.click();
    }

    @Then("Verify that the password change page is displayed.")
    public void verifyThatThePasswordChangePageIsDisplayed() {
        ramazanPage.changePasswordButton.isDisplayed();
    }

    @And("The user enters a new password that is less than {int} characters long.")
    public void theUserEntersANewPasswordThatIsLessThanCharactersLong(int arg0) {
        
    }

    @And("The user enters a new password without any uppercase letters or special characters.")
    public void theUserEntersANewPasswordWithoutAnyUppercaseLettersOrSpecialCharacters() {
    }

    @Then("Verify that the user encounters an error message indicating the inability to change the password.")
    public void verifyThatTheUserEncountersAnErrorMessageIndicatingTheInabilityToChangeThePassword() {

    }

    @And("The user enters a new password that is at least {int} characters long and contains at least one uppercase letter and one special character.")
    public void theUserEntersANewPasswordThatIsAtLeastCharactersLongAndContainsAtLeastOneUppercaseLetterAndOneSpecialCharacter(int arg0) {
        ramazanPage.currentPasswordElement.sendKeys("wonderworld123");
        ramazanPage.newPasswordElement.sendKeys("Wonder.123");
        ramazanPage.confirmPasswordElement.sendKeys("Wonder.123");
        ramazanPage.saveButtonPasswordPage.click();
    }

    @Then("Verify that the user encounters the message Password has been changed successfully.")
    public void verifyThatTheUserEncountersTheMessagePasswordHasBeenChangedSuccessfully() {

    }
}
