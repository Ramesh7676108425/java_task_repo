package com.xworkz.curdoperation.things;

public class Crudchar {
	
	int index=0;
	char[] xyz=new char[4];
	
	public void getname(char letters) {
		
		if(index<xyz.length) {
			
			xyz[index]=letters;
			index++;
		}
	}

}
