package Qvision.POMCapacitacion;

import static org.junit.Assert.*;



import org.junit.After;

import org.junit.Before;

import org.junit.Test;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;






public class LoginTest {

	

	WebDriver driver;

	

	@Before

	public void cargaInicial(){

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("http://sahitest.com/demo/training/login.htm");

	}



	@Test

	public void test() {

		LoginPage pageLogin = new LoginPage(driver);

		MainPage pageMain = new MainPage(driver);

		pageLogin.iniciarSesion("test", "secret");

		assertTrue("No inicio sesión", pageMain.validarIngreso());

	}

	

	@After

	public void cerrar(){

		driver.close();

	}



}