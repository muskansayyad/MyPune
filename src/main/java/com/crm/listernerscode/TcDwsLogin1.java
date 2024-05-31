package com.crm.listernerscode;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TcDwsLogin1 {
	@Test
	public void login() 
		{
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();		
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://demowebshop.tricentis.com/");
			driver.findElement(By.className("ico-login")).click();
			driver.findElement(By.id("Email")).sendKeys("admin1@gmail.com");
			driver.findElement(By.id("Password")).sendKeys("admin1");
			driver.findElement(By.xpath("//input[@value='lognnn in']")).click();
			driver.close();		
		}
		
	@Test
	public void RedBus() 
		{
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();		
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://www.redbus.in/");
			driver.close();
	    }
	
	@Test(dependsOnMethods="login")
	public void ManiDum() 
		{
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();		
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("https://manis.in/");
			driver.close();
		
		}

}
