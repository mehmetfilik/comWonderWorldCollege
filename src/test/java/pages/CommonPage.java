package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class CommonPage extends Base {
  
    // Homepage -> Login Button
    @FindBy(xpath = "//a[@class='complainbtn']")
    private WebElement loginButton;

    // User-Parent LoginPage -> Email Box
    @FindBy(id = "email")
    private WebElement emailBox;

    // Parent LoginPage -> Password Box
    @FindBy(id = "password")
    private WebElement passwordBox;

    // LoginPage -> Submit Button
    @FindBy(xpath = "//button[@class='btn']")
    private WebElement submitButton;

    // Homapage AdminLogin Button
    @FindBy(xpath = "//i[@class='fa fa-user-plus']")
    private WebElement adminLoginButton;

    // Admin Login Page -> EmailBox
    @FindBy(id = "form-username")
    private WebElement adminEmailBox;

    //Admin Login Page -> passwordBox
    @FindBy(id = "form-password")
    private WebElement adminPasswordBox;

    // Admin and Teacher Login Page -> signInButton
    @FindBy(xpath = "//button[@class='btn']")
    private WebElement signInButton;
    
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
    @FindBy(linkText = "//div[2]/p[2]/a")
    private WebElement frontSiteButton;

    // Homapage TeacherLogin Button
    @FindBy(xpath = "//i[@class='fa fa-user-plus']")
    private WebElement teacherLoginButton;
   
    // Teacher Login Page -> EmailBox
    @FindBy(id = "form-username")
    private WebElement teacherEmailBox;

    //Teacher Login Page -> passwordBox
    @FindBy(id = "form-password")
    private WebElement teacherPasswordBox;
  
  
  
  //-------------------------------------------------------------------------------------------------------------------
  
  

    public void parentOrStudentLoginMethod (String username, String password){
        Driver.getDriver().get(ConfigReader.getProperty("wonderUrl"));
        loginButton.click();
        emailBox.sendKeys(username);
        passwordBox.sendKeys(password);
        submitButton.click();
    }

    public void adminLoginMethod (String adminEmail, String password){
        Driver.getDriver().get(ConfigReader.getProperty("adminLoginUrl"));
        adminLoginButton.click();
        ReusableMethods.switchToWindow("Login : Wonder World College");
        adminEmailBox.sendKeys(adminEmail);
        adminPasswordBox.sendKeys(password);
        signInButton.click();

    }

    public void teacherLoginMethod (String teacherEmail, String password){
        Driver.getDriver().get(ConfigReader.getProperty("teacherLoginUrl"));
        teacherLoginButton.click();
        ReusableMethods.switchToWindow("Login : Wonder World College");
        teacherEmailBox.sendKeys(teacherEmail);
        teacherPasswordBox.sendKeys(password);
        signInButton.click();

    }
  
     public void navigateToHomepage(){
        Driver.getDriver().get(ConfigReader.getProperty("wonderUrl"));
    }

    public void navigateToAdminLoginUrl(){
        Driver.getDriver().get(ConfigReader.getProperty("adminLoginUrl"));
    }

    public void verifyAndClickOnTheLoginButtonOnTheHomepage(){
        loginButton.isDisplayed();
        loginButton.click();
    }

    public void loginUsername(String username){
        emailBox.sendKeys(ConfigReader.getProperty(username));
    }

    public void loginPassword(String password){
        passwordBox.sendKeys(ConfigReader.getProperty(password));
    }

    public void clickSignInButton(){
        signInButton.click();
    }

    public void closeTheBrowser() {
        Driver.quitDriver();
    }

    public void clickAdminLoginButton(){
        adminLoginButton.click();
        ReusableMethods.switchToWindow("Login : Wonder World College");
    }

    public void adminLoginUsername(String username){
        adminEmailBox.sendKeys(ConfigReader.getProperty(username));
    }

    public void adminLoginPassword(String password){
        adminPasswordBox.sendKeys(ConfigReader.getProperty(password));
    }



}

