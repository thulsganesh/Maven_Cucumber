package com.property;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {

	public static Properties p;

	// Configuration_Reader() Method used all get Method this the common one so that
	// one create one new method
	public Configuration_Reader() throws IOException {

		File f = new File(
				"C:\\Users\\LENOVO\\eclipse-workspace\\Maven_Project\\src\\main\\java\\com\\property\\Adactin.properties");

		FileInputStream fis = new FileInputStream(f);

		p = new Properties(); // Local variable ---> Static Variable

		p.load(fis);

	}

	// geturl
	public String getUrl() throws IOException {

//		File f = new File("C:\\Users\\LENOVO\\eclipse-workspace\\Maven_Project\\src\\main\\java\\com\\property\\Adactin.properties");
//		
//		FileInputStream fis = new FileInputStream(f);
//		
//		Properties p = new Properties();
//		
//		p.load(fis);

		String url = p.getProperty("url"); // Key---->url --->Adactin.property

		return url;

	}

	public String getUserName() {

		String username = p.getProperty("username");

		return username;

	}

	public String getPassword() {

		String password = p.getProperty("password");

		return password;

	}

	public String getLocation() {

		String location = p.getProperty("location");

		return location;

	}

	public String getHotel() {

		String hotel = p.getProperty("hotel");

		return hotel;

	}
	
	public String getRType() {
		
		String rtype = p.getProperty("rtype");
		
		return rtype;
		
	}
	
	public String getRNo() {
		
		String rno = p.getProperty("rno");
		
		return rno;
		
	}
	
	public String getAdult() {
		
		String adult = p.getProperty("adult");
		
		return adult;
		
	}
	
	public String getChild() {
		
		String child = p.getProperty("child");
		
		return child;
		
	}
	
	public String getFirstName() {
		
		String fname = p.getProperty("firstname");
		
		return fname;
		
	}
	
	public String getLastName() {
		
		String lname = p.getProperty("lastname");
		
		return lname;
	
	}
	
	public String getAddress() {
		
		String address = p.getProperty("address");
		
		return address;
	
	}
	
	public String getCardNo() {
		
		String cardno = p.getProperty("cardno");
		
		return cardno;
		
	}
	
	public String getCType() {
		
		String ctype = p.getProperty("ctype");
		
		return ctype;
		
	}
	
	public String getMonth() {
		
		String mon = p.getProperty("month");
		
		return mon;
		
	}
	
	public String getYear() {
		
		String yr = p.getProperty("year");
		
		return yr;
		
	}

	public String getCvv() {
		
		String cvv = p.getProperty("cvv");
		
		return cvv;
		
	}
	
	public String getScreenShot() {
		
		String screenshot = p.getProperty("screenshot");
		
		return screenshot;
		
	}
	
}
