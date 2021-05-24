package com.base;

import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.utilities.ExecelUtilities;

public class BaseClass extends ExecelUtilities{
	public static WebDriver driver;

	public static WebDriver launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\eclipse-cucumber-practise\\Cucumber_Practics\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

	 public static String get(String data) throws FileNotFoundException {
		Map<String, String> excelData = getExcelData();
		return excelData.get(data);
	}
	public static void urlLaunch(String url) {
		driver.get(url);
	}
	public static void send(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void click(WebElement element) {
		element.click();
	}

	public static void clear(WebElement element) {
		element.clear();
	}
	public static void dropDown(WebElement element,String value) {
		Select s = new Select(element);
		s.selectByVisibleText(value);
	}
	public static void doubleClick(WebElement element) {
		Actions a = new Actions(driver);
		a.doubleClick(element);
	}
	public static void JSclick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);

	}
	public static void scrollPage(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	public static void quit() {
		driver.quit();
	}
	public static void close() {
		driver.close();
	}
	public static String getText(WebElement element) {
		return element.getText();
	}
	public static String attributeValue(WebElement element,String attributename) {
		return element.getAttribute(attributename);

	}
}
