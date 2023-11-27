package Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MBLoginPF extends MBBasePage
{
	WebDriver driver;
	Robot r;
	
	public MBLoginPF(WebDriver driver) throws AWTException 
	{
		super(driver);
		this.driver=driver;
		this.r = new Robot();
	}
	
//	-----------------------------------------------------Locators-------------------------------------------------------------
	@FindBy(xpath="//a[text()='Login' and @class='mb-header__main__link js-menu-link ']")
	WebElement mainmenu;
	
	@FindBy(xpath="//a[@class='mb-login__drop-cta']")
	WebElement subMenu;
	
	@FindBy(id="emailOrMobile")
	WebElement mailOrMob;
	
	@FindBy(tagName="button")
	WebElement next;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="btnLogin")
	WebElement loginBtn;
	
	@FindBy(className="mbB2cPS__close")
	WebElement close;
	
	@FindBy(className="close-btn")
	WebElement pop;
	
	@FindBy(xpath="//a[@data-testid='header-logo-link']")
	WebElement logo;
	
	@FindBy(xpath="//div[@class='onmodal']")
	WebElement homePagePopup;
	
	@FindBy(className="onmodal__cross")
	WebElement cross;
//	---------------------------------------------------Methods-----------------------------------------------------------
	//method to move to login tab
	public void toLoginPage() throws InterruptedException 
	{
//		wait.until(ExpectedConditions.visibilityOf(mainmenu));
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(5000);
		r.mouseMove(1010, 145);
		
		waitUntilVisibility(subMenu);
		subMenu.click();
	}
	
//	entering credentials
	public void enterCredentials(String mail, String pass) 
	{
		String parentWindowHandle = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();

		// Iterate through handles
		for (String windowHandle : windowHandles) {
		    // Switch to the window that is not the parent window
		    if (!windowHandle.equals(parentWindowHandle)) {
		        driver.switchTo().window(windowHandle);
		        break;
		    }
		}
		waitUntilVisibility(mailOrMob);
		mailOrMob.sendKeys(mail);
		next.click();
	
		waitUntilVisibility(password);
		password.sendKeys(pass);
		
		waitUntilVisibility(loginBtn);
		loginBtn.click();
	}
	
	public void closePop()
	{
		waitUntilVisibility(close);
		close.click();
		
		waitUntilVisibility(pop);
		pop.click();
	}
	
	public void landPage() 
	{
		waitUntilVisibility(logo);
		logo.click();
		waitUntilVisibility(cross);
		if(cross.isDisplayed()) {
            System.out.println("Pop-up is displayed. Closing the pop-up.");
            cross.click();
        } 
	}

}
