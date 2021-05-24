package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class ToolsQaTextBoxObjects extends BaseClass{
	public ToolsQaTextBoxObjects() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="userName")
	private WebElement username;
	
	@FindBy(xpath="//input[@id='userEmail']")
	private WebElement email;
	
	@FindBy(xpath="//textarea[@id='currentAddress']")
	private WebElement currentAddress;
	
	@FindBy(id="permanentAddress")
	private WebElement permanentAddress;
	
	@FindBy(id="submit")
	private WebElement submitButton;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getCurrentAddress() {
		return currentAddress;
	}

	public WebElement getPermanentAddress() {
		return permanentAddress;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}
	
}
