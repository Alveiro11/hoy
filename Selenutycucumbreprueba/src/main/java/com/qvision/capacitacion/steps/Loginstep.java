package com.qvision.capacitacion.steps;

import com.qvision.capacitacion.pages.Loginpage;

import net.thucydides.core.annotations.Step;

public class Loginstep {
	
	
	Loginpage pageLogin;
	
	@Step
	public void openUrl() { 
		
		
		}
	
	@Step
	public void login(String user, String password) { 
		pagelogin.login(user, password);
		
	}
	
	@Step
	public boolean validate() { 
		return pagelogin.validateMessage();
		
	}
	

}
