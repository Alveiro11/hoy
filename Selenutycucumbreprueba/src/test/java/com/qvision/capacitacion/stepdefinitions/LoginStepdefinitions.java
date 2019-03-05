package com.qvision.capacitacion.stepdefinitions;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import com.qvision.capacitacion.steps.Loginstep;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginStepdefinitions {
	
	
	@Steps
	Loginstep stepLogin;
	
	
	@Given("^That i am in the login page$")
	public void thatIAmInTheLoginPage() {
	    
	}

	@When("^I type the data$")
	public void iTypeTheData(DataTable arg1) {
	    List<Map<String , String>> ListData = arg1.asMaps(String.class, String.class);
	    String user = ListData.get(0).get("user");
	    String password = ListData.get(1).get("pass");
	    stepLogin.login(user, password);
	}

	@Then("^I enter the application$")
	public void iEnterTheApplication() {
	    assert(stepLogin.validate());
	}

	
	
	
	

}
