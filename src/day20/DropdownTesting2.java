package day20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTesting2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		//WebElement drop1=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		//Select s1=new Select(drop1);
		
		new Select(driver.findElement(By.xpath("//select[@id='searchDropdownBox']"))).selectByVisibleText("Books");
		
		//s1.selectByIndex(6);
		
		//s1.selectByValue("search-alias=stripbooks-intl-ship");
		
		
		//s1.selectByVisibleText("Books");
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Harry Potter");
		
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		
		
		driver.quit();

	}

}
