package com.apvg.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {
			"src/test/resources/features"
		},
		glue= {
			"com.apvg.stepdefinitions"	
		},
		plugin= {
			"pretty",
			"html:target/results/test.html",
			"json:target/json/results.json",
			"junit:target/junit/cucumber.xml"
		},
		monochrome=true,
		tags = "@sanity or @regression"
)
public class TestRunner {

}
