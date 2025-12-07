package cognizant.test;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utility.PropertyReader;

public class SauseLogin {

	@Test
	public void loginSause() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\datta\\chromedriver-win64\\Chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(PropertyReader.getUrl());

		driver.manage().window().maximize();
		
		driver.findElement(By.id("user-name")).sendKeys(PropertyReader.getUsername());
		driver.findElement(By.id("password")).sendKeys(PropertyReader.getPassword());
		
		driver.findElement(By.id("login-button")).click();
	}
}
