package com.asp.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.ApplayFilterPom;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClassApplayFilter {
WebDriver driver;
ApplayFilterPom applayfilter;

@BeforeClass
public void launchBrowser() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.ebay.com/");
	applayfilter = new  ApplayFilterPom(driver);
	
}

@BeforeMethod
public void maximizeBrowser() {
	driver.manage().window().maximize();
}
@Test
public void tc() throws InterruptedException {
	applayfilter.enterInput("Electronics");
	Thread.sleep(2000);
	applayfilter.clickButton();
	Thread.sleep(2000);
	applayfilter.clickCategory();
	Thread.sleep(2000);
	applayfilter.clickFilter1();
	Thread.sleep(2000);
	applayfilter.clickOption1();
	Object abc = driver.findElement(By.xpath("//span[text()='Price']"));
	Thread.sleep(3000);
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",abc);
	applayfilter.clickFilter2();
	applayfilter.clickOption2();
	applayfilter.clickFilter3();
	applayfilter.clickOption3();
	applayfilter.clickApplay();	
}
@AfterMethod
public void refresh() throws InterruptedException {
	Thread.sleep(4000);
	driver.navigate().refresh();
}
@AfterClass
public void closebrowser() {
	driver.close();
}






























}
