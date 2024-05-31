package com.crm.listernerscode;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileRead1 {
	public static String PropertiesRead(String key) throws IOException   {
		Properties prop=new Properties();

		FileInputStream fis = new FileInputStream("https://demowebshop.tricentis.com/");
		prop.load(fis);
		
		
		String url=prop.getProperty("https://demowebshop.tricentis.com/"); 
		System.out.print(url);
		return data;
		
		
	}
	
		
 

		}


}
