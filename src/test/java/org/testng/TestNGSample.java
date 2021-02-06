package org.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGSample {
	WebDriver driver;

	@BeforeClass
	private void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

	}

	@Test
	private void tc1() {
		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys("Ramesh");

		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("Veer");

		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();

	}

	@Test(priority=7,enabled=true,invocationCount=3)
	private void tc2() {
		System.out.println("Test2");

	}
	@Test(priority=11,enabled=false,invocationCount=2)
	private void tc3() {
		System.out.println("Test 3");

	}

	

}
