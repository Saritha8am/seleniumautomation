package day16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsInWebElement1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("reyaz009");
		
		System.out.println(driver.findElement(By.id("username")).getLocation().x);
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("login")).click();
		
		Thread.sleep(5000);
		
		System.out.println(driver.findElement(By.id("username_span")).isDisplayed());
		
		Thread.sleep(3000);
		
		System.out.println(driver.findElement(By.id("password_span")).getText());
		
		System.out.println(driver.findElement(By.id("password_span")).getRect().height);
		
		
		Thread.sleep(3000);
		
		System.out.println(driver.findElement(By.id("password_span")).getAttribute("class"));
		
		Thread.sleep(3000);
		
		System.out.println(driver.findElement(By.id("password_span")).getCssValue("font-family"));
		
		System.out.println(driver.findElement(By.id("password_span")).getTagName());
		
		Thread.sleep(3000);
		driver.findElement(By.id("username")).clear();
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}
