package com.ibm.selenium;

import org.junit.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumWebDriverTest {
	
	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
	}

	// Search using keyword through GMail

	@Test
	public void testtestclass() throws Exception {
		// Open Home Page
		driver.get("http://www.gmail.com");
		// Enter text in search box
		driver.findElement(By.id("Email")).sendKeys("vijaybylla2");
		Thread.sleep(1000);
		
		// Click Search button
		driver.findElement(By.id("next")).click();		
		Thread.sleep(10000);
		
		driver.findElement(By.id("Passwd")).sendKeys("Vijay@123#");
		Thread.sleep(10000);
		
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(10000);
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
}