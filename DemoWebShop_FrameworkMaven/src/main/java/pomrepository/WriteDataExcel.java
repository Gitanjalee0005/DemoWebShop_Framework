package pomrepository;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("C:\\Users\\Asus\\OneDrive\\Documents\\Selenium\\Book1.xlsx");
		
		Workbook book = WorkbookFactory.create(fis);
		
		//Sheet sh = book.createSheet("WriteData");//
		Sheet sh = book.getSheet("WriteData");
		sh.createRow(0).createCell(0).setCellValue("Gitanjalee");
		sh.createRow(1).createCell(0).setCellValue("Sao");
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Asus\\OneDrive\\Documents\\Selenium\\Book1.xlsx");
		
		book.write(fos);
		
		fos.flush();
		System.out.println("Done");
	}

}
