package com.apvg.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {
			"src/test/resources/features" // Path to feature files
		},
		glue= {
			"com.apvg.stepdefinitions"	 // Package for step definitions
		},
		plugin= {
			"pretty",											// Console output
			"html:target/cucumber-reports/CucumberReport.html",	// HTML Report
			"json:target/cucumber-reports/CucumberReport.json", // JSON Report
			"junit:target/cucumber-reports/CucumberReport.xml"	// JUnit Report
		},
		monochrome=true,										// Improves readability in console
		tags = "@sanity or @regression"
)
public class TestRunner {

}
