package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.CommonPage;
import pages.FilikPage;
import pages.HamzaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Set;

public class HamzaStepdefinition {

    HamzaPage hamzaPage = new HamzaPage();
    CommonPage commonPage = new CommonPage();

    Actions actions = new Actions(Driver.getDriver());
    private String studentListWH;
    Set<String> hamzaWhSet ;

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
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedName = "search";

        Assert.assertTrue(actualUrl.contains(expectedName));
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

    @Given("User performs a search in the Class {int} and Section {string} dropdowns based on pre-condition")
    public void userPerformsASearchInTheClassAndSectionDropdownsBasedOnPreCondition(int classNo, String sectionNo) {
        WebElement dropdownClass = Driver.getDriver().findElement(By.id("class_id"));
        Select selectClass = new Select(dropdownClass);
        selectClass.selectByVisibleText("Class 2");

        WebElement dropdownSection = Driver.getDriver().findElement(By.id("section_id"));
        Select selectSection = new Select(dropdownSection);
        selectSection.selectByVisibleText("A");
        hamzaPage.classSectionSearchButton.click();
    }

    @Then("A list with headers Admission No, Student Name, Class, Father Name, Date Of Birth, Gender, Category, Mobile Number, Action is displayed")
    public void aListWithHeadersAdmissionNoStudentNameClassFatherNameDateOfBirthGenderCategoryMobileNumberActionIsDisplayed() {
        hamzaPage.searchListAdmissionNo.isDisplayed();
        hamzaPage.searchListStudenName.isDisplayed();
        hamzaPage.searchListClass.isDisplayed();
        hamzaPage.searchListFatherName.isDisplayed();
        hamzaPage.searchListDate.isDisplayed();
        hamzaPage.searchListGender.isDisplayed();
        hamzaPage.searchListCategory.isDisplayed();
        hamzaPage.searchListMobileNumber.isDisplayed();
        hamzaPage.searchListAction.isDisplayed();
    }

    @And("User verifies that the student name in the list is clickable and opens the student's profile page")
    public void userVerifiesThatTheStudentNameInTheListIsClickableAndOpensTheStudentSProfilePageInANewWindow() {
        studentListWH = Driver.getDriver().getWindowHandle();
        actions.keyDown(Keys.CONTROL).click(hamzaPage.searchStudentName)
                .keyUp(Keys.CONTROL).perform();
        hamzaWhSet = Driver.getDriver().getWindowHandles();
        String studentProfileWH = "";

        for (String eachWhd : hamzaWhSet
        ) {
            if (!eachWhd.equals(studentListWH)) {
                studentProfileWH = eachWhd;
            }


        }
        Driver.getDriver().switchTo().window(studentProfileWH);

        String actualStudentName= hamzaPage.studentProfileName.getText();
        String expectedStudentName="eglence";
        Assert.assertTrue(actualStudentName.contains(expectedStudentName));
        Driver.getDriver().close();

    }

    @And("User goes back to the previous Student Search page")
    public void userGoesBackToThePreviousStudentSearchPage() {
        Driver.getDriver().switchTo().window(studentListWH);
    }

    @Then("User verifies that the view icon under the Action column is visible and active")
    public void userVerifiesThatTheViewIconUnderTheActionColumnIsVisibleAndActive() {
        hamzaPage.studentListViewIcon.isDisplayed();
        hamzaPage.studentListViewIcon.isEnabled();


    }

    @And("User clicks on the view icon")
    public void userClicksOnTheViewIcon() {
        actions.keyDown(Keys.CONTROL).click(hamzaPage.studentListViewIcon)
                .keyUp(Keys.CONTROL).perform();
        hamzaWhSet = Driver.getDriver().getWindowHandles();
        String studentProfileViewButtonWH = "";
        for (String eachWhd : hamzaWhSet
        ) {
            if (!eachWhd.equals(studentListWH)) {
                studentProfileViewButtonWH = eachWhd;
            }
        }
        Driver.getDriver().switchTo().window(studentProfileViewButtonWH);


    }



    @Then("User verifies that the student's profile page opens in a new window")
    public void userVerifiesThatTheStudentSProfilePageOpensInANewWindow() {
        String actualStudentName= hamzaPage.studentProfileName.getText();
        String expectedStudentName="eglence";
        Assert.assertTrue(actualStudentName.contains(expectedStudentName));
        Driver.getDriver().close();
    }

    @Then("User verifies that the edit icon under the Action column is visible and active")
    public void userVerifiesThatTheEditIconUnderTheActionColumnIsVisibleAndActive() {
    hamzaPage.studentListEditIcon.isDisplayed();
    hamzaPage.studentListEditIcon.isEnabled();
    }

    @And("User clicks on the edit icon")
    public void userClicksOnTheEditIcon() {
        actions.keyDown(Keys.CONTROL).click(hamzaPage.studentListEditIcon)
            .keyUp(Keys.CONTROL).perform();
        hamzaWhSet = Driver.getDriver().getWindowHandles();
        String studentProfileEditButtonWH = "";
        for (String eachWhd : hamzaWhSet
        ) {
            if (!eachWhd.equals(studentListWH)) {
                studentProfileEditButtonWH = eachWhd;
            }
        }
        Driver.getDriver().switchTo().window(studentProfileEditButtonWH);

    }

    @Then("User verifies that the student's edit page is opened")
    public void userVerifiesThatTheStudentSEditPageIsOpened() {
    String actualEditPage= hamzaPage.studentEditPageHead.getText();
    String expectedEditPage="Edit Student";
    Assert.assertTrue(actualEditPage.contains(expectedEditPage));
    }

    @And("User can edit the information in the Edit Student, Transport Details, Fees Details, Parent Guardian Detail, Address-Details, and Miscellaneous Details sections")
    public void userCanEditTheInformationInTheEditStudentTransportDetailsFeesDetailsParentGuardianDetailAddressDetailsAndMiscellaneousDetailsSections() {
        actions.click(hamzaPage.studentEditAdmissionNo).sendKeys("1").perform();

        WebElement dropdownEditClass = Driver.getDriver().findElement(By.id("class_id"));
        Select selectEditClass = new Select(dropdownEditClass);
        selectEditClass.selectByVisibleText("Class 3");

        WebElement dropdownEditSection = Driver.getDriver().findElement(By.id("section_id"));
        Select selectEditSection = new Select(dropdownEditSection);
        selectEditSection.selectByVisibleText("A");

        actions.click(hamzaPage.studentEditFirstName).sendKeys("test").perform();

        WebElement dropdownEditGender = Driver.getDriver().findElement(By.name("gender"));
        Select selectEditGender = new Select(dropdownEditGender);
        selectEditGender.selectByVisibleText("Female");

        hamzaPage.studentEditDateOfBirth.click();
        actions.moveToElement(hamzaPage.studentEditDatePicker).click().build().perform();

        WebElement dropdownEditRouteList = Driver.getDriver().findElement(By.id("vehroute_id"));
        Select selectEditRouteList = new Select(dropdownEditRouteList);
        selectEditRouteList.selectByValue("5");

        // WebElement dropdownEditPickupPoint = Driver.getDriver().findElement(By.id("pickup_point"));
        // Select selectEditPickup = new Select(dropdownEditPickupPoint);
        //selectEditPickup.selectByVisibleText("Brooklyn West");

        hamzaPage.studentEditTestFees.click();

        hamzaPage.studentEditFatherName.click();
        hamzaPage.studentEditFatherName.clear();
         actions.click(hamzaPage.studentEditFatherName).sendKeys("Ramiz").perform();

        hamzaPage.studentEditGuardianIs.click();

        hamzaPage.studentEditGuardianName.click();
        hamzaPage.studentEditGuardianName.clear();























    }
}

    
