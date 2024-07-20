package Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_1 {
	//create method which can holding value 1-10

	public static void main(String[] args) {
		List numlist=new ArrayList();
		for (int i=1; i<=10; i++) {
			numlist.add(i);
		}
		System.out.println(numlist);
		System.out.println();
		System.out.println("****************************************************************");
		System.out.println("Create method return 1-15");
		
		for (int i=11; i<=15; i++) {
			numlist.add(i);
		}
		System.out.println(numlist);
	}
}
