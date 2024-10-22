package Rivision;

public class Aggregation2 {
	String House,Place;
	Aggregation1 Agg;
	public Aggregation2(Aggregation1 Agg,String House,String Place)
	{
	
		this.Agg=Agg;
		this.House=House;
		this.Place=Place;
		
	}
	public void display()
	{
		System.out.println(Agg.Name);
		System.out.println(Agg.Rollno);
		System.out.println(House);
		System.out.println(Place);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aggregation1 o1=new Aggregation1("Shefeena",1);
		Aggregation2 o2=new Aggregation2(o1,"Mangattu","Varappetty");
		o2.display();
		
		
		
	}

}
