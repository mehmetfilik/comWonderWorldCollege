package stepdefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.checkerframework.checker.units.qual.K;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.CommonPage;
import pages.FerhatPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;
import java.util.ResourceBundle;


public class FerhatStepdefinition {

    FerhatPage ferhatPage = new FerhatPage();
    CommonPage commonPage = new CommonPage();
    Actions actions = new Actions(Driver.getDriver());

    //***************************13.1***************************
    @Then("The user navigates to the {string} page")
    public void theUserNavigatesToThePage(String loginurl) {
        Driver.getDriver().get(ConfigReader.getProperty(loginurl));
        ReusableMethods.bekle(2);
    }

    @Then("The user goes to the navbar section")
    public void the_user_goes_to_the_navbar_section() {
        Assert.assertTrue(ferhatPage.mailbutton.isDisplayed());
        System.out.println(ferhatPage.mailbutton.getText());
        ReusableMethods.bekle(2);
        Driver.closeDriver();


        //****************************13.2*******************************
    }

    @Then("The user goes to the footer section.")
    public void the_user_goes_to_the_footer_section() {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.END).perform();
        ReusableMethods.bekle(1);

    }

    @Then("Verify that there is a phone number in the footer section")
    public void verifyThatThereIsAPhoneNumberInTheFooterSection() {
        Assert.assertTrue(ferhatPage.phoneNumbers.isDisplayed());
        System.out.println(ferhatPage.phoneNumbers.getText());

    }

    @Then("Verify that there is an email in the footer section")
    public void verifyThatThereIsAnEmailInTheFooterSection() {
        Assert.assertTrue(ferhatPage.mailAddress.isDisplayed());
        System.out.println(ferhatPage.mailAddress.getText());

    }

    @Then("Verify that there is address information in the footer section")
    public void verifyThatThereIsAddressInformationInTheFooterSection() {
        Assert.assertTrue(ferhatPage.address.isDisplayed());
        System.out.println(ferhatPage.address.getText());
        ReusableMethods.bekle(2);
        Driver.closeDriver();


        //*****************************13.3**********************************
    }

    @Then("Confirmation that call us appears")
    public void confirmationThatCallUsAppears() {
        Assert.assertTrue(ferhatPage.callUs.isDisplayed());
        System.out.println(ferhatPage.callUs.getText());
        ReusableMethods.bekle(2);
        Driver.closeDriver();


        //*****************************21.1***********************************
    }

    @Then("Admin clicks login button")
    public void adminClicksLoginButton() {
        commonPage.adminLoginMethod("ferhat.dursun@admin.wonderworldcollege.com", "wonderworld123");
        ReusableMethods.bekle(2);

    }

    @Then("Student Information button is clicked")
    public void studentInformationButtonIsClicked() {
        ReusableMethods.switchToWindow("Wonder World College");
        System.out.println(Driver.getDriver().getTitle());
        ReusableMethods.bekle(2);
        ferhatPage.studentInformation.click();
        ReusableMethods.bekle(2);
    }

    @Then("Online Admission page link is displayed")
    public void onlineAdmissionPageLinkIsDisplayed() {
        String str = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(str.contains("onlinestudent"));
        ReusableMethods.bekle(2);
        Driver.closeDriver();


        //*****************************21.2***********************************
    }

    @Then("Click on the Online Admission page link")
    public void clickOnTheOnlineAdmissionPageLink() {
        ferhatPage.onlineAdmission.click();
        ReusableMethods.bekle(3);

    }

    @Then("User verifies that the titles under students list are displayed")
    public void userVerifiesThatTheTitlesUnderStudentsListAreDisplayed() {
        List<WebElement> list = Driver.getDriver().findElements(By.xpath("//th[@class='sorting']"));
        for (WebElement each : list) {
            Assert.assertTrue(each.isDisplayed());
            System.out.println(each.getText());
        }
    }

    @Then("Action header is validated")
    public void actionHeaderIsValidated() {
        ferhatPage.actionButon.isDisplayed();
        System.out.println(ferhatPage.actionButon.getText());
        Driver.closeDriver();


        //*****************************21.3**************************************
    }

    @Then("A new name Ali is entered in the search section")
    public void aNewNameAliIsEnteredInTheSearchSection() {
        ferhatPage.nameAli.sendKeys("Ali");
        ReusableMethods.bekle(3);
        Driver.closeDriver();


        //*******************************21.4***************************************
    }

    @Then("Verifies that Student List is visible")
    public void verifiesThatStudentListIsVisible() {
        Assert.assertTrue(ferhatPage.studentList.isDisplayed());

    }

    @Then("Student selection is made in the Search section")
    public void studentSelectionIsMadeInTheSearchSection() {
        ferhatPage.search.click();
        ReusableMethods.bekle(2);

    }

    @Then("Student name is written in the search section")
    public void studentNameIsWrittenInTheSearchSection() {
        ferhatPage.namePolat.sendKeys("Polat");
        ReusableMethods.bekle(2);

    }

    @Then("Search section is deleted")
    public void searchSectionIsDeleted() {
        ferhatPage.clear.clear();
        ReusableMethods.bekle(3);


    }

    @Then("A new name is entered in the search section")
    public void aNewNameIsEnteredInTheSearchSection() {
        ferhatPage.namePetra.sendKeys("Petra");
        ReusableMethods.bekle(3);
        Driver.closeDriver();


        //**************************21.5************************************
    }

    @Then("Search e Erol name is entered")
    public void searchEErolNameIsEntered() {
        ferhatPage.nameErol.sendKeys("Erol");
        ReusableMethods.bekle(2);

    }

    @Then("Erol name written in search will be deleted")
    public void erolNameWrittenInSearchWillBeDeleted() {
        ferhatPage.nameErolDlt.clear();
        ReusableMethods.bekle(2);

    }

    @Then("Sign name is entered in the search button")
    public void signNameIsEnteredInTheSearchButton() {
        ferhatPage.nameFurkan.sendKeys("Furkan");
        ReusableMethods.bekle(3);
        Driver.closeDriver();


        //***************************************21.6*******************************
    }

    @Then("Applications are deleted by clicking the delete icon under the action title")
    public void applicationsAreDeletedByClickingTheDeleteIconUnderTheActionTitle() {
        ferhatPage.FeesDeleteIkon.click();
        ReusableMethods.bekle(2);
        Driver.getDriver().switchTo().alert().accept();
        ReusableMethods.bekle(3);
        Driver.closeDriver();


        //**************************************21.7*********************************
    }

    @Then("Click the edit end enroll icon")
    public void clickTheEditEndEnrollIcon() {
        ferhatPage.editEndEnroll.click();
        ReusableMethods.bekle(2);
        Driver.getDriver().switchTo().alert().accept();
        ReusableMethods.bekle(2);

    }

    @Then("Verifies that it redirects to the Edit and Enroll page")
    public void verifiesThatItRedirectsToTheEditAndEnrollPage() {
        String str = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(str.contains("edit"));
        System.out.println(str);
        ReusableMethods.bekle(3);

    }

    @Then("The information filled in by the student in the Online Admission form is displayed")
    public void theInformationFilledInByTheStudentInTheOnlineAdmissionFormIsDisplayed() {
        actions.click(ferhatPage.admissionNo).sendKeys("123")
                .sendKeys(Keys.TAB)
                .sendKeys("3469")
                .sendKeys(Keys.TAB)
                .sendKeys("Class 9")
                .sendKeys(Keys.ENTER)
                .sendKeys(Keys.TAB)
                .sendKeys("D")
                .sendKeys(Keys.TAB)
                .sendKeys("Ferhat")
                .sendKeys(Keys.TAB)
                .sendKeys("Dursun")
                .sendKeys(Keys.TAB)
                .sendKeys("Male")
                .sendKeys(Keys.TAB)
                .sendKeys("05/06/2014")
                .sendKeys(Keys.ENTER)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.END)

                .perform();
        ReusableMethods.bekle(2);


        //*********************************21.8*********************************
    }

    @Then("Edit Online Admission is displayed")
    public void editOnlineAdmissionIsDisplayed() {
        Assert.assertTrue(ferhatPage.editOnlinaAdmis.isDisplayed());


    }

    @Then("Wage data text is displayed")
    public void wageDataTextIsDisplayed() {
        Assert.assertTrue(ferhatPage.feesDetails.isDisplayed());


    }

    @Then("Transport Details is displayed")
    public void transportDetailsIsDisplayed() {
        Assert.assertTrue(ferhatPage.transportDetails.isDisplayed());

    }

    @Then("Parent Guardian Detail text is displayed")
    public void parentGuardianDetailTextIsDisplayed() {
        Assert.assertTrue(ferhatPage.parentGuardianDetail.isDisplayed());
    }

    @Then("Address Details is displayed")
    public void addressDetailsIsDisplayed() {
        Assert.assertTrue(ferhatPage.addressDetails.isDisplayed());
    }

    @Then("Miscellaneous Details is displayed")
    public void miscellaneousDetailsIsDisplayed() {
        Assert.assertTrue(ferhatPage.miscellaneousDetails.isDisplayed());

    }

    @Then("Save button text is displayed")
    public void saveButtonTextIsDisplayed() {
        Assert.assertTrue(ferhatPage.saveButton.isDisplayed());
    }

    @Then("Save and Enroll button text is displayed")
    public void saveAndEnrollButtonTextIsDisplayed() {
        Assert.assertTrue(ferhatPage.saveAndEnroll.isDisplayed());
    }

    @Then("The payment amount is automatically displayed when entering the Fees Details information.")
    public void thePaymentAmountIsAutomaticallyDisplayedWhenEnteringTheFeesDetailsInformation() {
        List<WebElement> list = Driver.getDriver().findElements(By.xpath("//span[@class='font14']"));
        for (WebElement each : list) {
            Assert.assertTrue(each.isDisplayed());
            System.out.println(each.getText());
        }
        ReusableMethods.bekle(2);
        ferhatPage.feesDetailsinformation.click();
        ReusableMethods.bekle(2);
        actions.sendKeys(Keys.DOWN)
                .sendKeys(Keys.DOWN)
                .sendKeys(Keys.DOWN).perform();
        ReusableMethods.bekle(3);

    }

    @And("Save button is pressed")
    public void savebuttonIspressed() {
        ferhatPage.save.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }

    @And("Click the Save and Save and Enroll buttons")
    public void clickSaveandSaveandEnrollbuttons() {
        ferhatPage.saveAndSavEnrrol2.click();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Driver.quitDriver();

    }


    //*************************************27.1**************************************
    @Then("Clicks the fee collection button")
    public void clicksthefeecollectionbutton() {
        ferhatPage.FeesCollection.click();

    }

    @Then("Click the Fee type button")
    public void clicktheFeetypebutton() {
        ferhatPage.feesTypeButton.click();
        ReusableMethods.bekle(3);

    }

    @Then("Verified that it was redirected to the fare collection page")
    public void verifiedthatItwasRedirectedtothefarecollectionpage() {
        String str = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(str.contains("feetype"));
        ReusableMethods.bekle(3);
        Driver.closeDriver();


        //**********************************27.2*****************************
    }

    @Then("Name, Rate Code, Description text Boxes and Save button are validated")
    public void vameRateCodeDescriptiontextBoxesandSavebuttonarevalidated() {
        List<WebElement> list = Driver.getDriver().findElements(By.xpath("//div[@class='form-group']"));
        for (int i = 0; i < 3; i++) {
            ReusableMethods.bekle(2);
            Assert.assertTrue(list.get(i).isDisplayed());
            System.out.println(list.get(i).getText());
        }
    }

    @Then("In the Fees Type List window, the titles Name, Fees Code, Action are visible and verified.")
    public void InTheFeesTypeListWindowTheTitlesNameFeesCodeActionAreVisibleAndVerified() {
        List<WebElement> list = Driver.getDriver().findElements(By.xpath("//th[@class='sorting']"));
        for (int i = 0; i < 2; i++) {
            ReusableMethods.bekle(2);
            Assert.assertTrue(list.get(i).isDisplayed());
            System.out.println(list.get(i).getText());
        }
        Assert.assertTrue(ferhatPage.actionButton.isDisplayed());
        System.out.println(ferhatPage.actionButton.getText());
        Driver.closeDriver();


        //**********************************27.3**************************************
    }

    @Then("In the Add Fees Type window, data is entered in the Name, Fees Code and Description textBoxes.")
    public void InTheAddFeesTypeWindowDataIsEnteredInTheNameFeesCodeAndDescriptionTextBoxes() {
        ferhatPage.FeesName.sendKeys("Ferhat");
        ferhatPage.FeesCode.sendKeys("1234");
        ferhatPage.descireptions.sendKeys("Thankss!!!");

    }

    @And("Save click button")
    public void saveClickButton() {
        ferhatPage.saveButton.click();
        Driver.closeDriver();


        //**********************************27.4*****************************************
    }

    @And("Click the edit icon under Actions")
    public void clickTheEditIconUnderActions() {
        ferhatPage.feesEditIkon.click();
    }

    @And("The entered data is updated.")
    public void theEnteredDataIsUpdated() {
        ReusableMethods.bekle(2);
        ferhatPage.FeesName.clear();
        ferhatPage.FeesName.sendKeys("FERO");
        ReusableMethods.bekle(2);
        ferhatPage.FeesCode.clear();
        ferhatPage.FeesCode.sendKeys("98765");
        ReusableMethods.bekle(2);
        ferhatPage.descireptions.clear();
        ferhatPage.descireptions.sendKeys("SORRY");
        ReusableMethods.bekle(2);
        ferhatPage.saveButton.click();
        Driver.closeDriver();


        //************************************27.5**********************************
    }

    @And("Click the delete icon under actions")
    public void clickTheDeleteIconUnderActions() {
        ReusableMethods.bekle(2);
        ferhatPage.FeesDeleteIkon.click();
        ReusableMethods.bekle(3);

    }

    @And("Agree by clicking on the warning")
    public void agreeByClickingOnTheWarning() {
        Driver.getDriver().switchTo().alert().accept();
        Driver.closeDriver();


        //************************************44.1*******************************
    }

    @Then("Click the studend login buttonn")
    public void clickTheStudendLoginButtonn() {
        commonPage.parentOrStudentLoginMethod("std118", "wonderworld123");


    }

    @Then("User should be able to access Profile Image button")
    public void userShouldBeAbleToAccessProfileImageButton() {
        ferhatPage.profilButton.click();
        ReusableMethods.bekle(4);

    }

    @Then("User accesses change password button")
    public void userAccessesChangePasswordButton() {
        ferhatPage.changePasswordIcon.isEnabled();


    }

    @Then("User clicks change password button")
    public void userClicksChangePasswordButton() {
        ferhatPage.changePasswordIcon.click();
    }

    @Then("User enters new password with at least six characters")
    public void userEntersNewPasswordWithAtLeastSixCharacters() {
        ferhatPage.oldPassword.sendKeys("wonderworld");
        ferhatPage.newPasword.sendKeys("1234F.");
        ferhatPage.repeatPassword.sendKeys("1234F.");
        ReusableMethods.bekle(2);


    }
    @Then("User incorrectly enters new password with at least six characters")
    public void userincorrectlyentersnewpasswordwithatleastsixcharacters() {
        ferhatPage.oldPassword.sendKeys("wonderworld");
        ferhatPage.newPasword.sendKeys("123dF.");
        ferhatPage.repeatPassword.sendKeys("123dF.");
        ReusableMethods.bekle(2);

}
    @And("User receives message on incorrect password entries")
    public void userReceivesMessageOnIncorrectPasswordEntries(){
        ferhatPage.stdntSave.click();
        ReusableMethods.bekle(1);
        String str = ferhatPage.changePasswordTitle.getText();
        Assert.assertTrue(str.contains("changeUserName"));


    }


    @Then("User correctly enters new password with at least six characters")
    public void userCorrectlyEntersNewPasswordWithAtLeastSixCharacters() {
        ferhatPage.stdntSave2.click();
    }

    @And("User closes the browser")
    public void userClosesTheBrowser() {
        ReusableMethods.waitForPageToLoad(4);
        Driver.quitDriver();
    }
}



















