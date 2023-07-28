package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MustafaPage extends Base {

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

    public void elementsDisplayedMethod(){
        Assert.assertTrue(complaintTypeElement.isDisplayed());
        Assert.assertTrue(complainByElement.isDisplayed());
        Assert.assertTrue(noteElement.isDisplayed());
        Assert.assertTrue(assignedElement.isDisplayed());
        Assert.assertTrue(actionTakenElement.isDisplayed());
        Assert.assertTrue(descriptionElement.isDisplayed());
        Assert.assertTrue(dateElement.isDisplayed());
        Assert.assertTrue(phoneElement.isDisplayed());
        Assert.assertTrue(sourceElement.isDisplayed());
    }





}
