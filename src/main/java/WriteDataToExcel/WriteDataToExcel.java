package WriteDataToExcel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataToExcel
{
	public void DatatoExcel() throws IOException
	{
		FileInputStream fis=new FileInputStream("\"C:\\Users\\muska\\eclipse-workspace\\selenium2\\src\\main\\java\\selenium\\muskan.xlsx\"");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		Row row = sheet.getRow(0);
		Cell cell = row.createCell(2);
		cell.setCellType(CellType.STRING);
		cell.setCellValue("AnyData");
		FileOutputStream fos=new FileOutputStream("\"C:\\Users\\muska\\eclipse-workspace\\selenium2\\src\\main\\java\\selenium\\muskan.xlsx\"");
		wb.write(fos);
		wb.close();
		
	}

}

