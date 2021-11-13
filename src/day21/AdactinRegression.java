package day21;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AdactinRegression {
	
	
	@Test(priority=2)
	public void login()
	{
		Assert.assertTrue(false);
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
	
	

}
