package Extent_Report;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import Annotations.BaseClassDWS;
import Annotations.DwsLoginPage;

public class ReportwithActualTestCases extends BaseClassDWS
{
	 ExtentReports reports;
	 ExtentTest test;
		

	 
	 @Test
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
		@Test
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
