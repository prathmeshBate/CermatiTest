package com.asp.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.ApplayFilterPom;
import POM.CompaireStringPom;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClassCompaireString {
	
WebDriver driver;
CompaireStringPom compairestringpom;

@BeforeClass
public void launchBrowser() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.ebay.com/");
	compairestringpom = new  CompaireStringPom(driver);
}

@BeforeMethod
public void maximizeBrowser() {
	driver.manage().window().maximize();
}
@Test
public void tc() throws InterruptedException {
	compairestringpom.enterInput("Mackbook");
	 Thread.sleep(3000);
	compairestringpom.clickSearch();
	 Thread.sleep(3000);
	compairestringpom.clickCategory();
	 Thread.sleep(3000);
	compairestringpom.clickSelectCategory();
	 Thread.sleep(3000);
	compairestringpom.clickSelectAnotherCategory();
    Thread.sleep(3000);
	 
	 String str="Macbook";
	WebElement s= driver.findElement(By.xpath("//span[text()='Apple Macbook Pro 13\" Laptop | UPGRADED i5 16GB RAM | 1TB HD | MacOS | WARRANTY']"));
	String str2="Apple Macbook Pro 13";
	
System.out.println(str.contains(str2));
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
