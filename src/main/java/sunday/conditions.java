package sunday;

import java.io.IOException;

public class conditions {
	
	public void ifconditions(String signal,String vechiletype)
	{
		if(signal.equals("Red"))
		{
		System.out.println("you have to stop");	
			if (vechiletype.equals("Ambulance"))
			{
				System.out.println("please go a head. dont stop");	
			}
		}
		else if(signal.equals("Green"))
		{
			System.out.println("you are good to go");	
		}
		else if(signal.equals("Yellow"))
		{
			System.out.println("you are ready to go");	
		}
		else
		{
			System.out.println("you have given incorrect signal type");	
		}
	}
	
	public void switchcondition(String Gender ) 
	{
		switch(Gender.toUpperCase())
		{
		case "MALE":
			System.out.println("M");
			break;
		case "FEMALE":
			System.out.println("F");
			break;
		default:
			System.out.println("T");
		break;
		}
		
	}
	
	public void loops()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
			//i=i+1;
		}	
	}
	
	public void whileloop()
	{
		int i=10;
		while(i<10)
		{
			System.out.println(i);
			i=i+1;
		}
	}
	
	public void dowhileloop()
	{
		int i=10;
		do
		{
			System.out.println(i);
			i=i+1;
		}while (i<10);
	}
	
	public void div() throws ArithmeticException,IOException
	{
		try
		{
		int a=30;
		int b=0;
		double c=a/b;
		System.out.println(c);
		}
		catch(ArithmeticException ar)
		{
			System.out.println("invalid input");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("this is finally");
		}
	}

	public void thow(int age)
	{
		if (age>18)
		{
			throw new ArithmeticException("u are greated than 18");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		conditions c = new conditions();
		//c.div();
		c.ifconditions("Red","Ambulance");
		c.switchcondition("male");
		c.dowhileloop();
		c.thow(19);
	}

}
