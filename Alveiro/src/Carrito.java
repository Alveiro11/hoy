import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Carrito {
	
	public static void main(String[] args) {
		 // TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://sahitest.com/demo/training/login.htm");
		 try {

		  WebElement txtUsuario = driver.findElement(By.id("user"));
		  txtUsuario.sendKeys("test");
		  WebElement txtClave = driver.findElement(By.id("password"));
		  txtClave.sendKeys("secret");
		  WebElement btnLogin = driver.findElement(By.id("loginbtn"));
		  btnLogin.click();
		  WebElement lblMensaje = driver
		    .findElement((By.xpath("//*[@id='region-main']/div[2]/div/div/div/div[1]/span")));
		  if (lblMensaje.isDisplayed()) {
		   System.out.println("Error usuario");
		  }

		 } catch (Exception e) {
		  // TODO: handle exception
		 }

		 driver.close();
		}


}
