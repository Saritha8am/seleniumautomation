package day14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsInWebDriver1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//To start the browser
		WebDriver driver=new ChromeDriver();
		
		//To Launh the app
		driver.get("https://adactinhotelapp.com/");
		
		//To Maximize the window
		driver.manage().window().maximize();
		
		//to get Title
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		//System.out.println(driver.getPageSource());
		
		//findElement
		
		driver.findElement(By.id("username")).sendKeys("reyaz009");
		
		Thread.sleep(5000);
		
		driver.close();

	}

}
