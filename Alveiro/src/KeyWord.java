import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KeyWord {

	public void escribir(WebDriver driver, String identificador, String dato) {
		WebElement txtEscribe = driver.findElement(By.id(identificador));
		txtEscribe.sendKeys(dato);
	}

	public void tomarImagen(WebDriver driver){ 
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
			Long time = System.currentTimeMillis();
			try {
				FileUtils.copyFile(scrFile, new File("Screenshot"+time+" .png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	public void Clic(WebDriver driver , String identificador){
			WebElement btnClick = driver.findElement(By.id(identificador));
			btnClick.click();
		    tomarImagen(driven);
						
	}



}
