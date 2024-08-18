package DataReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelReader {
	@Test
	public void dataReader() throws Exception {
		File srcFile=new File("E:\\SeleniumJava\\DataDrivenFramework\\src\\test\\resources\\excel\\Seleniumpractice.xlsx");
		
		FileInputStream fis=new FileInputStream(srcFile);
		
		XSSFWorkbook book=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=book.getSheetAt(0);
		String value=sheet.getRow(1).getCell(0).getStringCellValue();
		System.out.println(value);
		
	}

}
