package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:/Users/punath/Documents/Eclipse Workspace/NaveenJun/JavaPrac/CucumberPOM/src/main/java/com/qa/features/FreeCRMLogin.feature",
		glue = {"com/qa/stepDefinitions"},
		format= {"pretty", "html:test-output", "json:jons_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
		monochrome = true,
		strict=true,
		dryRun = false
		)


public class TestRunner 
{
	
}

