package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Page {

	public WebDriver driver;

	public Search_Page(WebDriver driver2) {

		this.driver = driver2;

		PageFactory.initElements(driver, this);

	}

	// search
	
	@FindBy(id = "Submit")
	private WebElement searchbtn;

	public WebElement getSearchBtn() {
		return searchbtn;
	}

}
