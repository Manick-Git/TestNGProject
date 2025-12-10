package Test;

import org.testng.annotations.Test;

public class Day4 {
	
	@Test
	public void webloginHomeLoan()
	{
		System.out.println("webloginHomeLoan");
	}
	
	@Test(groups= {"Smoke"})
	public void MobileloginHomeLoan()
	{
		System.out.println("MobileloginHomeLoan");
	}
	
	@Test
	public void LoginAPIHomeLoan()
	{
		System.out.println("LoginAPIHomeLoan");
	}
}
