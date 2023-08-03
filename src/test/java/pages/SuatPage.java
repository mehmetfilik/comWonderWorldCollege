package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.locators.RelativeLocator;
import utilities.Driver;

public class SuatPage extends Base{

    //---------------------US_004-------------------------


    @FindBy(css= "a[href=‘../examresult']" )
    public WebElement examResult;

    @FindBy(xpath = "//input[@id=‘admission_no']")
    public WebElement admissionNoBox;

    @FindBy(xpath = "//select[@id=‘exam_id']")
    public WebElement selectExamBox;

    @FindBy(xpath="//label[text()='Admission No']/following-sibling::small")
    public WebElement mandatoryAdmissionSign;

    @FindBy(xpath= "//label[text()='Exam']/following-sibling::small")
    public WebElement mandatoryExamSign;

    @FindBy(xpath= "//button[@id='search_btn']" )
    public WebElement searchButton;

    @FindBy(xpath= "ul/li[contains(.,'Student Name')]" )
    public WebElement studentName;

    @FindBy(xpath= "ul/li[contains(.,'Roll Number')]" )
    public WebElement rollNumber;

    @FindBy(xpath= "ul/li[contains(.,'Admission No')]" )
    public WebElement admissionNoElement;

    @FindBy(xpath="//h4[text()='Average Passing']")
    public WebElement averagePassing;

    @FindBy(xpath="//th[text()=‘Subject']")
    public WebElement headingSubject;

    @FindBy(xpath="//th[text()='Max Marks’]")
    public WebElement headingMaxMarks;

    @FindBy(xpath="//th[text()='Min Marks’]")
    public WebElement headingMinMarks;

    @FindBy(xpath="//th[text()='Marks Obtained’]")
    public WebElement headingMarksObtained;

    @FindBy(xpath="//th[text()=‘Note’]")
    public WebElement headingNote;

    @FindBy(xpath="h5[text()='Percentage :  ']")
    public WebElement footerPercentage;

    @FindBy(xpath="h5[text()='Rank :  ‘]")
    public WebElement footerRank;

    @FindBy(xpath="//h5[text()='Result :’]")
    public WebElement footerResult;

    @FindBy(xpath="//span[text()='Division :’]")
    public WebElement footerDivision;

    @FindBy(xpath="//h5[text()='Grand Total : ‘]")
    public WebElement footerGrandTotal;

    @FindBy(xpath="//h5[text()='Total Obtain Marks :  ']")
    public WebElement footerTotalObtainMarks;

//-----------------------------US_008--------------------------------

    @FindBy(xpath="//section[@class='countdown_bg fullwidth counter']")
    public WebElement sectionElement;

    @FindBy(xpath="//h2[text()='ACHEIVEMENTS']")
    public WebElement achievementsElement;

    @FindBy(xpath = "(//*[@class='counter-main'])[1]")
    public WebElement graduatesElement;

    @FindBy(xpath = "(//*[@class='counter-main'])[2]")
    public WebElement teachersElement;

    @FindBy(xpath="(//*[@class='counter-main'])[3]")
    public WebElement campusElement;

    @FindBy(xpath="(//*[@class='counter-main'])[4]")
    public WebElement studentElement;

//--------------------------------US_011--------------------------------------

    @FindBy(xpath="//a[text()='Complain']")
    public WebElement complainTextElement;

    @FindBy(xpath="//i[@class='fa fa-pencil-square-o i-plain']")
    public WebElement complainIconElement;

    @FindBy(xpath="//label[@for=‘name']")
    public WebElement nameTextElement ;

    @FindBy(xpath="//label[text()=‘Email']")
    public WebElement emailTextElement;

    @FindBy(xpath="//label[text()='Contact No.’]")
    public WebElement contactNoElement;

    @FindBy(xpath="//label[text()=‘Description']")
    public WebElement descriptionElement;

    @FindBy(xpath="//input[@placeholder='Enter Your Name’]")
    public WebElement nameBoxElement;

    @FindBy(xpath="//input[@placeholder='Enter Your Email’]")
    public WebElement emailBoxElement;

    @FindBy(xpath="//input[@placeholder='Enter Contact No.’]")
    public WebElement contactNoBoxElement;

    @FindBy(id="description")
    public WebElement descriptionBoxElement ;

    @FindBy(xpath="//input[@name=‘submit'] ")
    public WebElement submitButtonElement;

    @FindBy(xpath="//div[@class='alert alert-success']")
    public WebElement successAlertElement;


}
