package com.mmt.qa.testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mmt.qa.base.BaseClass;
import com.mmt.qa.pages.HomePage;
import com.mmt.qa.pages.SignIn;

public class SignInTest extends BaseClass {
	HomePage hp;
	SignIn si;
	
	
	@BeforeMethod 
	public void setup() {
		initialize_driver();
		hp= new HomePage();
		si= new SignIn();
	}

	@Test (priority=1)
	public void validate_signIn_test() {
		//Actions ac= new Actions (driver);
		//ac.doubleClick();
		hp.click_mmt_logo();
		hp.click_btn_signIn();
		si.signIn("ambrishmalwa@gmail.com", "Ambrish123!@#");		
	}
	
	@AfterMethod
	public void teardown() {
		//driver.close();
	}
	
	
	
}
