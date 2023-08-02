package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class MustafaPage extends Base {

    Select select;

    //*****************************[US_029]***********************************//


    // Admin Panel-> Front Office tab
    @FindBy(xpath = "//span[text()='Front Office']")
    public WebElement frontOfficeTab;

    // Admin Panel -> Front Office -> ComplainTab
    @FindBy(xpath = "//*[@id=\"sibe-box\"]/ul[2]/li[1]/ul/li[6]/a")
    public WebElement complainTab;

    //Front Office ->ComplainTab-> ComplainType
    @FindBy(xpath = "(//label[@for='exampleInputEmail1'])[1]")
    private WebElement complaintTypeElement;

    // Front Office -> ComplainTab -> source
    @FindBy(xpath = "(//label[@for='pwd'])[1]")
    private WebElement sourceElement;

    //Front Office -> ComplainTab -> phone
    @FindBy(xpath = "//label[@for='email']")
    private WebElement phoneElement;

    //Front Office -> ComplainTab -> date
    @FindBy(xpath = "(//label[@for='pwd'])[3]")
    private WebElement dateElement;

    //Front Office -> ComplainTab -> ComplainBy
    @FindBy(xpath = "(//label[@for='pwd'])[2]")
    private WebElement complainByElement;

    //Front Office -> ComplainTab -> Description
    @FindBy(xpath = "(//label[@for='pwd'])[4]")
    private WebElement descriptionElement;

    //Front Office -> ComplainTab -> ActionTaken
    @FindBy(xpath = "(//label[@for='pwd'])[5]")
    private WebElement actionTakenElement;

    //Front Office -> ComplainTab -> Assigned
    @FindBy(xpath = "(//label[@for='pwd'])[6]")
    private WebElement assignedElement;


    //Front Office -> ComplainTab -> Note
    @FindBy(xpath = "(//label[@for='pwd'])[7]")
    private WebElement noteElement;

    //Front Office -> ComplainTab -> DrogAndDrop
    @FindBy(xpath = "//div[@class='dropify-wrapper']")
    public WebElement drogAndDropElementi;

    //Front Office -> ComplainTab -> SaveButton
    @FindBy(id = "submitbtn")
    public WebElement saveButton;

    //Front Office -> ComplainTab -> complainTypeBox
    @FindBy(xpath = "//select[@name='complaint']")
    private WebElement complainTypeBox;

    //Front Office -> ComplainTab -> sourceBox
    @FindBy(xpath = "//select[@name='source']")
    private WebElement sourceBox;

    //Front Office -> ComplainTab -> complainByBox
    @FindBy(xpath = "(//input[@class='form-control'])[1]")
    public WebElement complainByBox;

    //Front Office -> ComplainTab -> phoneBox
    @FindBy(xpath = "(//input[@class='form-control'])[2]")
    private WebElement phoneBox;

    //Front Office -> ComplainTab -> dateBox
    @FindBy(xpath = "//input[@name='date']")
    private WebElement dateBox;

    //Front Office -> ComplainTab -> dateBox -> activeDayElement
    @FindBy(xpath = "//td[@class='active day']")
    private WebElement activeDayElement;


    //Front Office -> ComplainTab -> descriptionBox

    @FindBy(id = "description")
    private WebElement descriptionBox;

    //Front Office -> ComplainTab -> complainTitle;
    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/thead/tr/th[1]")
    private WebElement compleinTitle;


    //Front Office -> ComplainTab -> complainTypeTitle

    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/thead/tr/th[2]")
    private WebElement compleinTypeTitle;

    //Front Office -> ComplainTab -> nameTitle

    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/thead/tr/th[3]")
    private WebElement nameTitle;

    //Front Office -> ComplainTab -> phoneTitle

    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/thead/tr/th[4]")
    private WebElement phoneTitle;

    //Front Office -> ComplainTab -> dateTitle

    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/thead/tr/th[5]")
    private WebElement dateTitle;

    //Front Office -> ComplainTab -> actionTitle

    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/thead/tr/th[6]")
    private WebElement actionTitle;


    @FindBy(xpath = "//div[@class='alert alert-success']")
    private WebElement recordSavedSuccessfullyTextElemet;


    //Front Office -> ComplainTab ->Action-> viewButton
    @FindBy(xpath = "//a[@data-target='#complaintdetails']")
    private WebElement viewButton;

    //Front Office -> ComplainTab -> viewButton-> detailsTextElement
    @FindBy(xpath = "//*[@id=\'complaintdetails\']/div/div/div[1]/h4")
    public WebElement detailsTextElement;

    @FindBy(xpath = "(//a[@data-original-title='Edit'])[1]")
    public WebElement editButton;

    @FindBy(xpath = "(//button[@type='submit'])[3]")
    public WebElement saveButton2;

    //Front Office -> ComplainTab ->Action-> deleteButton
    @FindBy(xpath = "(//a[@data-original-title='Delete'])[1]")
    public WebElement deleteButton;


    //******************************METHODS***************************************//


    public void viewButtonclick() {

        viewButton.click();
    }


    public void detailsTextElementAssert() {
        Assert.assertTrue(detailsTextElement.isEnabled());
    }

    public void grievanceRecordTestMethod() {
        String expectedText = "Record Saved Successfully";
        String actualText = recordSavedSuccessfullyTextElemet.getText();
        Assert.assertEquals(expectedText, actualText);
    }

    public void grievanceUpdateTestMethod() {
        String expectedText = "Record Updated Successfully";
        String actualText = recordSavedSuccessfullyTextElemet.getText();
        Assert.assertEquals(expectedText, actualText);
    }

    public void grievanceDeleteTestMethod() {
        String expectedText = "Record Delete Successfully";
        String actualText = recordSavedSuccessfullyTextElemet.getText();
        Assert.assertEquals(expectedText, actualText);
    }

    public void alertaccept() {
        Driver.getDriver().switchTo().alert().accept();
    }


    public void complainCreationMethod() {
        select = new Select(complainTypeBox);
        select.selectByVisibleText("Teacher ");
        select = new Select(sourceBox);
        select.selectByVisibleText("Online Front Site");
        complainByBox.sendKeys("Mustafa Özsamur");
        phoneBox.sendKeys("+90564789876");
        descriptionBox.sendKeys("the teacher's lecture is bad and he does not know the subjects");
        saveButton.click();
    }


    public void elementsDisplayedMethod() {
        Assert.assertTrue(complaintTypeElement.isDisplayed());
        Assert.assertTrue(complainByElement.isDisplayed());
        Assert.assertTrue(noteElement.isDisplayed());
        Assert.assertTrue(assignedElement.isDisplayed());
        Assert.assertTrue(actionTakenElement.isDisplayed());
        Assert.assertTrue(descriptionElement.isDisplayed());
        Assert.assertTrue(dateElement.isDisplayed());
        Assert.assertTrue(phoneElement.isDisplayed());
        Assert.assertTrue(sourceElement.isDisplayed());
        Assert.assertTrue(saveButton.isDisplayed());
    }


    public void complainHeaderElementTestMethod() {
        Assert.assertTrue(compleinTitle.isDisplayed());
        Assert.assertTrue(compleinTypeTitle.isDisplayed());
        Assert.assertTrue(nameTitle.isDisplayed());
        Assert.assertTrue(phoneTitle.isDisplayed());
        Assert.assertTrue(dateTitle.isDisplayed());
        Assert.assertTrue(actionTitle.isDisplayed());
    }

//************************************************US_043************************************//

    // Homepage -> Login Button
    @FindBy(xpath = "//a[@class='complainbtn']")
    public WebElement loginButton;

    // Student-Parent LoginPage -> Email Box
    @FindBy(id = "email")
    private WebElement emailBox;

    // Student-Parent LoginPage -> Password Box
    @FindBy(id = "password")
    private WebElement passwordBox;

    // LoginPage -> Submit Button
    @FindBy(xpath = "//button[@class='btn']")
    private WebElement submitButton;

    @FindBy(xpath = "//div[@class='alert alert-danger']")
    private WebElement deleteSuccessfullyTextElemet;

    // loginPage ForgotPasswordButton
    @FindBy(xpath = "//a[@class='forgot']")
    public WebElement forgotPasswordButton;

    //ForgotPasswordPage emailBox;
    @FindBy(id = "form-username")
    public WebElement forgotEmailBox;

    ////ForgotPasswordPage studentRadioButton
    @FindBy(xpath = "//input[@value='student']")
    public WebElement studentRadioButton;


    //ForgotPasswordPage submitButton;
    @FindBy(xpath = "//button[@class='btn']")
    public WebElement forgotPasswordSubmitButton;

    @FindBy(xpath = "//div[@class='alert alert-danger']")
    private WebElement errorMesageTextElemet;

    public void passwordChangeAssertMethod(){


      if (errorMesageTextElemet.isDisplayed()){
          Assert.assertTrue(false);
      }else {
          Assert.assertTrue(true);
      }
    }

    public void negativeStudentLoginAssert() {

        String actualText = deleteSuccessfullyTextElemet.getText();
        String expectedText = "Invalid Username Or Password";
        Assert.assertEquals(expectedText, actualText);
        System.out.println(deleteSuccessfullyTextElemet.getText());
    }

    //***********************************US_045*****************************************//

    @FindBy(xpath = "//i[@class='fa fa-key']")
    public WebElement changePasswordButton;

    @FindBy(xpath = "//img[@alt='User Image']")
    public WebElement profileImgElement;

    @FindBy(xpath = "//a[normalize-space()='Change Username']")
    public WebElement changeUsername;

    @FindBy(xpath = "//input[@name='current_username']")
    public WebElement currentUsernameBox;

    @FindBy(xpath = "//input[@name='new_username']")
    public WebElement newUsernameBox;
    @FindBy(xpath = "//input[@name='confirm_username']")
    public WebElement confirmUsernameBox;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement saveButton3;


    public void usernameChangeTestMethod() {
        if (currentUsernameBox.isDisplayed()) {
            Assert.assertTrue(false);
        } else {
            Assert.assertTrue(true);
        }
    }

//*****************************US_047***********************************//

    //StudentPage-> HomeworkTab
    @FindBy(xpath = "(//a[@href='https://qa.wonderworldcollege.com/user/homework'])[1]")
    public WebElement homeworkTab;

    //HomeworkTab ->Upcoming Homework->ClassField
    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/thead/tr/th[1]")
    private WebElement classField;

    //HomeworkTab ->Upcoming Homework->SectionField
    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/thead/tr/th[2]")
    private WebElement sectionField;

    //HomeworkTab ->Upcoming Homework->SubjectField
    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/thead/tr/th[3]")
    private WebElement subjectField;

    //HomeworkTab ->Upcoming Homework->HomeworkDate
    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/thead/tr/th[4]")
    private WebElement homeworkDateField;

    //HomeworkTab ->Upcoming Homework->submissionDate
    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/thead/tr/th[5]")
    private WebElement submissionDateField;

    //HomeworkTab ->Upcoming Homework->EvaluationDate
    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/thead/tr/th[6]")
    private WebElement evaluationDateField;

    //HomeworkTab ->Upcoming Homework->MaxMarks
    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/thead/tr/th[7]")
    private WebElement maxMamrksField;

    //HomeworkTab ->Upcoming Homework->MarksObtained
    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/thead/tr/th[8]")
    private WebElement marksObtainedField;

    //HomeworkTab ->Upcoming Homework->Note
    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/thead/tr/th[9]")
    private WebElement noteField;

    //HomeworkTab ->Upcoming Homework->Status
    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/thead/tr/th[10]")
    private WebElement statusField;

    //HomeworkTab ->Upcoming Homework->Action
    @FindBy(xpath = "//*[@id=\"DataTables_Table_0\"]/thead/tr/th[11]")
    private WebElement actionField;



    @FindBy(xpath = "//textarea[@name='message']")
    private WebElement homeworkDetailsPage;

    @FindBy(xpath = "(//span[@data-toggle='tooltip'])[1]")
    public WebElement hamburgerMenuUnderAction;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    private WebElement saveButton4;

    //HomeworkTab-> Daily Assignment
    @FindBy(xpath = "//div[@class='box-tools pull-right']")
    private WebElement   dailyAssignmentButton;

    //HomeworkTab-> +Daily Assignment
    @FindBy(xpath = "//div[@class='box-tools pull-right']")
    private WebElement newDailyAssignmentButton;

    //HomeworkTab-> +Daily Assignment->subjectDropDown
    @FindBy(id = "subject")
    private WebElement subjectDropDownElement;

    //HomeworkTab-> +Daily Assignment->titleBox;
    @FindBy(xpath = "//input[@name='title']")
    private WebElement titleBox;

    //HomeworkTab-> +Daily Assignment->descriptionBox
    @FindBy(id = "description")
    private WebElement descriptionBox2;

    //HomeworkTab-> +Daily Assignment->saveButton;
    @FindBy(xpath = "(//button[@type='submit'])[1]")
    private WebElement saveButton5;

    //Daily Assignment List -> Subject
    @FindBy(xpath = "//*[@id=\'DataTables_Table_0\']/tbody/tr[1]/td[1]")
    private WebElement subjectElement;




    @FindBy(xpath = "//a[@data-original-title='Edit']")
    private WebElement editButton2;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    private WebElement saveButton6;

    @FindBy(xpath = "(//select[@class='form-control'])[2]")
    private WebElement subjectDropDown2;





    public void fieldAssertMethod(){
        Assert.assertTrue(classField.isDisplayed());
        Assert.assertTrue(sectionField.isDisplayed());
        Assert.assertTrue(subjectField.isDisplayed());
        Assert.assertTrue(homeworkDateField.isDisplayed());
        Assert.assertTrue(submissionDateField.isDisplayed());
        Assert.assertTrue(actionField.isDisplayed());
        Assert.assertTrue(noteField.isDisplayed());
        Assert.assertTrue(statusField.isDisplayed());
        Assert.assertTrue(marksObtainedField.isDisplayed());
        Assert.assertTrue(maxMamrksField.isDisplayed());
        Assert.assertTrue(evaluationDateField.isDisplayed());

    }

    public void homeworkDetailsPage(){
        hamburgerMenuUnderAction.click();
        Assert.assertTrue(homeworkDetailsPage.isDisplayed());
        homeworkDetailsPage.sendKeys("Let's finish the homework on time.");
        saveButton4.click();
    }

    public void newdailyAssignment(){
        dailyAssignmentButton.click();
        newDailyAssignmentButton.click();
        select =new Select(subjectDropDownElement);
        select.selectByVisibleText("Mathematics (110) ");

        titleBox.sendKeys("Integral");
        descriptionBox2.sendKeys("Please finish the integral homework in 2 days");
        saveButton5.click();
        Assert.assertTrue(subjectElement.isDisplayed());
    }

    public void updateNewdailyAssignment(){
        ReusableMethods.bekle(3);
        editButton2.click();
        select =new Select(subjectDropDown2);
        select.selectByVisibleText("Computer (220)");
        ReusableMethods.bekle(2);
        saveButton6.click();

    }


//************************************US_056****************************************//
    //Parent--> MyProfile
    @FindBy(xpath = "//*[@id=\"sibe-box\"]/li[2]/a/span")
    public WebElement myProfileTab;

    //Parent--> My Profile--> class
    @FindBy(xpath = "//li[@class='list-group-item border0']")
    private WebElement classElement;

    //Parent--> My Profile--> section
    @FindBy(xpath = "(//li[@class='list-group-item'])[1]")
    private WebElement sectionElement;

    //Parent--> My Profile--> gender
    @FindBy(xpath = "(//li[@class='list-group-item'])[2]")
    private WebElement genderElement;

    //Parent--> My Profile--> barcode
    @FindBy(xpath = "//li[@class='list-group-item listnoback']")
    private WebElement barcodeElement;


    public void parentMyProfileElementsVisiable(){

        Assert.assertTrue(classElement.isDisplayed());
        Assert.assertTrue(sectionElement.isDisplayed());
        Assert.assertTrue(genderElement.isDisplayed());
        Assert.assertTrue(barcodeElement.isDisplayed());
    }

    //Profile
    //Fees
    //Exam
    //Documents

    //Parent--> My Profile--> profile
    @FindBy(xpath = "(//a[@data-toggle='tab'])[1]")
    public WebElement profileElement;

    //Parent--> My Profile--> Fees
    @FindBy(xpath = "(//a[@data-toggle='tab'])[2]")
    private WebElement feesElement;

    //Parent--> My Profile--> Exam
    @FindBy(xpath = "(//a[@data-toggle='tab'])[3]")
    private WebElement examElement;


    //Parent--> My Profile--> Documents
    @FindBy(xpath = "(//a[@data-toggle='tab'])[4]")
    private WebElement documentsElement;

    @FindBy(xpath = "(//h3[@class='pagetitleh2'])[1]")
    private WebElement addressDetails;

    @FindBy(xpath = "(//h3[@class='pagetitleh2'])[2]")
    private WebElement parentGuardianDetail;

    @FindBy(xpath = "(//h3[@class='pagetitleh2'])[3]")
    private WebElement hostelDetails;

    @FindBy(xpath = "(//h3[@class='pagetitleh2'])[4]")
    private WebElement miscellaneousDetails;




    public void parentMyProfileElementsVisiable2(){

        Assert.assertTrue(profileElement.isDisplayed());
        Assert.assertTrue(feesElement.isDisplayed());
        Assert.assertTrue(examElement.isDisplayed());
        Assert.assertTrue(documentsElement.isDisplayed());
    }


    public void profileElementsAssertMethod(){

        Assert.assertTrue(addressDetails.isDisplayed());
        Assert.assertTrue(parentGuardianDetail.isDisplayed());
        Assert.assertTrue(hostelDetails.isDisplayed());
        Assert.assertTrue(miscellaneousDetails.isDisplayed());
    }








}
