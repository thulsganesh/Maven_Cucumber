package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Maven_Cucumber_Project.BaseClass;
import com.property.File_Reader_Manager;
import com.sdp.Page_Object_Manager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends BaseClass {

	public static Page_Object_Manager pom = new Page_Object_Manager(driver);    //pom. Error Will Show That Avoid used this line

	@Given("^user Must Launch The Url$")
	public void user_Must_Launch_The_Url() throws Throwable {

		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();	
		urlLaunch(url);
		
	}

	@When("^user Enter The Username In The Username Field$")
	public void user_Enter_The_Username_In_The_Username_Field() throws Throwable {

		String username = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUserName();
		passInput(pom.getInstanceLogin().getUserName(), username);
		
	}

	@When("^user Enter The Password In The Password Field$")
	public void user_Enter_The_Password_In_The_Password_Field() throws Throwable {

		String password = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPassword();
		passInput(pom.getInstanceLogin().getPass(), password);
		
	}

	@Then("^user Click The Login Button And It Navigates To The Search Hotel Page$")
	public void user_Click_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page() throws Throwable {

		clickOnElement(pom.getInstanceLogin().getLoginBtn());
		
	}

	@When("^user Select The Location In The Location Field$")
	public void user_Select_The_Location_In_The_Location_Field() throws Throwable {

		String loc = File_Reader_Manager.getInstanceFRM().getInstanceCR().getLocation();
		WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
		selectByVisibleText(location, loc);
	}

	@When("^user Select The Hotels In The Hotels Field$")
	public void user_Select_The_Hotels_In_The_Hotels_Field() throws Throwable {

		String ho = File_Reader_Manager.getInstanceFRM().getInstanceCR().getHotel();
		WebElement hotel = driver.findElement(By.xpath("//select[@id='hotels']"));
		selectByVisibleText(hotel, ho);
		
	}

	@When("^user Select The Room Type In The Room Type Field$")
	public void user_Select_The_Room_Type_In_The_Room_Type_Field() throws Throwable {

		String rt = File_Reader_Manager.getInstanceFRM().getInstanceCR().getRType();
		WebElement rtype = driver.findElement(By.xpath("//select[@id='room_type']"));
		selectByVisibleText(rtype, rt);
		
	}

	@When("^user Select The Number of Rooms In The Number of Rooms Field$")
	public void user_Select_The_Number_of_Rooms_In_The_Number_of_Rooms_Field() throws Throwable {

		String rn = File_Reader_Manager.getInstanceFRM().getInstanceCR().getRNo();
		WebElement rno = driver.findElement(By.xpath("//select[@id='room_nos']"));
		selectByVisibleText(rno, rn);
	
	}

	@When("^user Select The Adults Per Room In The Adults Per Room Field$")
	public void user_Select_The_Adults_Per_Room_In_The_Adults_Per_Room_Field() throws Throwable {

		String adt = File_Reader_Manager.getInstanceFRM().getInstanceCR().getAdult();
		WebElement adult = driver.findElement(By.xpath("//select[@id='adult_room']"));
		selectByVisibleText(adult, adt);

	}

	@When("^user Select The Children Per Room In The Children Per Room Field$")
	public void user_Select_The_Children_Per_Room_In_The_Children_Per_Room_Field() throws Throwable {

		String cld = File_Reader_Manager.getInstanceFRM().getInstanceCR().getChild();
		WebElement child = driver.findElement(By.xpath("//select[@id='child_room']"));
		selectByVisibleText(child, cld);
	
	}

	@Then("^user Click The Search Button And It Navigates To The Select Hotel Page$")
	public void user_Click_The_Search_Button_And_It_Navigates_To_The_Select_Hotel_Page() throws Throwable {

		clickOnElement(pom.getInstanceSearch().getSearchBtn());
	
	}

	@When("^user Click The Select Button$")
	public void user_Click_The_Select_Button() throws Throwable {

		clickOnElement(pom.getInstanceSearchResult().getSoption());
		
	}

	@Then("^user Click The Continue Button And It Navigates To The Book A Hotel Page$")
	public void user_Click_The_Continue_Button_And_It_Navigates_To_The_Book_A_Hotel_Page() throws Throwable {

		clickOnElement(pom.getInstanceSearchResult().getConBtn());
		
	}

	@When("^user Type The First Name In The First Name Field$")
	public void user_Type_The_First_Name_In_The_First_Name_Field() throws Throwable {

		String fn = File_Reader_Manager.getInstanceFRM().getInstanceCR().getFirstName();
		passInput(pom.getInstanceBookingForm().getFirstName(), fn);
		
	}

	@When("^user Type The Last Name In The Last Name Field$")
	public void user_Type_The_Last_Name_In_The_Last_Name_Field() throws Throwable {

		String ln = File_Reader_Manager.getInstanceFRM().getInstanceCR().getLastName();
		passInput(pom.getInstanceBookingForm().getLastName(),ln);
		
	}

	@When("^user Type Billing Address In The Billing Address Field$")
	public void user_Type_Billing_Address_In_The_Billing_Address_Field() throws Throwable {
	
		String add = File_Reader_Manager.getInstanceFRM().getInstanceCR().getAddress();
		passInput(pom.getInstanceBookingForm().getBillAdd(), add);
		
	}

	@When("^user Type Credit Card No In The Credit Card No Field$")
	public void user_Type_Credit_Card_No_In_The_Credit_Card_No_Field() throws Throwable {

		String cno = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCardNo();
		passInput(pom.getInstanceBookingForm().getCardNo(), cno);
		
	}

	@When("^user Select Credit Card Type In The Credit Card Type Field$")
	public void user_Select_Credit_Card_Type_In_The_Credit_Card_Type_Field() throws Throwable {

		String ct = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCType();
		WebElement ctype = driver.findElement(By.xpath("//select[@id='cc_type']"));
		selectByVisibleText(ctype, ct);
		
	}

	@When("^user Select Month In The Month Field$")
	public void user_Select_Month_In_The_Month_Field() throws Throwable {

		String m = File_Reader_Manager.getInstanceFRM().getInstanceCR().getMonth();
		WebElement mon = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		selectByVisibleText(mon, m);
		
	}

	@When("^user Select Year In The Year Field$")
	public void user_Select_Year_In_The_Year_Field() throws Throwable {

		String y = File_Reader_Manager.getInstanceFRM().getInstanceCR().getYear();
		WebElement yr = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		selectByVisibleText(yr, y);
		
	}

	@When("^user Type CVV Number In The CVV Number Field$")
	public void user_Type_CVV_Number_In_The_CVV_Number_Field() throws Throwable {

		String c = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCvv();
		passInput(pom.getInstanceBookingForm().getCvv(), c);

	}

	@Then("^user Click The Book Now Button And It Navigates To The Booking Confirmation$")
	public void user_Click_The_Book_Now_Button_And_It_Navigates_To_The_Booking_Confirmation() throws Throwable {
	
		clickOnElement(pom.getInstanceBookingForm().getBookBtn());
		
	}

	@When("^user Take ScreenShot To Save The ScreenShot Page In The ScreenShot Folder$")
	public void user_Take_ScreenShot_To_Save_The_ScreenShot_Page_In_The_ScreenShot_Folder() throws Throwable {

		Thread.sleep(3000);
		String scrsht = File_Reader_Manager.getInstanceFRM().getInstanceCR().getScreenShot();
		screenShot(scrsht);
		Thread.sleep(5000);
		
	}

	@Then("^user Click The Logout Button And It Navigates To The Successfully Logged Out Page$")
	public void user_Click_The_Logout_Button_And_It_Navigates_To_The_Successfully_Logged_Out_Page() throws Throwable {

		closeBrowser();
		
	}
	
}
