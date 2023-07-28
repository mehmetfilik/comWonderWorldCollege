package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.CommonPage;
import pages.MustafaPage;

public class MustafaStepdefinition {

    CommonPage common=new CommonPage();
    MustafaPage mustafa=new MustafaPage();

    @Given("User goes to {string} page")
    public void user_goes_to_page(String string) {
    }
    @Then("Click on the Admin Login Button.")
    public void click_on_the_admin_login_button() {

    }
    @Then("Enter a valid E-mail and Password.")
    public void enter_a_valid_e_mail_and_password() {

    }
    @Then("Enter valid email and password in the email and password boxes.")
    public void enter_valid_email_and_password_in_the_email_and_password_boxes() {

    }
    @Then("Click on the {string} button.")
    public void click_on_the_button(String string) {

    }
    @Then("Click on the {string} link.")
    public void click_on_the_link(String string) {

    }
}
