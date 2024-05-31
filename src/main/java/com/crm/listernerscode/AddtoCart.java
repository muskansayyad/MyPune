package com.crm.listernerscode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddtoCart extends Baseclass {
	public void addtoCart() throws InterruptedException{
		driver.findElement(By.xpath("//a[contains(text(),'Digital downlaod')]")).click();
		List<WebElement>products=driver.findElements(By.xpath("//input[@value='Add to cart']"));
		for(WebElement web:products) {
			web.click();
		}
		Thread.sleep(4000);
	}

}
