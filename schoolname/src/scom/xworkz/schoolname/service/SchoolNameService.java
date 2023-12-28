package scom.xworkz.schoolname.service;

public interface SchoolNameService {
	
	boolean validateandsaveS(String schoolName);
	
	boolean isExists(String schoolName);
	
	boolean update(String oldName,String newName);
	void read();
	
	boolean delete(String schoolName);

}
