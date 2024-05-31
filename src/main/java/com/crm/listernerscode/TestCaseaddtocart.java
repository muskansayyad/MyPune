package com.crm.listernerscode;
	
	import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//	@Listeners(com.crm.listenerscode)
public class TestCaseaddtocart extends Base 
	{
		@Test
		public void addToCart() throws InterruptedException 
		{
			driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
			List<WebElement> add = driver.findElements(By.xpath("//input[@value='Add to cart']"));
			for (WebElement web : add)
			{
				web.click();
				Thread.sleep(2000);
			}
		}
	}
		