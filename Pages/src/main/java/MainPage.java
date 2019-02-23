

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;



public class MainPage {



	WebDriver driver;



	public MainPage(WebDriver driver) {

		this.driver = driver;

	}



	public boolean validarIngreso() {

		boolean isValidate = false;

		try {

			WebElement lblTitle = driver.findElement(By.xpath("//*[@id='available']/h2"));

			if (lblTitle.isDisplayed()) {

				isValidate = true;

			}

		} catch (Exception e) {

			// TODO: handle exception

			System.out.println(e.getMessage());

		}

		return isValidate;

	}



}