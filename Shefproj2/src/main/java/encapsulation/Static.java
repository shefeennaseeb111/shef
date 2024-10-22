package encapsulation;

public class Static
{
static int a;
static int b;
static int c;
public static int add(int a,int b)
{
	
c=a+b;
return c;
}
public static void main(String args[])
{
Static.add(30,60);
System.out.println(c);
}
}