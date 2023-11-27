package Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MBHomeLoanPrepaymentPF extends MBBasePage{
	WebDriver driver;
	Actions actions;
	JavascriptExecutor js;
	WebDriverWait wait;
	Robot r;
	public MBHomeLoanPrepaymentPF(WebDriver driver) throws AWTException {
		super(driver);
		this.actions = new Actions(driver);
		this.js = (JavascriptExecutor) driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		this.r = new Robot();
	}
	
	@FindBy(xpath="//li[@class='js-menu-container']/child::a[text()='Home Loans']")
	WebElement homeLoan;
	
	@FindBy(css="a[href='https://www.magicbricks.com/homeloan/prepayment-calculator']")
	WebElement homeLoanPrepay;
	
	@FindBy(id="lalpc")
	WebElement lAmt;
	
	@FindBy(xpath="//input[@id='ltlpc']")
	WebElement tenure;
	
	@FindBy(id="rplc")
	WebElement roi;
	
	@FindBy(xpath="//div[@class='formField']/child::input")
	WebElement installmentPaid;
	
	@FindBy(id="palpc")
	WebElement prepayAmt;
	
	@FindBy(css = ".home-loan__action--btn.btn-red.large")
	WebElement calcBtn;

//	move to homeloan
	public void movesToHomeLoan() {
		actions.moveToElement(homeLoan);
		homeLoanPrepay.click();
	}

//	sending keys to the fields using scenario outline
	public void enterDetails(String string, String string2, String string3, String string4, String string5) {
		lAmt.sendKeys(string);
		tenure.sendKeys(string2);
		roi.sendKeys(string3);
		installmentPaid.sendKeys(string4);
		prepayAmt.sendKeys(string5);
	}
	
//	clicking login button
	public void clickCalc() {
		calcBtn.click();
	}
	
}
