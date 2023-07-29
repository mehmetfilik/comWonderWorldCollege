package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HamzaPage extends Base {
    public HamzaPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //admin login >email
    @FindBy(xpath = "//input[@name='login']")
    public WebElement eMail;

    // admin login >sing in
    @FindBy(xpath = "//button[text()='Sign In']")
    public WebElement signinButton;

    // Adress Box On The New Adress Page
    @FindBy (xpath = "//input[@id='Address']")
    public WebElement adressBoxOnTheNewAdressPage;

    // PhoneNumber Box On The New Adress Page
    @FindBy (xpath = "//input[@id='customer_phn']")
    public WebElement phoneNumberBoxOntheNewAdressPage;


    // Homapage AdminLogin Button
    @FindBy(xpath = "//i[@class='fa fa-user-plus']")
    public WebElement adminLoginButton;

    // Admin Login Page -> EmailBox
    @FindBy(id = "form-username")
    public WebElement adminEmailBox;

    //Admin Login Page -> passwordBox
    @FindBy(id = "form-password")
    public WebElement adminPasswordBox;

    // Admin and Teacher Login Page -> signInButton
    @FindBy(xpath = "//button[@class='btn']")
    public WebElement signInButton;

    //===================================================================

    //Admin Page -> Student Information Link
    @FindBy(xpath = "(//*[text()='Student Information'])[2]")
    public WebElement studentInformationLink;
    //Admin Page -> Student Details Link
    @FindBy(xpath = "(//*[text()='Student Details'])[2]")
    public WebElement studentDetailsLink;

    //Admin Student Details -> Class DropDown Element
    @FindBy (xpath ="//*[@id='class_id']")
    public WebElement classDropDownElement;

    //Admin Student Details -> Section DropDown Element
    @FindBy (xpath ="//*[@id='section_id']")
    public WebElement sectionDropDownElement;

    //Admin Student Details -> Class-Section Search Button
    @FindBy (xpath ="(//*[@name='search'])[3]")
    public WebElement classSectionSearchButton;

    //Admin Student Details -> Class-Section Search Button
    @FindBy (xpath ="(//*[@name='search'])[4]")
    public WebElement searchByKeywordSearchButton;




}
