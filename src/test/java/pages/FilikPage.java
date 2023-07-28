package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ConfigReader;
import utilities.Driver;

public class FilikPage extends Base {







    public void navigateToHomepage(){
        Driver.getDriver().get(ConfigReader.getProperty("userLoginUrl"));
    }

}
