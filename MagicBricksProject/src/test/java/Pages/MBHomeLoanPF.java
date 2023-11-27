package Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MBHomeLoanPF extends MBBasePage
{
	WebDriver driver;
	JavascriptExecutor js;
	Robot r;
	
	public MBHomeLoanPF(WebDriver driver) throws AWTException 
	{
		super(driver);
		this.driver=driver;
		this.js = (JavascriptExecutor) driver;
		this.r = new Robot();
	}
	
	@FindBy(xpath="//ul[@class='drop-links']/child::li/child::a[text()='Home Loans']")
	WebElement title;
	
	@FindBy(id="monthlyIncome")
	WebElement input;
	
	@FindBy(id="generate-otp")
	WebElement checkBtn;
	
	@FindBy(id="loanAmount")
	WebElement lamt;
	
	@FindBy(id="shortlistedN")
	WebElement no;
	
	@FindBy(id="NameCityOnly")
	WebElement city;
	
	public void homeLoanPage() throws InterruptedException 
	{
		Thread.sleep(5000);
		r.mouseMove(370, 180);
		waitUntilVisibility(title);
		title.click();
		
	}
	
//	@Parameters({"hlAmt","hlCity"})String hlAmt , String hlcity
	public void checkEligibility() 
	{
		String childWindow = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();

		// Iterate through handles
		for (String windowHandle : windowHandles) 
		{
			try 
			{
			    driver.switchTo().window(windowHandle);
			}
			catch(NoSuchElementException e) 
			{
				driver.quit();
			}
		}
		waitUntilVisibility(input);
		input.sendKeys("1000");
		checkBtn.click();
		
//		waitUntilVisibility(lamt);
//		lamt.sendKeys(hlAmt);
//		no.click();
//		waitUntilVisibility(city);
//		city.sendKeys(hlcity);	
	}
	
}
