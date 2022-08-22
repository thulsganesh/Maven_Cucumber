package com.runner;

import org.junit.AfterClass;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Maven_Cucumber_Project.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature", glue= "com/stepdefinition/Step_Definition.java")

public class Test_Runner{

	public static WebDriver driver;			//driver=Null

	@BeforeClass
	public static void setUp() {

		driver = BaseClass.launchBrowser("chrome");
		
	}
	
	@AfterClass
	public static void tearDown() {

		BaseClass.closeBrowser();
		
	}
	
}
