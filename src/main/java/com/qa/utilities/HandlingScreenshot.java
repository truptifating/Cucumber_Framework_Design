package com.qa.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class HandlingScreenshot 
{
	public static WebDriver driver;
	  public static void takeScreenShot() throws IOException
	  {
		 
		  try {
			   
			  TakesScreenshot scrShot = ((TakesScreenshot) driver);
			  File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);    
			  FileUtils.copyFile(SrcFile, new File ("/home/vishnu/Documents/Trupti_Test_Automation/New_Automation_Scripts/Cucumber_Automation/image.png"));
			  System.out.println("ScreenShot Taken");	  		  
			} 
			catch (Exception e) 
			{
			    System.out.println("Exception while taking ScreenShot "+e.getMessage());
			}
	
	  }
}
