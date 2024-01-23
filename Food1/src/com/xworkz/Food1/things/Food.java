package com.xworkz.Food1.things;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Food {
	
	
	public static void main(String[] args) {
		
		
		List list=new ArrayList();
		list.add("Dose");
		list.add("palav");
		list.add("idli");
		list.add("uppittu");
		list.add("holige");
		list.add("rice");
		list.add("Geerice");
		list.add("JeeraRice");
		list.add("Rotti");
		list.add("Akkirotti");
		list.add("rasmalia");
		list.add("chicken");
		list.add("mutton");
		list.add("biriyani");
		list.add("kaima");
		list.add("boti");
		list.add("payasa");
		list.add("kabab");
		list.add("palya");
		list.add("beetroot");
		list.add("laadu");
		list.add("pepper dry");
		list.add("chilly chicken");
		list.add("ice cream");
		list.add("chacolate");
		list.add("xyz");
		
		list.add("x");
		list.add("y");
		list.add("z");
		list.add("rr");
		list.add("tt");
		Collections.addAll(list,"gg", "uifuf","ufuf");
		
		System.out.println(list);
		System.out.println(list.contains("Dose"));
		System.out.println(list.remove(20));
		System.out.println(list.size());
		//for(String foodlist:ArrayList) {
		//	System.out.println(list);
		// }
	}

}
