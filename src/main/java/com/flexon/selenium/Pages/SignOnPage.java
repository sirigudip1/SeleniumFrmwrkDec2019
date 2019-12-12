package com.flexon.selenium.Pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignOnPage {
	
	//initialize the logger calss
	
		public static final Logger logger = Logger.getLogger(SignOnPage.class.getName());
		
		public WebDriver driver;
		
		public SignOnPage(WebDriver driver)
		{
			this.driver=driver;
		}
		
		// Page Factory
		
		
		@FindBy(xpath = "//input[@name='userName']")
		public WebElement usernameTextbox;
		
		//pwd
		
		@FindBy(xpath="//input[@name='password']")
		public WebElement passWordTextbox;
		
		//login
		
		
		@FindBy(xpath = "//input[@name='login']")
		public WebElement loginButton;
		
		
		public void clickloginButton()
		{
			loginButton.click();
		}
		
}
