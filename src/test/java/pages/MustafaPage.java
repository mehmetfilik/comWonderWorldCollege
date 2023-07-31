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

    public void grievanceUpdateTestMethod(){
        String expectedText = "Record Updated Successfully";
        String actualText = recordSavedSuccessfullyTextElemet.getText();
        Assert.assertEquals(expectedText, actualText);
    }

    public void grievanceDeleteTestMethod(){
        String expectedText = "Record Delete Successfully";
        String actualText = recordSavedSuccessfullyTextElemet.getText();
        Assert.assertEquals(expectedText, actualText);
    }

    public void alertaccept(){
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
    private WebElement loginButton;

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


    public void negativeStudentLoginAssert(){

        String actualText=deleteSuccessfullyTextElemet.getText();
        String expectedText="Invalid Username Or Password";
        Assert.assertEquals(expectedText,actualText);
        System.out.println(deleteSuccessfullyTextElemet.getText());
    }

    //***********************************US_045*****************************************//

    @FindBy(xpath = "//i[@class='fa fa-key']")
    public WebElement  changePasswordButton;

    @FindBy(xpath = "//img[@alt='User Image']")
    public WebElement profileImgElement;

    @FindBy(xpath = "//a[normalize-space()='Change Username']")
    public  WebElement changeUsername;

    @FindBy(xpath = "//input[@name='current_username']")
    public WebElement currentUsernameBox;

    @FindBy(xpath = "//input[@name='new_username']")
    public WebElement newUsernameBox;
    @FindBy(xpath = "//input[@name='confirm_username']")
    public WebElement confirmUsernameBox;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement saveButton3;


    public void usernameChangeTestMethod(){
        if (currentUsernameBox.isDisplayed()){
            Assert.assertTrue(false);
        }else {
            Assert.assertTrue(true);
        }
    }




}
