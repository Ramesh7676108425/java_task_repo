package com.xworkz.Food1.runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Countries {
	public static void main(String[] args) {
		
		List list=new ArrayList();
		
		
		Collections.addAll(list,"China","Mexico","Italy","Spain","Russia","Argentina","Nigeria","South Korea","Egypt","Turkey","Indonesia","Saudi Arabia","Pakistan","Thailand","Vietnam","Canada","Philippines","Iran","Malaysia","Colombia","Netherlands","Belgium","Switzerland","Sweden","Norway","Denmark","Finland","Portugal","Greece","New Zealand","Singapore","Austria","Hungary","Poland","Czech Republic","Ireland","Chile","Peru","Ukraine","Romania","Israel","United Arab Emirates","South Africa","Kenya","Nigeria","Algeria","Morocco","Ghana","Ethiopia","Uganda","Tanzania","Angola","Mozambique","Zimbabwe","Botswana","Madagascar","Malawi","Bangladesh","Sri Lanka","Maldives","Bhutan","Nepal","Afghanistan","Iraq","Syria","Lebanon","Jordan","Kuwait","Qatar","Oman","Russia","Argentina","Nigeria","South Korea","China","Mexico","Italy","Spain","Russia","Argentina","Nigeria","South Korea","Egypt","Turkey","Indonesia","Saudi Arabia","Pakistan","Thailand");
		System.out.println(list);
		System.out.println(list.size());
		
		list.subList(2, 10);
		
		list.forEach((x)->System.out.println(x));
		System.out.println(list);
	}

}
