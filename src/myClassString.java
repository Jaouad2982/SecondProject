
import java.util.Scanner;

public class myClassString {
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String response;
		// Creation of StringClass which has both a set and get method
		StringClass string = new StringClass();
		System.out.println("Enter your String's name");
		String myStr = input.nextLine();
		string.setString(myStr);
		string.getString();
		// The do while method checks whether the string is equal to the user
		// input
		// based on three options yes or no or something else
		do {
			checkString(myStr);
			System.out.println("Enter y to continue N to quit");
			response = input.nextLine();
			if (response.equalsIgnoreCase("N")) {
				System.out.println("Thank you and have a good day");
			} else if (response.equalsIgnoreCase("y")) {
				checkString(myStr);

			} else

			{
				System.out.println("Invalid input");
			}

			System.out.println("Plz try again");
			response = input.nextLine();

		} while (response.equalsIgnoreCase("y"));

	}

	// method which checks and prompts the user for a string name
	public static void checkString(String myStr) {
		System.out.println("Enter your String answer to see if it matches or not");
		String myString = input.nextLine();
		if (myString.equalsIgnoreCase(myStr)) {
			System.out.println("You got the right String");
		}
	}

}