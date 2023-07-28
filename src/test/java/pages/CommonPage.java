package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class CommonPage extends Base {
    // Homepage -> Login Button
    @FindBy(xpath = "//a[@class='complainbtn']")
    private WebElement loginButton;

    // Parent LoginPage -> Email Box
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

    // Admin Login Page -> signInButton
    @FindBy(xpath = "//button[@class='btn']")
    private WebElement signInButton;




    public void parentLoginMethod (String username, String password){
        Driver.getDriver().get(ConfigReader.getProperty("wonderUrl"));
        loginButton.click();
        emailBox.sendKeys(username);
        passwordBox.sendKeys(password);
        submitButton.click();
    }

    public void studentLoginMethod (String username, String password){
        Driver.getDriver().get(ConfigReader.getProperty("wonderUrl"));
        loginButton.click();
        emailBox.sendKeys(username);
        passwordBox.sendKeys(password);
        submitButton.click();
    }

    public void admintLoginMethod (String adminEmail, String password){
        Driver.getDriver().get(ConfigReader.getProperty("adminLoginUrl"));
        adminLoginButton.click();
        ReusableMethods.switchToWindow("Login : Wonder World College");
        adminEmailBox.sendKeys(adminEmail);
        adminPasswordBox.sendKeys(password);
        signInButton.click();
    }

    public void teacherLoginMethod (String username, String password){
        Driver.getDriver().get(ConfigReader.getProperty("adminLoginUrl"));
        adminLoginButton.click();
        ReusableMethods.switchToWindow("Login : Wonder World College");
        adminEmailBox.sendKeys(username);
        adminPasswordBox.sendKeys(password);
        signInButton.click();
    }


}
