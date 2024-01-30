package com.xworkz.collections33.driver;

import java.util.ArrayList;
import java.util.List;

public class CompanyName {
	
	public static void main(String[] args) {
		
		
		
		List clist=new  ArrayList();
		clist.add("capgemini");
		clist.add("dxc");
		clist.add("infosys");
		clist.add("tech mahindra");
		clist.add("siemans");
		clist.add("dell core");
		clist.add("accenture");
		clist.add("quest global");
		clist.add("cognigent");
		System.out.println(clist);
		
		System.out.println("index of object:"+clist.indexOf("dxc"));
		
		
		
System.out.println("size of list:"+clist.size());



    System.out.println("last index of:"+clist.lastIndexOf("accenture"));
    
    
    
    System.out.println("contains:"+clist.contains("dell core"));
    
    
    System.out.println("get index :"+clist.get(4));
    
    
    
    System.out.println("isEmpty:"+clist.isEmpty());
    
    
    
  //  System.out.println("remove by index:"+clist.remove(2));
    
    
    
  //  System.out.println("remove all:"+clist.removeAll(clist));
    
    System.out.println("set:"+clist.set(3, "xyz"));
    
    
    System.out.println("spliterator:"+clist.spliterator());
    
    
    
    System.out.println("sublist:"+clist.subList(3, 8));
    
    
    
    System.out.println("to array:"+clist.toArray(args));
    
    
    System.out.println("clist:"+clist.toArray());
    
    
    
    System.out.println("listIterator:"+clist.listIterator());
    
    System.out.println("containsAll:"+clist.containsAll(clist));
	}

}
