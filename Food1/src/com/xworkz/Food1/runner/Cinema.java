package com.xworkz.Food1.runner;

import java.util.ArrayList;
import java.util.List;

public class Cinema {
	public static void main(String[] args) {
		
		
		
		List list=new ArrayList();
		list.add("kaatera");
		list.add("yuvaratna");
		list.add("salar");
		list.add("salar");
		//list.add("salar");
		//list.add("kaatera");)
		System.out.println("list of cinema is:"+list);
		
		System.out.println("deleted cinema is:"+list.remove(1));
		System.out.println("cinema conatins:"+list.size());
		System.out.println("kbvkjb:"+list.indexOf("salar"));
		System.out.println("vjnb:"+list.equals("kaatera"));
		//System.out.println("bifbi:"+list.");
		
	}

}
