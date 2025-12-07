package cognizant.test;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PublicisSapient {

	public static void main(String[] args) {

		WebDriver driver = null;
		WebDriverWait wait=new WebDriverWait(driver,10);
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("datta")));
		
		WebElement element2= driver.findElement(By.xpath("//input[@id='test']"));
		Select sc=new Select(element2);
		sc.selectByVisibleText("India");
		
		WebElement checkbox=driver.findElement(By.id("cst"));
		if(!checkbox.isSelected())
		{
			checkbox.click();
		}
		
		Actions act=new Actions(driver);
		act.contextClick(driver.findElement(By.id("dda"))).perform();
		act.doubleClick(checkbox).perform();
		act.moveToElement(checkbox).perform();
		
		//keyboard action
		act.sendKeys(Keys.DOWN).perform();
		act.keyDown(Keys.CONTROL).sendKeys(args);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Alerts
		
		Alert alert=driver.switchTo().alert();
		alert.accept();
		alert.sendKeys("datta");
		
		//frame
		driver.switchTo().frame(2);
		driver.switchTo().defaultContent();
		
		//windows
		String parent=driver.getWindowHandle();
		
		Set<String> childwindow=driver.getWindowHandles();
		
		for(String win: childwindow)
		{
			System.out.println(win);
		}
	}

}
