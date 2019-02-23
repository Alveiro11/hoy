package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	
	
	@FindBy (name = "user")
	WebElement txtUsuario;
	
	@FindBy(name = "password")
	WebElement txtpassword;
	
	@FindBy(xpath = "/html/body/center/div/form/table/tbody/tr[3]/td[2]/input")
	WebElement btnlogin;
	
	@FindBy(id = "errorMessage")
	WebElement lblMessage;
	
	public void  loginApp(String username, String password) { 
		
		txtUsuario.sendKeys(username);
		txtpassword.sendKeys(password);
		btnlogin.click();
		
		
	}
	
	public boolean validatelogin() { 
		boolean isLogin = true;
		try { 
			if (lblMessage.isDisplayed()) { 
				isLogin = false;
				
			}
				
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return isLogin;
		
		
	}

}
