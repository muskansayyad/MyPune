package com.crm.listernerscode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AddtoCartGiftcard 
{
	
	public class addtoCard extends Baseclass
	{
		@Test
		public void addtocart()throws InterruptedException {
			driver.findElement(By.xpath("//a[contains(text(),'Gift Card')][1]")).click();
			List<WebElement>products=driver.findElements(By.xpath("//input[@value='Add to cart']"));
			for (WebElement web:products) {
				web.click();
			}
			Thread.sleep(40000);
		}
		
	}

}
