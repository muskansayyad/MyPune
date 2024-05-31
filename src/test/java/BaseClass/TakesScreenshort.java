package BaseClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Annotations.DwsLoginPage;
import TestNGBasic.BaseClass;

public class TakesScreenshort extends BaseClass
{
	public ExtentReports report;
	public ExtentSparkReporter spark;
	public ExtentTest test;
	
	public void dwsloginCorrect()
	{
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		DwsLoginPage dws=new DwsLoginPage(driver);
		dws.username("admin01@gmail.coom");
		dws.password("admin01");
		dws.login_button();
		driver.findElement(By.xpath("//a[text()='Log out'"));
	}
	
	public void dwsloginIncorrect() throws InterruptedException
	{
		

		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		DwsLoginPage dws=new DwsLoginPage(driver);
		Thread.sleep(2000);
		dws.username("admin01@gmail.coom");
		dws.password("admin01");
		dws.login_button();
		driver.findElement(By.xpath("//a[text()='Log out'"));
		
	}
	@Test
	public void redBus()
	{
		
	
		driver.get("https://www.redbus.in");
		assertEquals("qsp","qsps");
	}
		
	

}
