package com.qa.stepdefinattion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.pageobjects.HomePageObjects;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.Timeout;

public class StepDefination 
{
	public static WebDriver driver;	
	
	@Given("^Initialize the browser$")
	public void initialize_the_browser() throws Throwable 
	{
		System.setProperty("webdriver.gecko.driver", "/home/vishnu/Documents/Trupti_Test_Automation/New_Automation_Scripts/Cucumber_Automation/geckodriver");  
		driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("^Title of Login Page is facebook$")
	public void title_of_Login_Page_is_facebook() throws Throwable 
	{
	    driver.get("https://www.facebook.com/");
	}

	@Then("^User Enters Username and Passward$")
	public void user_Enters_Username_and_Passward() throws Throwable 
	{
	    driver.findElement(HomePageObjects.UserName).sendKeys("truptifatting@gmail.com");	    	    
	    driver.findElement(HomePageObjects.Password).sendKeys("xyz");
	}

	@Then("^Click on Login Button$")
	public void click_on_Login_Button() throws Throwable 
	{
	    driver.findElement(HomePageObjects.LoginButton).click();
	}
}
