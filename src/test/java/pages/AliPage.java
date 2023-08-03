package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AliPage extends Base {

    @FindBy(xpath = "//h2[.='OUR EXPERIENCED STAFFS']")
    public WebElement ourExperiencedStaffs;

    @FindBy(xpath = "(//h3[.='Anthony Carter'])[2]")
    public WebElement anthonyCarter;

    @FindBy(xpath = "(//h3[.='Ava Turner'])[2]")
    public WebElement avaTurner;

    @FindBy(xpath = "(//h3[.='David Morgan'])[2]")
    public WebElement davidMorgan;

    @FindBy(xpath = "(//h3[.='Lily Peterson'])[2]")
    public WebElement lilyPeterson;

    @FindBy(xpath = "//h2[.='WHAT PEOPLE SAYS']")
    public WebElement whatPeopleSays;

    @FindBy(xpath = "//div[@class='owl-carousel testimonial-carousel owl-loaded owl-drag']")
    public WebElement testimonial;

    @FindBy(xpath = "//*[@id=\"navbar-collapse-3\"]/ul/li[5]/a")
    public WebElement academicsDDM;

    @FindBy(xpath = "//a[.='Teacher']")
    public WebElement academicsDdmTeacher;

}
