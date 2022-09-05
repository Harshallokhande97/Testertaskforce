package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	XSSFWorkbook wb;
	public void ExcelDataProvider () throws Exception {
		
		String path="C:\\Users\\ADMIN\\eclipse-workspace\\Batch11_Framework\\TestData\\TestData.xlsx";
		FileInputStream Fis=new FileInputStream(path);
		wb=new XSSFWorkbook(Fis);
		
	}
	
	public String getStringdata (String Sheetname, int row, int cell) {
		
		return wb.getSheet(Sheetname).getRow(0).getCell(0).getStringCellValue();
		
	}

}
