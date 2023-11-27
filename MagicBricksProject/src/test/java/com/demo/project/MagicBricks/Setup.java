package com.demo.project.MagicBricks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Setup {
	String browserName;
	WebDriver driver;
//	String url;

	public  Setup (String browserName) {
		this.browserName=browserName;
    }
	public WebDriver initDriver() {
		
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
//			driver.navigate().to(url);
			return driver;
		} else if (browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			EdgeOptions options = new EdgeOptions();
			options.setCapability("Capability.Notifications", false);
			driver = new EdgeDriver(options);
			driver = new EdgeDriver();
			driver.manage().window().maximize();
//			driver.navigate().to(url);
			return driver;
		} else {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			FirefoxOptions options = new FirefoxOptions();
			options.setCapability("moz:notifications", false);
			driver = new FirefoxDriver(options);
			driver.manage().window().maximize();
//			driver.navigate().to(url);
			return driver;
		}
	}
}
