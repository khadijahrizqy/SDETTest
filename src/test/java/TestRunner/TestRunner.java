package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue= {"StepDefinition"},
monochrome = true,
plugin = {"pretty", "junit:target/JUnitReports/report.xml",
		"json:target/JSONReports/cucumber.json",
		"html:target/HtmlReports"}//,
// tags="" // remove if no tags
		)
public class TestRunner {
	
}
