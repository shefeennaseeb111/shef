package methodeoverloading;

public class Staticmethodeoverload {
	static int c;
	static float z;
	
	public static void add(int a,int b)
	{
	c=a+b;
	System.out.println(c);
	
	}
	public static void add(float x,float y)
	{
		z=x+y;
		System.out.println(z);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staticmethodeoverload.add(30,50);
		Staticmethodeoverload.add(40f,50f);
		
		
		
	}

}
