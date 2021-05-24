package com.stepdef;

import com.base.BaseClass;
import com.pageobjects.ToolsQaTextBoxObjects;

import io.cucumber.java.en.*;

public class ToolsQaStepDef extends BaseClass{
	ToolsQaTextBoxObjects t;
	@Given("User launch the toolqa application url")
	public void user_launch_the_toolqa_application_url() {
		 launchBrowser();
	       urlLaunch("https://demoqa.com/text-box");

	}

	@When("User trying to enter the {string}")
	public void user_trying_to_enter_the(String firstname) {
		t=new ToolsQaTextBoxObjects();
    	send(t.getUsername(), firstname);

	}

	@Then("User enter the mail {string}")
	public void user_enter_the_mail(String mailid) {
		send(t.getEmail(), mailid);
	}

	@When("User enter the current address {string}")
	public void user_enter_the_current_address(String redentialaddress) {
		send(t.getCurrentAddress(), redentialaddress);

  
	}

	@Then("User enter the permenent address {string}")
	public void user_enter_the_permenent_address(String permenentaddress) {
		 send(t.getPermanentAddress(), permenentaddress);
	}

	@When("User click the submit button")
	public void user_click_the_submit_button() throws InterruptedException {
		scrollPage(t.getSubmitButton());
		Thread.sleep(3000);
		click(t.getSubmitButton());

	}

	@Then("User verify the entered details are showed correctly")
	public void user_verify_the_entered_details_are_showed_correctly() {
	   
	}
	 
}
