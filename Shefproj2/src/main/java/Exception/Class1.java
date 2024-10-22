package Exception;

public class Class1 {
	int a=10;
	public void div()
	{
		try {
		int c=a/0;
		System.out.println(c);
	}
		catch(ArithmeticException b)
		{
			System.out.println("Exception Handling"+b);
		}
		finally
		{
			System.out.println("hello");
		}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class1 o=new Class1();
		o.div();
	}

}
