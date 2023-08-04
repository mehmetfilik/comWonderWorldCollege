package pages;

import org.checkerframework.checker.signature.qual.FieldDescriptor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TahaPage extends Base{




    //"Exam Group" button under the "Examination" menu in teacher's panel sidebar
    @FindBy(xpath = "//*[@id=\"sibe-box\"]/ul[2]/li[2]/ul/li[1]/a")
    public static WebElement examGroupButton;

    //"Exam Group" page
    @FindBy(xpath = "//section[@class='content']")
    public static WebElement examGroupPage;

    @FindBy(xpath = "//*[@id=\"sibe-box\"]/ul[2]/li[2]")
    public static WebElement examinationButton;


    @FindBy(xpath = "/html/body/div[1]/div[1]/section/div/div[1]/div/div")
    public static WebElement addExamGroupSection;

    @FindBy(xpath = "//input[@id='name']")
    public static WebElement addEGSNameBox;

    @FindBy(xpath = "//select[@id='name']")
    public static WebElement addEGSExamTypeBox;

    @FindBy(xpath = "//textarea[@id='description']")
    public static WebElement addEGSDesriptionBox;

    @FindBy(xpath = "/html/body/div[1]/div[1]/section/div/div[1]/div/form/div[2]/button")
    public static WebElement addEGSSaveButton;

    @FindBy(xpath = "/html/body/div[1]/div[1]/section/div/div[1]/div/form/div[1]/div[1]")
    public static WebElement addEGSSuccessBox;

    @FindBy(xpath = "/html/body/div[1]/div[1]/section/div/div[2]/div/div[2]")
    public static WebElement examGroupList;

    @FindBy(xpath = "/html/body/div[1]/div[1]/section/div/div[2]/div/div[2]/div/div[2]/table/tbody/tr[1]/td[4]/a[1]/i")
    public static WebElement plusButton;

    @FindBy(xpath = "/html/body/div[1]/div[1]/section/div/div[2]/div/div[2]/div/div[2]/table/tbody/tr[1]/td[4]/a[2]/i")
    public static WebElement editButton;

    @FindBy(xpath = "/html/body/div[1]/div[1]/section/div/div[2]/div/div[2]/div/div[2]/table/tbody/tr[70]/td[4]/a[3]/i")
    public static WebElement deleteButton;

    @FindBy(xpath = "/html/body/div[1]/div[1]/section")
    public static WebElement examPage;

}
