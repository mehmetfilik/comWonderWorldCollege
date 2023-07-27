package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SuatPage {
    public SuatPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
