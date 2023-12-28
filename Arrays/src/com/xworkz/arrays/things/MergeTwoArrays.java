package com.xworkz.arrays.things;

import java.util.Arrays;

public class MergeTwoArrays {
	
	public static void main(String args[]) {
		
		int[] num1= {1,2,3};
		
		int[] num2 = {4,5,6};
		
		int[]  num3=new int [num1.length+num2.length];
		//System.out.println(num3);
		for(int i=0;i<num1.length;i++) {
			num3[i]=num1[i];//1,2,3,0,0,0,
		}
		for (int i=0;i<num2.length;i++) {
			num3[num1.length+i]=num2[i];
		}
		System.out.println(Arrays.toString(num3));
	}

}
