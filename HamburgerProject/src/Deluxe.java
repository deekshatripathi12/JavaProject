/**
 * 
 */

/**
 * @author fly
 *
 */
public class Deluxe extends Hamburger {

	String ingredients;
	String breadType;
	String meat;
	double price=3.56;
	double sausage=4.5;
	double bacon=4.5;
	double chips =2.75;
	double drink=1.81;
	
	
	
	public Deluxe(String breadType, String meat)
	{
		super.breadType=breadType;
		super.meatType=meatType;
		setBreadType(breadType);
		setMeat(meat);
	}
	public String getBreadType() {
		return breadType;
	}
	public void setBreadType(String breadType) {
		this.breadType = breadType;
	}
	public String getMeat() {
		return meat;
	}
	public void setMeat(String meat) {
		this.meat = meat;
	}
	@Override
	public double getCost() {
		double total=price;
		if(getMeat().equalsIgnoreCase("Sausage and Bacon"))
			total = total + sausage +bacon;
			
		else
			total =total + bacon;
		return total+ chips + drink;
	}

	@Override
	public String getIngredients(int choice) {
		System.out.println("Cannot add additional items to a Deluxe burger");
		System.out.println("Added chips for an extra "+ chips);
		System.out.println("Added chips for an extra "+ drink);
		
		return null;
		
	}

}
