package Filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class propertyclass {
	String Filepath="C:\\Users\\sathishkumar\\eclipse-workspace\\WeekendSEP2022\\Input\\sample.properties";
	
	public void  propertyfilehandle()
	{
		
		File f= new File(Filepath);
		try {
			FileInputStream Fs = new FileInputStream(f);
			Properties P = new Properties();
			P.load(Fs);
			System.out.println(P.getProperty("name"));
			System.out.println(P.getProperty("age"));
			System.out.println(P.getProperty("year"));
			System.out.println(P.getProperty("degree"));
			P.setProperty("address","Chennai ,Tamilnadu");
			System.out.println(P.getProperty("address"));
		}
		catch(Exception e)
		{
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		propertyclass pc = new propertyclass();
		pc.propertyfilehandle();
	}

}
