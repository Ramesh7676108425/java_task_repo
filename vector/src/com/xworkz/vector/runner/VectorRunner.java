package com.xworkz.vector.runner;

import java.util.Vector;

public class VectorRunner {
	
	public static void main(String[] args) {
		
		
		
		Vector <Integer> namvector=new Vector<>();
		
		namvector.add(10);
		namvector.add(20);
		namvector.add(30);
		namvector.add(40);
		namvector.add(50);
		namvector.add(60);
		
		
		//size of the namvectro 
		System.out.println("size of numvector is:"+namvector.size());
		
		//display the content of the vector
		
		System.out.println("all the element is:"+namvector);
		
		//for each method
		for(Integer num:namvector) {
			System.out.println(num);
			
			
		}

		//insert another number at index 3 
		namvector.add(3, 100);
		
		System.out.println("numbers:"+namvector);
		
		///capacity of vector
		namvector.capacity();
		System.out.println("capacity:"+namvector);
		
		////clone
		namvector.clone();
		System.out.println("clone:"+namvector);
		//contains 
		namvector.contains(20);
		System.out.println("contains:"+20);
		
		//first element of vector
		namvector.firstElement();
		System.out.println("first elemnt:"+10);
		
		//sublist
		namvector.subList(2, 5);
	System.out.println("capacity:"+namvector);
		
	}

}
