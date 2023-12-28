package com.workz.ramesh.boot;

public class StringMethod {
	public static void main(String[] args) {
		
		String sentence="sapatasagaradache yello";
		String wordToReverse="saptasagadache";
		String[] word=sentence.split(" ");
		String reverse="";
		
		for(int w=0;w<word.length;w++) {
			if(word[w].equalsIgnoreCase(wordToReverse)) {
			for(int i=word[w].length()-1;i>0;i--) {
				reverse=reverse+word[w].charAt(i);
			}
			word[w]=reverse;
			}
			
		}
		for (String w:word) {
			System.out.print(w+" ");
		}
		
	}

}
