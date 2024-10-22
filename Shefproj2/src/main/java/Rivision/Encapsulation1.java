package Rivision;

public class Encapsulation1 {
	private int p;
	public void setter(int p)
	{
		this.p=p;
	}
	public void getter()
	{
		if((p==1001)||(p==1234)||(p==1212))
		{
			System.out.println("pin number is valid");
		}
		else
		{
			System.out.println("pin number is invalid");
		}
	}

}
