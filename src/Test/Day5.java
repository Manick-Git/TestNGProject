package Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Day5 {
	
	@AfterTest
	public void Lastexecution()
	{
		System.out.println("I will execute last");
	}
	
	@AfterSuite
	public void Bfsuite()
	{
		System.out.println("I am last one in suite");
	}
	
	@BeforeTest
	public void prerequisite()
	{
		System.out.println("I will run before test");
	}
	

	@Test(groups= {"Smoke"})
	public void Demo()
	{
		System.out.println("hello");
	}
	
	@Test
	public void SecondTest()
	{
		System.out.println("bye");
	}
}
