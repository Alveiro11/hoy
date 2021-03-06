

import static org.testng.AssertJUnit.assertTrue;
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
		
		assertTrue("Se inicipo sesion correctamente", pageMain.validarIngreso());

	}

	

	@Test

	public void llenado() {

	    llenado llenado = new llenado(driver);
	    
	    MainPage pageMain = new MainPage(driver);

		llenado.llenadocarrito("1", "2", "2");

	}
	

	@After

	public void cerrar(){

		driver.close();

	} }



