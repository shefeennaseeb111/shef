package finalkeyword;

public class Finalkeyword1 extends Finalkeyword2 {
	final int a=30;
	//public Finalkeyword1()
	//{
		// a=30;we can change the value in constructors
	//}
	//public final void add()
	//{							
								//final methodes cannot override
	//}
	
	public static void main(String[] args) {
		Finalkeyword1 s=new Finalkeyword1();
		System.out.println(s.a);// TODO Auto-generated method stub
		s.add();//final methodes can be inherrit
	}
}
