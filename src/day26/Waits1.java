package day26;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Waits1 {
	
	WebDriver driver;

	
	@BeforeMethod
	public void setUp()
	{
		
		driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
				
	}
	
	@Test
	public void alertHandleTest() throws InterruptedException
	{
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		driver.findElement(By.xpath("//a[@id='welcome']")).click();
		
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
		Thread.sleep(10000);
		
		
		
		
		
	}
	
	@AfterMethod
	public void teardown()
	{
		
		driver.quit();
	}
	

}
