package things;

public class Hotel extends SouthFood {
	
	protected String hotelName;
	protected float reviews;
	protected boolean isGood;
	
	
	public void getSouthFoodInfo() {
		super.isSpicy=true;
		super.name="guhh";
		super.price=333;
		
		System.out.println(super.isSpicy);
		System.out.println(super.name);
		System.out.println(super.price);
	}

}
