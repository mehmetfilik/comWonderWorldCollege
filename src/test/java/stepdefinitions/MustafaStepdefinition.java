package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.CommonPage;
import pages.MustafaPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class MustafaStepdefinition {

    CommonPage common = new CommonPage();
    MustafaPage mustafa = new MustafaPage();


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
        mustafa.saveButton.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(mustafa.drogAndDropElementi).perform();
        ReusableMethods.bekle(3);


        String filePath1 = System.getProperty("user.dir");
        String filePath2 = "/src/test/java/files/testfile.txt";
        String filePath = filePath1 + filePath2;
        actions.moveToElement(mustafa.drogAndDropElementi).sendKeys(filePath).perform();

        ReusableMethods.bekle(5);

    }
}





