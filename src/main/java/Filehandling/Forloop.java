package Filehandling;

public class Forloop {
	
	
	String name="Sathish kumar .R";
	int age =553435346;
	String[] newname={"sathish","sankar","vinoth","kumar","mani","vijay"};
	int[] rank= {5,2,4,6};
	
	public Forloop()
	{
		int a;
		for(a=3;a<=13;a++)
		{
			System.out.println(a);
		}
		
	}
	
	public void forloopimplementation()
	{
		int a;
		
		for(a=3;a<=13;a++)
		{
			System.out.println(a);
		}
		
		for(a=13;a>=0;a--)
		{
			System.out.println(a);
		}
	}

	public void arrayimplementation()
	{
		System.out.println(name);
		
		for(int i=0;i<newname.length;i++)
		{
		System.out.println(newname[i]);
		}

	}
	
	/*public void stringconceptimplementation() 
	{
		char[] nrechar=name.toCharArray();
		for(int i=0;i<nrechar.length;i++)
		{
			System.out.print(nrechar[i]);
		}
		String[] aftersplit=name.split("\s");
		for(int i=0;i<aftersplit.length;i++)
		{
			if (i==1)
			{
				char[] iconvert=aftersplit[i].toCharArray();
				for(int j=0;j<iconvert.length;j++)
				{
				System.out.println(iconvert[j]);
				}
			}
			else
			{
			System.out.print(aftersplit[i]);
			System.out.print("\n");
			}
		}
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Forloop F = new Forloop();
		//F.stringconceptimplementation();
	}

}
