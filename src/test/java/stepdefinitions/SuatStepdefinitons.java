package stepdefinitions;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.CommonPage;
import pages.SuatPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class SuatStepdefinitons {

    CommonPage commonPage = new CommonPage();
    SuatPage suatPage = new SuatPage();

    @Given("Go to homepage" )
    public void goToHomepage(){
        commonPage.navigateToHomepage();}
    //--------------------US_004---------------------------
    @And("Click on the 'Exam Result' menu title")
    public void clickOnExamResultMenu(){
        suatPage.examResult.click();
    }

    @And("Redirected to the 'Exam Result' page")
    public void redirectExamResultPage(){
        String expectedUrl="https://qa.wonderworldcollege.com/examresult";
        String actualURl= Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(actualURl, expectedUrl);
    }

    @Then("Close the browser")
    public void closeTheBrowser(){
        commonPage.closeTheBrowser();
    }

    @And("Verify that Admission No and Exam text box are visible and are mandatory fields for data input.")
    public void verifyAdmissionAndExamTextBox(){
        Assert.assertTrue(suatPage.admissionNoBox.isDisplayed());
        Assert.assertTrue(suatPage.selectExamBox.isDisplayed());

        String actualMandatoryAdmissionStar=suatPage.mandatoryAdmissionSign.getText();
        String expectedMandatoryAdmissionStar="*";

        Assert.assertEquals(actualMandatoryAdmissionStar,expectedMandatoryAdmissionStar);

        String actualMandatoryExamStar=suatPage.mandatoryExamSign.getText();
        String expectedMandatoryExamStar="*";

        Assert.assertEquals(actualMandatoryAdmissionStar,expectedMandatoryExamStar);


    }

    @And ("Verify the existance of Search button")
    public void verifyTheExistanceOfSearchButton(){
        suatPage.searchButton.isEnabled();
    }

    @And("Enter data in Admission No text box and select Exam from Exam text box")
    public void enterDataInAdmissionNoAndSelectExam(){
        suatPage.admissionNoBox.sendKeys("18010");

        Select select=new Select(suatPage.selectExamBox);
        select.selectByVisibleText("Ingilizce");

    }
    @And("Click on the Search button to verify usage of the Search button")
    public void clickOnSearchButton(){
        suatPage.searchButton.click();
    }

    @And("Open a window that shows the student's exam results")
    public void openWindowShowsStudentsExamResult(){
        String expectedUrl="https://qa.wonderworldcollege.com/examresult";
        String actualUrl=Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(actualUrl,expectedUrl);

    }

    @And("Verify that Student Name, Roll Number and Admission No is displayed in open window.")
    public void verifyStudentNameRollNumberAndAdmissionNoAreDisplaying(){
        Assert.assertTrue(suatPage.studentName.isDisplayed());
        Assert.assertTrue(suatPage.rollNumber.isDisplayed());
        Assert.assertTrue(suatPage.admissionNoElement.isDisplayed());
    }

    @And("Confirm that exam results are listed with the headings Subject, Max Marks, Min Marks, Marks Obtained, and Note")
    public void confirmExamResultsAreListedWithHeadingsSubjectMaxMarksMinMarksMarksObtainedAndNote(){
        Assert.assertTrue(suatPage.averagePassing.isDisplayed());
        Assert.assertTrue(suatPage.headingSubject.isDisplayed());
        Assert.assertTrue(suatPage.headingMaxMarks.isDisplayed());
        Assert.assertTrue(suatPage.headingMinMarks.isDisplayed());
        Assert.assertTrue(suatPage.headingMarksObtained.isDisplayed());
        Assert.assertTrue(suatPage.headingNote.isDisplayed());

    }

    @And("Verify correct displaying of calculated Percentage, Rank, Result, Division, Grand Total, and Total Obtain Marks based on exam results")
    public void verifyCorrectDisplayingOfCalculatedPercentageRankResultDivisionGrandTotalAndTotalObtain(){

        Assert.assertTrue(suatPage.footerPercentage.isDisplayed());
        Assert.assertTrue(suatPage.footerRank.isDisplayed());
        Assert.assertTrue(suatPage.footerResult.isDisplayed());
        Assert.assertTrue(suatPage.footerDivision.isDisplayed());
        Assert.assertTrue(suatPage.footerGrandTotal.isDisplayed());
        Assert.assertTrue(suatPage.footerTotalObtainMarks.isDisplayed());
    }


 //--------------------------------US_008--------------------------------------
 @And("Hover to Achievements section")
 public void hoverToAchievementsSection() {
     ReusableMethods.hover(suatPage.sectionElement);
 }

    @Then("Display Achievements section under the heading Achievements")
    public void displaySectionUnderTheHeadingAchievements() {
        Assert.assertTrue(suatPage.achievementsElement.isDisplayed());

    }


    @And("Display boards in Achievements section with {int} Graduates, {int} Certified Teachers, {int} Student Campuses, {int} Students informations")
    public void displayBoardsInAchievementsSectionWithGraduatesCertifiedTeachersStudentCampusesStudentsInformations(int arg0, int arg1, int arg2, int arg3) {

        String graduates = suatPage.graduatesElement.getText();
        String certifiedTeachers =suatPage.teachersElement.getText();
        String studentCampuses = suatPage.campusElement.getText();
        String students = suatPage.studentElement.getText();

    }

    @And("Wait for visibility of element")
    public void waitForVisibilityOfElement() {
        ReusableMethods.waitForVisibility(By.xpath("//option[text()='Ingilizce']"), 3);
    }

//------------------------------------US_011---------------------------------------

    @And("Go down end of the homepage")
    public void goDownEndOfTheHomepage() {
        Actions actions= new Actions(Driver.getDriver());
        actions.sendKeys(Keys.END).perform();
    }

    @And("Verify that Complain heading and icon are visible")
    public void verifyThatHeadingAndIconAreVisible() {
        Assert.assertTrue(suatPage.complainTextElement.isDisplayed());
        Assert.assertTrue(suatPage.complainIconElement.isDisplayed());
    }

    @When("Click on Complain heading or icon")
    public void clickOnHeadingAndIcon() {
        suatPage.complainTextElement.click();
        suatPage.complainIconElement.click();
    }

    @And("Relevant complain page is opened")
    public void relevantComplainPageIsOpened() {
        String expectedUrl="https://qa.wonderworldcollege.com/page/complain";
        String actualUrl=Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(actualUrl,expectedUrl);
    }

    @And("Confirm that there are text boxes for Name, Email, Contact No. and Description")
    public void confirmThatThereAreTextBoxesForNameEmailContactNoAndDescription() {
        Assert.assertTrue(suatPage.nameTextElement.isDisplayed());
        Assert.assertTrue(suatPage.emailTextElement.isDisplayed());
        Assert.assertTrue(suatPage.contactNoElement.isDisplayed());
        Assert.assertTrue(suatPage.descriptionElement.isDisplayed());
    }

    @When("Enter data into the Name, Email, Contact No. and Description boxes")
    public void enterDataIntoTheNameEmailContactNoAndDescriptionBoxes() {
        suatPage.nameBoxElement.sendKeys("Suat");
        suatPage.emailBoxElement.sendKeys("suat.demirci@gmail.com");
        suatPage.contactNoBoxElement.sendKeys("0762236789");
        suatPage.descriptionBoxElement.sendKeys("Ipsum loreaton");
    }

    @And("Click on Submit button")
    public void clickOnSubmitButton() {
        suatPage.submitButtonElement.click();
    }

    @Then("Verify that complaint is succesfully submitted")
    public void verifyThatComplaintIsSuccesfullySubmitted() {

        String expectedText="Record Saved Successfully";
        String actualText=suatPage.successAlertElement.getText();

        Assert.assertEquals(actualText,expectedText);
    }


    @And("Wait for {int} seconds")
    public void waitForSeconds(int saniye) {
        ReusableMethods.bekle(10);
    }
//-----------------------------------------US_019-----------------------------------

    @Given("Navigate to admin login url")
    public void navigateToAdminLoginUrl() {
        commonPage.navigateToAdminLoginUrl();
    }

    @And("Provide admin login enterance")
    public void provideAdminLoginEnterance() {
        commonPage.adminLoginMethod("suat.demirci@admin.wonderworldcollege.com","wonderworld12345");
    }

    @Then("Confirm that the profile icon on the top bar is visible")
    public void confirmThatTheProfileIconOnTheTopBarIsVisible() {
        Assert.assertTrue(suatPage.profileIconElement.isDisplayed());
    }

    @Then("Click on the profile icon")
    public void clickOnTheProfileIcon() {
        suatPage.profileIconElement.click();
    }


    @And("Open a window that displays the name of the account owner, role and links to Profile, Password and Logout")
    public void openAWindowThatDisplaysTheNameOfTheAccountOwnerRoleAndLinksToProfilePasswordAndLogout() {
        Assert.assertTrue(suatPage.profileWindowElement.isDisplayed());
        Assert.assertTrue(suatPage.profileLinkText.isDisplayed());
        Assert.assertTrue(suatPage.passwordLinkText.isDisplayed());
        Assert.assertTrue(suatPage.logoutLinkText.isDisplayed());
        Assert.assertTrue(suatPage.adminName.isDisplayed());
        Assert.assertTrue(suatPage.adminRole.isDisplayed());
    }

    @Then("Click on Profile Page link")
    public void clickOnProfilePageLink() {
        suatPage.profileLinkText.click();
    }


    @And("Click on to the Payroll, Leaves, Attendance, and Documents pages to verify transition is possible")
    public void clickOnToTheProfilePayrollLeavesAttendanceAndDocumentsPagesToVerifyTransitionIsPossible() {
        suatPage.payrollLinkElement.click();
        suatPage.leavesLinkElement.click();
        suatPage.attendanceLinkElement.click();
        suatPage.documentsLinkElement.click();
        suatPage.profileLinkElement.click();
    }


    @And("Verify that  the General Information, Address Details, Bank Account Details, and Social Media Link information are displaying on Profile page")
    public void verifyThatTheGeneralInformationAddressDetailsBankAccountDetailsAndSocialMediaLinkInformationAreDisplayingOnProfilePage() {
        Assert.assertTrue(suatPage.addressDetails.isDisplayed());
        Assert.assertTrue(suatPage.bankAccountDetails.isDisplayed());
        Assert.assertTrue(suatPage.socialMediaDetails.isDisplayed());

    }



    @And("Click on to the Payroll page")
    public void clickOnToThePayrollPage() {
        suatPage.payrollLinkElement.click();
    }

    @Then("Confirm the visibility of Total Net Salary Paid, Total Gross Salary, Total Earning, Total Deduction info boards")
    public void confirmTheVisibilityOfTotalNetSalaryPaidTotalGrossSalaryTotalEarningTotalDeductionInfoBoards() {
        Assert.assertTrue(suatPage.totalNetSalary.isDisplayed());;
        Assert.assertTrue(suatPage.totalGrossSalary.isDisplayed());;
        Assert.assertTrue(suatPage.totalEarning.isDisplayed());;
        Assert.assertTrue(suatPage.totalDeduction.isDisplayed());
    }

    @And("Display Payslip list with Month-Year, Date, Mode, Status, Net Salary, Action columns")
    public void displayPayslipListWithMonthYearDateModeStatusNetSalaryActionColumns() {
        Assert.assertTrue(suatPage.paySliplist.isDisplayed());
        Assert.assertTrue(suatPage.paySlipColumn.isDisplayed());
        Assert.assertTrue(suatPage.monthYearColumn.isDisplayed());
        Assert.assertTrue(suatPage.dateColumn.isDisplayed());
        Assert.assertTrue(suatPage.modeColumn.isDisplayed());
        Assert.assertTrue(suatPage.statusColumn.isDisplayed());
        Assert.assertTrue(suatPage.actionColumn.isDisplayed());
        Assert.assertTrue(suatPage.netSalaryColumn.isDisplayed());

    }

    @Then("Click on View Payslip link under the Action column")
    public void clickOnViewLinkUnderTheActionColumn() {
        suatPage.viewPayslipButton.click();

    }

    @And("Display related payslip for that period")
    public void displayRelatedPayslipForThatPeriod() {
        Assert.assertTrue(suatPage.payslipViewWindow.isDisplayed());
    }

    @And("Confirm that there is a search textBox")
    public void confirmThatThereIsASearchTextBox() {
        Assert.assertTrue(suatPage.payslipSearchElement.isEnabled());
    }

    @And("Verify that filtering within Paylist by using headings is possible")
    public void verifyThatFilteringWithinPaylistByUsingHeadingsIsPossible() {
        suatPage.payslipSearchElement.sendKeys("November");
    }

    @And("Click on Leaves page")
    public void clickOnLeavesPage() {
        suatPage.leavesLinkElement.click();
    }

    @Then("Display Leave List with Leave Type, Leave Date, Days, Apply Date, Status, Action columns")
    public void displayLeaveListWithLeaveTypeLeaveDateDaysApplyDateStatusActionColumns() {
        Assert.assertTrue(suatPage.leaveListColumns.isDisplayed());
        Assert.assertTrue(suatPage.leaveStatusColumn.isDisplayed());
        Assert.assertTrue(suatPage.leaveTypeColumn.isDisplayed());
        Assert.assertTrue(suatPage.leaveDateColumn.isDisplayed());
        Assert.assertTrue(suatPage.actionLeavesColumn.isDisplayed());
        Assert.assertTrue(suatPage.applyDateColumn.isDisplayed());
        Assert.assertTrue(suatPage.attendanceLinkElement.isDisplayed());
    }

    @When("Click on view icon under Action column")
    public void clickOnViewIconUnderActionColumn() {
        suatPage.viewIconElement.click();
    }

    @And("View the relevant leave information")
    public void viewTheRelevantLeaveInformation() {
        Assert.assertTrue(suatPage.leaveInfoWindow.isDisplayed());
    }

    @And("Click on Attendance page")
    public void clickOnAttandancePage() {
        suatPage.attendanceLinkElement.click();
    }

    @And("Approve the visibility of info boards including Total Present, Total Late, Total Absent, Total Half Day, Total Holiday")
    public void approveTheVisibilityOfInfoBoardsIncludingTotalPresentTotalLateTotalAbsentTotalHalfDayTotalHoliday() {
        Assert.assertTrue(suatPage.attendanceListElement.isDisplayed());
    }

    @And("Check availibility of selectable attendance year")
    public void checkAvailibilityOfSelectableAttendanceYear() {
        Select select= new Select(suatPage.selectableYearElement);
        select.selectByIndex(1);

    }

    @Then("Get the explanation of Attendance marking letters")
    public void getTheExplanationOfAttendanceMarkingLetters() {
        Assert.assertTrue(suatPage.attendanceMarkingLetters.isDisplayed());
    }

    @And("Display staff's Attendance List")
    public void displayStaffSAttandanceList() {
        Assert.assertTrue(suatPage.attendanceListElement.isDisplayed());
    }

    @When("Click on the Password link")
    public void clickOnThePasswordLink() {
        suatPage.passwordLinkText.click();
    }

    @Then("Link a page that involves Current Password, New Password, Confirm Password text boxes, and a Change Password button")
    public void linkAPageThatInvolvesCurrentPasswordNewPasswordConfirmPasswordTextBoxesAndAChangePasswordButton() {
        Assert.assertTrue(suatPage.currentPasswordBox.isDisplayed());
        Assert.assertTrue(suatPage.newPasswordBox.isDisplayed());
        Assert.assertTrue(suatPage.confirmPasswordBox.isDisplayed());
        Assert.assertTrue(suatPage.changePasswordButton.isDisplayed());
    }

    @Then("Enter valid values to Current, New and Confirm Password text boxes")
    public void enterValidValuesToCurrentNewAndConfirmPasswordTextBoxes() {
        suatPage.currentPasswordBox.sendKeys("wonderworld1234");
        suatPage.newPasswordBox.sendKeys("wonderworld12345");
        suatPage.confirmPasswordBox.sendKeys("wonderworld12345");
        suatPage.changePasswordButton.isDisplayed();
    }

    @When("Click on the Change Password button")
    public void clickOnTheChangePasswordButton() {
        suatPage.changePasswordButton.click();
    }

    @And("Verify that Password is changed")
    public void verifyThatPasswordIsChanged() {
        String actualSuccessText=suatPage.successMessageElement.getText();
        String expectedSuccessText="Password Changed Successfully";

        Assert.assertEquals(actualSuccessText,expectedSuccessText);
    }

    @Then("Click on the Logout link")
    public void clickOnTheLogoutLink() {
        suatPage.logoutLinkText.click();
    }

    @And("Approve that the admin is logged out")
    public void approveThatTheAdminIsLoggedOut() {
        String expectedUrl="https://qa.wonderworldcollege.com/site/login";
        String actualUrl=Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(actualUrl,expectedUrl);
    }

//-----------------------------------US_028--------------------------------------


    @And("Click on the Income menu on the sidebar")
    public void clickOnTheIncomeMenuOnTheSidebar() {
        suatPage.incomeNavElement.click();
    }

    @And("Confirm that Add Income page link is displayed")
    public void confirmThatAddIncomePageLinkIsDisplayed() {
        suatPage.addIncomeLink.isDisplayed();
    }

    @When("Click on the Add Income page link")
    public void clickOnTheAddIncomePageLink() {
        suatPage.addIncomeLink.click();
    }

    @Then("Link to the income page")
    public void linkToTheIncomePage() {
        String actualIncomePageUrl=Driver.getDriver().getCurrentUrl();
        String expectedIncomePageUrl="https://qa.wonderworldcollege.com/admin/income";

        Assert.assertEquals(actualIncomePageUrl,expectedIncomePageUrl);
    }

    @And("Approve the possibility of uploading document")
    public void approveThePossibilityOfUploadingDocument() {
        suatPage.uploadDocumentBox.click();
    }

    @And("Confirm the existence of Add Income section with the Income Head dropdown menu, Name, Invoice Number, Date, Amount, and Description fields.")
    public void confirmTheExistenceOfAddIncomeSectionWithTheIncomeHeadDropdownMenuNameInvoiceNumberDateAmountAndDescriptionFields() {
        Assert.assertTrue(suatPage.addIncomeSection.isDisplayed());
        Assert.assertTrue(suatPage.incomeHeadWord.isDisplayed());
        Assert.assertTrue(suatPage.incomeNameWord.isDisplayed());
        Assert.assertTrue(suatPage.incomeDateWord.isDisplayed());
        Assert.assertTrue(suatPage.invoiceNumberWord.isDisplayed());
        Assert.assertTrue(suatPage.incomeAmountWord.isDisplayed());
        Assert.assertTrue(suatPage.incomeDescriptionWord.isDisplayed());
    }

    @And("Enter valid information to the text boxes in Add income section")
    public void enterValidInformationToTheTextBoxesInAddIncomeSection() {
        Select select= new Select(suatPage.incomeHeadBox);
        select.selectByIndex(4);
        suatPage.incomeNameBox.sendKeys("Ibrahim K");
        suatPage.invoiceNoBox.sendKeys("10009");
        suatPage.amountBox.sendKeys("1000");
        suatPage.incomeDateBox.click();
        suatPage.spesicficDay.click();

    }

    @When("Click on the Save button")
    public void clickOnTheSaveButton() {
        suatPage.saveButton.click();
    }

    @Then("Confirm the creation of a new Income record")
    public void confirmTheCreationOfANewIncomeRecord() {
        String actualSuccessAlert=suatPage.successAlert.getText();
        String expectedSuccessAlert="Record Saved Successfully";

        Assert.assertEquals(actualSuccessAlert,expectedSuccessAlert);

    }

    @And("See that Income list has Name, Description, Invoice Number, Date, Income Head, and Amount")
    public void seeThatIncomeListHasNameDescriptionInvoiceNumberDateIncomeHeadAndAmount() {
        Assert.assertTrue(suatPage.incomeListText.isDisplayed());
        Assert.assertTrue(suatPage.incomeListName.isDisplayed());
        Assert.assertTrue(suatPage.incomeListAmount.isDisplayed());
        Assert.assertTrue(suatPage.incomeListDate.isDisplayed());
        Assert.assertTrue(suatPage.incomeListIncomeHead.isDisplayed());
        Assert.assertTrue(suatPage.incomeListDescription.isDisplayed());
        Assert.assertTrue(suatPage.incomeListInvoiceNo.isDisplayed());
    }

    @And("Verify the existence of search box to enable searching specific data")
    public void verifyTheExistenceOfSearchBoxToEnableSearchingSpecificData() {
        Assert.assertTrue(suatPage.incomeSearchBox.isDisplayed());
        suatPage.incomeSearchBox.sendKeys("Mahmut");
    }

    @And("Confirm that in one page the amount of records seen is changeable")
    public void confirmThatInOnePageTheAmountOfRecordsSeenIsChangeable() {
        Select select= new Select(suatPage.incomeRecordNumber);
        select.selectByIndex(1);
    }
}
