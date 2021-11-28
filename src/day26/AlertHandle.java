package day26;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertHandle {
	
	WebDriver driver;

	
	@BeforeMethod
	public void setUp()
	{
		
		driver=new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void alertHandleTest() throws InterruptedException
	{
		
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		
		//Thread.sleep(10000);
		
		Alert al=driver.switchTo().alert();
		
		System.out.println("Text on first alert \n"+al.getText());
		
		//this will click ok button on alert
		al.accept();
		
		
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("Reyaz");
		
		
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		
		
		//Thread.sleep(10000);
		
		
		al=driver.switchTo().alert();
		
		System.out.println("Text on second alert \n"+al.getText());
		
		//this will click ok button on alert
		al.accept();
		
				
		
		
		
		
		
	}
	
	@AfterMethod
	public void teardown()
	{
		
		driver.quit();
	}
	

}
