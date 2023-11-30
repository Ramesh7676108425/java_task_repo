package com.xworkz.arrays.things;

import java.util.Arrays;
import java.util.Collections;

public class SortingElement {
	//sorting of elements by built in method
	public static void main(String[] args) {
//		
//		//approch 1
//		
//		int[] a= {30,50,20,10,60};
//		System.out.println("Arrays elements before sorting:"+Arrays.toString(a));
//		
//		Arrays.parallelSort(a);
//		System.out.println("Arrays elements after sorting:"+Arrays.toString(a));
//		
//		
		
//		
//		//approch 2
//		
//		int[] r= {30,50,20,10,60};
//		System.out.println("Arrays elements before sorting:"+Arrays.toString(r));
//		
//		Arrays.sort(r);
//		System.out.println("Arrays elements after sorting:"+Arrays.toString(r));
//		
//		
		//reverse order or descending order
		
		Integer[] s= {30,50,20,10,60};
		System.out.println("Arrays elements before sorting:"+Arrays.toString(s));
		
		Arrays.sort(s,Collections.reverseOrder());
		System.out.println("Arrays elements after sorting:"+Arrays.toString(s));
		
		
		
	}

}
