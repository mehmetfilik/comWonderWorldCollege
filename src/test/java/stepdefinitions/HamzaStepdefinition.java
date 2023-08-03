package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CommonPage;
import pages.FilikPage;
import pages.HamzaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.net.Socket;
import java.time.Duration;
import java.util.Set;

public class HamzaStepdefinition {

    HamzaPage hamzaPage = new HamzaPage();
    CommonPage commonPage = new CommonPage();

    Actions actions = new Actions(Driver.getDriver());
    private String studentListWH;
    Set<String> hamzaWhSet;


    @Given("User goes to {string}")
    public void goesToAdminPage(String requestedUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(requestedUrl));
    }


    @Given("User clicks on the {string} button")
    public void userClicksOnTheButton(String adminLoginButton) {
        hamzaPage.adminLoginButton.click();
        ReusableMethods.switchToWindow("Login : Wonder World College");

    }

    @Then("The user enters the email and password")
    public void theUserEntersTheEmailAndPassword() {
        hamzaPage.adminEmailBox.sendKeys(ConfigReader.getProperty("validHamzaAdminEmail"));
        hamzaPage.adminPasswordBox.sendKeys(ConfigReader.getProperty("validHamzaAdminPassword"));

    }

    @And("User clicks on the Admin Sign In button")
    public void userClicksOnTheAdminSignInButton() {
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

        String actualStudentName = hamzaPage.studentProfileName.getText();
        String expectedStudentName = "eglence";
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
        String actualStudentName = hamzaPage.studentProfileName.getText();
        String expectedStudentName = "eglence";
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
        String actualEditPage = hamzaPage.studentEditPageHead.getText();
        String expectedEditPage = "Edit Student";
        Assert.assertTrue(actualEditPage.contains(expectedEditPage));
    }

    @And("User can edit the information in the Edit Student, Transport Details, Fees Details, Parent Guardian Detail, Address-Details, and Miscellaneous Details sections")
    public void userCanEditTheInformationInTheEditStudentTransportDetailsFeesDetailsParentGuardianDetailAddressDetailsAndMiscellaneousDetailsSections() {
        actions.click(hamzaPage.studentEditAdmissionNo).sendKeys("1").perform();

        WebElement dropdownEditClass = Driver.getDriver().findElement(By.id("class_id"));
        Select selectEditClass = new Select(dropdownEditClass);
        selectEditClass.selectByVisibleText("Class 2");

        WebElement dropdownEditSection = Driver.getDriver().findElement(By.id("section_id"));
        Select selectEditSection = new Select(dropdownEditSection);
        selectEditSection.selectByVisibleText("A");

        //actions.click(hamzaPage.studentEditFirstName).sendKeys("test").perform();

        WebElement dropdownEditGender = Driver.getDriver().findElement(By.name("gender"));
        Select selectEditGender = new Select(dropdownEditGender);
        selectEditGender.selectByVisibleText("Female");

        hamzaPage.studentEditDateOfBirth.click();
        hamzaPage.studentEditDateOfBirth.clear();
        actions.sendKeys(hamzaPage.studentEditDateOfBirth).sendKeys("04/02/2009").perform();

        //actions.moveToElement(hamzaPage.studentEditDatePicker).click().build().perform();

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
        actions.click(hamzaPage.studentEditGuardianName).sendKeys("BabaName").perform();
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();
        actions.sendKeys("+905555555555");
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();
        actions.sendKeys("Asagi Ayranci Mah. Ortadaki Park Sk.").perform();

        hamzaPage.studentEditBankName.click();
        hamzaPage.studentEditBankName.clear();
        actions.click(hamzaPage.studentEditBankName).sendKeys("Central Bank");
        actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();
        actions.sendKeys("Basarili Ogrenci");
        hamzaPage.studentEditSaveButton.click();
    }

    @And("User verifies that the edited information is saved by clicking the save button on the Edit page")
    public void userVerifiesThatTheEditedInformationIsSavedByClickingTheSaveButtonOnTheEditPage() throws InterruptedException {
        //ReusableMethods.wait(2);
        Thread.sleep(3000);
        String actualEditAlert = hamzaPage.studentEditSaveAlert.getText();
        //WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        //wait.until(ExpectedConditions.visibilityOf(hamzaPage.studentEditSaveAlert));
        String expectedEditAlert = "Record Updated Successfully";
        Assert.assertTrue(actualEditAlert.contains(expectedEditAlert));
        Driver.getDriver().close();
    }

    @Given("User verifies that the add fees icon under the Action column is visible and active")
    public void userVerifiesThatTheAddFeesIconUnderTheActionColumnIsVisibleAndActive() {
        hamzaPage.studentListAddFeesIcon.isDisplayed();
        hamzaPage.studentListAddFeesIcon.isEnabled();
    }

    @And("User clicks on the add fees icon")
    public void userClicksOnTheAddFeesIcon() {
        actions.keyDown(Keys.CONTROL).click(hamzaPage.studentListAddFeesIcon)
                .keyUp(Keys.CONTROL).perform();
        hamzaWhSet = Driver.getDriver().getWindowHandles();
        String studentProfileAddFeesButtonWH = "";
        for (String eachWhd : hamzaWhSet
        ) {
            if (!eachWhd.equals(studentListWH)) {
                studentProfileAddFeesButtonWH = eachWhd;
            }
        }
        Driver.getDriver().switchTo().window(studentProfileAddFeesButtonWH);
    }


    @Then("User is redirected to the relevant student's add fee page")
    public void userIsRedirectedToTheRelevantStudentSAddFeePage() {
        String actualAddFeeUrl = Driver.getDriver().getCurrentUrl();
        String expectedAddFeeUrl = "addfee";

        Assert.assertTrue(actualAddFeeUrl.contains(expectedAddFeeUrl));

    }

    //=================================================================================================
    //=================================================================================================
    //US_024
    @And("User clicks on the Fees Collection link")
    public void userClicksOnTheFeesCollectionLink() {
        hamzaPage.adminFeesCollectionIcon.click();
    }

    @Then("User verifies that the Collect Fees page link is visible under the Fees Collection menu heading")
    public void userVerifiesThatTheCollectFeesPageLinkIsVisibleUnderTheFeesCollectionMenuHeading() {
        hamzaPage.adminFeesMasterIcon.isDisplayed();

    }


    @When("User clicks on the Collect Fees link")
    public void userClicksOnTheCollectFeesLink() {
        hamzaPage.adminFeesMasterIcon.click();

    }

    @Then("User verifies that the addfee page is opened is opened")
    public void userVerifiesThatTheAddfeePageIsOpenedisOpened() {
        String actualFeesUrl = Driver.getDriver().getCurrentUrl();
        String expectedFeesUrl = "adfee";
        Assert.assertTrue(actualFeesUrl.contains(expectedFeesUrl));

    }


    @And("User goes to the URL {string} list")
    public void userGoesToTheURLList(String requestedUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(requestedUrl));
    }


    @Then("Student Fees list should be displayed with columns Fees Group, Fees Code, Due Date, Status, Amount, Payment ID, Mode, Date, Discount, Fine, Paid, Balance, Action")
    public void studentFeesListShouldBeDisplayedWithColumnsFeesGroupFeesCodeDueDateStatusAmountPaymentIDModeDateDiscountFinePaidBalanceAction() {
        {
            hamzaPage.adminFeesFeesGroupIcon.isDisplayed();
            hamzaPage.adminFeesFeesCodeIcon.isDisplayed();
            hamzaPage.adminFeesDueDateIcon.isDisplayed();
            hamzaPage.adminFeesStatusIcon.isDisplayed();
            hamzaPage.adminFeesAmountIcon.isDisplayed();
            hamzaPage.adminFeesPaymentIDIcon.isDisplayed();
            hamzaPage.adminFeesModeIcon.isDisplayed();
            hamzaPage.adminFeesDateIcon.isDisplayed();
            hamzaPage.adminFeesDiscountIcon.isDisplayed();
            hamzaPage.adminFeesFineIcon.isDisplayed();
            hamzaPage.adminFeesPaidIcon.isDisplayed();
            hamzaPage.adminFeesBalanceIcon.isDisplayed();
            hamzaPage.adminFeesActionIcon.isDisplayed();
        }
    }

    @When("Admin selects the Euro symbol from the top bar in the admin panel")
    public void adminSelectsTheEuroSymbolFromTheTopBarInTheAdminPanel() {
        hamzaPage.adminFeesBarMoneyIcon.click();
        hamzaPage.adminFeesBarEuroIcon.click();
    }

    @Then("Euro symbol should be visible in the Amount column of the Student Fees list")
    public void euroSymbolShouldBeVisibleInTheAmountColumnOfTheStudentFeesList() {
        hamzaPage.adminFeesListEuroIcon.isDisplayed();
    }

    @When("Admin clicks on the + icon under the Action column for an unpaid payment")
    public void adminClicksOnTheIconUnderTheActionColumnForAnUnpaidPayment() {
    hamzaPage.adminFeesActionPlusIcon.click();

    }

    @And("Admin enters the amount in the popup and clicks on the Collect Fees button")
    public void adminEntersTheAmountInThePopupAndClicksOnTheCollectFeesButton() {
        hamzaPage.adminFeesAmountPopup.click();
        //WebDriverWait waitAmountPopup = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(2));
        //waitAmountPopup.until(ExpectedConditions.visibilityOf(hamzaPage.adminFeesAmountPopup));
        actions.sendKeys(Keys.DELETE).sendKeys(Keys.DELETE)
               .sendKeys(Keys.DELETE).sendKeys(Keys.DELETE).sendKeys(Keys.DELETE).sendKeys(Keys.DELETE)
                .sendKeys(Keys.DELETE).sendKeys(Keys.DELETE).perform();
        //hamzaPage.adminFeesAmountPopup.clear();
        actions.sendKeys("1000.00").perform();
        hamzaPage.adminFeesAmountPopupCollectFees.click();
    }

    @Then("The entered amount should be seen in the addfee page")
    public void theEnteredAmountShouldBeSeenInTheAddfeePage() throws InterruptedException {
        //WebDriverWait waitAmountSaved = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(6));
        Thread.sleep(4000);
        String actualAmount= hamzaPage.adminFeesEnteredAmountText.getText();
        System.out.println("actual Amount = "+actualAmount);
        String expectedAmount = "1,000.00";
        Assert.assertEquals(expectedAmount,actualAmount);
    }

    @When("Admin clicks on the revert icon for the payment")
    public void adminClicksOnTheRevertIconForThePayment() {
        hamzaPage.adminFeesRevertIcon.click();
    }

    @Then("Confirmation is given by clicking the revert icon in the window that opens.")
    public void confirmationIsGivenByClickingTheRevertIconInTheWindowThatOpens() {
    hamzaPage.adminFeesRevertAssentIcon.click();

    }
    @Then("{string} status should be displayed under the Status column")
    public void statusShouldBeDisplayedUnderTheStatusColumn(String arg0) throws InterruptedException {
        Thread.sleep(4000);
        String actualBalanceAmount= hamzaPage.adminFeesBalanceText.getText();
        String expectedBalanceAmount = "€0.00"  ;
        Assert.assertEquals(actualBalanceAmount, expectedBalanceAmount);
    }



    @Then("Paid amount should be displayed in the Paid column")
    public void paidAmountShouldBeDisplayedInThePaidColumn() throws InterruptedException {
        Thread.sleep(4000);
        String actualPaidline= hamzaPage.adminFeesPaidLine.getText();
        actualPaidline="€"+actualPaidline;
        System.out.println("actualPaidLine="+actualPaidline);
        String actualTotalPaidLine =hamzaPage.adminFeesTotalPaid.getText();
        System.out.println("actualTotalPaidLine0"+actualTotalPaidLine);
        Assert.assertEquals(actualPaidline, actualTotalPaidLine);
    }

    @And("Remaining balance amount should be displayed in the Balance column")
    public void remainingBalanceAmountShouldBeDisplayedInTheBalanceColumn() {
        String totalBalanceOne=hamzaPage.adminFeesBalanceOne.getText();
        System.out.println("total balance one ="+totalBalanceOne);
        double total1=Double.parseDouble(totalBalanceOne);

        String totalBalanceTwo=hamzaPage.adminFeesBalanceTwo.getText();
        System.out.println("total balance two ="+totalBalanceTwo);
        double total2=Double.parseDouble(totalBalanceTwo);

        double grandTotalBalance= total1+total2;
        System.out.println(grandTotalBalance);

        String expectedFinallyTotalBalance="€"+grandTotalBalance;
        System.out.println("expected Finally Total Balance="+expectedFinallyTotalBalance);

        String totalBalance=hamzaPage.adminFeesTotalBalance.getText();
        System.out.println("Grandtotalbalance="+totalBalance);

      Assert.assertEquals(totalBalance,expectedFinallyTotalBalance);

    }

    //========================================================================================
    //US_025


    @Then("User verifies that the Fees Master page link is visible under the Fees Collection menu heading")
    public void userVerifiesThatTheFeesMasterPageLinkIsVisibleUnderTheFeesCollectionMenuHeading () {
        hamzaPage.adminFeesMasterIcon.isDisplayed();

    }

    @When("User clicks on the Fees Master link")
    public void userClicksOnTheFeesMasterLink () {
        hamzaPage.adminFeesMasterIcon.click();
    }

    @Then("User verifies that the feesmaster page is opened")
    public void userVerifiesThatTheFeesmasterPageIsOpened () {
        String actualFeesMasterUrl = Driver.getDriver().getCurrentUrl();
        String expectedFeesMasterUrl = "feemaster";
        Assert.assertTrue(actualFeesMasterUrl.contains(expectedFeesMasterUrl));
    }

    @And("User verifies the presence of {string} and {string} sections on the {string} page")
    public void userVerifiesThePresenceOfAndSectionsOnThePage (String arg0, String arg1, String arg2){
        hamzaPage.adminFeesMasterHead.isDisplayed();
        hamzaPage.adminFeesGroupText.isDisplayed();
        hamzaPage.adminFeesTypeText.isDisplayed();
        hamzaPage.adminFeesDueDateText.isDisplayed();
        hamzaPage.adminFeesAmountText.isDisplayed();
        hamzaPage.adminFeesFineTypeText.isDisplayed();
        hamzaPage.adminFeesNoneButton.isDisplayed();
        hamzaPage.adminFeesPercentageButton.isDisplayed();
        hamzaPage.adminFeesFixButton.isDisplayed();
        hamzaPage.adminFeesPercentageText.isDisplayed();
        hamzaPage.adminFeesFixAmountText.isDisplayed();
        hamzaPage.adminFeesFeesMasterHead.isDisplayed();
        hamzaPage.adminFeesFeesGroupText.isDisplayed();
        hamzaPage.adminFeesFeesCodeText.isDisplayed();
        hamzaPage.adminFeesFixListAmountText.isDisplayed();
        hamzaPage.adminFeesListActionText.isDisplayed();

    }

    @And("User verifies the presence of the search box for filtering on the {string} page")
    public void userVerifiesThePresenceOfTheSearchBoxForFilteringOnThePage(String arg0) {
    hamzaPage.adminFeesListSearchBox.isDisplayed();
    hamzaPage.adminFeesListSearchBox.isEnabled();

    }

    @And("User selects {string} from the {string} dropdown menu in the {string} window")
    public void userSelectsFromTheDropdownMenuInTheWindow(String arg0, String arg1, String arg2) {
        WebElement dropdownFeesGroup = Driver.getDriver().findElement(By.id("fee_groups_id"));
        Select selectFeesGroup = new Select(dropdownFeesGroup);
        selectFeesGroup.selectByVisibleText("hamzatest");
    }

    @And("User selects {string} as the {string} in the {string} window")
    public void userSelectsAsTheInTheWindow(String arg0, String arg1, String arg2) {
        WebElement dropdownFeesType = Driver.getDriver().findElement(By.id("feetype_id"));
        Select selectFeesType = new Select(dropdownFeesType);
        selectFeesType.selectByVisibleText("hamzatesttype");
    }

    @And("User enters {string} in the {string} field in the {string} window")
    public void userEntersInTheFieldInTheWindow(String arg0, String arg1, String arg2) {
    hamzaPage.adminFeesFeesMasterAmount.click();
    actions.click(hamzaPage.adminFeesFeesMasterAmount).sendKeys("10000.00").perform();
    }

    @And("User clicks the {string} button in the {string} window and verifies successful saving")
    public void userClicksTheButtonInTheWindowAndVerifiesSuccessfulSaving(String arg0, String arg1) {
    hamzaPage.adminFeesFeesMasterSave.click();

    }

    @And("User clicks the edit icon for the last item in the {string} section")
    public void userClicksTheEditIconForTheLastItemInTheSection(String arg0) throws InterruptedException {
        Thread.sleep(3000);
        hamzaPage.adminFeesFeesMasterEdit.click();

    }

    @And("User enters {string} in the {string} field in the edit window")
    public void userEntersInTheFieldInTheEditWindow(String arg0, String arg1) throws InterruptedException {
        Thread.sleep(4000);
        actions.click(hamzaPage.adminFeesAmountEdit).sendKeys("20000");
    }

    @And("User clicks the {string} button in the edit window and verifies successful update")
    public void userClicksTheButtonInTheEditWindowAndVerifiesSuccessfulUpdate(String arg0) throws InterruptedException {
        hamzaPage.adminFeesEditSaveButton.click();
        Thread.sleep(3000);
        hamzaPage.adminFeesEditSaveSuccess.isDisplayed();
    }

    @And("User clicks the delete icon for the last held item in the {string} section")
    public void userClicksTheDeleteIconForTheLastHeldItemInTheSection(String arg0) throws InterruptedException {
        hamzaPage.adminFeesFeesDeleteIcon.click();
        Thread.sleep(3000);
        actions.sendKeys(Keys.ENTER);
    }

    @Then("User verifies that the last item in the {string} section is deleted")
    public void userVerifiesThatTheLastItemInTheSectionIsDeleted(String arg0) {
        Assert.assertFalse(hamzaPage.adminFeesFeesDeleteIcon.isDisplayed());
    }
}

    
