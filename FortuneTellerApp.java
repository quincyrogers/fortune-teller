
import java.util.Scanner;

public class FortuneTellerApp {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		
		System.out.println("What is your first name?");
		String first = input.nextLine();
		System.out.println("What is your last name?");
		String last = input.nextLine();
		
		
		
		
		System.out.println("what is your age?");
		int age = input.nextInt();
		input.nextLine();
		int ageUser = age;

		System.out.println("What is you birth month?");
		double month = input.nextInt();
		input.nextLine();

		double bankBalance14 = 345.98;
		double bankBalance58 = 6291061.89;
		double bankBalance912 = 45.02;
		double bankBalance000 = 0.00;

		if (month > 0 && month <= 4)
			month = bankBalance14;
		if (month > 4 && month <= 8)
			month = bankBalance58;
		if (month >= 9 && month <= 12)
			month = bankBalance912;
		if (month == 0)
			month = bankBalance000;

		System.out.println("What is number of siblings you have?");
		int numberSiblings = input.nextInt();
		String location = input.nextLine();

		String location0 = "Naples, Italy";
		String location1 = "Tybee Island, Georgia";
		String location2 = "Watamu, Kenya";
		String location3 = "Bazaruto, Mozambique";
		String location4 = "Rio de Janeiro, Brazil";
		String location5 = "North Sentinel Island";

		System.out.println("What is your favorite ROYGBIV color");
		System.out.println("If you do not know what a ROYGBIV color is. Enter Help");
		String color = input.next();
		while (color.equals("Help")) {
			System.out.println("The ROYGBIV colors are red, orange, yellow, green, blue, indigo (Dark Blue), violet");
			System.out.println("What is your favorite ROYGBIV color");
			System.out.println("If you do not know what a ROYGBIV color is. Enter help");
			
			String red = "shopping cart.";
			String orange = "Ford F150 Raptor.";
			String yellow = "Corvette Stingray LT-1.";
			String green = "Pregnant Goat.";
			String blue = "helicopter.";
			String indigo = "Jeep Gladiator.";
			String violet = "boat.";
			
			
			input.close();	
		}

		{

		}
		
		if (ageUser % 2 == 0)
			System.out.print((first.toUpperCase())  + ( last.toUpperCase()) + " will retire in 44 years");
		else
			System.out.print((first.toUpperCase())  + ( last.toUpperCase()) +" will retire in 18 years");
		

		System.out.print(" with $" + month + " in the bank, ");

		System.out.print("a vacation home in ");
		if (numberSiblings == 0)
			System.out.println(location0);
		if (numberSiblings == 1)
			System.out.println(location1);
		if (numberSiblings == 2)
			System.out.println(location2);
		if (numberSiblings == 3)
			System.out.println(location3);
		if (numberSiblings > 3)
			System.out.println(location4);
		if (numberSiblings < 0)
			System.out.println(location5);
		
		System.out.print(", and travel by shopping cart.");
			
		
	}
	
}
