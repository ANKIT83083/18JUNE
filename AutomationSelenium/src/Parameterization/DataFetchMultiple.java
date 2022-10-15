package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataFetchMultiple {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\hp\\OneDrive\\Desktop\\demo.xlsx");
		
		double data=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getNumericCellValue();
		
		int rowcount=WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum();   //count-1
		Cell c=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0);
		
		for(int i=0; i<=rowcount; i++) {
			int cellcount=WorkbookFactory.create(file).getSheet("Sheet1").getRow(i).getLastCellNum();
			
			for(int j=0;j<=cellcount-1;j++) {
				
				if (c.equals(CellType.NUMERIC)) {
					c.getNumericCellValue();
				}
				else if(c.equals(CellType.STRING)) {
					c.getStringCellValue();
				}
				else if(c.equals(CellType.BOOLEAN)) {
					c.getBooleanCellValue();
				}
				
			}
		}
		System.out.println(data);
	}

}
