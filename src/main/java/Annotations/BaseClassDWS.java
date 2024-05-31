package Annotations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClassDWS
{
	public static WebDriver driver;
	
	@BeforeClass
	public void beforeClass()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Welcome...!!!");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("Thanks for Comming....");
	}
	
	
	@AfterClass
	public void afterClass()
	{
		driver.quit();
	}
	
	

}
