package com.googleproject.MoneseFramework.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)

@CucumberOptions (
		features = {"src/test/java/com/googleproject/Framework/featureFiles/"},
		glue = {"com/googleproject/Framework/stepFile"},
		monochrome = true,
		plugin = {"pretty", "html:target/cucumber", 
				"json:target/cucumber.json", 
				"com.cucumber.listener.ExtentCucumberFormatter:target/report.html"}
	)

public class MainRunnerSuite extends AbstractTestNGCucumberTests{


}
