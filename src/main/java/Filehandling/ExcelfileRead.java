package Filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelfileRead {
	
	String filepath="C:\\Users\\sathishkumar\\eclipse-workspace\\WeekendSEP2022\\Input\\sampledata.xls";
	
	
	public void excelreaddata() throws IOException
	{
		File F = new File(filepath);
		FileInputStream FL = new FileInputStream(F);
		
		//XSSFWorkbook Wbk = new XSSFWorkbook(FL);
		HSSFWorkbook Wbk = new HSSFWorkbook(FL);
		Sheet sheetvalue=Wbk.getSheet("Input");
		//Sheet sneetvalue=Wbk.getSheetAt(0);
		//int userrow=sheetvalue.getLastRowNum(); //get the total used row
		int userrow=sheetvalue.getPhysicalNumberOfRows();
		for (int rowvalue=0;rowvalue<userrow;rowvalue++)
		{
			Row eachrow=sheetvalue.getRow(rowvalue);
			int totalusercolumn=eachrow.getLastCellNum();
			for (int columnvalue=0;columnvalue<totalusercolumn;columnvalue++)
			{
				Cell eachcellvalue=eachrow.getCell(columnvalue);
				
				System.out.print(handledatatype(eachcellvalue));
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
	
	public Object handledatatype(Cell eachcellvalue)
	{
		Object value = null;
		switch(eachcellvalue.getCellType())
		{
			case STRING:
				value=eachcellvalue.getStringCellValue();
			break;
			case NUMERIC:
				//value=eachcellvalue.getNumericCellValue();
				DataFormatter dataFormatter = new DataFormatter();
				value = dataFormatter.formatCellValue(eachcellvalue);
			break;
				
		}
		return value;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExcelfileRead E =new ExcelfileRead();
		E.excelreaddata();
	}

}
;