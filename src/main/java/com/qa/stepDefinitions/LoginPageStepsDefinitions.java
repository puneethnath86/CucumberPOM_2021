package com.qa.stepDefinitions;

import org.testng.Assert;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginPageStepsDefinitions extends TestBase
{
	LoginPage lp;
	HomePage hp;
	@Given("^user opens browser$")
	public void user_opens_browser(){
		TestBase.initilization();
	}

	@Then("^user is on login page$")
	public void user_is_on_login_page(){
		lp=new LoginPage();
		String loginPageTitle = lp.validateLoginPageTitle();
		Assert.assertEquals(loginPageTitle, "Cogmento CRM");
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password(){
		lp.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Then("^user click login button$")
	public void user_click_login_button(){
//		hp=lp.clickLogin();
	}

	@Then("^user is navigated to homepage$")
	public void user_is_navigated_to_homepage(){
//	    String homePageTitle = hp.verifyHomePageTitle();
//	    Assert.assertEquals(homePageTitle, "");
	}

	@Then("^validate homepage title$")
	public void validate_homepage_title(){
	    
	}

	@Then("^validate username logged in to the application$")
	public void validate_username_logged_in_to_the_application(){
	    
	}
}
