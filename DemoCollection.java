package practice;

import java.util.*;

/* Collection - Arrays/Linked List/Hash Set's/Hash Map */

public class DemoCollection {
	
	public static void main(String [] args) {
	
	//ArrayList
	List<String> a1 = new ArrayList<String>();
	a1.add("Surendra");
	a1.add("Sam");
	a1.add("Steven");
	a1.add("sam");
	System.out.println("Array list ");
	System.out.print("\t lenghth:" + a1.size()+ a1);
	
	//Linkedlist
	List <String> l1 = new LinkedList<String>();
	l1.add("Suri");
	l1.add("Sami");
	l1.add("Stevie");
	l1.add("Suri");
	System.out.println();
	System.out.println("Linked List");
	System.out.print("\t"+l1);
	
	//HashSet's
	Set <Integer> s1 = new HashSet<Integer>();
	s1.add(10);
	s1.add(20);	
	System.out.println();
	System.out.println("Hash Set");
	System.out.print("\t"+s1);
	
	//HashMap's
	//Old method - Map<String,Integer> hm = new HashMap<String, Integer>();
	HashMap<String,Integer> hm = new HashMap<String, Integer>();
	
	//Put Method to insert Key->value
	hm.put("Suri",47);
	hm.put("Sam",16);
	hm.put("Steve",30);
	
	System.out.println("\nDisplaying Hashmap");
	System.out.println("\t" + hm);
	
	//Get - To get value of the specified key
	int a = hm.get("Sam");
	System.out.println();
	System.out.println("\n HashMap Examples");
	System.out.println("Getting value");
	System.out.println(hm.get("Suri"));
	System.out.println(a);
	
	//Get All the Keys and Print
	System.out.println("Printing All the Keys");
	Set <String> keys = hm.keySet();
	for (String key :keys) {
		System.out.println(key);
	}
	
	
	}	
}

