package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Stringcollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a=new ArrayList<String>();
		a.add("Shefeena");
		a.add("Anu");
		a.add("Faizaan");
		a.add("Farha");
		System.out.println(a);    //output is [20, 15, 40, 66]
	    a.remove(1);
		System.out.println(a); 	//output is [20,40,66]
		int length=a.size();
		System.out.println(length);		//to know about the length of the array ,output is 3
		System.out.println(a.get(1));	//value of the memory location 1,output is 40
		boolean n=a.contains(30);		//check 30 is inside the array list,
		System.out.println(n);			//output is false
		Iterator it=a.iterator();		//iterate the values using while loop.
		while(it.hasNext())				//hasNext() is a method used for iterate the elements in the list in forward direction
		{
			System.out.println(it.next());	//next() is the method used to print each element
  }
		
	}

}
