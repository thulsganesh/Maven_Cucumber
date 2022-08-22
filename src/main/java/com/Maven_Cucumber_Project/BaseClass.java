package com.Maven_Cucumber_Project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;

	public static Select s;

	public static Actions act;

	public static JavascriptExecutor js;

	// Browser SetProperty, Add Driver, Maximize Methods

	public static WebDriver launchBrowser(String browsername) {

		if (browsername.equalsIgnoreCase("Chrome")) {

			// 2 ways of setProperty,
			// 1Way
			// System.setProperty("webdriver.chrome.driver",
			// "C:\\Users\\LENOVO\\eclipse-workspace\\Maven_Project\\Driver\\chromedriver.exe");
			// 2Way
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//Driver//chromedriver104.exe");

			driver = new ChromeDriver();

			driver.manage().window().maximize();

		}

		else if (browsername.equalsIgnoreCase("InternetExplorer")) {

		}

		else if (browsername.equalsIgnoreCase("FireFox")) {

		}

		return driver;
	}

	// *********WEBDRIVER METHODS*************

	// get()

	public static void urlLaunch(String url) {

		driver.get(url);
	}

	// Get title()

	public static void getTitle(String title) {

		title = driver.getTitle();

		System.out.println("Get Title: " + title);

	}

	// Get current url()

	public static void getCurrentUrl(String url) {

		url = driver.getCurrentUrl();

		System.out.println("Get Current Url: " + url);

	}

	// ***********NAVIGATE METHODS*************

	// Navigate to()

	public static void navigateTo(String url) {

		driver.navigate().to(url);

	}

	// Navigate back()

	public static void navigateBack() {

		driver.navigate().back();

	}

	// Navigate forward ()

	public static void navigateForward() {

		driver.navigate().forward();

	}

	// Navigate refresh()

	public static void navigateRefresh() {

		driver.navigate().refresh();

	}

	// ******************MANAGE WINDOW***********************

	// close()

	public static void closeBrowser() {

		driver.close();
	}

	// quit()

	public static void quitBrowser() {

		driver.quit();
	}

	// ************************WEBELEMENT METHODS********************************

	// sendKeys()

	public static void passInput(WebElement element, String input) {

		element.sendKeys(input);

	}

	// click()

	public static void clickOnElement(WebElement element) {

		element.click();

	}

	// getText()

	public static void getText(String text, WebElement q) {

		text = q.getText();

		System.out.println(text);

	}

	// getAttribute()

	public static void getAttribute(WebElement e, String text, String attribute) {

		attribute = e.getAttribute(text);

		System.out.println(attribute);

	}

	// clear()

	public static void clear(WebElement e) {

		e.clear();

	}

	// isEnable()

	public static void isEnable(WebElement e) {

		boolean b = e.isEnabled();

		System.out.println(b);

	}

	// isDisplayed()

	public static void isDisplayed(WebElement e) {

		boolean b = e.isDisplayed();

		System.out.println(b);

	}

	// isSelected()

	public static void isSelected(WebElement e) {

		boolean b = e.isSelected();

		System.out.println(b);

	}

	// **************************Select*****************************

	// selectByVisibleText()

	public static void selectByVisibleText(WebElement element, String text) {

		s = new Select(element);

		s.selectByVisibleText(text);

	}

	// selectByValue()

	public static void selectByValue(WebElement element, String value) {

		s = new Select(element);

		s.selectByValue(value);

	}

	// getFirstSelectedOptions()

	public static void getFirstSelectedOptions(WebElement foption) {

		s = new Select(foption);

		foption = s.getFirstSelectedOption();

		String text = foption.getText();

		System.out.println(text);

	}

	// getAllSelectedOptions()

	public static void getAllSelectedOptions(WebElement e) {

		s = new Select(e);

		List<WebElement> alloption = s.getAllSelectedOptions();

		for (WebElement it : alloption) {

			System.out.println("Get All Selected Options " + it.getText());

		}

	}

	// Get all Deselect All

	public static void deselectAll(WebElement e) {

		s = new Select(e);

		s.deselectAll();
	}

	// isMultiple()

	public static void isMultiple(WebElement e) {

		s = new Select(e);

		boolean chk = s.isMultiple();

		System.out.println("This is Multiple Drop Down" + chk);

	}

	// size()

	public static void size(WebElement e) {

		s = new Select(e);

		List<WebElement> alloption = s.getOptions();

		int size = alloption.size();

		System.out.println(size);

	}

	// *******************Alert********************

	// Alert()

	public static void alert(Alert alert) {

		alert = driver.switchTo().alert();

		alert.accept();

	}

	// Action(All methods from action class)

	// contextClick()

	public static void actionsContextClick(WebElement element) {

		act = new Actions(driver);

		// Action must Called build(), perform() methods

		// Right Click on Code....

		act.contextClick(element).build().perform();

	}

	// click()

	public static void actionsclick(Actions act, WebElement element) {

		act = new Actions(driver);

		act.click(element).build().perform(); // Note This click(element) used to click LEFT CLICK

	}

	// doubleClick()

	public static void actionsDoubleClick(Actions act, WebElement element) {

		act = new Actions(driver);

		// Double Click on Button Code...

		act.doubleClick(element).build().perform();

	}

	// ***********************Frames****************

	// Opened One Frame

	public static void frame(WebElement frame) {

		driver.switchTo().frame(frame);

	}

	// Opened Morethan One Frames

	public static void frames(WebElement frame, WebElement innerframe, WebElement outerframe) {

		driver.switchTo().frame(frame);

		driver.switchTo().frame(innerframe);

		driver.switchTo().frame(outerframe);

	}

	// Close All The Frames

	public static void closeAllFrames() {

		driver.switchTo().defaultContent();

	}

	// Close Inner Frame Only

	public static void closeInnerFrame() {

		driver.switchTo().parentFrame();
	}

	// Close Outer Frame Only

	public static void closeOuterFrame() {

		driver.switchTo().defaultContent();

	}

	// Count Howmany Frames in the Program

	public static void frameCount(List<WebElement> totalframe, int count) {

		totalframe = driver.findElements(By.tagName("iframe"));

		count = totalframe.size();

		System.out.println("No of Frames in the Program: " + count);

	}

	// Robot()

	public static void robot(Actions act, WebElement element, Robot robo) throws InterruptedException, AWTException {

		act = new Actions(driver);

		act.contextClick(element).build().perform();

		robo = new Robot(); // Declare AWTException

		robo.keyPress(KeyEvent.VK_PAGE_DOWN); // VK----Virtual Key

		Thread.sleep(1000);

		robo.keyPress(KeyEvent.VK_PAGE_UP);

		Thread.sleep(1000);

		robo.keyPress(KeyEvent.VK_ENTER);

		Thread.sleep(1000);

	}

	// getwindowHandles()

	public static void windowsHandles() {
		
		Set<String> windowhandles = driver.getWindowHandles();
		
		for (String it : windowhandles) {
			
			String title = driver.switchTo().window(it).getTitle();
			
			System.out.println(title);
			
		}

	}

	//*********************DropDown**********************
	
	// Drop down ()

	public static void dropDown(Actions act, WebElement from, WebElement to) {

		act = new Actions(driver);

		act.dragAndDrop(from, to).build().perform();

	}
	
	//******************Check Box************************88

	// Check box()

	public static void checkBox(WebElement e) {

		e.click();
		
	}

	// getOptions()

	public static void getOptions() {

		List<WebElement> list = s.getOptions();

		for (WebElement it : list) {

			System.out.println(it.getText());

		}

	}

	// Wait()

	public static void waitMethod(int waittime) throws Exception {

		Thread.sleep(waittime);

	}

	// **********************JavaScriptEecutor********************

	// Scroll up and down()

	public static void scrollUpAndDown(int from, int to) {

		js = (JavascriptExecutor) driver;

		// Scroll Down

		js.executeScript("window.scrollBy(from, to)", "");

		// Again Scroll Up

		js.executeScript("window.scrollBy(from, to)", "");

	}
	
	//*************************Radio Button****************************

	// RadioButton()

	public static void radioButton(WebElement element) {

		element.click();

	}

	// ************TAKE SCREEN SHOT*****************

	// screenshot code

	public static void screenShot(String location) throws InterruptedException, IOException {

		Thread.sleep(5000);

		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

		File des = new File(location);

		// FileHandler.copy(source, des); ----------> Single ScreenShot

		FileUtils.copyFile(source, des);

	}

	// ***********************Windows Set Size**************************

	public static void windowsSetSize(Dimension dim) {

		dim = new Dimension(800, 600);

		driver.manage().window().setSize(dim);

	}

}
