package com.qa.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase 
{
	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	
	public TestBase() {
		try {
			prop=new Properties();
			FileInputStream fis=new FileInputStream("C:/Users/punath/Documents/Eclipse Workspace/NaveenJun/JavaPrac/CucumberPOM/src/main/java/com/qa/config/config.properties");
			prop.load(fis);
		}
		catch(IOException e) {
			e.getMessage();
		}
	}
	
	public static void initilization() {
		
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		
		else if(browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
//		To launch the browser with URL
		driver.get(prop.getProperty("url"));
		

		
	}
}
