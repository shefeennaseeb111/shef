package encapsulation;

public class Instance
{
 
 int c;
public int add(int a,int b)
{

c=a+b;
return c;

}
public static void main(String args[])
{
Instance o=new Instance();

System.out.println(o.add(30,40));
}
}