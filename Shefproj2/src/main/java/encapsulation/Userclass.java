package encapsulation;

public class Userclass {
	private int p;
	
	public void setter(int p)
	{
		this.p=p;
		
	}
	public void getter()
	{
		if((p==1001)||(p==1234)||(p==1212))
		{
			System.out.println("pin numer is valid");		
		}
		else
		{
		System.out.println("pin numer is invalid");	
		}
		
		
	}

}
