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

    //Admin Student List -> Add Fees Icon
    @FindBy (xpath ="(//*[@href='https://qa.wonderworldcollege.com/studentfee/addfee/160'])[1]")
    public WebElement studentListAddFeesIcon;

    //Admin Fees Collection -> Fees Collection Icon
    @FindBy (xpath ="//*[text()='Fees Collection']")
    public WebElement adminFeesCollectionIcon;

    //Admin Fees Collection -> Fees Master Icon
    @FindBy (xpath ="(//*[text()='Fees Master'])[2]")
    public WebElement adminFeesMasterIcon;



    //Admin Fees Collection -> Fees Group Icon
    @FindBy (xpath ="(//th[text()='Fees Group'])[1]")
    public WebElement adminFeesFeesGroupIcon;

    //Admin Fees Collection -> Fees Code Icon
    @FindBy (xpath ="(//th[text()='Fees Code'])[1]")
    public WebElement adminFeesFeesCodeIcon;

    //Admin Fees Collection -> Due Date Icon
    @FindBy (xpath ="(//th[text()='Due Date'])[1]")
    public WebElement adminFeesDueDateIcon;

    //Admin Fees Collection -> Status Icon
    @FindBy (xpath ="(//th[text()='Status'])[1]")
    public WebElement adminFeesStatusIcon;


    //Admin Fees Collection -> Amount Icon
    @FindBy (xpath ="//*[@id=\"DataTables_Table_0\"]/thead[1]/tr/th[5]")
    public WebElement adminFeesAmountIcon;


    //Admin Fees Collection -> Payment ID Icon
    @FindBy (xpath ="(//th[text()='Payment ID'])[1]")
    public WebElement adminFeesPaymentIDIcon;


    //Admin Fees Collection -> Mode Icon
    @FindBy (xpath ="(//th[text()='Mode'])[1]")
    public WebElement adminFeesModeIcon;


    //Admin Fees Collection -> Date Icon
    @FindBy (xpath ="(//th[text()='Date'])[1]")
    public WebElement adminFeesDateIcon;


    //Admin Fees Collection -> Discount Icon
    @FindBy (xpath ="//*[@id=\"DataTables_Table_0\"]/thead[1]/tr/th[10]")
    public WebElement adminFeesDiscountIcon;


    //Admin Fees Collection -> Fine Icon
    @FindBy (xpath ="//*[@id=\"DataTables_Table_0\"]/thead[1]/tr/th[11]")
    public WebElement adminFeesFineIcon;


    //Admin Fees Collection -> Paid Icon
    @FindBy (xpath ="//*[@id=\"DataTables_Table_0\"]/thead[1]/tr/th[12]")
    public WebElement adminFeesPaidIcon;


    //Admin Fees Collection -> Balance Icon
    @FindBy (xpath ="//*[@id=\"DataTables_Table_0\"]/thead[1]/tr/th[13]")
    public WebElement adminFeesBalanceIcon;


    //Admin Fees Collection -> Action Icon
    @FindBy (xpath ="(//th[text()='Action'])[1]")
    public WebElement adminFeesActionIcon;

    //Admin Fees Collection -> Admin Bar Money Icon
    @FindBy (xpath ="//*[@id=\"alert\"]/nav/div[2]/div/div/div[1]/div/button/span[1]")
    public WebElement adminFeesBarMoneyIcon;

    //Admin Fees Collection -> Admin Bar Euro Icon
    @FindBy (xpath ="//*[@id=\"alert\"]/nav/div[2]/div/div/div[1]/div/div/ul/li[1]/a")
    public WebElement adminFeesBarEuroIcon;

    //Admin Fees Collection -> Fees List Euro Icon
    @FindBy (xpath ="//*[@id=\"DataTables_Table_0\"]/thead[1]/tr/th[6]/span")
    public WebElement adminFeesListEuroIcon;

    //Admin Fees Collection -> Add Fee + Icon
    @FindBy (xpath ="//*[@id=\"DataTables_Table_0\"]/tbody/tr[2]/td[14]/div/div/button[1]")
    public WebElement adminFeesActionPlusIcon;

    //Admin Fees Collection -> Amount Popup
    @FindBy (id = "amount")
    public WebElement adminFeesAmountPopup;

    //Admin Fees Collection -> Amount Popup Collect Fees
    @FindBy (xpath = "(//*[@id='load'])[3]")
    public WebElement adminFeesAmountPopupCollectFees;

    //Admin Fees Collection -> Entered Amount Text
    @FindBy (xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[3]/td[12]")
    public WebElement adminFeesEnteredAmountText;

    //Admin Fees Collection -> Amount Add Fee Revert Icon
    @FindBy (xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[3]/td[14]/div/div/button[1]")
    public WebElement adminFeesRevertIcon;

    //Admin Fees Collection -> Revert Assent
    @FindBy (xpath = "//*[@id=\"confirm-delete\"]/div/div/div[3]/a")
    public WebElement adminFeesRevertAssentIcon;

    //Admin Fees Collection -> Balance Text
    @FindBy (xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[4]/td[12]")
    public WebElement adminFeesBalanceText;

    //Admin Fees Collection -> Paid
    @FindBy (xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[2]/td[12]")
    public WebElement adminFeesPaidLine;

    //Admin Fees Collection -> Total Paid
    @FindBy (xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[5]/td[12]")
    public WebElement adminFeesTotalPaid;

    //Admin Fees Collection -> Balance One
    @FindBy (xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[2]/td[13]")
    public WebElement adminFeesBalanceOne;

    //Admin Fees Collection -> Balance Two
    @FindBy (xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[4]/td[13]")
    public WebElement adminFeesBalanceTwo;

    //Admin Fees Collection -> Total Balance
    @FindBy (xpath = "//*[@id=\"DataTables_Table_0\"]/tbody/tr[5]/td[13]")
    public WebElement adminFeesTotalBalance;





















    //======================================================================
    //US_025

    //Admin Fees Collection -> Fees Master Head
    @FindBy (xpath ="//*[text()='Add Fees Master : 2022-23']")
    public WebElement adminFeesMasterHead;

    //Admin Fees Collection -> Fees Group Text
    @FindBy (xpath ="(//*[text()='Fees Group'])[3]")
    public WebElement adminFeesGroupText;

    //Admin Fees Collection -> Fees Type Text
    @FindBy (xpath ="(//*[text()='Fees Type'])[3]")
    public WebElement adminFeesTypeText;

    //Admin Fees Collection -> Due Date Text
    @FindBy (xpath ="(//*[text()='Due Date'])[1]")
    public WebElement adminFeesDueDateText;

    //Admin Fees Collection -> Amount Text
    @FindBy (xpath ="//*[text()='Amount (€)']")
    public WebElement adminFeesAmountText;

    //Admin Fees Collection -> Fine Type Text
    @FindBy (xpath ="//*[text()='Fine Type']")
    public WebElement adminFeesFineTypeText;

    //Admin Fees Collection -> Fine Type None Button
    @FindBy (xpath ="(//*[@id='input-type-student'])[1]")
    public WebElement adminFeesNoneButton;

    //Admin Fees Collection -> Fine Type Percentage Button
    @FindBy (xpath ="(//*[@id='input-type-student'])[2]")
    public WebElement adminFeesPercentageButton;

    //Admin Fees Collection -> Fine Type Fix Amount Button
    @FindBy (id ="input-type-tutor")
    public WebElement adminFeesFixButton;

    //Admin Fees Collection -> Percentage
    @FindBy (xpath ="//*[text()='Percentage (%)']")
    public WebElement adminFeesPercentageText;

    //Admin Fees Collection -> Fix Amount
    @FindBy (xpath ="//*[text()='Fix Amount (€)']")
    public WebElement adminFeesFixAmountText;

    //Admin Fees Collection -> Fees Master List Head
    @FindBy (xpath ="//*[text()='Fees Master List : 2022-23']")
    public WebElement adminFeesFeesMasterHead;

    //Admin Fees Collection -> Fees Group
    @FindBy (xpath ="//*[@id=\"DataTables_Table_0\"]/thead/tr/th[1]")
    public WebElement adminFeesFeesGroupText;

    //Admin Fees Collection -> Fees Code
    @FindBy (xpath ="//*[@id=\"DataTables_Table_0\"]/thead/tr/th[2]/div/div[1]")
    public WebElement adminFeesFeesCodeText;

    //Admin Fees Collection -> List Amount
    @FindBy (xpath ="//*[@id=\"DataTables_Table_0\"]/thead/tr/th[2]/div/div[2]")
    public WebElement adminFeesFixListAmountText;

    //Admin Fees Collection -> List Action
    @FindBy (xpath ="//*[text()='Action']")
    public WebElement adminFeesListActionText;

    //Admin Fees Collection -> List Search
    @FindBy (xpath ="//*[@id=\"DataTables_Table_0_filter\"]/label/input")
    public WebElement adminFeesListSearchBox;

    //Admin Fees Collection -> Fees Master Amount
    @FindBy (id ="amount")
    public WebElement adminFeesFeesMasterAmount;

    //Admin Fees Collection -> Fees Master Save
    @FindBy (xpath ="//*[@id=\"form1\"]/div[2]/button")
    public WebElement adminFeesFeesMasterSave;

    //Admin Fees Collection -> Fees Master Edit
    @FindBy (xpath ="//a[@href='https://qa.wonderworldcollege.com/admin/feemaster/edit/414']")
    public WebElement adminFeesFeesMasterEdit;

    //Admin Fees Collection -> Edit Amount Button
    @FindBy (id ="amount")
    public WebElement adminFeesAmountEdit;

    //Admin Fees Collection -> Edit Save Button
    @FindBy (xpath ="//*[@id=\"form1\"]/div[2]/button")
    public WebElement adminFeesEditSaveButton;

    //Admin Fees Collection -> Edit Save Success
    @FindBy (xpath ="//*[text()='Record Updated Successfully']")
    public WebElement adminFeesEditSaveSuccess;

    //Admin Fees Collection -> Fees Delete Icon
    @FindBy (xpath ="//a[@href='https://qa.wonderworldcollege.com/admin/feemaster/delete/414']")
    public WebElement adminFeesFeesDeleteIcon;












}