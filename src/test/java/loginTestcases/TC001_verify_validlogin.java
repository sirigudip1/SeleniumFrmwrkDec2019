package loginTestcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
//importing Test Base and Signon page class from other packages
import com.flexon.TestBase.TestBase;
import com.flexon.selenium.Pages.SignOnPage;

public class TC001_verify_validlogin extends TestBase {
	
	
	
	//private static final Logger log = Logger
	
	@Test
	public void validLogin()
	{
		System.out.println("Print this ..I am in TC001 java class");
		SignOnPage sp = PageFactory.initElements(driver, SignOnPage.class);
		sp.usernameTextbox.sendKeys("Siritest4");
		sp.passWordTextbox.sendKeys("Siritest456");
		sp.loginButton.click();
		//Assert.assertTrue(driver.getTitle().contains("Find a Flight: Mercury Tours:"));
	}
	
	

}
