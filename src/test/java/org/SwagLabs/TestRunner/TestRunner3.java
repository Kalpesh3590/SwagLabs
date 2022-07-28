package org.SwagLabs.TestRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src//test//resources//Feature3",
glue= {"org.SwagLabs.SortingSteps"},
plugin= {"pretty",
		"html:target/HTML_Reports/htmlreports3.html",
		"json:target/JSON_Reports/json_report3.json",
		"junit:target/JUNIT_Reports/junit_report3.xml"},
		monochrome= true)

public class TestRunner3 extends AbstractTestNGCucumberTests
{

}