package project2;

public class Studentdetails2 {
	Studentdetails1 Agg;
	String House;
	String Place;
	public Studentdetails2(Studentdetails1 Agg,String House,String Place)
	{
		this.Agg=Agg;
	this.House=House;
	this.Place=Place;
	
	}
	public void display()
	{
		System.out.println(Agg.name);
		System.out.println(Agg.rollno);
		System.out.println( House);
		System.out.println(Place);
	}
	public static void main(String args[])
	{
		Studentdetails1 o1=new Studentdetails1("Shefeena",1);
		Studentdetails2 o2=new Studentdetails2(o1,"Mangattu","Varappetty");
		o2.display();
	}
	

}
