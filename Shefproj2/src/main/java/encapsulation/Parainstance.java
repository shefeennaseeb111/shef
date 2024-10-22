package encapsulation;

public class Parainstance
{
int d,s;
public int add(int a,int b)
{
d=a+b;
return d;

}
public int add(int a,int b,int c)
{
s=a+b+c;
return s;
}

public static void main(String args[])
{
	Parainstance o1=new Parainstance();
	
int w=o1.add(30,40,50);
int e=o1.add(10,20);
System.out.println(w);
System.out.println(e);
}}

