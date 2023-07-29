package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SametPage extends Base  {

    @FindBy(xpath = "//div[@class='col-md-3 col-sm-5']")
    public WebElement pageLogo;

}
