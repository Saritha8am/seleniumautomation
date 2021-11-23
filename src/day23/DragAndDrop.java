package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAndDrop {
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
	}
	
	@Test
	public void dragAndDropTest() throws InterruptedException
	{
		
		driver.switchTo().frame(0);
		
		Actions action=new Actions(driver);
		
		Thread.sleep(5000);
		
		
		action.dragAndDrop(driver.findElement(By.xpath("//div[@id='draggable']")), 
				driver.findElement(By.xpath("//div[@id='droppable']")))
		      .build()
		      .perform();
		
		Thread.sleep(5000);
		
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}


}
