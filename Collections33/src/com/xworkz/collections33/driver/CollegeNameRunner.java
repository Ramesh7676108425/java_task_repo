package com.xworkz.collections33.driver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Spliterator;

public class CollegeNameRunner {
	
	
	public static void main(String[] args) {
		
		
		Collection collection=new ArrayList();
		
		collection.add("PES");
		collection.add("VVCE");
		collection.add("RV");
		collection.add("ATME");
		collection.add("MIT");
		collection.add("SJCE");
		collection.add("NIE");
		collection.add("DYS");
		System.out.println(collection);
		System.out.println("size of collection:"+collection.size());
		System.out.println("collection:"+collection.hashCode());
		System.out.println("contains method:"+collection.contains("SJCE"));
		System.out.println("isempty method:"+collection.isEmpty());
		System.out.println("iterator:"+collection.iterator());
		System.out.println("collection:"+collection.getClass());
		//System.out.println("remove:"+collection.remove("DYS"));
		//System.out.println("remove:"+collection.removeAll(collection));
		System.out.println("collection:"+collection.retainAll(collection));
		ArrayList<String> spliterator=new ArrayList<String>();
		System.out.println("spliterator:"+collection.spliterator());
	}

}
