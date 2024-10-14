package polymorphism;

public class polymorphism2 extends polymorphism1  {
	int d;
	public void add()
	{
		super.add();
		d=a-b;
		System.out.println("dif is"+d);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		polymorphism2 o1=new polymorphism2();
		o1.add();
	}

}
