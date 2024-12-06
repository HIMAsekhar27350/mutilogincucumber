package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src\\test\\java\\Features\\loginpage.feature"},
glue = {"StepDefinitions"},plugin = {"pretty","html:target/htmlreports/htmlreports.html"})
public class TestRunner extends AbstractTestNGCucumberTests {
}
