package abstraction;

public class Stud implements Student,Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stud s=new Stud();
		s.display();
		s.read();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}

	@Override
	public void read() {
		// TODO Auto-generated method stub
		int c=a+b;
		System.out.println(c);
	}

}
