package day27;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Waits3 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		
		driver=new ChromeDriver();
		
		driver.get("https://www.zoho.com/signup.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	@Test
	public void waitsTest() throws InterruptedException
	{
		
		
		//WebDriverWait myWait=new WebDriverWait(driver,30);
		
		FluentWait<WebDriver> myWait=new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(500));
		
		myWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[@id='signup-termservice']"))));
		myWait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[@id='signup-termservice']"))));
		driver.findElement(By.xpath("//span[@id='signup-termservice']")).click();
		
		Thread.sleep(5000);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
