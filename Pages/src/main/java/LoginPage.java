


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;



public class LoginPage {

	

	WebDriver driver;

	

	public LoginPage(WebDriver driver){

		this.driver = driver;

	}



	WebElement txtUsername;

	WebElement txtPassword;

	WebElement btnLogin;
	

	

	public void iniciarSesion(String user, String pass){

		txtUsername = driver.findElement(By.name("user"));

		txtUsername.sendKeys(user);

		txtPassword = driver.findElement(By.name("password"));

		txtPassword.sendKeys(pass);

		btnLogin = driver.findElement(By.xpath("/html/body/center/div/form/table/tbody/tr[3]/td[2]/input"));

		btnLogin.click();
		
	}	

	

}