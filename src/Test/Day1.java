package Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Day1 {
	
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
	
	@Parameters({"PURL"})
	@Test(groups= {"Smoke"})
	public void Demo(String purl)
	{
		System.out.println("hello");
		System.out.println(purl);
	}
	
	@Parameters({"URL"})
	@Test
	public void SecondTest(String url)
	{
		System.out.println("bye");
		System.out.println(url);
	}
}
