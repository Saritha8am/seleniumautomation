package day28;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebTable {
	
	WebDriver driver;

	@BeforeMethod
	public void setUp() {

		driver = new ChromeDriver();

		driver.get("https://www.timeanddate.com/worldclock/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

	@Test
	public void webTableTest() throws InterruptedException {

		
		List<WebElement> allLinks=driver.findElements(By.xpath("//table[@class='zebra fw tb-theme']/tbody/descendant::tr/td[1]"));
		
		for(WebElement link:allLinks)
		{
			System.out.println(link.getText());
		}
		
	}


}
