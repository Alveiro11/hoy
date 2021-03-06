package Qvision.registro;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistroPage {
	
	
	

	@FindBy (name = "user")
	WebElement txtUsername;
	
	@FindBy(name = "password")
	WebElement txtpassword;
	
	@FindBy(name = "password2")
	WebElement txtpassword2;
	
	@FindBy(name = "Gender")
	WebElement txtGender;

	@FindBy(name = "Address")
	WebElement txtAddress;
	
	@FindBy(name = "BillinAddress")
	WebElement txtBillinAddress;
	
	@FindBy(name = "State")
	WebElement txtState;
	
	@FindBy(name = "Checkbox")
	WebElement txtCheckbox;
	
	
	@FindBy(name = "Register")
	WebElement txRegister;
	
	public void  Registro (String username, String password, String password2, String Gender,String Address, String BillinAddress, String State, String Checkbox, String Register) { 
		
		
		txtUsername.sendKeys(username);
		txtpassword.sendKeys(password);
		txtpassword2.sendKeys(password2);
		txtGender.sendKeys(Gender);
		txtAddress.sendKeys(Address);
	    txtBillinAddress.sendKeys(BillinAddress);
	    txtState.sendKeys(State);
	    txtCheckbox.sendKeys(Checkbox);
	    txRegister.sendKeys(Register);
	    
	    
	    
		
		
				
	}


}
