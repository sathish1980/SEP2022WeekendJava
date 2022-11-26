package sunday;

public class Fristclass {
	
	public static int age=45;
	float f=2.3f;
	double c =1.23234;
	char d ='a';

	String name="sathish";
	boolean gender= false;
	
	
	public Fristclass(int a, int b)
	{
		int age=35;
		System.out.println("constructor"+age);
	}
	
	public void add()
	{
		int a=1;
		int b=20;
		int c=a+b;
		System.out.println("This is add method" +age);
	}
	
	public void addition(int a, int b)
	{
		int c= a+b;
		System.out.println("addition of 2 number : " +c);
	}

	public void mutiple(int a, int b)
	{

		int c= returnaddof2value(a,b);
		int d=c*a;
		System.out.println(d);
	}
	public int returnaddof2value(int a, int b)
	{
		int c= a+b;
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("same line");
		System.out.println("Output");
		System.out.println("Output1");
		System.out.println("Output2");
		Fristclass obj1= new Fristclass(3,4);
		obj1.add();
		Fristclass obj2= new Fristclass(3,4);
		obj2.mutiple(4, 5);


	}

}
