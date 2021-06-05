package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class LoginPage extends TestBase
{
	
//	PAGE FACTORY OBJECT REPOSITORY
	
	@FindBy(name="email")
	WebElement usernameTxt;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement passwordTxt;
	
	@FindBy(xpath="//div[text() = 'Login']")
	WebElement loginBtn;
	
//	Initializing the page objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public void login(String username, String password) {
		
//		try{Thread.sleep(5000);}
//		catch(Exception e) {e.printStackTrace();}
		
		usernameTxt.sendKeys(username);
		passwordTxt.sendKeys(password);
		
	}
	
	public void launchBrowser() {
		TestBase.initilization();
	}
	
	public HomePage clickLogin() {
		loginBtn.click();
		return new HomePage();
	}
	
}
