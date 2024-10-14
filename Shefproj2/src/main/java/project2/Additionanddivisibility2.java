package project2;

public class Additionanddivisibility2 extends Additionanddivisibility1 {
	public Additionanddivisibility2()
	{
		System.out.println("The sum is"+super.c);
		if(c%10==0)
		{
			System.out.println("divisible");
			
		}
		else
		{
			System.out.println("not divisible");
			
		}
		super.display();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Additionanddivisibility2 o=new Additionanddivisibility2();
	}

}
