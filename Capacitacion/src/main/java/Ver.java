import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ver {
	


	public static void main(String[] args, String data) {
		 // TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
	   Ver	// WebDriver driver = new ChomeDriver();
		 file data = new File ("data.txt");
		 FileReader fr;
		 
		 try {
			 
			 fr = new FileReader(data);
			 BufferedReader br = new BufferedReader (fr);
			 String linea = "";
			 while((linea=br.readLine())!= null) {
				
				 try {
					  String[] datos = linea.split(",");
					  driver.get("http://developsupport.com/qIntranet/login/index.php");
					  WebElement txtUsuario = driver.findElement(By.id("username"));
					  txtUsuario.sendKeys(datos[0]);
					  WebElement txtPassword = driver.findElement(By.id("password"));
					  txtPassword.sendKeys(datos[1]);
					  WebElement btnLogin = driver.findElement(By.id("loginbtn"));
					  btnLogin.click();
					  WebElement lblMensaje = driver
						.findElement((By.xpath("//*[@id='region-main']/div[2]/div/div/div/div[1]/span")));
							  if (lblMensaje.isDisplayed()) {
							   System.out.println("Error de Usuario y Contrasena");
				              }
					 
					 
				 } catch (NoSuchElementException e1) { 
					 
				 }
		    }
				 
				 
		} catch (IOException e1) { 
			
			e1.printStackTrace();
		}
		driver.close();
	}

}

}