package proj;

public class Class2 extends Class1 {
	public Class2(int a, int b) 
	{
		
			super(a, b);
			this.a=a;
			this.b=b;
			c=a-b;
			System.out.println("Difference is"+c);
		
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class2 o=new Class2(50, 20);
		
	}

}
