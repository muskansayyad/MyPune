package WebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

public class BaseClassQsp 
{
	WebDriver driver;
	@Beforesuite
	public void beforesuitse()
	{
		System.out.println("DataBase connection");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("pre-condition for testcase runner");
	}
	@BeforeClass
	public void beforeClass()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/");
	}
	@beforeMethod
	public void beforeMethod()throws InterruptedException
	{
		driver.findElement(By.xpath("//p[text()='UITesting Concepts']")).click();
		Thread.sleep(2000);
		
		Actions a=new Actions(driver);
		WebElement dropdown=driver.findElement(By.xpath("//section[text()='Web Element']"));
		a.click(dropdown);
		Thread.sleep(2000);
	}
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("No need to long-out");
	}
	@AfterClass
	public void AfterClass()
	{
		System.out.println("after Class");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("post condition for test Runner");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("Database disconnected");
	}


}
  
