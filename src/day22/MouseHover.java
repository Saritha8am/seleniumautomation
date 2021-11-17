package day22;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MouseHover {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		
		driver.manage().window().maximize();
	}
	
	@Test
	public void mouseHoverTest()
	{
		
		Actions action=new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']")))
		.pause(5000)
		.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Macs (')]")))
		.pause(5000)
		.click()
		.build()
		.perform();
		
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
