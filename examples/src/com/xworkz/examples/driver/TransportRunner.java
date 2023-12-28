package com.xworkz.examples.driver;

import com.xworkz.examples.things.Bus;
import com.xworkz.examples.things.Driver;
import com.xworkz.examples.things.Transport;

public class TransportRunner {
	
	public static void main(String[] args) {
		
		Transport t=new Transport();
		t.name="srl";
		t.cost=2222;
		System.out.println(t.name);
		System.out.println(t.cost);
		
		
		Bus b=new Bus();
		b.name="tttt";
		b.price=2222;
		System.out.println(b.name);
		System.out.println(b.price);
		
		
		Driver d=new Driver();
		d.name="name";
		d.age=12;
		System.out.println(d.name);
		System.out.println(d.age);
		
	}

}
