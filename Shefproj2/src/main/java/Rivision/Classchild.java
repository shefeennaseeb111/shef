package Rivision;

public class Classchild implements Class1,Parent  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Classchild o1=new Classchild();
		o1.read();
		o1.display();
	}

	@Override
	public void read() {
		// TODO Auto-generated method stub
		int c=a+b;
		System.out.println(c);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Hi helloooo");
	}
	

}
