package Collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		Set<String> countryset=new HashSet();
		countryset.add("Landon");
		countryset.add("USA");
		countryset.add("Canada");
		countryset.add("Jermani");
		countryset.add("France");
		countryset.add("Netherland");
		countryset.add(null);
		countryset.add(null);
		
		System.out.println(countryset);
		
	System.out.println("************************************************************");
	
	for(String Country: countryset ) {
		
		System.out.println(Country);
	}
	System.out.println("************************************************************");
	countryset.remove("USA");
	System.out.println(countryset);
	System.out.println("************************************************************");
	countryset.size();
	System.out.println(countryset.size());
	
	
	

	}

}
