package com.mmt.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mmt.qa.base.BaseClass;

public class SignIn extends BaseClass{
	
	public SignIn(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//*[@id='username']" )
	WebElement login_input;
	
	@FindBy (xpath= "//span[contains(text(),'Continue')]")
	WebElement btn_continue;
	
	@FindBy (xpath= "//input[@id='password']")
	WebElement password_input;
	
	@FindBy (xpath= "//span[contains(text(),'Login')]")
	WebElement login_btn;
	
	public HomePage signIn(String username, String password) {
		login_input.sendKeys(username);
		btn_continue.click();
		password_input.sendKeys(password);
		login_btn.click();
		return new HomePage();
	}
	
}
