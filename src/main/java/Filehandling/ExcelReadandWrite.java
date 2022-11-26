package Filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadandWrite {
	String inputfilepath=System.getProperty("user.dir")+"\\Input\\sampledata.xls";
	String outputfilepath = System.getProperty("user.dir")+"\\Output\\output06112022_alldata.xlsx";
	
	
	public void readandwrite() throws IOException
	{
		File F = new File(inputfilepath);
		FileInputStream FL = new FileInputStream(F);
		
		//XSSFWorkbook Wbk = new XSSFWorkbook(FL);
		HSSFWorkbook Wbk = new HSSFWorkbook(FL);
		Sheet inputsheetvalue=Wbk.getSheet("Input");
		
		//Write
		File outF = new File(outputfilepath);
		if(F.exists())
		{
			
		}
		else
		{
			try {
				F.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		FileOutputStream fs = new FileOutputStream(outF);
		
		XSSFWorkbook hsf = new XSSFWorkbook();
		Sheet outputsheetvalue= hsf.createSheet("Output");
		
		int userrow=inputsheetvalue.getPhysicalNumberOfRows();
		for (int rowvalue=0;rowvalue<userrow;rowvalue++)
		{
			Row eachrow=inputsheetvalue.getRow(rowvalue);
			Row outrow=outputsheetvalue.createRow(rowvalue);
			int totalusercolumn=eachrow.getLastCellNum();
			for (int columnvalue=0;columnvalue<totalusercolumn;columnvalue++)
			{
				Cell outcellvalue=outrow.createCell(columnvalue);
				Cell eachcellvalue=eachrow.getCell(columnvalue);
				outcellvalue.setCellValue(handledatatype(eachcellvalue).toString());
			}
		
		}
		hsf.write(fs);
		hsf.close();
		fs.close();
		System.out.println("Done");
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
		ExcelReadandWrite E = new ExcelReadandWrite();
		E.readandwrite();
	}

}
