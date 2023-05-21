package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// Read Multiple data for using For loop 
		  // generalize the row count
        FileInputStream fis2 = new FileInputStream("./data/Testdata.xlsx");
        Workbook wb2 = WorkbookFactory.create(fis2);
        Sheet sheet2 = wb2.getSheet("IPL");
        
        int rc = sheet2.getLastRowNum(); // get last row of the sheet
        
		for(int i=1;i<=rc;i++)
		{
		FileInputStream fis = new FileInputStream("./data/Testdata.xlsx"); //provide path of excel file
		Workbook wb = WorkbookFactory.create(fis); //make the file ready for read
		Sheet sheet = wb.getSheet("IPL"); //get into sheet
		Row row = sheet.getRow(i); //get into sheet
		Cell cell = row.getCell(1); //get into desired row
         String data = cell.getStringCellValue(); //get value from cell/col
         Thread.sleep(1000);
         System.out.println(data);
         
       
		}
         
	}

}
