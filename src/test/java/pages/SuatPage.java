package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SuatPage extends Base{
    public SuatPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
