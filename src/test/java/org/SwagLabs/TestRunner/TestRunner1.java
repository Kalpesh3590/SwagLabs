package org.SwagLabs.TestRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src//test//resources//Feature1",
glue= {"org.SwagLabs.BrowserOpeningSteps"},
plugin= {"pretty",
		"html:target/HTML_Reports/htmlreports1.html",
		"json:target/JSON_Reports/json_report1.json",
		"junit:target/JUNIT_Reports/junit_report1.xml"},
		monochrome= true)

public class TestRunner1 extends AbstractTestNGCucumberTests
{

}