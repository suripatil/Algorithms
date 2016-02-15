)ckage practice;

import java.util.*;

package practice;

import java.util.*;

/* Java Program to sort Hashmap */

public class HashSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	HashMap <String,Integer> hm = new HashMap<String,Integer>();
	
	hm.put("Suri",10);
	hm.put("Sam", 01);
	hm.put("Abhi", 10);
	
	//Put the keys into ArrayList and sort it
	Set <String> keys = hm.keySet();
	ArrayList <String> list = new ArrayList<String>();
	list.addAll(keys);
	
	//Call sort method from Collections
	Collections.sort(list);
	
	//Display Sorted Key's with Values
	for (String key:list) {
		System.out.println(key + ":" + hm.get(key));
		}
	}
}

