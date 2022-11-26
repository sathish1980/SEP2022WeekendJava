package Filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	
	String filepath = "C:\\Users\\sathishkumar\\eclipse-workspace\\WeekendSEP2022\\Output\\output06112022.xlsx";
	String[] name= {"sathish","kumar","R"};
	public void excelwritedata() throws FileNotFoundException
	{
		File F = new File(filepath);
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
		FileOutputStream fs = new FileOutputStream(F);
		
		XSSFWorkbook hsf = new XSSFWorkbook(); // we can able to read xlsx file
		//or
		//HSSFWorkbook hsf = new HSSFWorkbook(fs); // we can able to read xls file
		Sheet sh= hsf.createSheet("Output");
		
		//for(int i=0;i<name.length;i++)
		for(int i=0;i<1;i++)
		{
			Row rw=sh.createRow(i);
			int usedcolumn= name.length;
			for(int j=0;j<usedcolumn;j++)
			{
				Cell celvalue=rw.createCell(j);
				celvalue.setCellValue(name[j]);
			}
		}
		try {
			hsf.write(fs);
			hsf.close();
			fs.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Done");
	}

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		ExcelWrite E = new ExcelWrite();
		E.excelwritedata();
	}

}
