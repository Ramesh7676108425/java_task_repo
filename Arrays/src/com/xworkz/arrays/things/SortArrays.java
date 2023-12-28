package com.xworkz.arrays.things;

import java.util.Arrays;

public class SortArrays {
	
	public static void main(String[] args) {
		
		int[] num1= {4,3,1,2};
		
		for (int i=0;i<num1.length;i++) {
			for(int j=i+1;j<num1.length;j++) {
				if(num1[i]>num1[j]) {
					int temp =num1[i];
					num1[i]=num1[j];
					num1[j]=temp;
				}
			}
		}
			//System.out.println(arrays.toString(num1));
		
		
		System.out.println(Arrays.toString(num1));
	
		}
		}

