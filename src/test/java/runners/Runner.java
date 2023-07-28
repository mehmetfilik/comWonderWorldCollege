package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failedRerun.txt"
        },
        features = "src/test/resources",
        glue = {"stepdefinitions"},
        tags = "@Test1",
        dryRun = false
)

public class Runner {
}


/*

        git init
        git add .
        git commit -m "first commit"
        git branch -M main
        git remote add origin https://github.com/mehmetfilik/comWonderWorldCollege.git
        git push -u origin main

 */