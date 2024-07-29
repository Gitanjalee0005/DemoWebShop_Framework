package genericlibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataUtility {

	public String getDataFromProperties(String Key) throws IOException {

		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/CommonData.properties");
		Properties pro = new Properties();
		pro.load(fis);
		String value = pro.getProperty(Key);
		return value;
	}
	
	public String getDataFromExcel(String sheet, int rowNum, int cellNum) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/Book1.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet(sheet);
		String value = sh.getRow(rowNum).getCell(cellNum).toString();
		return value;	
	}
	
	public Object[][] getMultipleDataFromExcel(String sheetName) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/Book1.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet(sheetName);
		
		int lastRowNumber = sh.getPhysicalNumberOfRows();
		int lastCellNumber = sh.getRow(0).getPhysicalNumberOfCells();
		
		Object[][] arr = new Object[lastRowNumber-1][lastCellNumber];
		
		for(int i = 1 ; i<lastRowNumber ; i++) {
			
			for(int j =0 ; j<lastCellNumber ; j++) {
				
				arr[i-1][j] = sh.getRow(i).getCell(j).toString();
			}
		}
		return arr;
	}
}
