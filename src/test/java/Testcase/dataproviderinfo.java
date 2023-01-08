package Testcase;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import Utils.ExcelRead;

public class dataproviderinfo {

	@DataProvider(name="loginsheet")
	public Object[][] FBloginTestdata() throws IOException
	{
		return ExcelRead.read("login");
	}
}
