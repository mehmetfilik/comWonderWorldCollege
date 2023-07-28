package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class OmerPage extends Base {




    @FindBy(xpath ="//a[text()='Teacher Login ']")
    private WebElement teacherLoginButton;

    @FindBy(className ="form-group has-feedback")
    private WebElement teacherLoginUsernameBox;

    @FindBy(xpath ="//*[@class='form-group has-feedback'][2]")
    private WebElement teacherLoginPasswordBox;

    @FindBy(id ="//*[@class='btn']")
    private WebElement teacherLoginSinginButton;



    // -----------------------------------------------------------------------------


    public void teacherAdminSignIn(){
        teacherLoginButton.click();
        teacherLoginUsernameBox.sendKeys("omer.faruk.unal@teacher.wonderworldcollege.com");
        teacherLoginPasswordBox.sendKeys("wonderworld123");
        teacherLoginSinginButton.click();
    }

}
