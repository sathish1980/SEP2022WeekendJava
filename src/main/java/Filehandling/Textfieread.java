package Filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Textfieread {
	
	String Filepath="C:\\Users\\sathishkumar\\eclipse-workspace\\WeekendSEP2022\\Input\\Testdata.txt";
	
	public void readonecharacter() throws IOException
	{
		File f= new File(Filepath);
		try {
			FileInputStream Fs = new FileInputStream(f);
			int a =Fs.read();
			System.out.println((char)a);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//or
		//FileInputStream Fs = new FileInputStream(Filepath);
		
	}
	
	public void readallcharacter() throws IOException
	{
		File f= new File(Filepath);
		try {
			FileInputStream Fs = new FileInputStream(f);
			int a ;
			while ((a=Fs.read()) != -1)
			{
			System.out.println((char)a);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//or
		//FileInputStream Fs = new FileInputStream(Filepath);
		
	}

	public void readByFileReader() throws IOException
	{
		File f= new File(Filepath);
		try {
			FileReader Fs = new FileReader(f);
			int a ;
			while ((a=Fs.read()) != -1)
			{
			System.out.println((char)a);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//or
		//FileInputStream Fs = new FileInputStream(Filepath);
		
	}

	public void readByFileReaderlinebyline() throws IOException, InterruptedException
	{
		File f= new File(Filepath);
		try {
			FileReader Fs = new FileReader(f);
			BufferedReader Bf= new BufferedReader(Fs);
			String a;
			while ((a = Bf.readLine()) != null)
			{
			System.out.println(a);
			Thread.sleep(1000);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//or
		//FileInputStream Fs = new FileInputStream(Filepath);
		
	}
	
	
	public void readByFileReadefirstline() throws IOException
	{
		File f= new File(Filepath);
		try {
			FileReader Fs = new FileReader(f);
			BufferedReader Bf= new BufferedReader(Fs);
			System.out.println(Bf.readLine());
			System.out.println(Bf.readLine());
			System.out.println(Bf.readLine());
			System.out.println(Bf.readLine());
			System.out.println(Bf.readLine());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//or
		//FileInputStream Fs = new FileInputStream(Filepath);
		
	}
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		Textfieread T =new Textfieread();
		T.readByFileReaderlinebyline();
	}

}
