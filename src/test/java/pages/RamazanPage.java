package pages;

import org.checkerframework.checker.signature.qual.FieldDescriptor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

public class RamazanPage extends Base {


    @FindBy(xpath = "//span[.='Homework']")
    public WebElement homeworkLink;

    @FindBy(xpath = "(//a[@href='https://qa.wonderworldcollege.com/homework'])[2]")
    public WebElement addHomeworkLink;


    @FindBy(xpath = "//select[@id='searchclassid']")
    public WebElement classDropdownMenu;

    @FindBy(xpath = "//select[@id='secid']")
    public WebElement sectionDropdownMenu;

    @FindBy(xpath = "//select[@id='subject_group_id']")
    public WebElement subjectGroupDropdownMenu;

    @FindBy(xpath = "//select[@id='subid']")
    public WebElement subjectDropdownMenu;

    @FindBy(xpath = "//button[@id='search_filter']")
    public WebElement searchButton;

    @FindBy(xpath = "(//i[@class='fa fa-reorder'])[1]")
    public WebElement evaluationIcon;

    @FindBy(xpath = "//div[@id='evaluation_details']")
    public WebElement evaluateDetailsPage;


    @FindBy(xpath = "//h4[@class='mt0']")
    public WebElement summaryText;

    @FindBy(xpath = "//i[@class='fa fa-pencil']")
    public WebElement editIcon;


    @FindBy(xpath = "//iframe[@class='wysihtml5-sandbox']")
    public WebElement iFrameElement;
    @FindBy(xpath = "//body[@marginwidth='0']")
    public WebElement textBox;

    @FindBy(xpath = "(//*[@id='submit'])[1]")
    public WebElement saveButton;

    @FindBy(xpath = "//*[text()='Record Saved Successfully']")
    public WebElement successMessageElement;

    // @FindBy(xpath = "//*[text()='Record Saved Successfully']")
    // public WebElement toastMessageScheduleSuccessfully;

    @FindBy(xpath = "//i[@class='fa fa-remove']")
    public WebElement deleteIcon;

    @FindBy(xpath = "(//div[text()='No data available in table '])[1]")
    public WebElement noDataInHomeworkList;

    @FindBy(xpath = "//button[@onclick='addform()']")
    public WebElement addHomeworkButton;

    @FindBy(xpath = "//select[@id='modal_class_id']")
    public WebElement addPageClassDropdown;

    @FindBy(xpath = "//select[@id='modal_section_id']")
    public WebElement addPageSectionDropdown;

    @FindBy(xpath = "//select[@id='modal_subject_group_id']")
    public WebElement addPageSubjectGroupDropdown;

    @FindBy(xpath = "//select[@id='modal_subject_id']")
    public WebElement addPageSubjectDropdown;

    @FindBy(xpath = "//input[@id='homework_marks']")
    public WebElement homeworkMarks;

    @FindBy(xpath = "//a[text()='Upcoming Homework']")
    public WebElement upcomingHomework;

    @FindBy(xpath = "//a[text()='Closed Homework']")
    public WebElement closedHomework;

    @FindBy(xpath = "//input[@name='checkAll']")
    public WebElement checkBox;

    @FindBy(xpath = "//button[@id='delete_btn_id']")
    public WebElement deleteButton;

    @FindBy(xpath = "//*[text()='Record Deleted Successfully']")
    public WebElement deleteMessageElement;

    // --------------------------- US_049 ----------------------------- //
    @FindBy(xpath = "//*[@id='sibe-box']/li[6]/a/span")
    public WebElement appleLeaveLink;

    @FindBy(xpath = "//h3[@class='box-title']")
    public WebElement leaveLinkHeader;

    @FindBy(xpath = "//th[@aria-label='Class: activate to sort column ascending']")
    public WebElement classColumn;

    @FindBy(xpath = "//th[@aria-label='Section: activate to sort column ascending']")
    public WebElement sectionColumn;

    @FindBy(xpath = "//th[@aria-label='Apply Date: activate to sort column ascending']")
    public WebElement applyDateColumn;

    @FindBy(xpath = "//th[@aria-label='From Date: activate to sort column ascending']")
    public WebElement fromDateColumn;

    @FindBy(xpath = "//th[@aria-label='To Date: activate to sort column ascending']")
    public WebElement toDateColumn;

    @FindBy(xpath = "//th[@aria-label='Reason: activate to sort column ascending']")
    public WebElement reasonColumn;

    @FindBy(xpath = "//th[@aria-label='Status: activate to sort column ascending']")
    public WebElement statusColumn;

    @FindBy(xpath = "//th[@aria-label='Action: activate to sort column ascending']")
    public WebElement actionColumn;

    @FindBy(xpath = "//textarea[@id='message']")
    public WebElement textAreaEditLeavePage;

    @FindBy(xpath = "//*[@id='submit']")
    public WebElement saveButtonEditLeavePage;

    @FindBy(xpath = "//button[@onclick='add_leave()']")
    public WebElement addButtonLeavePage;

    @FindBy(xpath = "//input[@name='from_date']")
    public WebElement fromDateElement;

    @FindBy(xpath = "//input[@name='to_date']")
    public WebElement toDateElement;

    @FindBy(xpath = "//i[@class='fa fa-remove']")
    public WebElement deleteIconLeavePage;

    //=================US_053================

    // Homepage -> Login Button
    @FindBy(xpath = "//a[@title='Get child all academic updates communication with school administration.']")
    public WebElement loginButton;

    // User-Parent LoginPage -> Email Box
    @FindBy(xpath = "//input[@id='email']")
    public WebElement parentLoginEmailBox;

    // Parent LoginPage -> Password Box
    @FindBy(xpath = "//input[@id='password']")
    public WebElement parentLoginPasswordBox;

    // LoginPage -> Submit Button
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement parentLoginSubmitButton;

    @FindBy(xpath = "//div[@class='alert alert-danger']")
    public WebElement invalidPasswordAlert;

    @FindBy(xpath = "//a[@class='forgot']")
    public WebElement parentLoginForgotButton;

    @FindBy(xpath = "//h3[@class='font-white bolds']")
    public WebElement forgotPasswordPage;

    @FindBy(xpath = "//i[@class='fa fa-television']")
    public WebElement dashboardElement;

    //=========================US_054====================

    //Dashboard >> Profil Image
    @FindBy(xpath = "//img[@class='topuser-image']")
    public WebElement profilImageIcon;

    //Profil Image >> Change Password Icon
    @FindBy(xpath = "//i[@class='fa fa-key']")
    public WebElement changePasswordIcon;

    //Change Password Page >> Change Password button
    @FindBy(xpath = "//a[@href='#'][normalize-space()='Change Password']")
    public WebElement changePasswordButton;

    //Change Password Page >> Current Password
    @FindBy(xpath = "//input[@name='current_pass']")
    public WebElement currentPasswordElement;

    //Change Password Page >> New Password
    @FindBy(xpath = "//input[@name='new_pass']")
    public WebElement newPasswordElement;

    //Change Password Page >> Confirm Password
    @FindBy(xpath = "//input[@id='confirm_pass']")
    public WebElement confirmPasswordElement;


    //Change Username Page >> Change Username button
    @FindBy(xpath = "//a[normalize-space()='Change Username']")
    public WebElement changeUsernameButton;

    //Change Username Page >> Current Username
    @FindBy(xpath = "//input[@name='current_username']")
    public WebElement currentUsernameElement;

    //Change Username Page >> New Username
    @FindBy(xpath = "//input[@name='new_username']")
    public WebElement newUsernameElement;

    //Change Username Page >> Confirm Username
    @FindBy(xpath = "//input[@id='confirm_username']")
    public WebElement confirmUsernameElement;

    //Change Password Page >> Save Button
    @FindBy(xpath = "//button[@class='btn btn-info']")
    public WebElement saveButtonPasswordPage;

    // @FindBy(xpath = "//*[text()='Record Saved Successfully']")
    // public WebElement toastMessageScheduleSuccessfully;


    public void verifyThatTheClassSectionApplyDateFromDateToDateReasonStatusAndActionColumnsAreVisibleOnTheOpenedPage() {
        classColumn.isDisplayed();
        sectionColumn.isDisplayed();
        applyDateColumn.isDisplayed();
        fromDateColumn.isDisplayed();
        toDateColumn.isDisplayed();
        reasonColumn.isDisplayed();
        statusColumn.isDisplayed();
        actionColumn.isDisplayed();
    }



}
