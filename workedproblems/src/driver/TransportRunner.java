package driver;

import java.sql.Driver;

import things.Bus;
import things.Transport;

public class TransportRunner {
	
	public static void main(String[] args) {
		
		Transport t=new Transport();
		t.name="srl";
		t.cost=22;
		System.out.println(t.name);
		System.out.println(t.cost);
		
		Bus b=new Bus();
		b.busname="ughh";
		b.isprivate=true;
		System.out.println(b.busname);
		System.out.println(b.isprivate);
		
		
	}
	

}
