package com.xworkz.programming.things;

public class Structure {
	public static void main(String[] args) {
		String name="MusicalNight";
		char[] ch=name.toCharArray();
		for(int i=0;i<ch.length;i++) {
			char c=ch[i];
			if(Character.isUpperCase(c)) {
				c=Character.toLowerCase(c);
			}else if(Character.isLowerCase(c)) {
				c=Character.toUpperCase(c);
			}
			System.out.print(c);
		}
	}

}
