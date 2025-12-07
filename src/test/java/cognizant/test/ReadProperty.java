package cognizant.test;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadProperty {
	public static WebDriver driver;

	@Test
	public void getProperty() throws IOException {
		Properties props = new Properties();

		FileReader reader = new FileReader("C:\\Users\\datta\\eclipse-workspace\\SeleniumJavaProject\\TestData.properties");
		props.load(reader);

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\datta\\chromedriver-win64\\Chromedriver.exe");

		driver = new ChromeDriver();

		driver.get(props.getProperty("url"));
	}
}
