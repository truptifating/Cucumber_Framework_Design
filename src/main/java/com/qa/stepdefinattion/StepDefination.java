package com.qa.stepdefinattion;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.pageobjects.HomePageObjects;

//import com.qa.pageobjects.HomePageObjects;

//import com.qa.pageobjects.HomePageObjects;

//import com.qa.pageobjects.HomePageObjects;
//import com.qa.utilities.HandlingScreenshot;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.Timeout;

public class StepDefination 
{
	public static WebDriver driver;	
	
	@Given("^Initialize the browser$")
	public void initialize_the_browser() throws Throwable {
		  System.setProperty("webdriver.gecko.driver", "/home/vishnu/Documents/Trupti_Test_Automation/New_Automation_Scripts/Cucumber_Automation/geckodriver");  
		  driver = new FirefoxDriver();
		  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		  driver.get("https://www.facebook.com/");
	}

	@When("^Title of Login Page is facebook$")
	public void title_of_Login_Page_is_facebook() throws Throwable {
		 driver.get("https://www.facebook.com/");
	}
	
	
	@Then("^User Enters Credentials to login Page$")
	public void user_Enters_Credentials_to_login_Page(DataTable usercredentials) throws Throwable {
		 List<Map<String,String>> data = usercredentials.asMaps(String.class,String.class);
		 driver.findElement(HomePageObjects.UserName).sendKeys(data.get(0).get("Username")); 
		 driver.findElement(HomePageObjects.Password).sendKeys(data.get(0).get("Password"));
		 
	}

	@Then("^Click on Login Button$")
	public void click_on_Login_Button() throws Throwable {
		driver.findElement(HomePageObjects.LoginButton).click();
		
	}

}