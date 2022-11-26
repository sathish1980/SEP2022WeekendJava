package Filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class TextfileWrite {
	String inputFilepath="C:\\Users\\sathishkumar\\eclipse-workspace\\WeekendSEP2022\\Input\\Testdata.txt";
	
	
	String output="C:\\Users\\sathishkumar\\eclipse-workspace\\WeekendSEP2022\\Output\\outputdatacopy.txt";
	
	public void writeabyte() throws IOException {
		String name="this is sathish";
		
		File F = new File(output);
		if(F.exists())
		{
			System.out.println("File alreadry exist so we are not crearing");
		}
		else
		{
			F.createNewFile();
		}
		FileOutputStream outputStream = new FileOutputStream(F);  
		//Writer outputStreamWriter = new OutputStreamWriter(outputStream);  
		outputStream.write(76);
		byte a = 76;
		outputStream.write((char)76);
		byte b[]=name.getBytes();
		
		outputStream.write(b);
		outputStream.close(); 
		System.out.println("done");
	}
	
	public void writebyfilewriter()
	{
	     String s="Welcome to Besant Technology";    
		try {  
			File f = new File(output);
			if(f.exists()==false)
			{
			f.createNewFile();
			}
			FileWriter FL = new FileWriter(f);     
			FL.write(s);
			FL.write("\n");
			FL.close(); 
			System.out.println("done");
        } catch (Exception e) {  
            e.getMessage();  
        }  
	}
	

	public void filereadandwrite() throws IOException, InterruptedException
	{
		File f= new File(inputFilepath);
		try {
			FileReader Fs = new FileReader(f);
			BufferedReader Bf= new BufferedReader(Fs);
			File outfile = new File(output);
			if(outfile.exists()==false)
			{
				outfile.createNewFile();
			}
			FileWriter FL = new FileWriter(outfile);     
			
			String a;
			int count=0;
			while ((a = Bf.readLine()) != null)
			{
				count+=1;
				System.out.println(a);
				FL.write(a);
				System.out.println("Line: "+count+" Printed");
				FL.write("\n");
			}
			FL.close(); 
			System.out.println("done");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void copyfile()
	{
		File f= new File(inputFilepath);
		File fout= new File(output);
		try {
			FileUtils.copyFile(f, fout);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("done");
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		TextfileWrite T = new TextfileWrite();
		T.copyfile();
	}

}
