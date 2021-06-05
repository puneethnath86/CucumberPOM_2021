package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class HomePage extends TestBase
{
	@FindBy(xpath="")
	WebElement userNameLabel;
	
	@FindBy(xpath="//i[@class='users icon']")
	WebElement contactsLink;
	
	@FindBy(xpath="//button[text()='New']")
	WebElement newContactsLink;
	
	@FindBy(xpath="//i[@class='money icon']")
	WebElement dealsLink;
	
	@FindBy(xpath="//button[text()='New']")
	WebElement newDealsLink;
	
	
	@FindBy(xpath="")
	WebElement tasksLink;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public Boolean verifyCorrectUserName() {
		return userNameLabel.isDisplayed();
	}
	
	public ContactsPage clickOnContactsLink() {
		newContactsLink.click();
		return new ContactsPage();
	}
	
	
	public DealsPage clickOnDealsLink() {
		dealsLink.click();
		return new DealsPage();
	}
	
}
