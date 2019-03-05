	
	
	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.File;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.support.FindBy;

	import com.ibm.icu.impl.number.PNAffixGenerator.Result;

	import net.serenitybdd.core.pages.PageObject;
	import net.serenitybdd.core.pages.WebElementFacade;
	import net.thucydides.core.annotations.DefaultUrl;
	
	public class empleo {

	@DefaultUrl("https://www.elempleo.com/co/Home/Index")
	public class SearchPage extends PageObject {
		
		WebDriver driver;

		// ------------------------- Elements to Search profession ----------------

		@FindBy(xpath = "/html/body/div[4]/section[1]/div[3]/div[1]/div[2]/div/form/div/div/span[1]/input")
		WebElementFacade txtCargo;

		@FindBy(xpath = "/html/body/div[4]/section[1]/div[3]/div[1]/div[2]/div/form/div/div/span[2]/input")
		WebElementFacade txtCiudad;

		@FindBy(xpath = "/html/body/div[4]/section[1]/div[3]/div[1]/div[2]/div/form/div/div/span[1]/div/div/div[1]")
		WebElementFacade sltCargo;

		@FindBy(xpath = "/html/body/div[4]/section[1]/div[3]/div[1]/div[2]/div/form/div/div/span[2]/div/div/div[2]")
		WebElementFacade sltCiudad;

		@FindBy(xpath = "//*[@id=\"politics_cookieCO\"]/div/div[2]/a[2]")
		WebElementFacade btnCockie;

		// ------------------ Elements to filters -------------------------------

		@FindBy(id = "salary3")
		WebElementFacade chkSalario;

		@FindBy(xpath = "/html/body/div[8]/div[4]/div[2]/div[1]/div/div[3]/div/div[2]/label")
		WebElementFacade radFecha;

		@FindBy(id = "WorkAreaFilter1")
		WebElementFacade sltArea;

		@FindBy(xpath = "/html/body/div[8]/div[4]/div[1]/div[3]")
		WebElementFacade tblListaOfertas;

		// ------------------------ Methods ---------------------------------

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
			sltArea.selectByVisibleText("Administrativa y Financiera");
		}

	}

	}
