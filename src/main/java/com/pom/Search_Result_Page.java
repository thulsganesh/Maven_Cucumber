package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Result_Page {

	public WebDriver driver;

	public Search_Result_Page(WebDriver driver2) {

		this.driver = driver2;

		PageFactory.initElements(driver, this);

	}

	// Search Result to click Option Btn

	@FindBy(id = "radiobutton_0")
	private WebElement soption;

	@FindBy(id = "continue")
	private WebElement conbtn;

	public WebElement getSoption() {
		return soption;
	}

	public WebElement getConBtn() {
		return conbtn;
	}

}
