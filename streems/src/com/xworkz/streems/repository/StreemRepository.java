package com.xworkz.streems.repository;

public interface StreemRepository {
	
	boolean onsave(String streemName);
	
	String[] read();

}
