package com.qa.stepdefinattion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.qa.pageobjects.HomePageObjects;

//import com.qa.utilities.HandlingScreenshot;


import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.runtime.Timeout;

public class StepDefination 
{
	public static WebDriver driver;	
	SoftAssert softassert= new SoftAssert();
	
//	@Given("^Initialize the browser$")
//	public void initialize_the_browser() throws Throwable {
//		  System.setProperty("webdriver.chrome.driver", "E:\\Selenium Training\\X_Jars and drivers\\chromedriver_win32.exe");  
//		  driver = new ChromeDriver();
//		  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
//		
//	}
	@Then("^Enter the URl and Verify the Title of Login Page$")
	public void enter_the_URl_and_Verify_the_Title_of_Login_Page() throws Throwable {
		driver.get("https://www.facebook.com/");
		String getActualTitle=driver.getTitle();
		boolean verifyTitle=driver.getTitle().equalsIgnoreCase("Facebook – log in or sign up");				
		softassert.assertEquals(getActualTitle, "Facebook – log in or sign up","The facebook title is correct");  //Soft Assertions
		softassert.assertNotEquals(getActualTitle, "Facebook – log in or insign up","The facebook title is notcorrect"); 
		softassert.assertNull(verifyTitle);
		softassert.assertNotNull(verifyTitle);
//		softassert.assertTrue();
//		softassert.assertFalse();		
//		softassert.assertAll();
	}

	
	@Then("^User Enters Credentials to login Page$")
	public void user_Enters_Credentials_to_login_Page(DataTable usercredentials) throws Throwable {
		 List<Map<String,String>> data = usercredentials.asMaps(String.class,String.class);
		 driver.findElement(HomePageObjects.UserName).sendKeys(data.get(0).get("Username")); 
		 driver.findElement(HomePageObjects.Password).sendKeys(data.get(0).get("Password"));
		 System.out.println("Credentials are entered");
		 
	}

	@Then("^Click on Login Button$")
	public void click_on_Login_Button() throws Throwable {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		boolean loginButton =driver.findElement(HomePageObjects.LoginButton).isDisplayed();
		System.out.println(loginButton+"-Login Buttonis displayed");
		driver.findElement(HomePageObjects.LoginButton).click();
		String ActualTitleAfterLogin=driver.getTitle();
		String ExpectedTitleAfterLogin="Facebook";
		Assert.assertEquals(ActualTitleAfterLogin, ExpectedTitleAfterLogin);
		
	}
	
	@Then("^Verify the Objects on Login Page$")
	public void verify_the_Objects_on_Login_Page() throws Throwable {
		
		boolean createAccountButton =driver.findElement(HomePageObjects.CreateAccountButton).isEnabled();
		System.out.println(createAccountButton+"-CreateAccountButton is Enabled");
		//TakesScreenshot scrShot = ((TakesScreenshot) driver);
//		  File SrcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);    
//		  FileUtils.copyFile(SrcFile, new File ("/home/vishnu/Documents/Trupti_Test_Automation/New_Automation_Scripts/Cucumber_Automation/image.png"));
//		  System.out.println("ScreenShot Taken");	

	}

	
//	@Then("^Take Screenshot$")
//	public void take_Screenshot() throws Throwable {
//		Thread.sleep(20);
//	    HandlingScreenshot.takeScreenShot();
//	}
	
	@Then("^Closing the browser$")
	public void closing_the_browser() throws Throwable {
	   driver.quit();
	}

}