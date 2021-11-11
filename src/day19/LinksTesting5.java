package day19;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksTesting5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		WebElement block=driver.findElement(By.xpath("//div[text()='Get to Know Us']/parent::div"));
		
		List<WebElement> allLinks=block.findElements(By.tagName("a"));
		
		System.out.println("No of links in Module "+allLinks.size());
		
		for(int i=0;i<allLinks.size();i++)
		{
			
			System.out.println(allLinks.get(i).getText());
			
			allLinks.get(i).click();
			
			Thread.sleep(5000);
			
			System.out.println(driver.getCurrentUrl());
			
			driver.navigate().back();
			
			block=driver.findElement(By.xpath("//div[text()='Get to Know Us']/parent::div"));
			
			allLinks=block.findElements(By.tagName("a"));
			
			
		}
		
		
		driver.quit();

	}

}
