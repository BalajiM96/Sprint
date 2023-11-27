package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MBBasePage 
{

	WebDriver driver;
	
	public MBBasePage(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	public void waitUntilVisibility(WebElement ele) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
}
