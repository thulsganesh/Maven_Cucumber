package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Form_Page {

	public WebDriver driver;

	public Booking_Form_Page(WebDriver driver2) {

		this.driver = driver2;

		PageFactory.initElements(driver, this);

	}

	// FormFilling to Book
	@FindBy(id = "first_name")
	private WebElement fname;

	@FindBy(id = "last_name")
	private WebElement lname;

	@FindBy(id = "address")
	private WebElement billadd;

	@FindBy(id = "cc_num")
	private WebElement ccard;

	@FindBy(id = "cc_cvv")
	private WebElement cvv;

	@FindBy(id = "book_now")
	private WebElement bookbtn;

	public WebElement getFirstName() {
		return fname;
	}

	public WebElement getLastName() {
		return lname;
	}

	public WebElement getBillAdd() {
		return billadd;
	}

	public WebElement getCardNo() {
		return ccard;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBookBtn() {
		return bookbtn;
	}

}
