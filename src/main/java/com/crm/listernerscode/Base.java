package com.crm.listernerscode;


import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.crm.listerneracode.ExternalData;

import WebElements.EncryptedDocumentException;

public class Base extends ExternalData{
	public WebDriver driver;
	public String url;
	public String browser;
	public String userid;
	public String pass;
	public WebDriverWait wait;
	public Sheet sheet;
	
	@BeforeSuite
	public void resource() throws IOException, EncryptedDocumentException 
	{
		Properties prop = ExternalData.properyFile();
		url = prop.getProperty("url");
		browser=prop.getProperty("browser");
		userid=prop.getProperty("username");
		pass=prop.getProperty("password");
		
		sheet=(Sheet) ExternalData.excelFileData();
	}

	@BeforeTest
	public void setup() 
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.get(url);
	}
	@BeforeClass
	public void launchUrl()
	{
		driver.get(url);
	}
	@BeforeMethod
	public void login()
	{
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys(userid);
		driver.findElement(By.id("Password")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
	
	@AfterMethod
	public void logout()
	{
		wait.until(ExpectedConditions.elementToBeClickable(By.className("ico-logout")));
		driver.findElement(By.className("ico-logout")).click();
	}
	@AfterSuite
	public void close()
	{
		driver.close();
	}
	
	
}
	  
	