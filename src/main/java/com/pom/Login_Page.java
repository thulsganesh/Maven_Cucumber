package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	public WebDriver driver;

	// login

	@FindBy(id = "username")
	private WebElement uname;

	@FindBy(id = "password")
	private WebElement pass;

	@FindBy(id = "login")
	private WebElement loginbtn;

	public Login_Page(WebDriver driver2) {

		this.driver = driver2;

		PageFactory.initElements(driver, this);

	}

	public WebElement getUserName() {
		return uname;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLoginBtn() {
		return loginbtn;
	}
	
}
