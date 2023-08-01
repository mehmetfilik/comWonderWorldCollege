package pages;

import io.cucumber.java.en.And;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class FilikPage extends Base {

    CommonPage commonPage = new CommonPage();

    // userlogin > User Login Title
    @FindBy(xpath = "(//h3)[1]")
    private WebElement userLoginTitle;

    // userlogin > What's New In Wonder World College Title
    @FindBy(xpath = "(//h3)[2]")
    private WebElement whatsNewTitle;

    // userlogin > Forgot Password Button
    @FindBy(xpath = "//*[@class='forgot']")
    private WebElement forgotButton;

    // userlogin > Front Site Button
    @FindBy(xpath = "(//a[@target='_blank'])[1]")
    private WebElement frontSiteButton;

    // ufpassword > Email Box on the Forgot Password Page
    @FindBy(id = "form-username")
    private WebElement forgotEmailBox;

    // ufpassword > Student Radio Button on the Forgot Password Page
    @FindBy(xpath = "//*[@value='student']")
    private WebElement studentRadioButton;

    // ufpassword > Parent Radio Button on the Forgot Password Page
    @FindBy(xpath = "//*[@value='parent']")
    private WebElement parentRadioButton;

    // ufpassword -> Submit Button
    @FindBy(xpath = "//button[@class='btn']")
    private WebElement submitButton;

    // ufpassword -> User Login Button
    @FindBy(xpath = "//*[@class='forgot']")
    private WebElement userLoginButton;

    // ufpassword -> Invalid Email Or User Type
    @FindBy(xpath = "//div[@class='alert alert-danger']")
    private WebElement invalidEmailAlert;


    // ufpassword -> Invalid Email Or User Type
    @FindBy(xpath = "//div[@class='alert alert-success']")
    private WebElement validEmailAlert;

    // adminlogin > Admin Login Title
    @FindBy(xpath = "(//h3)[1]")
    private WebElement adminLoginTitle;

    // User-Parent LoginPage -> Email Box
    @FindBy(id = "email")
    private WebElement emailBox;

    // Parent LoginPage -> Password Box
    @FindBy(id = "password")
    private WebElement passwordBox;

    // Admin Login Page -> EmailBox
    @FindBy(id = "form-username")
    private WebElement adminEmailBox;

    //Admin Login Page -> passwordBox
    @FindBy(id = "form-password")
    private WebElement adminPasswordBox;

    // Admin and Teacher Login Page -> signInButton
    @FindBy(xpath = "//button[@class='btn']")
    private WebElement signInButton;

    // Teacher panel -> Examinations Menu
    @FindBy(xpath = "(//i[@class='fa fa-map-o ftlayer'])[2]")
    private WebElement examinationsMenu;

    // Teacher panel -> Examinations Menu > Exam Result Link
    @FindBy(xpath = "(//i[@class='fa fa-angle-double-right'])[42]")
    private WebElement examResultLink;

    // Teacher panel -> Examinations Menu > Exam Result Page > Select Criteria Title
    @FindBy(xpath = "//h3")
    private WebElement selectCriteriaTitle;

    // Teacher panel -> Exam Result Page > Select Criteria > Exam Group Dropdown Menu
    @FindBy(id = "select2-exam_group_id-container")
    private WebElement examGroupDropdownMenu;

    // Teacher panel -> Exam Result Page > Select Criteria > Exam Group Search Box
    @FindBy(xpath = "//*[@class='select2-search__field']")
    private WebElement examGroupSearchBox;

    // Teacher panel -> Exam Result Page > Select Criteria > Exam Dropdown Menu
    @FindBy(id = "select2-exam_id-container")
    private WebElement examDropdownMenu;

    // Teacher panel -> Exam Result Page > Select Criteria > Exam Search Box
    @FindBy(xpath = "//*[@class='select2-search__field']")
    private WebElement examSearchBox;

    // Teacher panel -> Exam Result Page > Select Criteria > Session Dropdown Menu
    @FindBy(id = "session_id")
    private WebElement sessionDropdownMenu;

    // Teacher panel -> Exam Result Page > Select Criteria > Class Dropdown Menu
    @FindBy(id = "class_id")
    private WebElement classDropdownMenu;

    // Teacher panel -> Exam Result Page > Select Criteria > Section Dropdown Menu
    @FindBy(id = "section_id")
    private WebElement sectionDropdownMenu;

    // Teacher panel -> Exam Result Page > Select Criteria > Search Button
    @FindBy(name = "search")
    private WebElement searchButton;


    // Teacher panel -> Exam Result Page > Exam Result Table Headers
    @FindBy(xpath = "//table/thead")
    private List<WebElement> examResultTableHeaders;

    // Teacher panel -> Exam Result Page > first student name on the table
    @FindBy(xpath = "//tbody/tr[1]/td[2]/a")
    private WebElement firstStudentNameOnExamResultTable;

    // Student panel -> student Profile
    @FindBy(xpath = "(//*[@class='active'])[3]")
    private WebElement studentProfile;




//-------------------------------------------------------------------------------------



    public void verificationOfWindowAndInformationOnUserLoginPage(){
        userLoginTitle.isDisplayed();
        whatsNewTitle.isDisplayed();
        emailBox.isDisplayed();
        emailBox.isEnabled();
        passwordBox.isDisplayed();
        passwordBox.isEnabled();
        submitButton.isDisplayed();
        forgotButton.isDisplayed();
        frontSiteButton.isDisplayed();
        userLoginButton.isDisplayed();

    }

    public void verifyStudentParentDashboardPage(){
        assertEquals(ConfigReader.getProperty("userDashboardUrl"),Driver.getDriver().getCurrentUrl());
    }

    public void verifyAdminDashboardPage(){
        assertEquals(ConfigReader.getProperty("adminDashboardUrl"),Driver.getDriver().getCurrentUrl());
    }

    public void verifyAndClickOnTheForgotPasswordButtonOnTheUserLoginPage() {
        forgotButton.isDisplayed();
        forgotButton.click();
        assertEquals(ConfigReader.getProperty("ufpasswordUrl"),Driver.getDriver().getCurrentUrl());
    }

    @And("Verify and Click on the Forgot Password Button on the Admin Login Page")
    public void verifyAndClickOnTheForgotPasswordButtonOnTheAdminLoginPage() {
        forgotButton.isDisplayed();
        forgotButton.click();
        assertEquals(ConfigReader.getProperty("forgotpasswordUrl"),Driver.getDriver().getCurrentUrl());
    }

    public void verifyPasswordResetFunctionalityOnTheUserForgotPasswordPage() {
        forgotEmailBox.isDisplayed();
        forgotEmailBox.isEnabled();
        studentRadioButton.isDisplayed();
        parentRadioButton.isDisplayed();
        submitButton.isDisplayed();
        forgotEmailBox.sendKeys(ConfigReader.getProperty("validFilikEmail"));
        studentRadioButton.click();
        submitButton.click();
        ReusableMethods.bekle(2);
        String actualAlertText = invalidEmailAlert.getText();
        assertTrue(actualAlertText.contains("Invalid Email Or User Type"));
    }

    public void verifyPasswordResetFunctionalityOnTheAdminForgotPasswordPage() {
        forgotEmailBox.isDisplayed();
        forgotEmailBox.isEnabled();
        submitButton.isDisplayed();
        forgotEmailBox.sendKeys(ConfigReader.getProperty("validFilikAdminEmail"));
        submitButton.click();
        ReusableMethods.bekle(2);
        String actualAlertText = validEmailAlert.getText();
        assertTrue(actualAlertText.contains("Please Check Your Email To Recover Your Password"));
    }

    public void verifyAndClickOnTheUserLoginButtonOnTheForgotPasswordPage() {
        userLoginButton.isDisplayed();
        userLoginButton.click();
        assertEquals(ConfigReader.getProperty("userloginUrl"),Driver.getDriver().getCurrentUrl());
    }

    public void verifyAndClickOnTheFrontSiteButtonOnTheUserLoginPage() {

        frontSiteButton.isDisplayed();
        frontSiteButton.click();
        ReusableMethods.switchToWindow(ConfigReader.getProperty("wonderUrl"));
        assertEquals(ConfigReader.getProperty("wonderUrl"),Driver.getDriver().getCurrentUrl());

    }

    public void forgotPasswordMethod(){
        commonPage.navigateToHomepage();
        commonPage.verifyAndClickOnTheLoginButtonOnTheHomepage();
        forgotButton.click();
        userLoginButton.click();
        frontSiteButton.click();
        ReusableMethods.switchToWindow("Home");
        assertEquals(ConfigReader.getProperty("wonderUrl"),Driver.getDriver().getCurrentUrl());

    }

    public void verificationOfWindowAndInformationOnAdminLoginPage(){
        adminLoginTitle.isDisplayed();
        whatsNewTitle.isDisplayed();
        adminEmailBox.isDisplayed();
        adminEmailBox.isEnabled();
        adminPasswordBox.isDisplayed();
        adminPasswordBox.isEnabled();
        signInButton.isDisplayed();
        forgotButton.isDisplayed();
        frontSiteButton.isDisplayed();
        userLoginButton.isDisplayed();
    }

    public void goToExamResultPageInTheTeacherPanel() {
        examinationsMenu.isDisplayed();
        examinationsMenu.click();
        examResultLink.isDisplayed();
        examResultLink.click();
    }

    public void verificationOfSelectCriteria() {
        selectCriteriaTitle.isDisplayed();
        examGroupDropdownMenu.isDisplayed();
        examGroupDropdownMenu.click();
        examGroupSearchBox.sendKeys("Average Passing Exam");
        examGroupSearchBox.sendKeys(Keys.ENTER);

        ReusableMethods.bekle(1);
        examDropdownMenu.isDisplayed();
        examDropdownMenu.click();

        examSearchBox.sendKeys("Average Passing");
        examSearchBox.sendKeys(Keys.ENTER);

        sessionDropdownMenu.isDisplayed();
        Select select = new Select(sessionDropdownMenu);
        select.selectByIndex(7);

        classDropdownMenu.isDisplayed();
        select = new Select(classDropdownMenu);
        select.selectByIndex(2);

        sectionDropdownMenu.isDisplayed();
        select = new Select(sectionDropdownMenu);
        select.selectByIndex(1);

        searchButton.isDisplayed();
        searchButton.click();
    }

    public String[] getExamResultTableHeaders(){
        String[] headers = new String[examResultTableHeaders.size()];

        for (int i = 0; i < examResultTableHeaders.size(); i++) {
            headers[i] = examResultTableHeaders.get(i).getText();
        }
        return headers;
    }

    public void clickExamResultTableHeader(int index) {
        examResultTableHeaders.get(index).click();
    }

    // A method that checks if the title is visible
    public boolean isHeaderVisible(String headerName) {
        for (WebElement header : examResultTableHeaders) {
            if (header.getText().equalsIgnoreCase(headerName)) {
                return header.isDisplayed();
            }
        }
        return false;
    }

    // A method to check if the title is clickable
    public boolean isHeaderClickable(String headerName) {
        for (WebElement header : examResultTableHeaders) {
            if (header.getText().equalsIgnoreCase(headerName)) {
                return header.isEnabled();
            }
        }
        return false;
    }

    public void verificationOfExamResultTableHeader(){
        verificationOfSelectCriteria();

        String[] headers = getExamResultTableHeaders();

        // Check visibility and clickability for each title
        for (String header : headers) {
            boolean isHeaderVisible = isHeaderVisible(header);
            boolean isHeaderClickable = isHeaderClickable(header);
           }
        ReusableMethods.bekle(1);
    }

    public void verificationOfUserRedirectionToStudentSProfilePage() {
        ReusableMethods.waitForPageToLoad(3);
        firstStudentNameOnExamResultTable.click();
        ReusableMethods.waitForPageToLoad(3);
        assertTrue(studentProfile.isDisplayed());
    }





}
