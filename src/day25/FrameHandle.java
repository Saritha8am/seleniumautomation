package day25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FrameHandle {
	
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		driver=new ChromeDriver();
		
		driver.get("https://www.angelfire.com/super/badwebs/");
		
		driver.manage().window().maximize();
	}
	
	@Test
	public void frameHandleTest() throws InterruptedException
	{
		
		driver.switchTo().frame("contents");

		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//font[contains(text(),'Hate Frames Page')]/parent::a")).click();
		
		Thread.sleep(5000);
		
		//to switch to page 
		driver.switchTo().defaultContent();
		
		//to switch to other frame
		driver.switchTo().frame("main");
		
		driver.findElement(By.xpath("//img[contains(@src,'angelfire-freeAd')]")).click();
		
		Thread.sleep(5000);
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
