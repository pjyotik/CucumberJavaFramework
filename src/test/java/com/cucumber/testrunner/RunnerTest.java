package com.cucumber.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * @author Pranob Kalita 08-Sep-2019
 */

@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "./src/test/resources/features/login.feature" }, 
		glue = "com/cucumber/stepdefinitions", 
		dryRun = false, 
		monochrome = true, 
		plugin = {"pretty", "json:target/CucumberTestReport.json",
				"html:target/CucumberTest-Reports/cucumber-pretty-report",
				"html:target/CucumberTest-Reports/cucumber-advance-report",				
				"rerun:target/CucumberTest-Reports/cucumber-rerun.txt"} 
		/*tags = { "@sanity, @regression" }*/)

public class RunnerTest {

}
