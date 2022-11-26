package package2;

import SampleBag.Firstclass;

public class protectedvalidation extends Firstclass{
	
	//Firstclass f = new Firstclass();
	
	public void check()
	{
		System.out.println(z);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		protectedvalidation p = new protectedvalidation();
		p.check();
	}

}
