package day21;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AdactinRegression {
	
	
	@Test(priority=2)
	public void login()
	{
		
		//Assert.assertTrue(false);
		System.out.println("Login Successfull...");
		
	}
	
	
	@Test(priority=1)
	public void registration()
	{
		
		System.out.println("Registration Successfull..");
		
	}
	
	
	@Test(priority=3,dependsOnMethods="login")
	public void bookAFlight()
	{
		
		System.out.println("Flight Ticket booked ... ");
		
	}
	
	@BeforeMethod
	public void setUp()
	{
		System.out.println("Browser started");
		System.out.println("App launched");
		
	}
	
	@AfterMethod
	public void teardown()
	{
		System.out.println("Browser closed");
	}
	
	
	
	
	
	
	
	

}
