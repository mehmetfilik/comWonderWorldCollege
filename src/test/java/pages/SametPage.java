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
    @FindBy(xpath = "//div[@class=\"col-md-12\"]")
    public WebElement admissionCriteria;

    @FindBy(xpath = "//select[@id=\"class_id\"]")
    public WebElement classBox;
    @FindBy(xpath = "//input[@id=\"firstname\"]")
    public WebElement firstNameBox;
    @FindBy(xpath = "//input[@id=\"lastname\"]")
    public WebElement lastNameBox;
    @FindBy(xpath = "//select[@name=\"gender\"]")
    public WebElement genderBox;
    @FindBy(xpath = "//input[@name=\"dob\"]")
    public WebElement dateOfBirthBox;
    @FindBy(xpath = "//input[@value=\"\" and @id=\"email\"]")
    public WebElement emailBox;
    @FindBy(xpath = "(//table/thead/tr[1]/th[2])[1]")
    public WebElement dateBox2023;
    @FindBy(xpath = "//body/div[6]/div[2]/table/thead/tr/th[2]")
    public WebElement datebox2023_2;
    @FindBy(xpath = "//body/div[6]/div[3]/table/thead/tr/th[1]")
    public WebElement prev;
    @FindBy(xpath = "//body/div[6]/div[3] /table/tbody/tr/td/span[7]")
    public WebElement year;
    @FindBy(xpath = "//body/div[6]/div[2]/table/tbody/tr/td/span[4]")
    public WebElement month;
    @FindBy(xpath = "//body/div[6]/div[1]/table/tbody/tr[2]/td[6]")
    public WebElement day;

    @FindBy(xpath = "//input[@id=\"father_name\"]")
    public WebElement fatherName;
    @FindBy(xpath = "//input[@id=\"mother_name\"]")
    public WebElement motherName;
    @FindBy(xpath = "//input[@id=\"guardian_name\"]")
    public WebElement guardName;
    @FindBy(xpath = "//input[@id=\"guardian_relation\"]")
    public WebElement guardRelation;
    @FindBy(xpath = "//input[@id=\"guardian_email\"]")
    public WebElement guardEmail;
    @FindBy(xpath = "//input[@name=\"guardian_is\"]")
    public WebElement fatherButton;
    @FindBy(xpath = "//input[@value=\"mother\"]")
    public WebElement motherButton;
    @FindBy(xpath = "//input[@value=\"other\"]")
    public WebElement otherButton;
    @FindBy(xpath = "//input[@id=\"adhar_no\"]")
    public WebElement nationalNumber;
    @FindBy(xpath = "//textarea[@name='previous_school' and @class='form-control']")
    public WebElement schoolDetails;
    @FindBy(xpath = "//body/div[5]/div/div/form/div[7]/div/div/button")
    public WebElement submitButton;
    @FindBy(xpath = "//div[@class=\"col-md-4 col-lg-4 col-sm-12\"]")
    public WebElement detailsAndStatus;
    @FindBy(xpath = "//body/div[5]/div/div/div[4]/div[3]/div/ul/li[1]")
    public WebElement referanceNo;
    @FindBy(xpath = "//body/div[5]/div/div/div[4]/div[3]/div/ul/li[2]")
    public WebElement formStatus;
    @FindBy(xpath = "//body/div[5]/div/div/div[4]/div[3]/div/ul/li[3]")
    public WebElement applicationDate;
    @FindBy(xpath = "//input[@id=\"checkterm\"]")
    public WebElement AgreeButton;
    @FindBy(xpath = "//button[@class=\"btn btn-danger\"]")
    public WebElement submit2;
    @FindBy(xpath = "//div[@class=\"alert alert-success\"]")
    public WebElement Successfully;
    @FindBy(xpath = "//span[@class=\"text-success\"]")
    public WebElement submittedMessage;

    @FindBy(xpath = "//body/div[5]/div/div/div[1]/div/div[1]/div/div[2]/h4")
    public WebElement engAndLit;
    @FindBy(xpath = "//body/div[5]/div/div/div[1]/div/div[2]/div/div/h4")
    public WebElement Mathematics;
    @FindBy(xpath = "//body/div[5]/div/div/div[1]/div/div[3]/div/div/h4")
    public WebElement Sciences;
    @FindBy(xpath = "//body/div[5]/div/div/div[1]/div/div[4]/div/div/h4")
    public WebElement SocialSciences;
    @FindBy(xpath = "//body/div[5]/div/div/div[1]/div/div[5]/div/div/h4")
    public WebElement History;
    @FindBy(xpath = "//body/div[5]/div/div/div[1]/div/div[6]/div/div/h4")
    public WebElement ArtsAndMusic;
    @FindBy(xpath = "//body/div[5]/div/div/div[1]/div/div[7]/div/div/h4")
    public WebElement HealtAndExercise;
    @FindBy(xpath = "//body/div[5]/div/div/div[1]/div/div[8]/div/div/h4")
    public WebElement Language;
    @FindBy(xpath = "//body/div[5]/div/div/div[1]/div/div[9]/div/div/h4")
    public WebElement ComputerScience;
    @FindBy(xpath = "//a[@href=\"../page/english-and-literature\"]")
    public WebElement EngAndLitDetails;
    @FindBy(xpath = "//a[@href=\"../page/mathematics\"]")
    public WebElement MathDetails;
    @FindBy(xpath = "//a[@href=\"../page/sciences\"]")
    public WebElement ScienceDetails;
    @FindBy(xpath = "//a[@href=\"../page/social-sciences\"]")
    public WebElement SocScienceDetails;
    @FindBy(xpath = "//a[@href=\"../page/history\"]")
    public WebElement HistoryDetails;
    @FindBy(xpath = "//a[@href=\"../page/arts-and-music\"]")
    public WebElement ArtsAndMusicDetails;
    @FindBy(xpath = "//a[@href=\"../page/health-and-exercise-sciences\"]")
    public WebElement HaExScienceDetails;
    @FindBy(xpath = "//a[@href=\"../page/foreign-language\"]")
    public WebElement ForeinLangDetails;
    @FindBy(xpath = "//a[@href=\"../page/computer-science\"]")
    public WebElement CompScienceDetails;


}
