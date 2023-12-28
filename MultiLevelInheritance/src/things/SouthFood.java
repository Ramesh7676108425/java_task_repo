package things;

public class SouthFood extends Food {
	
	protected String  name;
	
	protected int price;
	protected boolean isSpicy;
	
	
	
	public void getFoodinfo() {
		super.foodName="biriyani";
		super.foodType=21;
		super.price=333;
		
		
		System.out.println("food name is:"+super.foodName);
		System.out.println("food type is :"+super.foodType);
		System.out.println("food price is:"+super.price);
	}

}
