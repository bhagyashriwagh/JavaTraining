package Collection;

import java.util.ArrayList;
import java.util.List;
public class ArrayListEx {

	public static void main(String[] args) {
		
		List mylist=new ArrayList();
		mylist.add("Sachin");
		mylist.add("Virat");
		mylist.add("Dhoni");
		mylist.add("Yuovraj");
		mylist.add("Sachin");
		System.out.println(mylist);
		
		for(int i=0; i<mylist.size();i++) 
		{
			System.out.println(mylist.get(i));
		}
		

	}

}