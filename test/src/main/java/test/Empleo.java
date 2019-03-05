package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

public class Empleo {
	
	@DefaultUrl("https://www.elempleo.com/co/Home/Index")
	public class SearchPage extends PageObject {
		
		WebDriver driver;

	

		@FindBy(xpath = "/html/body/div[4]/section[1]/div[3]/div[1]/div[2]/div/form/div/div/span[1]/input")
		WebElement txtCargo;

		@FindBy(xpath = "/html/body/div[4]/section[1]/div[3]/div[1]/div[2]/div/form/div/div/span[2]/input")
		WebElement txtCiudad;

		@FindBy(xpath = "/html/body/div[4]/section[1]/div[3]/div[1]/div[2]/div/form/div/div/span[1]/div/div/div[1]")
		WebElement sltCargo;

		@FindBy(xpath = "/html/body/div[4]/section[1]/div[3]/div[1]/div[2]/div/form/div/div/span[2]/div/div/div[2]")
		WebElement sltCiudad;

		@FindBy(xpath = "//*[@id=\"politics_cookieCO\"]/div/div[2]/a[2]")
		WebElement btnCockie;

		

		@FindBy(id = "salary3")
		WebElement chkSalario;

		@FindBy(xpath = "/html/body/div[8]/div[4]/div[2]/div[1]/div/div[3]/div/div[2]/label")
		WebElement radFecha;

		@FindBy(id = "WorkAreaFilter1")
		WebElement sltArea;

		@FindBy(xpath = "/html/body/div[8]/div[4]/div[1]/div[3]")
		WebElement tblListaOfertas;

	

		public void buscarCargo(String cargo, String ciudad) {
			btnCockie.click();
			txtCargo.sendKeys(cargo);
			sltCargo.click();
			txtCiudad.sendKeys(ciudad);
			sltCiudad.click();
		}

		public void filter() {
			chkSalario.click();
			try {
				Thread.sleep(5 * 1000);
			} catch (Exception e) {
				System.out.println(e);
			}
			radFecha.click();
			try {
				Thread.sleep(5 * 1000);
			} catch (Exception e) {
				System.out.println(e);
			}
			sltArea.selectByVisibleText("Servicio al Cliente");
		}

	    } 



}




}
