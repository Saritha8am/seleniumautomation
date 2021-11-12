package day20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownTesting1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//select[@id='searchDropdownBox']")).sendKeys("Books");
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Harry Potter");
		
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		Thread.sleep(3000);
		
		System.out.println(driver.getTitle());
		
		
		driver.quit();

	}

}
