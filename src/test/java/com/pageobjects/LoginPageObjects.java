package com.pageobjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class LoginPageObjects extends BaseClass {
	
	 public LoginPageObjects() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement loginButton;
	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
}
