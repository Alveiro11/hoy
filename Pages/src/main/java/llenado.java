import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.mustache.Value;

public class llenado {
	
	WebDriver driver;
	
	public llenado(WebDriver driver){

		this.driver = driver;

	}

	WebElement txtCore;

	WebElement txtRuby;

	WebElement txtPython;
			
			
			
			public void llenadocarrito(String q1, String q2, String q3) { 
				
				
				txtCore = driver.findElement(By.name("q1"));

				txtCore.sendKeys(q1);
				
				txtRuby = driver.findElement(By.name("q2"));

				txtRuby.sendKeys(q2);
				
				txtPython = driver.findElement(By.name("q3"));

				txtPython.sendKeys(q3);
				
				Value = driver.findElement(By.Value("Add"));
				
				Value.click();

			}


}