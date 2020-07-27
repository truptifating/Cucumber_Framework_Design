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
	  public static void takeScreenShot(WebDriver driver, String ScreenshotName,String TestCaseName) throws IOException
	  {
		 
		  try {
			   
			  TakesScreenshot scrShot = ((TakesScreenshot) driver);
			  File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);    
			  FileUtils.copyFile(SrcFile, new File ("C:\\Users\\tfating\\EDM Cucumber Automation Project\\Screenshots\\"+TestCaseName+"\\"+ScreenshotName+".png"));
			  System.out.println("ScreenShot Taken");	  		  
			} 
			catch (Exception e) 
			{
			    System.out.println("Exception while taking ScreenShot "+e.getMessage());
			}


		  

		
	  }
}
