package pages;

import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

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

}
