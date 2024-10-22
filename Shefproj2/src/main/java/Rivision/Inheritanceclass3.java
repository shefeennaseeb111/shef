package Rivision;

public class Inheritanceclass3 extends Inheritanceclass2 {
	int tot;
	public void total()
	{
	tot=basic+hra-pf-ded+bonus;
	System.out.println("Total is"+tot);
	}

	public static void main(String[] args) {
		Inheritanceclass3 o1=new Inheritanceclass3();
		o1.get();
		o1.calc();
		o1.total();
		
		// TODO Auto-generated method stub

	}

}
