package com.qa.testrun;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features="features",
		features= "E:\\Selenium Training\\Cucumber_Framework_Design\\src\\main\\java\\features\\login.feature",
		//features= "/Cucumber_Automation/src/main/java/features/login.feature",
		glue="com.qa.stepdefinattion",
		dryRun=true
				
		)

public class TestRunner 
{

}
