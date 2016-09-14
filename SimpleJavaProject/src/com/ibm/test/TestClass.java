package com.ibm.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestClass {

	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
	}

	// Search using keyword through Google search

	@Test
	public void testclass() throws Exception {
		// Open Home Page
		driver.get("http://gmail.com");
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
