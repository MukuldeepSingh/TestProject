package com.mmt.qa.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mmt.qa.util.Utility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;		//as no need to create object
	public static Properties prop;		
	//config.properties= used to store envt variables 
	
	
	public BaseClass() 		// why we need cont = pre requisite , why public= to make this accessible everywhere
	{
		try {
		prop=new Properties();
		FileInputStream fip=new FileInputStream("C:\\Users\\10294465\\git\\mmt\\src\\main\\java\\com\\mmt\\qa\\config\\config.properties");
		prop.load(fip);	}
		
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void initialize_driver () {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();			// initialization of driver using chromeDriver class
											//We are storing object of chromedriver in ref variable of WebDriver
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Utility.pageload_timeout,TimeUnit.SECONDS);	
		driver.manage().timeouts().implicitlyWait(Utility.implecit_wait, TimeUnit.SECONDS );	
		
		}
	
	

	

	
	
	
	
	
	

}
