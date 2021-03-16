package test.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ex {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "/home/vishnu/Documents/Trupti_Test_Automation/New_Automation_Scripts/Cucumber_Automation/geckodriver");
		
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.makemytrip.com/flights/?cmp=SEM|D|DF|G|Brand|B_M_Makemytrip_Search_Exact|Brand_Top_5_Exact|Expanded|263079100974&s_kwcid=AL!1631!3!263079100974!e!!g!!make%20my%20trip&ef_id=CjwKCAiAyc2BBhAaEiwA44-wW8X-kbGyn7EIYq2FzSJCR3ffSSoMZVCGKOerd_y1uk4gdP4ltjqQHhoCExcQAvD_BwE:G:s&gclid=CjwKCAiAyc2BBhAaEiwA44-wW8X-kbGyn7EIYq2FzSJCR3ffSSoMZVCGKOerd_y1uk4gdP4ltjqQHhoCExcQAvD_BwE");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
		
		WebElement From= driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']"));
		From.click();
		
//		WebElement To=driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']"));
//		To.click();
//		
//		
//		Select drp= new Select(driver.findElement(By.xpath("//input[@id='departure']")));
//		System.out.println(drp.getOptions());
		
		
		
		

	}

}
