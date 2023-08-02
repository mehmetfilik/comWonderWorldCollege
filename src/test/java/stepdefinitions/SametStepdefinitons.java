package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.SametPage;
import utilities.ConfigReader;
import utilities.Driver;

public class SametStepdefinitons {

    SametPage sametPage = new SametPage();

    @Given("The user goes to the WonderWorldCollege homepage.")
    public void the_user_goes_to_the_wonder_world_college_homepage() {

        Driver.getDriver().get(ConfigReader.getProperty("wonderUrl"));
    }

    @Then("The user tests if the homepage is visible.")
    public void the_user_tests_if_the_homepage_is_visible() {

        if (sametPage.pageLogo.isDisplayed()){
            System.out.println("The visibility of the homepage has been confirmed");
        }
        else {
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
            Thread.sleep(waitTime*1000);
        }catch (InterruptedException e){
        }
    }

    @Then("Testing the second latest news information")
    public void testingTheSecondLatestNewsInformation() {

        Assert.assertTrue(sametPage.latestNews2.isDisplayed());
    }

    @And("waiting for {int} seconds")
    public void waitingForSeconds(int waitTime) {
        try {
            Thread.sleep(waitTime*1000);
        }catch (InterruptedException e){
        }
    }

    @Then("Testing the third latest news information")
    public void testingTheThirdLatestNewsInformation() {
        Assert.assertTrue(sametPage.latestNews3.isDisplayed());
    }


    @And("wait for {int} seconds")
    public void waitForSeconds(int waitTime) {
        try {
            Thread.sleep(waitTime*1000);
        }catch (InterruptedException e){
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

        if (actualUrl.contains(expectedUrl)){
            System.out.println("The homepage has been refreshed");
        }else {
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
        String expectedURL ="https://qa.wonderworldcollege.com/frontend";

        if (redirectedURL.contains(expectedURL)){
            System.out.println("You have been redirected to the correct page by clicking on the Home title");
        }else {
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

        if (redirectedURL.contains(expectedURL)){
            System.out.println("You have been redirected to the correct page by clicking on the Online Admission title");
        }else {
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

        if (redirectedURL.contains(expectedURL)){
            System.out.println("You have been redirected to the correct page by clicking on the Exam Result title");
        }else {
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

        if (redirectedURL.contains(expectedURL)){
            System.out.println("You have been redirected to the correct page by clicking on the About Us title");
        }else {
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

        if (redirectedURL.contains(expectedURL)){
            System.out.println("You have been redirected to the correct page by clicking on the Course title");
        }else {
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

        if (redirectedURL.contains(expectedURL)){
            System.out.println("You have been redirected to the correct page by clicking on the Gallery title");
        }else {
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

        if (redirectedURL.contains(expectedURL)){
            System.out.println("You have been redirected to the correct page by clicking on the News title");
        }else {
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

        if (redirectedURL.contains(expectedURL)){
            System.out.println("You have been redirected to the correct page by clicking on the Contact title");
        }else {
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

        if (redirectedURL.contains(expectedURL)){
            System.out.println("You have been redirected to the correct page by clicking on the Facilities title");
        }else {
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

        if (redirectedURL.contains(expectedURL)){
            System.out.println("You have been redirected to the correct page by clicking on the School Uniform title");
        }else {
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

        if (redirectedURL.contains(expectedURL)){
            System.out.println("You have been redirected to the Principal Message page by clicking on the title");
        }else {
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

        if (redirectedURL.contains(expectedURL)){
            System.out.println("You have been redirected to the Know Us page by clicking on the title");
        }else {
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

        if (redirectedURL.contains(expectedURL)){
            System.out.println("You have been redirected to the Approach page by clicking on the title");
        }else {
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

        if (redirectedURL.contains(expectedURL)){
            System.out.println("You have been redirected to the Teacher page by clicking on the title");
        }else {
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

        if (redirectedURL.contains(expectedURL)){
            System.out.println("You have been redirected to the Houses&Mentoring page by clicking on the title");
        }else {
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

        if (redirectedURL.contains(expectedURL)){
            System.out.println("You have been redirected to the Student Council page by clicking on the title");
        }else {
            System.out.println("The redirection to the page was not successful");
        }
    }
}


