package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SametPage extends Base  {
    @FindBy(xpath = "//div[@class='col-md-3 col-sm-5']")
    public WebElement pageLogo;

     // first latest news information
    @FindBy(xpath = "//a[@href=\"https://qa.wonderworldcollege.com/read/wonder-world-college-wins-national-stem-competition-for-innovative-robotics-design\"]")
    public WebElement latestNews1;

    // second-latest news information
    @FindBy(xpath = "//a[@href=\"https://qa.wonderworldcollege.com/read/wonder-world-college-launches-new-environmental-sustainability-program\"]")
    public WebElement latestNews2;

    // third-latest new information
    @FindBy(xpath = "//a[@href=\"https://qa.wonderworldcollege.com/read/students-from-wonder-world-college-honored-at-regional-art-exhibition\"]")
    public WebElement latestNews3;

    // fourt-latest news information
    @FindBy(xpath = "//a[@href=\"https://qa.wonderworldcollege.com/read/wonder-world-college-receives-accreditation-for-its-outstanding-business-program\"]")
    public WebElement latestNews4;

    @FindBy(xpath = "//li[@class=\"active \"]")
    public WebElement homeTitle;
    @FindBy(xpath = "//a[@href=\"../online_admission\"]")
    public WebElement onlineAdmissionTitle;
    @FindBy(xpath = "//a[@href=\"../examresult\"]")
    public WebElement examResult;
    @FindBy(xpath = "//a[@href=\"https://qa.wonderworldcollege.com/page/about-us\"]")
    public WebElement aboutUs;
    @FindBy(xpath = "//li[@class=\" dropdown\"]")
    public WebElement academics;
    @FindBy(xpath = "//a[@href=\"https://qa.wonderworldcollege.com/page/course\"]")
    public WebElement course;
    @FindBy(xpath = "//a[@href=\"https://qa.wonderworldcollege.com/page/gallery\"]")
    public WebElement gallery;
    @FindBy(xpath = "//a[@href=\"https://qa.wonderworldcollege.com/page/news\"]")
    public WebElement news;
    @FindBy(xpath = "//a[@href=\"https://qa.wonderworldcollege.com/page/contact-us\"]")
    public WebElement contact;
    @FindBy(xpath = "//a[@href=\"https://qa.wonderworldcollege.com/page/facilities\"]")
    public WebElement facilities;
    @FindBy(xpath = "//a[@href=\"https://qa.wonderworldcollege.com/page/school-uniform\"]")
    public WebElement schoolUniform;
    @FindBy(xpath = "//a[@href=\"https://qa.wonderworldcollege.com/page/principal-message\"]")
    public WebElement principalMessage;
    @FindBy(xpath = "//a[@href=\"https://qa.wonderworldcollege.com/page/know-us\"]")
    public WebElement knowUS;
    @FindBy(xpath = "//a[@href=\"https://qa.wonderworldcollege.com/page/approach\"]")
    public WebElement approach;
    @FindBy(xpath = "//a[@href=\"https://qa.wonderworldcollege.com/page/teacher\"]")
    public WebElement teacher;
    @FindBy(xpath = "//a[@href=\"https://qa.wonderworldcollege.com/page/houses-mentoring\"]")
    public WebElement housesMentoring;
    @FindBy(xpath = "//a[@href=\"https://qa.wonderworldcollege.com/page/student-council\"]")
    public WebElement studentCouncil;
}
