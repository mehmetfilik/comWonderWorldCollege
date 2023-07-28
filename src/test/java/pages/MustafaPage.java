package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MustafaPage extends Base {

    // Admin Panel-> Front Office tab
@FindBy(xpath = "//i[@class='fa fa-ioxhost ftlayer']")
public WebElement frontOfficeTab;


}
