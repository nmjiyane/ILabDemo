package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Client Journey Repos\\ILABDemo2\\src\\test\\resources\\stepdefinition\\FindLocation.feature",
        tags = {"@NkosinathiRun"},
        glue={"@stepdefinition"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
        format={"pretty","json:target/cucumber-reports/cucumber.json"},
        monochrome = true,
        dryRun = true)

public class TestRunner {
}
