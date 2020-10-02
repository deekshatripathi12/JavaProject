import java.util.Scanner;

/**
 * 
 */

/**
 * @author fly
 *
 */
public class MainClass {
	static Hamburger hamburger = null;
	static Scanner scan=new Scanner(System.in);
	
	
	//Simple Burger
	static void createClassic(int choice) {
		if(choice==1)
		{
			 hamburger=new Classic("White bread", "Sausage");
		}
		else if(choice==2)
		{
			 hamburger=new Classic("White bread", "Bacon");
		}
		
		System.out.println("More toppings??");
		System.out.println("1 Yes");
		System.out.println("2 No ");
		
		int toppingQ=scan.nextInt();
		if(toppingQ==1)
		{
			System.out.println("1. Tomato + Lettuce + Cheese");
			System.out.println("2. Tomato + Lettuce");
			System.out.println("3. Tomato +Cheese");
			System.out.println("4. Lettuce +Cheese");
			System.out.println("5. Cheese");
			int toppingC=scan.nextInt();
			
			if(toppingC==1 || toppingC==2 || toppingC==3  || toppingC==4  || toppingC==5  )
			{
				hamburger.getIngredients(toppingC);
				double total=hamburger.getCost();
				System.out.println("Total Burger price is " + total );
			}
			
		}
		else {
			hamburger.getCost();
			double total=hamburger.getCost();
			System.out.println("Total Burger price is " + total );
		}
	}
	
	
	//Healthy Burger
		static void createHealthy(int choice) {
			if(choice==1)
			{
				 hamburger=new Healthy("Brown Rye Bread", "Sausage");
			}
			else if(choice==2)
			{
				 hamburger=new Healthy("Brown Rye Bread", "Bacon");
			}
			
			System.out.println("More toppings??");
			System.out.println("1 Yes");
			System.out.println("2 No ");
			
			int toppingQ=scan.nextInt();
			if(toppingQ==1)
			{
				System.out.println("1. Tomato + Lettuce + Egg");
				System.out.println("2. Tomato + Lettuce + Lentils");
				System.out.println("3. Tomato + Lettuce + Cheese + Egg");
				System.out.println("4. Tomato + Lettuce + Cheese + Lentils");
				System.out.println("5. Tomato + Lettuce + Cheese + Egg + Lentils");
				int toppingC=scan.nextInt();
				
				if(toppingC==1 || toppingC==2 || toppingC==3  || toppingC==4  || toppingC==5  )
				{
					hamburger.getIngredients(toppingC);
					double total=hamburger.getCost();
					System.out.println("Total Burger price is " + total );
				}
				
			}
			else {
				hamburger.getCost();
				double total=hamburger.getCost();
				System.out.println("Total Burger price is " + total );
			}
		}
		
		//Deluxe Burger
		static void createDeluxe(int choice) {
			double total=0;
			if(choice==1)
			{
				 hamburger=new Deluxe("White Roll Bread", "Sausage and Bacon");
				 hamburger.getIngredients(0);
				 total=hamburger.getCost();
			}
			else if(choice==2)
			{
				 hamburger=new Deluxe("White roll bread", "Bacon");
				 hamburger.getIngredients(0);
				 total=hamburger.getCost();
			}
			System.out.println("Total Burger price is " + total );
		}
		
		
		
	public static void main(String[] args) {
		
		System.out.println("welcome to shamim burgers");
		System.out.println("Our Menu");
		System.out.println("1 Classic Burger");
		System.out.println("2 Healthy Burger");
		System.out.println("3 Deluxe Burger");
		Hamburger hamburger = null;
		int choice=Integer.parseInt(scan.nextLine());
		int meatC;
		
		switch(choice) {
		
		case 1:
			System.out.println("Please select the Meat type");
			System.out.println("1 Sausage");
			System.out.println(" 2 Bacon");
			 meatC=Integer.parseInt(scan.nextLine());
			createClassic(meatC);
			break;
			
			
		case 2:
			System.out.println("Please select the Meat type for Healthy Burger");
			System.out.println("1 Sausage");
			System.out.println("2 Bacon");
			 meatC=Integer.parseInt(scan.nextLine());
			 createHealthy(meatC);;
			 break;
			 
		case 3:
			System.out.println("Please select the Meat type for Healthy Burger");
			System.out.println("1 Add both Sausage and Bacon");
			System.out.println("2 Add only Bacon ");
			 meatC=Integer.parseInt(scan.nextLine());
			createDeluxe(meatC);
			break;
			
		default:
			System.out.println("Wrong input entered-- Restart your choices");
			
			
			
			
			
			
		}
		
		
		
		
		
	}

}
