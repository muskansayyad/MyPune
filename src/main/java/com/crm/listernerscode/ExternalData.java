package com.crm.listernerscode;

	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;

	import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;

	public class ExternalData
	{
		
		
		public static Properties properyFile() throws IOException
		{
			Properties prop = new Properties();
			FileInputStream fis = new FileInputStream("./src/test/resources/dwspropertie.properties");
			prop.load(fis);
			return prop;
		}
		
		public static Sheet excelFileData() throws EncryptedDocumentException, IOException
		{
			FileInputStream fis=new FileInputStream("E:\\Qspiders\\Qspiders\\Selenium\\Programs\\Excel files\\DemoWebShopGiftCartNames.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet("Sheet1");
			return sheet;
		}
	}

