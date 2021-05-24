package com.stepdef;

import java.io.FileNotFoundException;


import com.base.BaseClass;

import com.pageobjects.LoginPageObjects;
import com.utilities.ExecelUtilities;

import io.cucumber.java.en.*;

public class AdactinStepDefen extends BaseClass{
	
	LoginPageObjects ig;
	
	@Given("User launch the application {string}")
	public void user_launch_the_application(String url) throws FileNotFoundException {
		
		launchBrowser();
		urlLaunch(get(url));
	  
	}

	@When("User trying to enter the {string} and {string}")
	public void user_trying_to_enter_the_and(String username, String password) throws FileNotFoundException {
		 ig = new LoginPageObjects();
	 send(ig.getUsername(), get(username));
	 send(ig.getPassword(), get(password));
	}

	@Then("User click the login button")
	public void user_click_the_login_button() {
	 click(ig.getLoginButton()); 
	 quit();
	}

	@When("User verify the application is in homoe page")
	public void user_verify_the_application_is_in_homoe_page() {
	  
	}

}
