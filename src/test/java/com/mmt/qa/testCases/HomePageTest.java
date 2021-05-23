package com.mmt.qa.testCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mmt.qa.base.BaseClass;
import com.mmt.qa.pages.HomePage;
import com.mmt.qa.util.Utility;

import ExcelReadUtil.ExcelReadUtil;

public class HomePageTest extends BaseClass{
	HomePage hp;
	ExcelReadUtil er;
	
	
	@BeforeMethod 
	public void setup() {
		initialize_driver();
		hp=new HomePage();
		er= new ExcelReadUtil();
	}
	
	@Test
	public void validate_header_elements_test() {
		hp.click_btn_currency();
		String flights_actual= hp.validate_header_elements();
		Assert.assertEquals(flights_actual, er.getData("Sheet1",1,0));
		//String s2=er.getData("Sheet1",1,0);
		System.out.println(er.getData("Sheet1",1,0));
		//Object[] ob2= {s2};
//		System.out.println(hp.validate_header_elements().toString());
//		System.out.println(ob2.toString());
//		Assert.assertEquals(hp.validate_header_elements().toString(),ob2);
//		System.out.println("......................");
//		System.out.println(flights_actual);
//		
		
		
		//Utility.takeSnapShot(driver, "C:\\Users\\ambri\\OneDrive\\Desktop\\ScrShots\\1.png");
		driver.close();
	}

	
			
	
	
	
}
