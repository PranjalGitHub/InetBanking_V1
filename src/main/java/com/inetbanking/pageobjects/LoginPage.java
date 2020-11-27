package com.inetbanking.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	
	public LoginPage (WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);	
	}
	
	@FindBy(name="uid")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;	
	
	@FindBy(name="btnLogin")
	WebElement login;
	
	public void setUsername(String uname) {
		username.sendKeys(uname);
	}
	
	public void setPassword(String psrd) {
		password.sendKeys(psrd);
	}
	
	public void Login() {
		login.click();
	}
}
