package day13;

import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeLaunch {

	
	public static void main(String[] args) {
	
	    System.setProperty("webdriver.chrome.driver", "E:\\Saritha\\chromedriver.exe");
		new ChromeDriver();
		
	}
}
