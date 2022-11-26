package SampleBag;

public class Voterid {
	
	public void voterididentification(int age,String country)
	{
		if(country.equals("India"))
		{
			if(age>=18)
			{
				System.out.println("you are good to apply voter id");
				if (age >60)
				{
					System.out.println("you will get the voter id in next 5 days");
				}
				else
				{
					System.out.println("you will get the voter id in next 20 days");
					
				}
			}
			else if(age>=15)
			{
				System.out.println("you are eligible for pre voter id");
				int actualwaityear=18-age;
				System.out.println("You have to wait for "+actualwaityear+" more years to get the actual voter id");
			}
		}
		else
		{
			System.out.println("You are not a indian citizen");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Voterid v= new Voterid();
		v.voterididentification(45, "India");
	}

}
