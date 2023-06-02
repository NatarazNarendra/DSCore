package test.collectoin.col;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;
public class Test1Map {
	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		System.out.println("HashMap How it is  work Duplicate keys are not allowed ");
		map.put(1, "N");
		map.put(5, "A");
		map.put(2, "R");
		map.put(4, "E");
		map.put(3, "N");
		map.put(6, "D");
		map.put(7, "R");
	    map.put(5, "A");
	    map.put(8,"A");
	    map.put(null,"jani");
	    map.put(5, "Y");
	    map.put(null,"Siva");
	    map.put(9,null);
	    map.put(10, null);
	    System.out.println("Allows dulicate values only");
		System.out.println(map);
		System.out.println("Hash Map--Random Access in store key value paires");
		LinkedHashMap<Integer, String> linkedhashmap=new  LinkedHashMap<Integer, String>();
		
		
		System.out.println("StartLinkedHash Map!!!!!");
		linkedhashmap.put(1, "N");
		linkedhashmap.put(3, "A");
		linkedhashmap.put(2, "R");
		linkedhashmap.put(4, "E");
		linkedhashmap.put(5, "N");
		linkedhashmap.put(6, "D");
		linkedhashmap.put(7, "R");
		linkedhashmap.put(8, "A");
		linkedhashmap.put(null,"janu");
		linkedhashmap.put(5, "N");
		linkedhashmap.put(null,null);
		linkedhashmap.put(9,null);
		
		linkedhashmap.put(5, "Y");
		System.out.println(linkedhashmap);
		System.out.println(" linkedhashmap above element are Insertation order");
		TreeMap<Integer, String> tmap=new TreeMap<Integer, String>();
		System.out.println("TreeMap!!!!!  Does not allowed null keys");
		tmap.put(1, "N");
		tmap.put(5, "A");
		tmap.put(2, "R");
		tmap.put(4, "E");
		tmap.put(3, "N");
		tmap.put(6, "D");
		tmap.put(7, "R");
	    tmap.put(5, "A");
	    tmap.put(9,null);
	   tmap.put(null, "A");
		System.out.println(tmap);
		System.out.println(" above Treemap elements");
		Hashtable<Integer,String> table=new  Hashtable<Integer, String>();
		table.put(1, "N");
		table.put(5, "A");
		table.put(2, "R");
		table.put(4, "E");
		table.put(3, "N");
		table.put(6, "D");
		table.put(7, "R");
		table.put(8, "A");
		table.put(9,null);
		table.put(null, "A");
		System.out.println(table);
		
		
	}

}
