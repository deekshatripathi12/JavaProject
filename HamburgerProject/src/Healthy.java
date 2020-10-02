/**
 * 
 */

/**
 * @author fly
 *
 */
public class Healthy extends Hamburger{

	String ingredients;
	String topping="";
	double price=3.56;
	double lentil=3.41;
	double egg=5.43;
	double tomato=0.27;
	double lettuce=0.75;
	double cheese=1.13;
	public Healthy(String breadType, String meat)
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
			total =price +tomato + lettuce + egg;
			break;
			
		case "2":
			total =price +tomato + lettuce + lentil;
			break;
		
		case "3":
			total =price +tomato + lettuce + egg + cheese;
			break;
		
		case "4":
			total =price +tomato + lettuce + lentil + cheese;
			break;
		
		case "5":
			total =price +tomato + lettuce + lentil + cheese + egg;
			
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
			System.out.println("Egg added for 5.43");
		}
		else if(choice ==2) {
			
			System.out.println("Tomato added for 0.27");
			System.out.println("Lettuce added for 0.75");
			System.out.println("Lentils added for 3.41");
		}
		else if(choice ==3) {
			
			System.out.println("Tomato added for 0.27");
			System.out.println("Lettuce added for 0.75");
			System.out.println("Cheese added for 1.13");
			System.out.println("Egg added for 5.43");
		}
		
		else if(choice ==4) {
			
			System.out.println("Tomato added for 0.27");
			System.out.println("Lettuce added for 0.75");
			System.out.println("Cheese added for 1.13");
			System.out.println("Lentils added for 3.41");
		}
		else if(choice ==5) {
			
			System.out.println("Tomato added for 0.27");
			System.out.println("Lettuce added for 0.75");
			System.out.println("Cheese added for 1.13");
			System.out.println("Egg added for 5.43");
			System.out.println("Lentils added for 3.41");
		}
		else
		{
			System.out.println("No toppings added");
		}
		
		
		return null;
		
		
	
		
	}

}
