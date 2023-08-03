package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FerhatPage{
    public FerhatPage() {

        PageFactory.initElements(Driver.getDriver(),this);


    }//***********************13********************************

    @FindBy(xpath ="(//*[text()='info@wonderworldcollege.com'])[1]")
    public WebElement mailbutton;

    @FindBy(xpath = "(//*[@class='content-title'])[2]")
    public WebElement phoneNumbers;

    @FindBy(xpath ="(//*[@class='content-title'])[4]")
    public WebElement mailAddress;

    @FindBy(xpath ="//*[@class='sub-title']")
    public WebElement address;

    @FindBy(xpath =" //*[@class='he-text']")
    public WebElement callUs ;


    //**************************21********************************
    @FindBy(xpath ="//span[text()='Student Information']")
    public WebElement studentInformation ;


    @FindBy(xpath ="(//*[text()='Online Admission'])[3]")
    public WebElement onlineAdmission ;

    @FindBy(xpath ="//th[@aria-label='Action']")
    public WebElement actionButon ;

    @FindBy(xpath ="//h3[@class='box-title']")
    public WebElement studentList ;

    @FindBy(xpath ="//input[@type='search']")
    public WebElement search ;

    @FindBy(xpath ="//input[@type='search']")
    public WebElement nameAli ;

    @FindBy(xpath ="//input[@type='search']")
    public WebElement namePolat ;

    @FindBy(xpath ="//input[@type='search']")
    public WebElement clear ;

    @FindBy(xpath ="//input[@type='search']")
    public WebElement namePetra ;

    @FindBy(xpath ="//input[@type='search']")
    public WebElement nameErol ;

    @FindBy(xpath ="//input[@type='search']")
    public WebElement nameErolDlt ;

    @FindBy(xpath ="//input[@type='search']")
    public WebElement nameFurkan ;

    @FindBy(xpath ="//tbody/tr[1]/td[12]/a[3]/i[1]")
    public WebElement delete ;

    @FindBy(xpath ="//*[@class='fa fa-pencil']")
    public WebElement editEndEnroll ;

    @FindBy(xpath ="//input[@id='admission_no']")
    public WebElement admissionNo ;

    @FindBy(xpath ="//h3[@class='pagetitleh-whitebg']")
    public WebElement editOnlinaAdmis ;

    @FindBy(xpath ="(//h4[@class='pagetitleh2'][1]")
    public WebElement feesDetails ;

    @FindBy(xpath ="(//h3[@class='pagetitleh2'])[1]")
    public WebElement  transportDetails;

    @FindBy(xpath ="(//h4[@class='pagetitleh2'])[2]")
    public WebElement  parentGuardianDetail;

    @FindBy(xpath ="(//h3[@class='pagetitleh2'])[2]")
    public WebElement  addressDetails;

    @FindBy(xpath ="(//h3[@class='pagetitleh2'])[3]")
    public WebElement  miscellaneousDetails;

    @FindBy(xpath ="(//button[@type='submit'])[3]")
    public WebElement  saveButton;

    @FindBy(xpath ="(//button[@type='submit'])[4]")
    public WebElement  saveAndEnroll;

    @FindBy(xpath ="//span[@class='font14']")
    public WebElement  feesDetailsinformation;

    @FindBy(xpath = "(//button[@type='submit'])[3]")
    public WebElement save;

    @FindBy(xpath = "(//button[@type='submit'])[4]")
    public WebElement saveAndSavEnrrol2;


    //***************************27********************************
    @FindBy(xpath = "//span[text()='Fees Collection']")
    public WebElement FeesCollection;

    @FindBy(xpath = "(//*[text()='Fees Type'])[2]")
    public WebElement feesTypeButton;

    @FindBy(xpath = "//th[text()='Action']")
    public WebElement actionButton;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement FeesName;

    @FindBy(xpath = "//input[@name='code']")
    public WebElement FeesCode;

    @FindBy(xpath = "//textarea[@name='description']")
    public WebElement descireptions;

    @FindBy(xpath = "(//*[@class='fa fa-pencil'])[3]")
    public WebElement feesEditIkon;
    @FindBy(xpath = "(//*[@class='fa fa-remove'])[1]")
    public WebElement FeesDeleteIkon;

    //**************************44***************************
    @FindBy(xpath = "(//img[@alt='User Image'])[1]")
    public WebElement profilButton;

    @FindBy(xpath = "//i[@class='fa fa-key']")
    public WebElement changePasswordIcon;
    @FindBy(xpath = "//input[@name='current_pass']")
    public WebElement oldPassword;

    @FindBy(xpath = "//input[@name='new_pass']")
    public WebElement newPasword;

    @FindBy(xpath = "//input[@id='confirm_pass']")
    public WebElement repeatPassword;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement stdntSave;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement stdntSave2;

    @FindBy(xpath = "//*[@class='active']")
    public WebElement changePasswordTitle;


















}

