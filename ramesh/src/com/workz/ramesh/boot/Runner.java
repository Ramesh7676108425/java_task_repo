package com.workz.ramesh.boot;

import com.workz.ramesh.College;
import com.workz.ramesh.School;

public class Runner {
	public static void main(String[] args) {
		System.out.println("Invoking main in Runner");
		School sc = new School();
		sc.teach();
		College col = new College();
		col.teach();
		col.learn();
	}
}
