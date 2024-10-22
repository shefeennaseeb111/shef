package Exception;

public class Throw {
	 int a=12;
	public void check()
	{
		if(a>=18)
		{
			System.out.println("eligible");
		}
		else
		{
			//System.out.println("not eligible");
			throw new ArithmeticException("You are not eligible");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Throw o=new Throw();
	o.check();
		
	}

}
