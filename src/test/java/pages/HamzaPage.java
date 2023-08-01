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

    //Admin Student Search -> List Head1
    @FindBy (xpath ="(//th[@rowspan='1'])[1]")
    public WebElement searchListAdmissionNo;

    //Admin Student Search -> List Head2
    @FindBy (xpath ="(//th[@rowspan='1'])[2]")
    public WebElement searchListStudenName;

    //Admin Student Search -> List Head3
    @FindBy (xpath ="(//th[@rowspan='1'])[3]")
    public WebElement searchListClass;

    //Admin Student Search -> List Head4
    @FindBy (xpath ="(//th[@rowspan='1'])[4]")
    public WebElement searchListFatherName;

    //Admin Student Search -> List Head5
    @FindBy (xpath ="(//th[@rowspan='1'])[5]")
    public WebElement searchListDate;

    //Admin Student Search -> List Head6
    @FindBy (xpath ="(//th[@rowspan='1'])[6]")
    public WebElement searchListGender;

    //Admin Student Search -> List Head7
    @FindBy (xpath ="(//th[@rowspan='1'])[7]")
    public WebElement searchListCategory;

    //Admin Student Search -> List Head8
    @FindBy (xpath ="(//th[@rowspan='1'])[8]")
    public WebElement searchListMobileNumber;

    //Admin Student Search -> List Head9
    @FindBy (xpath ="(//th[@rowspan='1'])[9]")
    public WebElement searchListAction;

    //Admin Student Search -> Student Name
    @FindBy (partialLinkText = "eglence")
    public WebElement searchStudentName;

    //Admin Student Profile -> Student Name
    @FindBy (xpath ="(//*[text()='hamza.eglence'])[3]")
    public WebElement studentProfileName;

    //Admin Student List -> View Icon
    @FindBy (xpath ="(//*[@href='https://qa.wonderworldcollege.com/student/view/131'])[2]")
    public WebElement studentListViewIcon;

    //Admin Student List -> Edit Icon
    @FindBy (xpath ="(//*[@href='https://qa.wonderworldcollege.com/student/edit/131'])[1]")
    public WebElement studentListEditIcon;

    //Admin Edit Student -> Edit Head
    @FindBy (xpath ="//*[text()='Edit Student']")
    public WebElement studentEditPageHead;

    //Admin Edit Student -> Admission No
    @FindBy (id = "admission_no")
    public WebElement studentEditAdmissionNo;

    //Admin Edit Student -> First Name
    @FindBy (id = "firstname")
    public WebElement studentEditFirstName;

    //Admin Edit Student -> Date Of Birth
    @FindBy (id = "dob")
    public WebElement studentEditDateOfBirth;

    //Admin Edit Student -> Sample Birth
    @FindBy (xpath = "/html/body/div[5]/div[1]/table/tbody/tr[1]/td[4]")
    public WebElement studentEditDatePicker;

    //Admin Edit Student -> Fees Details
    @FindBy (xpath = "(//input[@type='checkbox'])[14]")
    public WebElement studentEditTestFees;

    //Admin Edit Student -> Father Name
    @FindBy (id = "father_name")
    public WebElement studentEditFatherName;

    //Admin Edit Student -> If Guardian Is
    @FindBy (xpath = "(//input[@name='guardian_is'])[3]")
    public WebElement studentEditGuardianIs;

    //Admin Edit Student -> Guardian Name
    @FindBy (id = "guardian_name")
    public WebElement studentEditGuardianName;

    //Admin Edit Student -> Bank Name
    @FindBy (id = "bank_name")
    public WebElement studentEditBankName;

    //Admin Edit Student -> Edit Save Button
    @FindBy (id = "submitbtn")
    public WebElement studentEditSaveButton;

    //Admin Edit Student -> Edit Save Alert
    @FindBy (xpath = "//div[text()='Record Updated Successfully']")
    public WebElement studentEditSaveAlert;
}