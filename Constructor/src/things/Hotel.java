package things;

public class Hotel {
	
	public String name;
	public int cost;
	
	
	
	public Hotel() {
		System.out.println("default constructor");
	}



	public Hotel(String name, int cost) {
		//System.out.println("parametairaised constructor");
		
		this.name = name;
		this.cost = cost;
		System.out.println("name:"+this.name + " "+ "cost:"+this.cost);
	}
	

}
