
public class Multiplecatch {
	int d=10;
	int r;
	String s;
	public void infin()
	{
		try
		{
			
		int a[]=new int[3];
		System.out.println(a[3]);
		
		int r=d/0;
		System.out.println(r);
		 String s=null;  
         System.out.println(s.length());  
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException occurs"+e);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception handling"+e);
		}
		catch(NullPointerException x)
		{
		System.out.println("Null point exception");	
		}
		finally
		{
			System.out.println("Helloooo");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiplecatch o=new Multiplecatch();
		o.infin();
	}

}


//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
