import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alv {
	
	
	public static void main(String[] args) {
		 // TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://developsupport.com/qIntranet/login/index.php");
		 try {
		Key.escribir(driver , "username", "lruiz");
		Key.escribir(driver , "password", "Valerie");
		Key.click(driver, "loginbtn");

			 WebElement lblMensaje = driver
		    .findElement((By.xpath("//*[@id='region-main']/div[2]/div/div/div/div[1]/span")));
		  if (lblMensaje.isDisplayed()) {
		   System.out.println("Error usuario");
		  }

		 } catch (Exception e) {
		  // TODO: handle exception
		 }

		 driver.close();
		}}


}
