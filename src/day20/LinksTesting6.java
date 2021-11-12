package day20;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksTesting6 {

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
			
			String linkName = allLinks.get(i).getText();
			
			System.out.println(linkName);
			
			String expURL=allLinks.get(i).getAttribute("href");
			
			System.out.println(expURL);
			
			allLinks.get(i).click();
			
			Thread.sleep(5000);
			
			String actURL=driver.getCurrentUrl();
			
			System.out.println(actURL);
			
			if(actURL.contains(expURL))
			{
				System.out.println(linkName+" is working");
			}
			else
			{
				System.out.println(linkName+" is not working");
			}
			driver.navigate().back();
			
			block=driver.findElement(By.xpath("//div[text()='Get to Know Us']/parent::div"));
			
			allLinks=block.findElements(By.tagName("a"));
			
			
		}
		
		
		driver.quit();

	}

}
