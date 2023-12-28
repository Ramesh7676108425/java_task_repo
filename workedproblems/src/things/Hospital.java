package things;

public class Hospital {
	
	public String name;
	public int numberOfDoctors;
	
	
	public Hospital() {
		System.out.println("default constructor");
	}


	public Hospital(String name, int numberOfDoctors) {
		
		this.name = name;
		this.numberOfDoctors = numberOfDoctors;
		System.out.println("name is:"+name+" "+ " number of doctors:"+numberOfDoctors);
	}
	

}
