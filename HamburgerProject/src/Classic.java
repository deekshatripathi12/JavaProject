import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

/**
 * 
 */

/**
 * @author fly
 *
 */
public class Classic extends Hamburger {
	
	String ingredients;
	String topping="";
	double price=3.56;
	public Classic(String breadType, String meat)
	{
		super.breadType=breadType;
		super.meatType=meatType;
	}

	@Override
	public double getCost() {
		
		double total=price;
		switch(topping)
		{
		case "1":
			total =price +2.52;
			break;
			
		case "2":
			total =price +0.79;
			break;
		
		case "3":
			total =price +1.4;
			break;
		
		case "4":
			total =price +1.88;
			break;
		
		case "5":
			total =price +1.13;
			
			break;
			
		default:
		total=total;	
			
		
		}
		return total;
	}

	@Override
	public String getIngredients(int choice) {
		topping =choice+"";
		if(choice ==1)
		{
			System.out.println("Tomato added for 0.27");
			System.out.println("Lettuce added for 0.75");
			System.out.println("Cheese added for 1.13");
		}
		else if(choice ==2) {
			
			System.out.println("Tomato added for 0.27");
			System.out.println("Lettuce added for 0.75");
		}
		else if(choice ==3) {
			
			System.out.println("Tomato added for 0.27");
			
			System.out.println("Lettuce added for 1.13");
		}
		
		else if(choice ==4) {
			
			System.out.println("Lettuce added for 0.75");
			System.out.println("Cheese added for 1.13");
		}
		else if(choice ==5) {
			
			System.out.println("Cheese added for 1.13");
		}
		else
		{
			System.out.println("No toppings added");
		}
		
		
		return null;
		
		
	}
	

}
