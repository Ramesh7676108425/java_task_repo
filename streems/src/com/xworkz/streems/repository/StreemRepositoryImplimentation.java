package com.xworkz.streems.repository;

public class StreemRepositoryImplimentation implements StreemRepository {

	
	private String[] streem=new String[3];
	private int index=0;
	@Override
	public boolean onsave(String streemName) {
		if(streem==null||index>=streem.length) {
			System.out.println("array is null and index is greter than given value");
		}
		else {
			if(index<streem.length) {
				streem[index]=streemName;
				index++;
				return true;
			}
		}
		return false;
	}
	@Override
	public String[] read() {
		return streem;
	}

}
