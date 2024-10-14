package finalkeywordinherritance;

public final class Class2 extends Class1 
{

	public void sub(int a,int b)
	{
		c=a-b;
		System.out.println("the dif is"+c);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class2 o=new Class2();
		o.add(100,5);
		o.sub(100,20);
	}
}       
