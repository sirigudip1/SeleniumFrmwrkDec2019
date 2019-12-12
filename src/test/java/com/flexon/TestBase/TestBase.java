package com.flexon.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestBase {
	
	public WebDriver driver;
	
	@BeforeTest
	
	public void initializeThis() throws IOException
	{
		Properties prop = new Properties();
		
		 String projLoc = System.getProperty("user.dir");
		
		//gives entire path
		
		 //String configPath = projLoc +"/Resources"+"/data.properties";
		 String configPath = 
				 "/Users/siri/eclipse-workspace/com.flexon.selenium1/Resources/data.properties";
		 System.out.println("config pasth is ***"+configPath);
		 
		 //location of prop file
		
	FileInputStream fis = new FileInputStream(configPath);
	
	//loading file
		 prop.load(fis);
		 String browserName = prop.getProperty("browser");
		 String urlName = prop.getProperty("url");
		 int implicitwaitTime = Integer.parseInt(prop.getProperty("implicitWait"));
		 //System.setProperty(prop);
		 System.out.println("browser name"+browserName);
		 
		 if(browserName.equalsIgnoreCase("chrome")) 
		 {
			 System.setProperty
				("webdriver.chrome.driver", "/Users/siri/Documents/Flexon/Drivers/chromedriver");
				driver = new ChromeDriver();
				driver.get(urlName);
				
				driver.manage().timeouts().implicitlyWait(implicitwaitTime, TimeUnit.SECONDS);
				
			
		 }
		/* else if (browserName.equalsIgnoreCase("firefox"))
		 {
			 System.setProperty
				("webdriver.firefox.driver", "/Users/siri/Documents/Flexon/Drivers/firefoxdriver");
				driver = new FirefoxDriver();
				driver.get(urlName);
				
				driver.manage().timeouts().implicitlyWait(implicitwaitTime, TimeUnit.SECONDS);
		 }
		*/
	}
	
	@AfterTest
	
	public void endThis()
	{
		//driver.quit();
	}

}
