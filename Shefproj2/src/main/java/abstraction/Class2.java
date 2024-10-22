package abstraction;

public class Class2 extends Class1 {
	public static void main(String[] args)
	{
		Class2 o=new Class2();
		o.read();
		o.display();
		Class1.write();
	}

	@Override
	public void read() {
		// TODO Auto-generated method stub
		System.out.println("Shefeena");
	}

}
