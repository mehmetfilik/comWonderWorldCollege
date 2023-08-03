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

//--------------------------------US_019------------------------------------

    @FindBy(xpath="//img[@alt='User Image']")
    public WebElement profileIconElement;

    @FindBy(xpath="//ul[@class='dropdown-menu dropdown-user menuboxshadow']")
    public WebElement profileWindowElement ;

    @FindBy(xpath = "//h4[text()='suat.demirci']")
    public WebElement adminName;

    @FindBy(xpath = "//h5[text()='Admin']")
    public WebElement adminRole;

    @FindBy(xpath ="//h3[text()='Bank Account Details']" )
    public WebElement bankAccountDetails;
    @FindBy(xpath ="//h3[text()='Address Details']" )
    public WebElement addressDetails;

    @FindBy(xpath ="//h3[text()='Social Media Link']" )
    public WebElement socialMediaDetails;

    @FindBy(xpath="//a[@href='#activity']")
    public WebElement profileLinkElement;

    @FindBy(xpath="//a[@data-original-title='My Profile']")
    public WebElement profileLinkText ;

    @FindBy(xpath="//a[@data-original-title='Change Password']")
    public WebElement passwordLinkText ;

    @FindBy(xpath="//a[@class='pull-right']")
    public WebElement logoutLinkText ;
    @FindBy(xpath="//a[@href='#payroll']")
    public WebElement payrollLinkElement;

    @FindBy(xpath="//a[@href='#leaves']")
    public WebElement leavesLinkElement;

    @FindBy(xpath="//a[@href='#attendance']")
    public WebElement attendanceLinkElement;

    @FindBy(xpath="//a[@href='#documents']")
    public WebElement documentsLinkElement;

    @FindBy(xpath="//div[@class='nav-tabs-custom theme-shadow’]//div[@class='tab-content']")
    public WebElement profilePageDatasElement;

    @FindBy(xpath = "//h5[text()='Total Net Salary Paid']")
    public WebElement totalNetSalary;

    @FindBy(xpath = "//h5[text()='Total Gross Salary']")
    public WebElement totalGrossSalary;

    @FindBy(xpath = "//h5[text()='Total Earning']")
    public WebElement totalEarning;

    @FindBy(xpath = "//h5[text()='Total Deduction']")
    public WebElement totalDeduction;

    @FindBy(xpath = "//table[@id='DataTables_Table_0']")
    public WebElement paySliplist;

    @FindBy (xpath = "//th[text()='Payslip #']")
    public  WebElement paySlipColumn;

    @FindBy (xpath = "//th[text()='Month - Year']")
    public  WebElement monthYearColumn;

    @FindBy (xpath = "//th[text()='Date']")
    public  WebElement dateColumn;

    @FindBy (xpath = "//th[text()='Mode']")
    public  WebElement modeColumn;

    @FindBy (xpath = "(//th[text()='Status'])[1]")
    public  WebElement statusColumn;

    @FindBy (xpath = "(//th[text()='Net Salary '])[1]")
    public  WebElement netSalaryColumn;

    @FindBy (xpath = "(//th[text()='Action'])[1]")
    public  WebElement actionColumn;
    @FindBy(xpath="(//a[@role='button'])[1]")
    public WebElement viewPayslipButton;

    @FindBy(id="testdata")
    public WebElement payslipViewWindow;

    @FindBy(xpath="(//input[@type='search'])[1]")
    public WebElement payslipSearchElement;

    @FindBy(xpath="//*[@id='DataTables_Table_1_filter']")
    public WebElement leaveListColumns;

    @FindBy(xpath = "(//th[text()='Leave Type'])[1]")
    public WebElement leaveTypeColumn;

    @FindBy(xpath = "(//th[text()='Leave Date'])[1]")
    public WebElement leaveDateColumn;

    @FindBy(xpath = "(//th[text()='Days'])[1]")
    public WebElement daysColumn;

    @FindBy(xpath = "(//th[text()='Apply Date'])[1]")
    public WebElement applyDateColumn;

    @FindBy(xpath = "(//th[text()='Status'])[1]")
    public WebElement leaveStatusColumn;

    @FindBy(xpath = "(//th[text()='Action'])[1]")
    public WebElement actionLeavesColumn;

    @FindBy(xpath="(//i[@class='fa fa-eye'])[1]")
    public WebElement viewIconElement;

    @FindBy(xpath="(//*[@class='modal-content'])[1]")
    public WebElement leaveInfoWindow;


    @FindBy(xpath="//select[@name='year']")
    public WebElement selectableYearElement;

    @FindBy(xpath="//div[@class='halfday pull-right']")
    public WebElement attendanceMarkingLetters;

    @FindBy(xpath="//*[@id='attendancetable_wrapper']")
    public WebElement attendanceListElement;

    @FindBy(xpath="//input[@name='current_pass']")
    public WebElement currentPasswordBox;

    @FindBy(xpath="//input[@name='new_pass']")
    public WebElement newPasswordBox;

    @FindBy(xpath="//input[@id='confirm_pass']")
    public WebElement confirmPasswordBox;

    @FindBy(xpath="(//button[@type='submit'])[1]")
    public WebElement changePasswordButton;

    @FindBy(xpath="//div[text()='Password Changed Successfully']")
    public WebElement successMessageElement;


//---------------------------------US_028--------------------------------------


    @FindBy(xpath="//i[@class='fa fa-usd ftlayer']/following-sibling::span")
    public WebElement incomeNavElement;

    @FindBy(xpath="(//a[text()='Add Income'])[2]")
    public WebElement addIncomeLink;

    @FindBy(xpath="(//div[@class='box box-primary'])[1]")
    public WebElement addIncomeSection;

    @FindBy(xpath = "//label[text()='Income Head']")
    public WebElement incomeHeadWord;

    @FindBy(xpath = "(//label[@for='exampleInputEmail1'])[2]")
    public WebElement incomeNameWord;

    @FindBy(xpath = "//label[text()='Invoice Number']")
    public WebElement invoiceNumberWord;

    @FindBy(xpath = "(//label[@for='exampleInputEmail1'])[4]")
    public WebElement incomeDateWord;

    @FindBy(xpath = "(//label[@for='exampleInputEmail1'])[5]")
    public WebElement incomeAmountWord;

    @FindBy(xpath = "//label[text()='Description']")
    public WebElement incomeDescriptionWord;

    @FindBy(xpath ="//*[@class='dropify-wrapper']")
    public WebElement uploadDocumentBox;

    @FindBy(xpath="//select[@name='inc_head_id']")
    public WebElement incomeHeadBox;

    @FindBy(xpath="//input[@id='name']")
    public WebElement incomeNameBox;

    @FindBy(xpath="//input[@name='invoice_no']")
    public WebElement invoiceNoBox;

    @FindBy(xpath="//input[@id=‘date']")
    public WebElement incomeDateBox;

    @FindBy(xpath="//input[@name='amount']")
    public WebElement amountBox;

    @FindBy(xpath="//button[@id='submitbtn']")
    public WebElement saveButton;

    @FindBy(xpath="//div[@class='alert alert-success text-left']")
    public WebElement successAlert;

    @FindBy(xpath="//h3[text()=' Income List']")
    public WebElement incomeListText;

    @FindBy(xpath="//th[@aria-label='Name: activate to sort column ascending']")
    public WebElement incomeListName;

    @FindBy(xpath="//th[@aria-label='Description: activate to sort column ascending']")
    public WebElement incomeListDescription;

    @FindBy(xpath="//th[@aria-label='Invoice Number: activate to sort column ascending']")
    public WebElement incomeListInvoiceNo;

    @FindBy(xpath="//th[@aria-label='Date: activate to sort column ascending']")
    public WebElement incomeListDate;

    @FindBy(xpath="//th[@aria-label='Income Head: activate to sort column ascending']")
    public WebElement incomeListIncomeHead;

    @FindBy(xpath="//th[@aria-label='Amount ($): activate to sort column ascending']")
    public WebElement incomeListAmount;


    @FindBy(xpath="//input[@type='search']")
    public WebElement incomeSearchBox;

    @FindBy(xpath="(//select[@name='DataTables_Table_0_length'])[1]")
    public WebElement incomeRecordNumber;




}
