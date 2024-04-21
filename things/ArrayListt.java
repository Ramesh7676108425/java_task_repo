package com.xworkz.Collection.things;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListt {
	public static void main(String[] args) {
		
		ArrayList<String> arraylist=new ArrayList <String>();
		arraylist.add("sushs");
		arraylist.add("tanu");
		arraylist.add("leena");
		arraylist.add("shireena");
		arraylist.add("joe");
		arraylist.add("ivana");
		arraylist.add("pooja");
		arraylist.add("deekshitha");
		arraylist.add("prakruthi");
		arraylist.add("apeksha");
		arraylist.add("pallavi");
		
		
		System.out.println("arraylist size is:"+arraylist.size());
		
		System.out.println("arraylist isempty is:"+arraylist.isEmpty());
		
		System.out.println("arraylist adding new element is:"+arraylist.add("neha"));
		
		arraylist.add(3, "malavika");
		System.out.println(arraylist);
		
		
		System.out.println("getting element is:"+arraylist.get(3));
		
		System.out.println("setting element is:"+arraylist.set(3, "rachitha"));
		
		System.out.println("contains method:"+arraylist.contains("pallavi"));
		
		Collections.sort(arraylist);
		System.out.println(arraylist);
		
		
		
		//for loop using in arraylist
		
		for(int i=0;i<arraylist.size();i++) {
			System.out.println(arraylist.get(i));
		}
		
		
		//for each
		for(String e:arraylist) {
			System.out.println(e);
		}
		
		//traversing a arraylist using a iterator
		
		Iterator itr=arraylist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//for each() method
		arraylist.forEach(a->System.out.println(a));
		
		
		
		//for each reamining method
		System.out.println("for ecah remaining method");
		Iterator  e=arraylist.iterator();
		e.forEachRemaining(a->System.out.println(a));
		
		
		
		//iterates in reverse oreder
		
		System.out.println("here  iterates in reverse oreder ");
		
		ListIterator  itrr =arraylist.listIterator();
		while(itrr.hasPrevious()) {
			
			System.out.println(itrr.next());
		}
	}
	
	

}
