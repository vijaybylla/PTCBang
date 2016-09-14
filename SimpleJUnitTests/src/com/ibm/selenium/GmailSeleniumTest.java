package com.ibm.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailSeleniumTest {

	public static void main(String[] args) {

		// for Firefox Browser
		WebDriver driver = new FirefoxDriver();
		
		// for Chrome Browser
		// WebDriver driver=new ChromeDriver();
		// webdriver.chrome.driver.
		
		driver.manage().window().maximize();
		driver.get("http://gmail.com");
		driver.findElement(By.id("Email")).sendKeys("vijaybylla2");
		driver.findElement(By.id("next")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.id("Passwd")));
		driver.findElement(By.id("Passwd")).sendKeys("Vijay@123#");
		driver.findElement(By.id("signIn")).click();
		// driver.close();

	}

}
