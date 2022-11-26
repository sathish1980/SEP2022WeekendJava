package SampleBag;

public class Exceptionhandling {
	
	
	public void add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}

	public void sub()
	{
		int a=10;
		int b=20;
		int c=a-b;
		System.out.println(c);
	}
	public void div()
	{
		try
		{
		int a=10;
		int b=0;
		int c=a/b;
		System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("aithmentic expetions arrised");
		}
		catch(Exception e)
		{
			System.out.println("exception arrised");
		}
		finally
		{
			System.out.println("finally");
		}
		
	}
	
	public void trowexception(int number)
	{
		if (number>20)
		{
			throw new ArithmeticException("It is greated than 20");
		}
		else
		{
			System.out.println("Its lesser than 20");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exceptionhandling W= new Exceptionhandling();
		W.div();
		W.add();
		W.sub();
		W.trowexception(34);
	}

}
