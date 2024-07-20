package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;


public class HashMapEx {
	public static void main(String[] args) {
	Map<Integer,String > mymap=new HashMap();
	mymap.put(1, "Sachin");
	mymap.put(2, "Dhoni");
	mymap.put(3, "Virat");
	mymap.put(4, "Rohit");
	mymap.put(5, "Shikar");
	mymap.put(6, "Kedar");
	
	System.out.println(mymap);
	
	System.out.println(mymap.containsKey(3));
	System.out.println(mymap.containsValue("sehwag"));
	//mymap.clear();
	//System.out.println(mymap);
	mymap.remove(3);
	System.out.println(mymap);
	mymap.replace(6, "youvraj");
	System.out.println(mymap);
	
	Set<Integer>set=mymap.keySet();
	Iterator<Integer>it=set.iterator();
	while(it.hasNext()) {
		Integer key=it.next();
		System.out.println(key);
		System.out.println(mymap.get(key));
	}
	}
}
