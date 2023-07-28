package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommonPage {

    // userlogin > User Login Title
    @FindBy(xpath = "(//h3)[1]")
    private WebElement userLoginTitle;

    // userlogin > What's New In Wonder World College Title
    @FindBy(xpath = "(//h3)[2]")
    private WebElement whatsNewTitle;

    // userlogin > Username Textbox
    @FindBy(id = "email")
    private WebElement usernameTextbox;

    // userlogin > Password Textbox
    @FindBy(id = "password")
    private WebElement passwordTextbox;

    // userlogin > Sign In Button
    @FindBy(xpath = "//*[@class='btn']")
    private WebElement signInButton;

    // userlogin > Forgot Password Button
    @FindBy(xpath = "//*[@class='forgot']")
    private WebElement forgotButton;

    // userlogin > Front Site Button
    @FindBy(linkText = "//div[2]/p[2]/a")
    private WebElement frontSiteButton;



}
