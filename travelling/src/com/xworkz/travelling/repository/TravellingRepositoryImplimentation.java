package com.xworkz.travelling.repository;

public class TravellingRepositoryImplimentation implements TravellingRepository {
	
	
	private String[] places=new String[4];
	int index=0;
	

	@Override
	public boolean onSave(String placeName) {
		
		if(places==null&&index>=places.length) {
			System.out.println("array is not full");
		}
		
	
	else {
		if(index>places.length) {
			places[index]=placeName;
			index++;
			System.out.println("placename is added successfully");
			return true;
			
		}
	}
return false;
}
}
