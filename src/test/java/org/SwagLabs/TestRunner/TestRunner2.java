package org.SwagLabs.TestRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src//test//resources//Feature2",
glue= {"org.SwagLabs.LoginPageSteps"},
plugin= {"pretty",
		"html:target/HTML_Reports/htmlreports2.html",
		"json:target/JSON_Reports/json_report2.json",
		"junit:target/JUNIT_Reports/junit_report2.xml"},
		monochrome= true)

public class TestRunner2 extends AbstractTestNGCucumberTests
{

}