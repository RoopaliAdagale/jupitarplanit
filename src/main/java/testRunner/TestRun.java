package testRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = {"src/main/resources/Features/Suite1"},
        glue = {"src/pagesStepDefination"},
        tags = "@Regression",
        plugin = {"pretty",
                "html:target/cucumber-report.html",
                "pretty", "json:target/cucumber/report.json",
                "pretty", "json:target/cucumber/report.xml"
        }
)
public class TestRun extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }


}
