package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchDataExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\demo.xlsx");
		
		//double data=WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(0).getNumericCellValue();
		//boolean data=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(2).getBooleanCellValue();
		//String data=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		Date data=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(5).getDateCellValue();
		
		System.out.println(data);
		//System.out.println(data1);
	}

}
