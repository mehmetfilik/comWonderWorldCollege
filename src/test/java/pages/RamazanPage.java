package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RamazanPage {

    @FindBy(xpath ="//a[@class='btn btn-upgrade btn-lg']")
    private WebElement parentLoginButton;

    @FindBy(xpath = "//input[@name='username']")
    private WebElement usernameBox;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordBox;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement signInButton;

    @FindBy(xpath = "//a[@class='forgot']")
    private WebElement forgotPasswordButton;

    @FindBy(xpath = "//a[@class='forgot pull-right']")
    private WebElement frontSiteButton;

    // @FindBy(xpath = "//span[normalize-space()='Homework']")
    private WebElement homeworkLink;

    // @FindBy(xpath = "//*[@id="sibe-box"]/ul[2]/li[8]/ul/li[1]/a/text()")
    private WebElement addHomeworkLink;

    @FindBy(xpath = "//select[@id='searchclassid']")
    private WebElement classDropdownMenu;

    @FindBy(xpath = "//select[@id='secid']")
    private WebElement sectionDropdownMenu;

    @FindBy(xpath = "//select[@id='subject_group_id']")
    private WebElement subjectGroupDropdownMenu;

    @FindBy(xpath = "//select[@id='subid']")
    private WebElement subjectDropdownMenu;

    @FindBy(xpath = "//button[@id='search_filter']")
    private WebElement searchButton;

    @FindBy(xpath = "//button[@onclick='addform()']")
    private WebElement addHomeworkListButton;

    @FindBy(xpath = "(//i[@class='fa fa-reorder'])[1]")
    private WebElement evaluationIcon;
}
