package encapsulation;

public class Revise
{
int a,b,c;
public Revise(int a,int b)
{
this.a=a;
this.b=b;
this.add();
} 
public void add()
{

c=a+b;
System.out.println(c);
}
public static void main(String args[])
{
	Revise o=new Revise(10,40);

}
}
