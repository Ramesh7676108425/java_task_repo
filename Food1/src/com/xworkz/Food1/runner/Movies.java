package com.xworkz.Food1.runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Movies {

	public static void main(String[] args) {

		List list = new ArrayList();

		Collections.addAll(list, "salar", "appu", "abhi", "mourya", "namma basava", "paramatma", "yuvaratna", "daasa",
				"kariya", "mugarumale", "mugulunage", "mandya", "kaatera", "jogi", "jogayya", "akash", "veea",
				"kalasipalya", "rajkumara", "gaalipata", "diya", "love mocktile", "pallavi anuapllavi", "premabaraha",
				"power", "jackey", "annabond", "milana", "bandana", "anand", "leo", "kabali", "kgf", "ramachari",
				"moggina manasu","krishna","yuva","siddartha","kirataka","rajahuli","masterpiece","rockey");
		System.out.println(list);
		System.out.println(list.size());
		System.out.println("sss:"+list.subList(20, 40));

		list.forEach((salar)->System.out.println(salar));
		System.out.println(list);


	}

}
