package package2;

public class assignment {
	
	public void Address(String Address)
	{
		if(Address.equals("Velachery"))
		{
			System.out.println("Plot No. 119, No.8, 11th Main Rd, Vijaya Nagar, Velachery, Chennai, Tamil Nadu 600042");
		}
		else if (Address.equals("Tambaram"))
		{
			System.out.println("1st Floor, No.2A Duraisamy, Reddy St, Near Passport Seva, Tambaram West, Chennai, Tamil Nadu 600045");
		}
		else if (Address.equals("OMR"))
		{
			System.out.println("5/318, 2nd Floor, Sri Sowdeswari Nagar, Rajiv Gandhi Salai, Thoraipakkam, Tamil Nadu 600097");
		}
		else if (Address.equals("Porur"))
		{
			System.out.println("180/84, 1st Floor, Karnataka Bank Building, Trunk Rd, Porur, Chennai, Tamil Nadu 600116");
		}
		else if (Address.equalsIgnoreCase("AnnaNagar"))
		{
			System.out.println("Land Mark :, Plot no: 1371,28th street kambar colony I Block Anna Nagar West, Behind Reliance Fresh, Chennai, Tamil Nadu 600040");
		}
		else if (Address.equals("T-Nagar"))
		{
			System.out.println("Old No:146/2- New, No: 48, Habibullah Rd, T. Nagar, Chennai, Tamil Nadu 600017");
		}
		else if (Address.equals("Thiruvanmiyur"))
		{
			System.out.println("22/67, 1st Floor, North mada street, Near, Valmiki St, Thiruvanmiyur, Chennai, Tamil Nadu 600041");
		}
		else if (Address.equals("Siruseri"))
		{
			System.out.println("No. 4/76, Ambedkar Street, OMR Road, Egatoor, Navallur, Siruseri, Chennai, Tamil Nadu 600130");
		}
		else if (Address.equals("Maraimalai Nagar"))
		{
			System.out.println("No.37, Ground Floor, Thiruvalluvar Salai, Maraimalai Nagar, Chennai, Tamil Nadu 603209");
		}
		else
		{
			System.out.println("The Center is available under this location: " +Address);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		assignment a = new assignment();
		a.Address("anna nagar");
	}

}
