package stepdefinitions;

import com.beust.ah.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import pages.SametPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class SametStepdefinitons {

    SametPage sametPage = new SametPage();


    @Given("The user goes to the WonderWorldCollege homepage.")
    public void the_user_goes_to_the_wonder_world_college_homepage() {

        Driver.getDriver().get(ConfigReader.getProperty("wonderUrl"));
    }

    @Then("The user tests if the homepage is visible.")
    public void the_user_tests_if_the_homepage_is_visible() {

        if (sametPage.pageLogo.isDisplayed()) {
            System.out.println("The visibility of the homepage has been confirmed");
        } else {
            System.out.println("The homepage is not visible");
        }

    }

    @Then("The user closes the page")
    public void the_user_closes_the_page() {

        Driver.closeDriver();
    }

    @Then("Testing the first latest news information\"")
    public void testing_the_first_latest_news_information() {

        Assert.assertTrue(sametPage.latestNews1.isDisplayed());

    }

    @And("waits for {int} seconds.")
    public void waitsForSeconds(int waitTime) {

        try {
            Thread.sleep(waitTime * 1000);
        } catch (InterruptedException e) {
        }
    }

    @Then("Testing the second latest news information")
    public void testingTheSecondLatestNewsInformation() {

        Assert.assertTrue(sametPage.latestNews2.isDisplayed());
    }

    @And("waiting for {int} seconds")
    public void waitingForSeconds(int waitTime) {
        try {
            Thread.sleep(waitTime * 1000);
        } catch (InterruptedException e) {
        }
    }

    @Then("Testing the third latest news information")
    public void testingTheThirdLatestNewsInformation() {
        Assert.assertTrue(sametPage.latestNews3.isDisplayed());
    }


    @And("wait for {int} seconds")
    public void waitForSeconds(int waitTime) {
        try {
            Thread.sleep(waitTime * 1000);
        } catch (InterruptedException e) {
        }
    }


    @Then("Testing the fourth latest new information")
    public void testingTheFourthLatestNewInformation() {
        Assert.assertTrue(sametPage.latestNews4.isDisplayed());
    }

    @Then("The visibility of the site logo is tested")
    public void theVisibilityOfTheSiteLogoIsTested() {
        Assert.assertTrue(sametPage.pageLogo.isDisplayed());
    }

    @Then("When the site logo is clicked, the page is refreshed")
    public void whenTheSiteLogoIsClickedThePageIsRefreshed() {
        sametPage.pageLogo.click();
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.wonderworldcollege.com";

        if (actualUrl.contains(expectedUrl)) {
            System.out.println("The homepage has been refreshed");
        } else {
            System.out.println("The homepage was not refreshed");
        }
    }


    @Then("the Home menu title should be visible")
    public void theHomeMenuTitleShouldBeVisible() {
        Assert.assertTrue(sametPage.homeTitle.isDisplayed());
    }

    @And("When clicked on the Home title, it should be redirected to the relevant page")
    public void whenClickedOnTheHomeTitleItShouldBeRedirectedToTheRelevantPage() {
        sametPage.homeTitle.click();
        String redirectedURL = Driver.getDriver().getCurrentUrl();
        String expectedURL = "https://qa.wonderworldcollege.com/frontend";

        if (redirectedURL.contains(expectedURL)) {
            System.out.println("You have been redirected to the correct page by clicking on the Home title");
        } else {
            System.out.println("The redirection to the page was not successful");
        }
    }


    @Then("The visibility of the Online Admission title is tested")
    public void theVisibilityOfTheOnlineAdmissionTitleIsTested() {
        Assert.assertTrue(sametPage.onlineAdmissionTitle.isDisplayed());
    }

    @And("When clicked on the Online Admission title, it is redirected to the relevant page.")
    public void whenClickedOnTheOnlineAdmissionTitleItIsRedirectedToTheRelevantPage() {
        sametPage.onlineAdmissionTitle.click();
        String redirectedURL = Driver.getDriver().getCurrentUrl();
        String expectedURL = "https://qa.wonderworldcollege.com/online_admission";

        if (redirectedURL.contains(expectedURL)) {
            System.out.println("You have been redirected to the correct page by clicking on the Online Admission title");
        } else {
            System.out.println("The redirection to the page was not successful");
        }
    }


    @Then("The visibility of the Exam Result title is tested")
    public void theVisibilityOfTheExamResultTitleIsTested() {
        Assert.assertTrue(sametPage.examResult.isDisplayed());
    }

    @And("When clicked on the Exam Result title, it is redirected to the relevant page.")
    public void whenClickedOnTheExamResultTitleItIsRedirectedToTheRelevantPage() {
        sametPage.examResult.click();
        String redirectedURL = Driver.getDriver().getCurrentUrl();
        String expectedURL = "https://qa.wonderworldcollege.com/examresult";

        if (redirectedURL.contains(expectedURL)) {
            System.out.println("You have been redirected to the correct page by clicking on the Exam Result title");
        } else {
            System.out.println("The redirection to the page was not successful");
        }
    }

    @Then("The visibility of the About Us title is tested")
    public void theVisibilityOfTheAboutUsTitleIsTested() {
        Assert.assertTrue(sametPage.aboutUs.isDisplayed());
    }

    @And("When clicked on the About Us title, it is redirected to the relevant page.")
    public void whenClickedOnTheAboutUsTitleItIsRedirectedToTheRelevantPage() {
        sametPage.aboutUs.click();
        String redirectedURL = Driver.getDriver().getCurrentUrl();
        String expectedURL = "https://qa.wonderworldcollege.com/page/about-us";

        if (redirectedURL.contains(expectedURL)) {
            System.out.println("You have been redirected to the correct page by clicking on the About Us title");
        } else {
            System.out.println("The redirection to the page was not successful");
        }

    }

    @Then("The visibility of the Academics title is tested")
    public void theVisibilityOfTheAcademicsTitleIsTested() {
        Assert.assertTrue(sametPage.academics.isDisplayed());
    }

    @Then("The visibility of the Course title is tested")
    public void theVisibilityOfTheCourseTitleIsTested() {
        Assert.assertTrue(sametPage.course.isDisplayed());
    }

    @And("When clicked on the Course title, it is redirected to the relevant page.")
    public void whenClickedOnTheCourseTitleItIsRedirectedToTheRelevantPage() {
        sametPage.course.click();
        String redirectedURL = Driver.getDriver().getCurrentUrl();
        String expectedURL = "https://qa.wonderworldcollege.com/page/course";

        if (redirectedURL.contains(expectedURL)) {
            System.out.println("You have been redirected to the correct page by clicking on the Course title");
        } else {
            System.out.println("The redirection to the page was not successful");
        }

    }

    @Then("The visibility of the Gallery title is tested")
    public void theVisibilityOfTheGalleryTitleIsTested() {
        Assert.assertTrue(sametPage.gallery.isDisplayed());
    }

    @And("When clicked on the Gallery title, it is redirected to the relevant page.")
    public void whenClickedOnTheGalleryTitleItIsRedirectedToTheRelevantPage() {
        sametPage.gallery.click();
        String redirectedURL = Driver.getDriver().getCurrentUrl();
        String expectedURL = "https://qa.wonderworldcollege.com/page/gallery";

        if (redirectedURL.contains(expectedURL)) {
            System.out.println("You have been redirected to the correct page by clicking on the Gallery title");
        } else {
            System.out.println("The redirection to the page was not successful");
        }
    }


    @Then("The visibility of the News title is tested")
    public void theVisibilityOfTheNewsTitleIsTested() {
        Assert.assertTrue(sametPage.news.isDisplayed());
    }

    @And("When clicked on the News title, it is redirected to the relevant page.")
    public void whenClickedOnTheNewsTitleItIsRedirectedToTheRelevantPage() {
        sametPage.news.click();
        String redirectedURL = Driver.getDriver().getCurrentUrl();
        String expectedURL = "https://qa.wonderworldcollege.com/page/news";

        if (redirectedURL.contains(expectedURL)) {
            System.out.println("You have been redirected to the correct page by clicking on the News title");
        } else {
            System.out.println("The redirection to the page was not successful");
        }
    }


    @Then("The visibility of the Contact title is tested")
    public void theVisibilityOfTheContactTitleIsTested() {
        Assert.assertTrue(sametPage.contact.isDisplayed());
    }

    @And("When clicked on the Contact title, it is redirected to the relevant page.")
    public void whenClickedOnTheContactTitleItIsRedirectedToTheRelevantPage() {
        sametPage.contact.click();
        String redirectedURL = Driver.getDriver().getCurrentUrl();
        String expectedURL = "https://qa.wonderworldcollege.com/page/contact-us";

        if (redirectedURL.contains(expectedURL)) {
            System.out.println("You have been redirected to the correct page by clicking on the Contact title");
        } else {
            System.out.println("The redirection to the page was not successful");
        }
    }


    @Then("Click on the Academics title.")
    public void clickOnTheAcademicsTitle() {
        sametPage.academics.click();
    }

    @Then("The visibility of the Facilities title is tested")
    public void theVisibilityOfTheFacilitiesTitleIsTested() {
        Assert.assertTrue(sametPage.facilities.isDisplayed());
    }

    @And("When clicked on the Facilities title, it is redirected to the relevant page.")
    public void whenClickedOnTheFacilitiesTitleItIsRedirectedToTheRelevantPage() {
        sametPage.facilities.click();
        String redirectedURL = Driver.getDriver().getCurrentUrl();
        String expectedURL = "https://qa.wonderworldcollege.com/page/facilities";

        if (redirectedURL.contains(expectedURL)) {
            System.out.println("You have been redirected to the correct page by clicking on the Facilities title");
        } else {
            System.out.println("The redirection to the page was not successful");
        }
    }

    @Then("The visibility of the School Uniform title is tested")
    public void theVisibilityOfTheSchoolUniformTitleIsTested() {
        Assert.assertTrue(sametPage.schoolUniform.isDisplayed());
    }

    @And("When clicked on the School Uniform title, it is redirected to the relevant page.")
    public void whenClickedOnTheSchoolUniformTitleItIsRedirectedToTheRelevantPage() {
        sametPage.schoolUniform.click();
        String redirectedURL = Driver.getDriver().getCurrentUrl();
        String expectedURL = "https://qa.wonderworldcollege.com/page/school-uniform";

        if (redirectedURL.contains(expectedURL)) {
            System.out.println("You have been redirected to the correct page by clicking on the School Uniform title");
        } else {
            System.out.println("The redirection to the page was not successful");
        }
    }

    @Then("The visibility of the Principal Message title is tested")
    public void theVisibilityOfThePrincipalMessageTitleIsTested() {
        Assert.assertTrue(sametPage.principalMessage.isDisplayed());
    }

    @And("When clicked on the Principal Message title, it is redirected to the relevant page.")
    public void whenClickedOnThePrincipalMessageTitleItIsRedirectedToTheRelevantPage() {
        sametPage.principalMessage.click();
        String redirectedURL = Driver.getDriver().getCurrentUrl();
        String expectedURL = "https://qa.wonderworldcollege.com/page/principal-message";

        if (redirectedURL.contains(expectedURL)) {
            System.out.println("You have been redirected to the Principal Message page by clicking on the title");
        } else {
            System.out.println("The redirection to the page was not successful");
        }
    }

    @Then("The visibility of the Know Us title is tested")
    public void theVisibilityOfTheKnowUsTitleIsTested() {
        Assert.assertTrue(sametPage.knowUS.isDisplayed());
    }

    @And("When clicked on the Know Us title, it is redirected to the relevant page.")
    public void whenClickedOnTheKnowUsTitleItIsRedirectedToTheRelevantPage() {
        sametPage.knowUS.click();
        String redirectedURL = Driver.getDriver().getCurrentUrl();
        String expectedURL = "https://qa.wonderworldcollege.com/page/know-us";

        if (redirectedURL.contains(expectedURL)) {
            System.out.println("You have been redirected to the Know Us page by clicking on the title");
        } else {
            System.out.println("The redirection to the page was not successful");
        }
    }

    @Then("The visibility of the Approach title is tested")
    public void theVisibilityOfTheApproachTitleIsTested() {
        Assert.assertTrue(sametPage.approach.isDisplayed());
    }

    @And("When clicked on the Approach title, it is redirected to the relevant page.")
    public void whenClickedOnTheApproachTitleItIsRedirectedToTheRelevantPage() {
        sametPage.approach.click();
        String redirectedURL = Driver.getDriver().getCurrentUrl();
        String expectedURL = "https://qa.wonderworldcollege.com/page/approach";

        if (redirectedURL.contains(expectedURL)) {
            System.out.println("You have been redirected to the Approach page by clicking on the title");
        } else {
            System.out.println("The redirection to the page was not successful");
        }
    }

    @Then("The visibility of the Teacher title is tested")
    public void theVisibilityOfTheTeacherTitleIsTested() {
        Assert.assertTrue(sametPage.teacher.isDisplayed());
    }

    @And("When clicked on the Teacher title, it is redirected to the relevant page.")
    public void whenClickedOnTheTeacherTitleItIsRedirectedToTheRelevantPage() {
        sametPage.teacher.click();
        String redirectedURL = Driver.getDriver().getCurrentUrl();
        String expectedURL = "https://qa.wonderworldcollege.com/page/teacher";

        if (redirectedURL.contains(expectedURL)) {
            System.out.println("You have been redirected to the Teacher page by clicking on the title");
        } else {
            System.out.println("The redirection to the page was not successful");
        }
    }

    @Then("The visibility of the Houses&Mentoring title is tested")
    public void theVisibilityOfTheHousesMentoringTitleIsTested() {
        Assert.assertTrue(sametPage.housesMentoring.isDisplayed());
    }

    @And("When clicked on the Houses&Mentoring title, it is redirected to the relevant page.")
    public void whenClickedOnTheHousesMentoringTitleItIsRedirectedToTheRelevantPage() {
        sametPage.housesMentoring.click();
        String redirectedURL = Driver.getDriver().getCurrentUrl();
        String expectedURL = "https://qa.wonderworldcollege.com/page/houses-mentoring";

        if (redirectedURL.contains(expectedURL)) {
            System.out.println("You have been redirected to the Houses&Mentoring page by clicking on the title");
        } else {
            System.out.println("The redirection to the page was not successful");
        }
    }

    @Then("The visibility of the Student Council title is tested")
    public void theVisibilityOfTheStudentCouncilTitleIsTested() {
        Assert.assertTrue(sametPage.studentCouncil.isDisplayed());
    }

    @And("When clicked on the Student Council title, it is redirected to the relevant page.")
    public void whenClickedOnTheStudentCouncilTitleItIsRedirectedToTheRelevantPage() {
        sametPage.studentCouncil.click();
        String redirectedURL = Driver.getDriver().getCurrentUrl();
        String expectedURL = "https://qa.wonderworldcollege.com/page/student-council";

        if (redirectedURL.contains(expectedURL)) {
            System.out.println("You have been redirected to the Student Council page by clicking on the title");
        } else {
            System.out.println("The redirection to the page was not successful");
        }
    }


    @Then("Go to the Online Admission page")
    public void goToTheOnlineAdmissionPage() {
        sametPage.onlineAdmissionTitle.click();
    }

    @And("verify that the school admission criteria are displayed in the Instructions window.")
    public void verifyThatTheSchoolAdmissionCriteriaAreDisplayedInTheInstructionsWindow() {
        Assert.assertTrue(sametPage.admissionCriteria.isDisplayed());
    }

    @Then("The visibility of the TextBoxes for class,firstname,last name,gender,date of birth,and email is tested.")
    public void theVisibilityOfTheTextBoxesForClassFirstnameLastNameGenderDateOfBirthAndEmailIsTested() {
        Assert.assertTrue(sametPage.classBox.isDisplayed());
        Assert.assertTrue(sametPage.firstNameBox.isDisplayed());
        Assert.assertTrue(sametPage.lastNameBox.isDisplayed());
        Assert.assertTrue(sametPage.genderBox.isDisplayed());
        Assert.assertTrue(sametPage.dateOfBirthBox.isDisplayed());
        Assert.assertTrue(sametPage.emailBox.isDisplayed());
    }

    @Then("The test verifies that data can be entered into the class,firstname,last name,gender,date of birth and email boxes.")
    public void theTestVerifiesThatDataCanBeEnteredIntoTheClassFirstnameLastNameGenderDateOfBirthAndEmailBoxes() {
        sametPage.classBox.click();
        sametPage.classBox.sendKeys(Keys.ARROW_DOWN);
        sametPage.classBox.sendKeys(Keys.ENTER);
        sametPage.firstNameBox.sendKeys("Bruce");
        sametPage.lastNameBox.sendKeys("Wayne");
        sametPage.genderBox.sendKeys(Keys.ARROW_DOWN);
        sametPage.genderBox.sendKeys(Keys.ENTER);
        sametPage.dateOfBirthBox.click();
        sametPage.dateBox2023.click();
        sametPage.datebox2023_2.click();
        sametPage.prev.click();
        sametPage.year.click();
        sametPage.month.click();
        sametPage.day.click();
        sametPage.emailBox.sendKeys(ConfigReader.getProperty("sametMail"));
    }


    @Then("Father Name and Mother Name textboxes must be visible")
    public void fatherNameAndMotherNameTextboxesMustBeVisible() {
        Assert.assertTrue(sametPage.fatherName.isDisplayed());
        Assert.assertTrue(sametPage.motherName.isDisplayed());
    }

    @Then("Data must be entered in the father name and mother name textboxes")
    public void dataMustBeEnteredInTheFatherNameAndMotherNameTextboxes() {
        sametPage.fatherName.sendKeys("Thomas");
        sametPage.motherName.sendKeys("Martha");
    }

    @Then("the guardian name, guardian relation, and guardian email TextBoxes should be visible")
    public void theGuardianNameGuardianRelationAndGuardianEmailTextBoxesShouldBeVisible() {
        Assert.assertTrue(sametPage.guardName.isDisplayed());
        Assert.assertTrue(sametPage.guardRelation.isDisplayed());
        Assert.assertTrue(sametPage.guardEmail.isDisplayed());
    }

    @Then("guardian name, guardian relation and guardian email TextBoxes must be data accessible")
    public void guardianNameGuardianRelationAndGuardianEmailTextBoxesMustBeDataAccessible() {
        sametPage.guardName.sendKeys("Thomas");
        sametPage.guardRelation.sendKeys("Father");
        sametPage.guardEmail.sendKeys(ConfigReader.getProperty("parentMail"));
    }

    @Then("Father, Mother, Other buttons should be visible and selectable")
    public void fatherMotherOtherButtonsShouldBeVisibleAndSelectable() {
        Assert.assertTrue(sametPage.fatherButton.isDisplayed() && sametPage.fatherButton.isEnabled());
        Assert.assertTrue(sametPage.motherButton.isDisplayed() && sametPage.motherButton.isEnabled());
        Assert.assertTrue(sametPage.otherButton.isDisplayed() && sametPage.otherButton.isEnabled());

        sametPage.fatherButton.click();


    }

    @Then("The National Identification Number and Previous School Details textboxes must be visible")
    public void theNationalIdentificationNumberAndPreviousSchoolDetailsTextboxesMustBeVisible() {
        Assert.assertTrue(sametPage.nationalNumber.isDisplayed());
        Assert.assertTrue(sametPage.schoolDetails.isDisplayed());
    }

    @Then("National Identification Number and Previous School Details textboxes must be data enterable")
    public void nationalIdentificationNumberAndPreviousSchoolDetailsTextboxesMustBeDataEnterable() {
        sametPage.nationalNumber.sendKeys("34512356734");
        sametPage.schoolDetails.sendKeys("ABCABC");
    }

    @And("Click the submit button")
    public void clickTheSubmitButton() {
        sametPage.submitButton.click();
    }

    @Then("review entered details And Status page is verified")
    public void reviewEnteredDetailsAndStatusPageIsVerified() {
        Assert.assertTrue(sametPage.detailsAndStatus.isDisplayed());
    }


    @Then("Reference No, Form Status and Application Date should be visible")
    public void referenceNoFormStatusAndApplicationDateShouldBeVisible() {
        Assert.assertTrue(sametPage.referanceNo.isDisplayed());
        Assert.assertTrue(sametPage.formStatus.isDisplayed());
        Assert.assertTrue(sametPage.applicationDate.isDisplayed());
    }


    @Then("I Agree To The Terms And Conditions button should be visible and clickable")
    public void iAgreeToTheTermsAndConditionsButtonShouldBeVisibleAndClickable() {
        Assert.assertTrue(sametPage.AgreeButton.isDisplayed());
        sametPage.AgreeButton.click();
    }

    @Then("Click the submit button at the bottom")
    public void clickTheSubmitButtonAtTheBottom() {
        sametPage.submit2.click();
    }

    @Then("Form Has Been Submitted Successfully..!! message should be visible")
    public void formHasBeenSubmittedSuccessfullyMessageShouldBeVisible() {
        Assert.assertTrue(sametPage.Successfully.isDisplayed());
    }

    @Then("submitted is verified")
    public void submittedIsVerified() {
        Assert.assertTrue(sametPage.submittedMessage.isDisplayed());
    }

    @When("Click on the Course menu on the top bar and the user should be redirected to the Course page")
    public void clickOnTheCourseMenuOnTheTopBarAndTheUSerShouldBeRedirectedToCoursePage() {
        sametPage.course.click();
        String redirectedURL = Driver.getDriver().getCurrentUrl();
        String expectedURL = "https://qa.wonderworldcollege.com/page/course";

        if (redirectedURL.contains(expectedURL)) {
            System.out.println("You have been redirected to the correct page by clicking on the Course title");
        } else {
            System.out.println("The redirection to the page was not successful");
        }
    }


    @Then("the course headings should be visible")
    public void theCourseHeadingsShouldBeVisible() {
        sametPage.engAndLit.isDisplayed();
        sametPage.Mathematics.isDisplayed();
        sametPage.Sciences.isDisplayed();
        sametPage.SocialSciences.isDisplayed();
        sametPage.History.isDisplayed();
        sametPage.ArtsAndMusic.isDisplayed();
        sametPage.HealtAndExercise.isDisplayed();
        sametPage.Language.isDisplayed();
        sametPage.ComputerScience.isDisplayed();

    }

    @And("there should be a Details button below each course heading")
    public void thereShouldBeADetailsButtonBelowEachCourseHeading() {
        sametPage.EngAndLitDetails.isDisplayed();
        sametPage.MathDetails.isDisplayed();
        sametPage.ScienceDetails.isDisplayed();
        sametPage.SocScienceDetails.isDisplayed();
        sametPage.HistoryDetails.isDisplayed();
        sametPage.ArtsAndMusicDetails.isDisplayed();
        sametPage.HaExScienceDetails.isDisplayed();
        sametPage.ForeinLangDetails.isDisplayed();
        sametPage.CompScienceDetails.isDisplayed();
    }

    @When("the Details button of any course is clicked")
    public void theDetailsButtonOfAnyCourseIsClicked() {
        sametPage.EngAndLitDetails.click();
        sametPage.MathDetails.click();
        sametPage.ScienceDetails.click();
        sametPage.SocScienceDetails.click();
        sametPage.HistoryDetails.click();
        sametPage.ArtsAndMusicDetails.click();
        sametPage.HaExScienceDetails.click();
        sametPage.ForeinLangDetails.click();
        sametPage.CompScienceDetails.click();
    }

    @And("the user should be redirected to the detailed page of the English and Literature")
    public void theUserShouldBeRedirectedToTheDetailedPageOfTheEnglishandLiterature() {
        sametPage.EngAndLitDetails.click();
        String redirectedURL = Driver.getDriver().getCurrentUrl();
        String expectedURL = "https://qa.wonderworldcollege.com/page/english-and-literature";

        if (redirectedURL.contains(expectedURL)) {
            System.out.println("The user was redirected to the relevant detail page");
        } else {
            System.out.println("could not be redirected to the page");
        }
        sametPage.course.click();
    }

    @Then("the user should be redirected to the detailed page of the Mathematics")
    public void theUserShouldBeRedirectedToTheDetailedPageOfTheMathematics() {
        sametPage.MathDetails.click();
        String redirectedURL = Driver.getDriver().getCurrentUrl();
        String expectedURL = "https://qa.wonderworldcollege.com/page/mathematics";

        if (redirectedURL.contains(expectedURL)) {
            System.out.println("The user was redirected to the relevant detail page");
        } else {
            System.out.println("could not be redirected to the page");
        }
        sametPage.course.click();
    }

    @Then("the user should be redirected to the detailed page of the Sciences")
    public void theUserShouldBeRedirectedToTheDetailedPageOfTheSciences() {
        sametPage.ScienceDetails.click();
        String redirectedURL = Driver.getDriver().getCurrentUrl();
        String expectedURL = "https://qa.wonderworldcollege.com/page/sciences";

        if (redirectedURL.contains(expectedURL)) {
            System.out.println("The user was redirected to the relevant detail page");
        } else {
            System.out.println("could not be redirected to the page");
        }
        sametPage.course.click();
    }

    @Then("the user should be redirected to the detailed page of the Social Sciences")
    public void theUserShouldBeRedirectedToTheDetailedPageOfTheSocialSciences() {
        sametPage.SocScienceDetails.click();
        String redirectedURL = Driver.getDriver().getCurrentUrl();
        String expectedURL = "https://qa.wonderworldcollege.com/page/social-sciences";

        if (redirectedURL.contains(expectedURL)) {
            System.out.println("The user was redirected to the relevant detail page");
        } else {
            System.out.println("could not be redirected to the page");
        }
        sametPage.course.click();
    }

    @Then("the user should be redirected to the detailed page of the History")
    public void theUserShouldBeRedirectedToTheDetailedPageOfTheHistory() {
        sametPage.HistoryDetails.click();
        String redirectedURL = Driver.getDriver().getCurrentUrl();
        String expectedURL = "https://qa.wonderworldcollege.com/page/history";

        if (redirectedURL.contains(expectedURL)) {
            System.out.println("The user was redirected to the relevant detail page");
        } else {
            System.out.println("could not be redirected to the page");
        }
        sametPage.course.click();
    }

    @Then("the user should be redirected to the detailed page of the Arts and Music")
    public void theUserShouldBeRedirectedToTheDetailedPageOfTheArtsAndMusic() {
        sametPage.ArtsAndMusicDetails.click();
        String redirectedURL = Driver.getDriver().getCurrentUrl();
        String expectedURL = "https://qa.wonderworldcollege.com/page/arts-and-music";

        if (redirectedURL.contains(expectedURL)) {
            System.out.println("The user was redirected to the relevant detail page");
        } else {
            System.out.println("could not be redirected to the page");
        }
        sametPage.course.click();
    }

    @Then("the user should be redirected to the detailed page of the Healts and Exercise Sciences")
    public void theUserShouldBeRedirectedToTheDetailedPageOfTheHealtsAndExerciseSciences() {
        sametPage.HaExScienceDetails.click();
        String redirectedURL = Driver.getDriver().getCurrentUrl();
        String expectedURL = "https://qa.wonderworldcollege.com/page/health-and-exercise-sciences";

        if (redirectedURL.contains(expectedURL)) {
            System.out.println("The user was redirected to the relevant detail page");
        } else {
            System.out.println("could not be redirected to the page");
        }
        sametPage.course.click();
    }

    @Then("the user should be redirected to the detailed page of the Foreign Language")
    public void theUserShouldBeRedirectedToTheDetailedPageOfTheForeignLanguage() {
        sametPage.ForeinLangDetails.click();
        String redirectedURL = Driver.getDriver().getCurrentUrl();
        String expectedURL = "https://qa.wonderworldcollege.com/page/foreign-language";

        if (redirectedURL.contains(expectedURL)) {
            System.out.println("The user was redirected to the relevant detail page");
        } else {
            System.out.println("could not be redirected to the page");
        }
        sametPage.course.click();
    }

    @Then("the user should be redirected to the detailed page of the Computer Science")
    public void theUserShouldBeRedirectedToTheDetailedPageOfTheComputerScience() {
        sametPage.CompScienceDetails.click();
        String redirectedURL = Driver.getDriver().getCurrentUrl();
        String expectedURL = "https://qa.wonderworldcollege.com/page/computer-science";

        if (redirectedURL.contains(expectedURL)) {
            System.out.println("The user was redirected to the relevant detail page");
        } else {
            System.out.println("could not be redirected to the page");
        }
    }

}




