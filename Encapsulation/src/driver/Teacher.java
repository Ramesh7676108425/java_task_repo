package driver;

import things.Student;

public class Teacher {
	
	public static void main(String args[]) {
		Student xy=new Student();
		xy.setRollNumber(22);
		xy.setName("ramesh");
		
		System.out.println("rollnumber is:"+xy.getRollNumber());
		System.out.println("name is :"+xy.getName());
		
		
	}

}
