package com.xworkz.collections33.driver;

import java.util.ArrayList;
import java.util.Comparator;

public class CMnames {
	
	public static void main(String[] args) {
		
		
		
		ArrayList arraylist=new ArrayList();
		arraylist.add("siddu");
		arraylist.add("stalin");
		arraylist.add("bsy");
		arraylist.add("yogi");
		arraylist.add("jagan");
		arraylist.add("sachin");
		System.out.println(arraylist);
		//clone
		System.out.println(arraylist.clone());
		//conatins
		System.out.println(arraylist.contains("sachin"));
		//conatins all
		System.out.println(arraylist.containsAll(arraylist));
		//equals 
		System.out.println(arraylist.equals(arraylist));
		//get method
		System.out.println(arraylist.get(4));
		//hashcode
		System.out.println(arraylist.hashCode());
		//index of
		System.out.println(arraylist.indexOf("bsy"));
		
		//is empty
		System.out.println(arraylist.isEmpty());
		
		//lastindex of
		System.out.println(arraylist.lastIndexOf("jagan"));
		
		//remove index
	//	System.out.println(arraylist.remove(5));
		
		//remove object
	//	System.out.println(arraylist.remove("jagan"));
		
		//remove all
		//System.out.println(arraylist.removeAll(arraylist));
		
		
		//tostring
		System.out.println(arraylist.toString());
		
		//set
		System.out.println(arraylist.set(3, "yogi"));
		
		//size
		System.out.println(arraylist.size());
		
		//get class
		System.out.println(arraylist.getClass());
		
		//splitrator
		System.out.println(arraylist.spliterator());
		
		//streem
		System.out.println(arraylist.stream());
		
		//
		//System.out.println(arraylist.sort((Comparator) arraylist));
		
		
		
		
	}

}
