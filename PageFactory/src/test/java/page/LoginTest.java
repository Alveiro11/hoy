package page;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class LoginTest {
	
	WebDriver driver;
	LoginPage pageLogin;
	
	
	@Before
	public void initDriver() { 
		System.setProperty("Webdriver .chrome.driver" , "chromedriver.exe");
		driver = new ChromeDriver();
		pageLogin = PageFactory.initElements(driver, LoginPage.class);
		driver .get("http://sahitest.com/demo/training/login.htm");
				
	}
	
	@Test
	public void test() { 
		pageLogin.loginApp("test" , "secret");
		assertTrue(pageLogin.validatelogin());
		
	}	
				
	@After
	public void closedriver() { 
			driver.close();
			
				
		
	}

}
