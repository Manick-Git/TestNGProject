package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Day3 {
	
	@BeforeClass
	public void BeforeAllClasses()
	{
		System.out.println("Before all the methods in Class");
	}
	
	@AfterClass
	public void AfterAllClasses()
	{
		System.out.println("After all methods in Class");
	}
	
	@Parameters({"CURL"})
	@Test
	public void WebloginCarLoan(String carl)
	{
		System.out.println("WebloginCarLoan");
		System.out.println(carl);
	}
	
	@Test
	public void MobileloginCarLoan()
	{
		System.out.println("MobileloginCarLoan");
	}
	
	@BeforeSuite
	public void Bfsuite()
	{
		System.out.println("I am number one in suite");
	}
	
	@BeforeMethod
	public void BeforeEveryMethod()
	{
		System.out.println("I will execute before every Method");
	}
	
	@AfterMethod
	public void AfterEveryMethod()
	{
		System.out.println("I will execute after every Method");
	}
	
	@Test(dataProvider = "getData")
	public void MobileSignInCarLoan(String username, String password)
	{
		System.out.println("MobileSignInCarLoan");
		System.out.println(username);
		System.out.println(password);
	}
	
	@Test(groups= {"Smoke2"})
	public void MobileSignOutCarLoan()
	{
		System.out.println("MobileSignOutCarLoan");
	}
	
	@Test(dependsOnMethods= {"MobileSignOutCarLoan","MobileSignInCarLoan"})
	public void LoginAPICarLoan()
	{
		System.out.println("LoginAPICarLoan");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		data[0][0] = "firstusername";
		data[0][1] = "firstpassword";
		
		data[1][0] = "secondusername";
		data[1][1] = "secondpassword";
		
		data[2][0] = "thirdusername";
		data[2][1] = "thirdpassword";
		
		return data;
	}
	

}
