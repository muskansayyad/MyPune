package Annotations;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class CaptureScreenShortOnFailed extends BaseClassDWS
{
	@Test
	public void dwsloginCorrect()
	{
		WebDriver driver;
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		DwsLoginPage dws=new DwsLoginPage(driver);
		dws.username("admin01@gmail.coom");
		dws.password("admin01");
		dws.login_button();
		driver.findElement(By.xpath("//a[text()='Log out'"));
		
	}
	@Test
	public void dwsloginIncorrect()
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
