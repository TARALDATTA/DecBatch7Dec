package cognizant.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FBLogin {

	public static WebDriver driver;

	@BeforeTest
	public void Login() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\datta\\chromedriver-win64\\Chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https:\\www.facebook.com");

		driver.manage().window().maximize();
		
		

	}

	@Test
	public void enterCredentials() {
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}

	@AfterTest
	public void logout() {
		driver.close();
	}

}
