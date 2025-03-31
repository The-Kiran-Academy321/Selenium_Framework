package com.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPage_Testcases {

	@Test
	void testValidCredentail() {
		WebDriver driver = new ChromeDriver();
		driver.get(
				"file:///D:/DATA_BACKUP/Downloads/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		Assert.assertEquals(driver.getTitle(), "Welcome The Kiran Academy"); 
	}
	@Test
	void testInValidCrential()
	{
		WebDriver driver = new ChromeDriver();
		driver.get(
				"file:///D:/DATA_BACKUP/Downloads/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("ABC@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();
		String errorText=driver.findElement(By.id("email_error")).getText();
		Assert.assertEquals(errorText, "Invalid User Name!!!");
	}
}
