package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.CommonPage;

public class OmerStepDefinition {

    CommonPage common = new CommonPage();


    @Given("Sign in on the Teacher Admin")
    public void sign_in_on_the_teacher_admin() {
        common.teacherLoginMethod("omer.faruk.unal@teacher.wonderworldcollege.com","wonderworld123");
    }
}
