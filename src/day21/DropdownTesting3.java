package day21;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownTesting3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();

		WebElement drop1=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
		List<WebElement> allItems=drop1.findElements(By.tagName("option"));
		
		System.out.println("NO of items in Dropdown "+allItems.size());
		
		for(int i=0;i<allItems.size();i++)
		{
			System.out.println(allItems.get(i).getText());
		}
		
		
		driver.quit();
		
		
		
		
		
	}

}
