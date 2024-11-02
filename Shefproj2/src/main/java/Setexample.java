
import java.util.LinkedHashSet;
import java.util.Set;


public class Setexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> ob=new LinkedHashSet<String>();
		ob.add("Shefeena");
		ob.add("Farha");
		ob.add("Faizaan");
		System.out.println(ob);
		for(String o:ob)
		{
			System.out.println(o);
		}
	}

}
