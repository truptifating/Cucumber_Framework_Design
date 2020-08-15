package com.qa.testrun;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = "/home/vishnu/Documents/Trupti_Test_Automation/New_Automation_Scripts/Cucumber_Automation/src/main/java/features"
 ,glue={"com.qa.stepdefinattion"}
 ,dryRun=false
		
 )

public class TestRunner 
{

}
