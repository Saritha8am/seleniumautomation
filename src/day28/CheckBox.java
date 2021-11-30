package day28;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckBox {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {

		driver = new ChromeDriver();

		driver.get("https://echoecho.com/htmlforms09.htm");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

	@Test
	public void waitsTest() throws InterruptedException {

		List<WebElement> checkBoxes=driver.findElements(By.xpath("(//td[@class='table5'])[2]/child::input"));
		
		for(WebElement checkbox:checkBoxes)
		{
			
			if(!checkbox.isSelected())
			{
				checkbox.click();
				
				Thread.sleep(5000);
				
			}
			
		}
		
		for(WebElement checkbox:checkBoxes)
		{
			System.out.println(checkbox.getAttribute("value")+"--------"+checkbox.getAttribute("checked"));
		}
		
		
		
		
		
		
		
		
		
		
	
	}

}
