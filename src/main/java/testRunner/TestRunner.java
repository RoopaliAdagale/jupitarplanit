package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;


@CucumberOptions(features = {"src/main/resources/Features/Suite2"}, glue = {"src/pagesStepDefination"}, tags = "@sanity", plugin = {"pretty", "html:target/cucumber-report.html", "pretty", "json:target/cucumber/report.json", "pretty", "json:target/cucumber/report.xml"})
public class TestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }

}
