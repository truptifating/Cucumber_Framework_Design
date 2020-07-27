package com.qa.testrun;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
 features = "/home/vishnu/Documents/Trupti_Test_Automation/New_Automation_Scripts/Cucumber_Automation/src/main/java/features/login.feature"
 ,glue={"/Cucumber_Automation/src/main/java/com/qa/stepdefinattion/StepDefination.java"}
 )

public class TestRunner 
{

}
