package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.CommonPage;
import pages.FilikPage;
import utilities.ConfigReader;
import pages.TahaPage;

public class TahaStepdefinitons {

    TahaPage tahaPage = new TahaPage();
    CommonPage commonPage = new CommonPage();


    @Given("After log in as a teacher search for Exam Group button under the Examination menu")
    public void afterLogInAsATeacherSearchForExamGroupButtonUnderTheExaminationMenu() {
        TahaPage.examinationButton.isDisplayed();
        TahaPage.examinationButton.click();
        TahaPage.examGroupButton.isDisplayed();
    }

    @And("Click on the Exam Group button")
    public void clickOnTheExamGroupButton() {
        TahaPage.examGroupButton.click();
    }


    @Then("Checks for the correct page result")
    public void checksForTheCorrectPageResult() {
        TahaPage.examGroupPage.isDisplayed();
    }

    @Then("On the Exam Group page check for the Add Exam Group section")
    public void onTheExamGroupPageCheckForTheAddExamGroupSection() {
        TahaPage.addExamGroupSection.isDisplayed();
    }

    @And("Check Exam Type dropdown menu visiblity")
    public void checkExamTypeDropdownMenuVisiblity() {
        TahaPage.addEGSExamTypeBox.isDisplayed();
    }

    @Then("Checks for Save button")
    public void checksForSaveButton() {
        TahaPage.addEGSSaveButton.isDisplayed();
        TahaPage.addEGSSaveButton.isEnabled();
    }

    @Then("Fill the section")
    public void fillTheSection() {
        TahaPage.addEGSNameBox.sendKeys("PT Math2");
        TahaPage.addEGSExamTypeBox.click();
        TahaPage.addEGSExamTypeBox.sendKeys(Keys.ARROW_DOWN);
        TahaPage.addEGSExamTypeBox.sendKeys(Keys.ENTER);
        TahaPage.addEGSDesriptionBox.sendKeys("Team2 Math2");
        TahaPage.addEGSSaveButton.click();
    }

    @And("Look for success text box")
    public void lookForSuccessTextBox() {
        TahaPage.addEGSSuccessBox.isDisplayed();
    }

    @Then("Look for Exam Group List")
    public void lookForExamGroupList() {
        TahaPage.examGroupList.isDisplayed();
    }

    @And("Click + icon")
    public void clickIcon() {
        TahaPage.plusButton.click();
        TahaPage.examPage.isDisplayed();
    }

    @Then("Click pencil icon")
    public void clickPencilIcon() {
        TahaPage.editButton.click();
    }

    @Then("Click cross icon for delete exam")
    public void clickCrossIconForDeleteExam() {
        TahaPage.deleteButton.click();
        TahaPage.deleteButton.isDisplayed();
    }
}
