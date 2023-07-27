package pages;

import utilities.ConfigReader;
import utilities.Driver;

public class FilikPage extends Base {







    public void navigateToHomepage(){
        Driver.getDriver().get(ConfigReader.getProperty("userLoginUrl"));
    }

}
