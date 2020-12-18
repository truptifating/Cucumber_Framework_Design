package com.qa.pageobjects;

import org.openqa.selenium.By;


public class HomePageObjects 
{
	/*public static final By FirstName=By.name("firstname");
	public static final By LastName=By.name("lastname");
	public static final By MobileNo= By.xpath(" //*[@id=\"u_0_r\"]");
	public static final By ForgottenAccountLink=By.linkText("Forgotten account?");*/
	
	public static final By UserName= By.xpath("//*[@id=\"email\"]");
	public static final By Password= By.xpath("//*[@id=\"pass\"]");
	public static final By LoginButton= By.xpath("//*[@id=\"u_0_b\"]");
	public static final By CreateAccountButton= By.xpath("//*[@id=\"u_0_2\"]");
	public static final By ForgerAccountLink= By.xpath("//a[contains(text(),'Forgotten account?')]");
	
	
    
}
