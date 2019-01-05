
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

		System.out.println("What is you birth month?");
		String month = input.nextLine();
		System.out.println();

		System.out.println("What is your favorite ROYGBIV color");
		System.out.println("If you do not know what a ROYGBIV color is. Enter Help");
		String color = input.nextLine();
		while (color.equals("Help")) {
			System.out.println("R for Red, O for Orange, Y for Yellow, G for Greeen, B for Blue, I for Dark Purple, V for Light Purple");
			System.out.println("What is your favorite ROYGBIV color");
			System.out.println("If you do not know what a ROYGBIV color is. Enter help");
			color = input.nextLine();
			
		System.out.println("What is number of siblings you have?");
		String numberSiblings = input.nextLine();
		
		}

	}

}
