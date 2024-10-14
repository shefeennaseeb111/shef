package methodeoverriding;

public class Offseason extends Onseason {
	int d1;
	public void discount() 
	{
	super.discount();
	d1=15*1000/100;
	System.out.println("Discount of off season is"+d1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Offseason o1=new Offseason();
		o1.discount();
	}

}
