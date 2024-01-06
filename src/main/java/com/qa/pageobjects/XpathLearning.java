package com.qa.pageobjects;

import org.openqa.selenium.By;

public class XpathLearning 
{
	
	// CReating the xpth for Free CRM
	public static final By UserName= By.xpath("//*[@id=\"email\"]");
	
	
	//url =HYR tutorials
	
//	xpath of text box of email-
	//label[text()='Email']/following-sibling::input[@type='text'] Or
	//label[text()='Email']/following-sibling::input[1]
	
	
	//label[text()='Email']/following-sibling::input[1]/parent::div or
	//label[text()='Email']/parent::div                             or
	//div[@class='container']/child::input[@type='text']
	
//	xpath for checking the checkbox-
	//td[text()='Maria Anders']/preceding-sibling::td/child::input
	
//	xpath for checking the button
	//div[@class='container']/descendant::button[@type='submit']
	
	
	//div[@class='buttons']/ancestor::div
	//div[@class='buttons']/ancestor-or-self::div
	
	///label[text()='Password']/following::input[1]
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
