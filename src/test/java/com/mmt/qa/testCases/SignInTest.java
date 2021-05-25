package com.mmt.qa.testCases;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mmt.qa.base.BaseClass;
import com.mmt.qa.pages.HomePage;
import com.mmt.qa.pages.SignIn;

public class SignInTest extends BaseClass {
	HomePage hp;
	SignIn si;
	Logger l1=Logger.getLogger(HomePageTest.class);
	
	@BeforeMethod 
	public void setup() {
		l1.info("****************************** Starting test cases execution  *****************************************");
		initialize_driver();
		hp= new HomePage();
		si= new SignIn();
	}

	@Test (priority=1)
	public void validate_signIn_test() {
		l1.info("****************************** validate test cases execution  *****************************************");

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
