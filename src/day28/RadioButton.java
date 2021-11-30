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

public class RadioButton {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {

		driver = new ChromeDriver();

		driver.get("https://echoecho.com/htmlforms10.htm");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

	@Test
	public void waitsTest() throws InterruptedException {

		List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@name='group1']"));

		for (int i = 0; i < radioButtons.size(); i++) {
			
			radioButtons.get(i).click();
			
			Thread.sleep(5000);
			
			for(int j=0;j< radioButtons.size();j++)
			{
			System.out.println(radioButtons.get(j).getAttribute("value") + "---------"
					+ radioButtons.get(j).getAttribute("checked"));
			
			}
		}

		/*
		 * for(WebElement radiobutton:radioButtons) {
		 * System.out.println(radiobutton.getAttribute("value")+"-------"+radiobutton.
		 * getAttribute("checked")); }
		 */
	}

}
