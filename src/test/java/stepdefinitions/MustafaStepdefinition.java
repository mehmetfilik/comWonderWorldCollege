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
import utilities.Driver;
import utilities.ReusableMethods;

public class MustafaStepdefinition {

    CommonPage common = new CommonPage();
    MustafaPage mustafa = new MustafaPage();



    Select select;


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

        Driver.quitDriver();
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

     //   Actions actions=new Actions(Driver.getDriver());
     //   actions.sendKeys(org.openqa.selenium.Keys.END).perform();

        JavascriptExecutor jsExecutor = (JavascriptExecutor) Driver.getDriver();
        jsExecutor.executeScript("window.scrollTo(0, 500);");


        mustafa.saveButton2.click();
    }

    @Then("The user should verify that the complaint information is updated.")
    public void theUserShouldVerifyThatTheComplaintInformationIsUpdated() {

        mustafa.grievanceUpdateTestMethod();
    }
}





