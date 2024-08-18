package DataReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelReader2 {
	@Test
	public void dataReader2() throws Exception {
		File srcFile = new File("./DataFile/Seleniumpractice.xlsx");

		FileInputStream fis = new FileInputStream(srcFile);

		XSSFWorkbook book = new XSSFWorkbook(fis);

		XSSFSheet sheet = book.getSheetAt(0);
//		int rows = sheet.getLastRowNum();
//		int cells = sheet.getRow(0).getLastCellNum();
//		for(int r=0;r<=rows;r++)
//		{
//			XSSFRow row=sheet.getRow(r);
//			for(int l=0;l<cells;l++) {
//				XSSFCell cell=row.getCell(l);
//				switch(cell.getCellType())
//				{
//				case STRING:System.out.print(cell.getStringCellValue()+" "); break;
//				case NUMERIC: System.out.print(cell.getNumericCellValue()+" ");break;
//				case BOOLEAN: System.out.print(cell.getBooleanCellValue()+" ");break;
//				default:
//					break;
//					
//				}
//				
//			}
//			System.out.println();
//		}
		Iterator it = sheet.iterator();
		while (it.hasNext()) {
			XSSFRow row = (XSSFRow) it.next();
			Iterator cellIterator = row.cellIterator();
			while (cellIterator.hasNext()) {
				XSSFCell cell = (XSSFCell) cellIterator.next();
				switch (cell.getCellType()) {
				case STRING:
					System.out.print(cell.getStringCellValue() + " ");
					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue() + " ");
					break;
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue() + " ");
					break;
				default:
					break;

				}

				
				
			}
			System.out.println();
		}

	}

}
