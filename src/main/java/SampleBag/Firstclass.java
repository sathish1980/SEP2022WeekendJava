package SampleBag;

public class Firstclass {
	
	//Method with out parameter /arguments
	//method with parameter
	//methiod with out return type
	//method with return type
	// Syntax : accessmodifier returntype method name
	
	public static int z =50;  //global variable
	protected void add()
	{
		
		int a =10; //local variable
		int b=20;
		int c =a+b;
		System.out.println(c);
		System.out.println(z);
		
	}
	
	public void sub(int a,int b)
	{
		int c =a-b; //-4
		int d=mul(); //300
		int e= c*d; //-1200
		System.out.println("The subtraction of 2 number is: "+c);
		System.out.println("The multiplication of 2 number is: "+e);	
	}
	
	public int mul()
	{
		int a=20;
		int b=15;
		int c=a*b;
		return c;	
	}
	
	public void trafficlight(String lightcolor,String vechiletype,int timer)
	{
		if(lightcolor.equals("Red"))
		{
			System.out.println("you have to stop");
			if(vechiletype.equals("ambulance"))
			{
				if(timer>10)
				{
				System.out.println("Please go head");
				}
			}
		}
		else if (lightcolor.equals("Green"))
		{
			System.out.println("you can go now");
		}
		else if (lightcolor.equals("yellow"))
		{
			System.out.println("you are good to start the engine now");
		}
		else
		{
			System.out.println("The given color is: " +lightcolor);
		}
	}
	
	public void switchcondistion(String gender)
	{
		switch(gender)
		{
		case "Male":
			System.out.println("You are male");
			break;
		case "Female":
			System.out.println("You are Female");
			break;
		default:
			System.out.println("You are Transgender");
			break;
		}
	}
	
	public void forloop(int a)
	{
		int next10number=a-10;
		for (int i=a;i>next10number;i--)
		{
			System.out.println(i);
		}
	}
	
	public void whileloop(int a)
	{
		while(a<=10)
		{
			System.out.println("greater than 10 : "+a);
			a=a+1;
		}
	}
	
	public void dowhileloop(int a)
	{
		do
		{
			System.out.println("greater than 10 : "+a);
			a=a+1;
		}
		while(a<=10);
	}
	public static void main(String[] bc)
	{
		System.out.print("sathish");
		System.out.println("kumar");
		System.out.print("###@Q$#%#$^$");
		System.out.println("R");
		Firstclass Fc = new Firstclass(); //instantiation
		Fc.add();
		Fc.sub(2,6);
		Fc.trafficlight("Red","ambulance",11);
		Fc.switchcondistion("Male");
		Fc.forloop(20);
		Fc.whileloop(11);
		Fc.dowhileloop(1);
	}
}
