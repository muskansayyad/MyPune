package WebElements;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TextBox1  extends BaseClassQsp
{
	@Test
	public void textBox()throws InterruptedException,EncryptedDocumentException,IOException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Text Box']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//li[text()='Without placeholder']")).click();
		FileInputStream fis=new FileInputStream("D:\\Qspiders.xlsx");
		workbook wb=workbook.create(fis);
		Sheet sheet= wb.getSheet("sheet1");
		String name= sheet.getRow(0).getCell(0).toString();
		String email= sheet.getRow(1).getCell(0).toString();
		String password= sheet.getRow(2).getCell(0).toString();
		
		driver.findElement(By.xpath("//input[@type='text'][1]")).sendKeys(name);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys(email);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Register']")).click();

		
	}
}
