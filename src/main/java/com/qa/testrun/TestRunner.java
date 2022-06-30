package com.qa.testrun;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Free_CRM_Project_1/src/main/java/features",
		glue="Cucumber_Automation/src/main/java/com/qa/stepdefinattion/StepDefination.java",
		dryRun=true
				
		)

public class TestRunner 
{

}
