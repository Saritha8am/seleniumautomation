package day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsInWebDriver2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		System.out.println(driver.getWindowHandle());
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//img[contains(@src,'google-play')]")).click();
		
		Thread.sleep(3000);
		
		System.out.println(driver.getWindowHandles());
		
		Thread.sleep(5000);
		
		driver.close();
		
		Thread.sleep(5000);
		
		driver.quit();
		
				

	}

}
