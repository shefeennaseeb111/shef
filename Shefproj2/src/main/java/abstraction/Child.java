package abstraction;

public class Child implements Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child ob=new Child();
		ob.read();
		ob.display();
		Parent obj=new Child();//parent is an interface.so: Interfacename object=new Classname();
		obj.display();
	}

	@Override
	public void read() {
		// TODO Auto-generated method stub
		System.out.println("Java  World");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}

}
