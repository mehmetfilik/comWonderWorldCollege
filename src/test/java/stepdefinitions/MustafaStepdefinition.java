package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.CommonPage;
import pages.MustafaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.io.ObjectInputFilter;

public class MustafaStepdefinition {

    CommonPage common = new CommonPage();
    MustafaPage mustafa = new MustafaPage();


    Select select;

    //***************************************US_029****************************************//

    @Given("User goes to {string} page")
    public void user_goes_to_page(String string) {
        common.adminLoginMethod("mustafa.ozsamur@admin.wonderworldcollege.com", "wonderworld123");
    }

    @Then("Click on the Admin Login Button.")
    public void click_on_the_admin_login_button() {

    }

    @Then("Enter a valid E-mail and Password.")
    public void enter_a_valid_e_mail_and_password() {

    }

    @Then("Enter valid email and password in the email and password boxes.")
    public void enter_valid_email_and_password_in_the_email_and_password_boxes() {

    }

    @Then("Click on the Sign in button.")
    public void click_on_the_sign_in_button() {

    }

    @Then("Click on the Front Office button.")
    public void click_on_the_front_office_button() {
        mustafa.frontOfficeTab.click();


    }

    @Then("Click on the Complein link.")
    public void click_on_the_complein_link() {
        mustafa.complainTab.click();


    }

    @And("Verifies that Complain Type, Source dropdown menus and Phone, Date, Description, Action Taken, Assigned, Note textBoxes appear.")
    public void verifiesThatComplainTypeSourceDropdownMenusAndPhoneDateDescriptionActionTakenAssignedNoteTextBoxesAppear() {
        mustafa.elementsDisplayedMethod();
    }

    @Then("user closes browser")
    public void userClosesBrowser() {

        Driver.closeDriver();
    }

    @Given("The user clicks on the Drag and drop link and uploads the file.")
    public void theUserClicksOnTheDragAndDropLinkAndUploadsTheFile() {

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(mustafa.drogAndDropElementi).perform();
        ReusableMethods.bekle(3);


        String filePath1 = System.getProperty("user.dir");
        String filePath2 = "/src/test/java/files/testfile.txt";
        String filePath = filePath1 + filePath2;
        actions.moveToElement(mustafa.drogAndDropElementi).sendKeys(filePath).perform();

        ReusableMethods.bekle(5);

    }


    @Given("On the User Complaint page, enters data in the boxes in the Add Complaint window")
    public void on_the_user_complaint_page_enters_data_in_the_boxes_in_the_add_complaint_window() {
        mustafa.complainCreationMethod();
    }

    @Then("Click on the {string} button.")
    public void click_on_the_button(String string) {

    }

    @Then("verifies that a grievance record has been created.")
    public void verifies_that_a_grievance_record_has_been_created() {
        mustafa.grievanceRecordTestMethod();
    }

    @And("The Copmlain List \\(with Complain, Complain Type, Name, Phone, Date, Action titles) should be displayed.")
    public void theCopmlainListWithComplainComplainTypeNamePhoneDateActionTitlesShouldBeDisplayed() {
        mustafa.complainHeaderElementTestMethod();
    }

    @Given("User, click on the View  icon under the Action heading.")
    public void userClickOnTheViewIconUnderTheActionHeading() {

        mustafa.viewButtonclick();

    }

    @Then("User Verifies that Complaint details are displayed.")
    public void userVerifiesThatComplaintDetailsAreDisplayed() {
        mustafa.detailsTextElementAssert();


    }

    @Given("User, click on the Edit  icon under the Action heading.")
    public void userClickOnTheEditIconUnderTheActionHeading() {
        mustafa.complainCreationMethod();
        mustafa.editButton.click();
    }

    @Then("The user makes changes to the complaint data.")
    public void theUserMakesChangesToTheComplaintData() {
        mustafa.complainByBox.clear();
        mustafa.complainByBox.sendKeys("Ahmet Bulutluoz");
    }

    @And("The user clicks the save button.")
    public void theUserClicksTheSaveButton() {


        JavascriptExecutor jsExecutor = (JavascriptExecutor) Driver.getDriver();
        jsExecutor.executeScript("window.scrollTo(0, 500);");


        mustafa.saveButton2.click();
    }

    @Then("The user should verify that the complaint information is updated.")
    public void theUserShouldVerifyThatTheComplaintInformationIsUpdated() {

        mustafa.grievanceUpdateTestMethod();
    }

    @Given("The user clicks on the delete icon under Action.")
    public void theUserClicksOnTheDeleteIconUnderAction() {
        mustafa.deleteButton.click();
        mustafa.alertaccept();
    }

    @Then("user confirms that the complaint has been deleted.")
    public void userConfirmsThatTheComplaintHasBeenDeleted() {

        mustafa.grievanceDeleteTestMethod();
    }


    //********************************************US_043**********************************//

    @Given("User goes to {string}.")
    public void user_goes_to(String string) {
        common.parentOrStudentLoginMethod("std142", "deneme");
    }

    @Then("Click the login button.")
    public void click_the_login_button() {

    }

    @Then("Enters valid username and invalid password in the username and password section on the left side.")
    public void enters_valid_username_and_invalid_password_in_the_username_and_password_section_on_the_left_side() {

    }

    @Then("Click the Sign In button.")
    public void click_the_sign_in_button() {

    }

    @Then("Verifies that the text {string} is visible.")
    public void verifiesThatTheTextIsVisible(String arg0) {
        mustafa.negativeStudentLoginAssert();

    }


    //********************************US_045*****************************************//

    @Given("user goes to {string}")
    public void userGoesTo(String arg0) {
        common.parentOrStudentLoginMethod("std142", "wonderworld123");
    }

    @And("The user enters the valid values in the username and password box on the left")
    public void theUserEntersTheValidValuesInTheUsernameAndPasswordBoxOnTheLeft() {

    }


    @And("clicks the {string} button.")
    public void clicksTheButton(String arg0) {


    }

    @And("User clicks on profile image")
    public void userClicksOnProfileImage() {
        mustafa.profileImgElement.click();
    }

    @Then("User clicks Change Password on Profile Image.")
    public void userClicksChangePasswordOnProfileImage() {

        mustafa.changePasswordButton.click();
    }


    @And("the user clicks the Change Username tab")
    public void theUserClicksTheChangeUsernameTab() {

        mustafa.changeUsername.click();
    }

    @And("User enters new username with less than {int} characters.")
    public void userEntersNewUsernameWithLessThanCharacters() {
        mustafa.currentUsernameBox.sendKeys("std142");
        mustafa.newUsernameBox.sendKeys("std");
        mustafa.confirmUsernameBox.sendKeys("std");

    }

    @And("User clicks the save button")
    public void userClicksTheSaveButton() {

        mustafa.saveButton3.click();
    }

    @Then("{string} Verifies that the text appears.")
    public void verifiesThatTheTextAppears(String arg0) throws IOException {

        mustafa.usernameChangeTestMethod();

    }


    @And("clicks on the forgot password button.")
    public void clicksOnTheForgotPasswordButton() {
        mustafa.loginButton.click();
        mustafa.forgotPasswordButton.click();

    }

    @Then("The user enters student email in the Email box on the Forgot Password page and clicks Submit.")
    public void theUserEntersStudentEmailInTheEmailBoxOnTheForgotPasswordPageAndClicksSubmit() {
        mustafa.forgotEmailBox.sendKeys("mustafa.ozsamur@student.wonderworldcollege.com");
        mustafa.studentRadioButton.click();
        mustafa.forgotPasswordSubmitButton.click();
    }

    @Then("Verifies that you are directed to the relevant page.")
    public void verifiesThatYouAreDirectedToTheRelevantPage() {
        mustafa.passwordChangeAssertMethod();
    }

    @Given("User goes to wonderWorldUrl page")
    public void userGoesToWonderWorldUrlPage() {
        Driver.getDriver().get(ConfigReader.getProperty("wonderUrl"));
    }

    @Given("The user enters the new username with the correct combination.")
    public void theUserEntersTheNewUsernameWithTheCorrectCombination() {
        common.parentOrStudentLoginMethod("std","wonderworld123");
        mustafa.currentUsernameBox.sendKeys("std");
        mustafa.newUsernameBox.sendKeys("std142");
        mustafa.confirmUsernameBox.sendKeys("std142");
        mustafa.saveButton3.click();


    }

    @Then("Username has been changed successfully. Verifies that the text is visible.")
    public void usernameHasBeenChangedSuccessfullyVerifiesThatTheTextIsVisible() {

        mustafa.usernameChangeTestMethod();
    }


    //**********************************************US_047******************************************//
    @Given("The user goes to the {string} website.")
    public void the_user_goes_to_the_website(String string) {
        common.parentOrStudentLoginMethod("std119", "wonderworld123");
    }

    @Given("Clicks the Login button.")
    public void clicks_the_login_button() {

    }

    @Given("The user enters the valid values in the username and password box on the left and clicks the Sign In button.")
    public void the_user_enters_the_valid_values_in_the_username_and_password_box_on_the_left_and_clicks_the_button() {

    }

    @Given("The user clicks on the Homework page on the left.")
    public void the_user_clicks_on_the_page_on_the_left() {
        mustafa.homeworkTab.click();
    }

    @Given("Column fields in the Upcoming Homework segment must be visible.")
    public void column_fields_in_the_segment_must_be_visible() {
        mustafa.fieldAssertMethod();
    }

    @Given("Click on the menu under the Action section and after typing a message in the message box, click the save button.")
    public void click_on_the_menu_under_the_section_and_after_typing_a_message_in_the_message_box_click_the_button() {
        mustafa.homeworkDetailsPage();


    }

    @Then("The Action section should be accessible and a message can be sent.")
    public void the_action_section_should_be_accessible_and_a_message_can_be_sent() {

    }


    @Given("User clicks Daily Assignment button")
    public void user_clicks_daily_assignment_button() {

    }

    @Given("Click on the +Daily Assignment button")
    public void click_on_the_daily_assignment_button() {

    }

    @Given("Creates a new daily assignment by entering the necessary information in the Subject , Title , Description, Attach Document fields and clicks the Save button.")
    public void creates_a_new_daily_assignment_by_entering_the_necessary_information_in_the_subject_title_description_attach_document_fields_and_clicks_the_save_button() {
        mustafa.newdailyAssignment();
    }

    @Then("Verifies that a new assignment has been added.")
    public void verifies_that_a_new_assignment_has_been_added() {
        mustafa.updateNewdailyAssignment();
    }


    @Given("The user clicks the Edit icon under the Action section")
    public void the_user_clicks_the_edit_icon_under_the_action_section() {

    }

    @Given("Changes the information on the Edit Daily Assignment page and clicks the {string} button.")
    public void changes_the_information_on_the_edit_daily_assignment_page_and_clicks_the_button(String string) {

    }

    @Given("Verifies that assignment information has been updated.")
    public void verifies_that_assignment_information_has_been_updated() {

    }

    @Given("Click the Delete icon under the Action section")
    public void click_the_delete_icon_under_the_action_section() {
        ReusableMethods.bekle(3);
        mustafa.deleteButton2.click();
       Alert alert= Driver.getDriver().switchTo().alert();
       alert.accept();

       if (mustafa.searchBox.isDisplayed()){
           Assert.assertTrue(false);
       }else{
           Assert.assertTrue(true);
       }

    }

    @Then("verifies that the assignment was deleted.")
    public void verifies_that_the_assignment_was_deleted() {
        mustafa.updateNewdailyAssignment();
    }

    @Then("Verifies that {string} appears")
    public void verifiesThatAppears(String arg0) {

    }
//********************************US_056***********************************//

    @Given("User goes to wonderWorld website")
    public void userGoesToWonderWorldWebsite() {
        common.parentOrStudentLoginMethod("parent76","wonderworld123");
    }

    @And("The user enters the valid values in the username and password box on the left and clicks the {string} button.")
    public void theUserEntersTheValidValuesInTheUsernameAndPasswordBoxOnTheLeftAndClicksTheButton(String arg0) {

    }

    @And("User clicks {string} button")
    public void userClicksButton(String arg0) {
        mustafa.myProfileTab.click();
    }

    @And("Student's name, Admission No, Class, Section, and Gender. Verifies that elements are visible")
    public void studentSNameAdmissionNoClassSectionAndGenderVerifiesThatElementsAreVisible() {
        mustafa.parentMyProfileElementsVisiable();
    }

    @Given("Verifies that the Profile, Fees, Exam, and Documents tabs are visible.")
    public void verifiesThatTheProfileFeesExamAndDocumentsTabsAreVisible() {
    mustafa.parentMyProfileElementsVisiable2();
    }

    @And("User clicks profile tab")
    public void userClicksProfileTab() {

        mustafa.profileElement.click();
    }

    @And("Verifies that the headers appear under the profile tab")
    public void verifiesThatTheHeadersAppearUnderTheProfileTab() {
mustafa.profileElementsAssertMethod();
    }


}





