package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Set;

import static org.junit.Assert.*;

public class FilikPage extends Base {

    CommonPage commonPage = new CommonPage();

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



//-------------------------------------------------------------------------------------



    public void verificationOfWindowAndInformationOnUserLoginPage(){
        userLoginTitle.isDisplayed();
        whatsNewTitle.isDisplayed();
    }

    public void verifyAndClickOnTheForgotPasswordButtonOnTheUserLoginPage() {
        forgotButton.isDisplayed();
        forgotButton.click();
        assertEquals(ConfigReader.getProperty("ufpasswordUrl"),Driver.getDriver().getCurrentUrl());
    }

    public void verifyPasswordResetFunctionalityOnTheForgotPasswordPage() {
        forgotEmailBox.isDisplayed();
        forgotEmailBox.isEnabled();
        studentRadioButton.isDisplayed();
        parentRadioButton.isDisplayed();
        submitButton.isDisplayed();
        forgotEmailBox.sendKeys(ConfigReader.getProperty("validFilikEmail"));
        studentRadioButton.click();
        submitButton.click();
        String actualAlertText = invalidEmailAlert.getText();
        ReusableMethods.bekle(2);
        assertTrue(actualAlertText.contains("Invalid Email Or User Type"));
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

}
