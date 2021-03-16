import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverTesting {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "/home/vishnu/Documents/Trupti_Test_Automation/New_Automation_Scripts/Cucumber_Automation/geckodriver");  
		  WebDriver driver = new FirefoxDriver();
//		FirefoxDriver driver = new FirefoxDriver();
	}

}
