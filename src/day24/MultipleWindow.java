package day24;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleWindow {
	
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		driver=new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
	}
	
	@Test
	public void multipleWindowTest() throws InterruptedException 
	{
		
		String homeWindowId=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//img[contains(@src,'google-play')]")).click();
		
		Set<String> windowIds=driver.getWindowHandles();
		
		Iterator<String> it=windowIds.iterator();
		
		while(it.hasNext())
		{
			
			driver.switchTo().window(it.next());
			
			try
			{
			driver.findElement(By.xpath("//a[text()='See more']")).click();
			break;
			}
			catch(NoSuchElementException e)
			{
				
				
			}
			
		}
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//img[contains(@src,'google-play')]")).click();
		
		 windowIds=driver.getWindowHandles();
		
		 it=windowIds.iterator();
		
		while(it.hasNext())
		{
			
			driver.switchTo().window(it.next());
			
			try
			{
			driver.findElement(By.xpath("//a[text()='See more']")).click();
			break;
			}
			catch(NoSuchElementException e)
			{
				
				
			}
			
		}
		
		Thread.sleep(5000);
		
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}


}
