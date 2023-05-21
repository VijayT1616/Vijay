package readExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		         // Read data from IPL Excel Sheet.
				FileInputStream fis  = new FileInputStream("./data/TestData.xlsx"); // provide 
				Workbook wb=WorkbookFactory.create(fis );
				Sheet sheet = wb.getSheet("IPL");
				
				Row row = sheet.getRow(1);
				Cell cell = row.getCell(1);
				String data = cell.getStringCellValue();
				System.out.println(data);
				
				
	}

}
