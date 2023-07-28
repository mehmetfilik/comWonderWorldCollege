package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Base;
import pages.CommonPage;
import pages.RamazanPage;

public class RamazanStepdefinitons extends Base {

    CommonPage common = new CommonPage();

    RamazanPage ramazanPage = new RamazanPage();

    @Given("User goes to wonderUrl page")
    public void user_goes_to_wonder_url_page() {
        common.teacherLoginMethod("ramazan.dalciçek@teacher.wonderworldcollege.com","wonderworld123");
    }
    @Then("Click on the Teacher Login Button.")
    public void click_on_the_teacher_login_button() {

    }
    @Then("Enter the username and password, then click on the {string} button.")
    public void enter_the_username_and_password_then_click_on_the_button(String string) {

    }
    @Then("clicks on the Homework page link in the sidebar")
    public void clicks_on_the_homework_page_link_in_the_sidebar() {

    }
    @Then("clicks on the Add Homework page link")
    public void clicks_on_the_add_homework_page_link() {

    }
    @Then("the teacher should be redirected to the Add Homework page successfully")
    public void the_teacher_should_be_redirected_to_the_add_homework_page_successfully() {

    }
}
