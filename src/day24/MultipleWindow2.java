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

public class MultipleWindow2 {
	
	
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
		
		switchToWindow("Adactin Hotel App - Apps on Google Play");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[text()='See more']")).click();
		
		Thread.sleep(5000);
		
		driver.switchTo().window(homeWindowId);
		
		driver.findElement(By.xpath("//img[contains(@src,'ios-button')]")).click();
		
		switchToWindow("TestFlight - Apple");
		
		driver.findElement(By.xpath("//a[text()='Terms of Service' and contains(@href,'apple.com')]")).click();
		
		Thread.sleep(5000);
		
		switchToWindow("Android Apps on Google Play");
		
		Thread.sleep(5000);
		
		
	}
	
	private void switchToWindow(String title) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		Set<String> allWindowIds=driver.getWindowHandles();
		Iterator<String> it=allWindowIds.iterator();
		
		while(it.hasNext())
		{
			
			driver.switchTo().window(it.next());
			
			if(title.equals(driver.getTitle()))
			{
				Thread.sleep(5000);
				break;
			}
			
			
		}
		
		
	}

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}


}
