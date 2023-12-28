package com.xorkz.hierarchialInheritance.things;

public class TransportRunner {
	
	public static void main(String[] args) {
		
		Transport t=new Transport();
		t.name="srl";
		t.price=500000;
		System.out.println(t.name);
		System.out.println(t.price);
		
		Bus b=new Bus();
		b.busName="kuh";
		b.busprice=3333;
		
		System.out.println(b.busName);
		System.out.println(b.busprice);
		
		
		Manufacture m=new Manufacture();
		m.enginePrice=2222;
		m.model="gugiu";
		System.out.println(m.enginePrice);
		System.out.println(m.model);
		
	}

}
