package english;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {

		// Var to store the number the user will introduce
		int num;

		// Initialize the Scanner
		Scanner reader = new Scanner(System.in);

		// Ask the user for a number
		System.out.println("Type a number:");

		// Store the data in the var "num"
		num = reader.nextInt();

		/*
		 * I create a loop where if the division between the number and 2 is 0 then the
		 * number is even and if the division is NOT 0 then its odd and it will show
		 * that on the screen
		 */
		while (num >= 0) {

			if (num % 2 == 0) {
				System.out.println("Even");
			}

			if (num % 2 != 0) {
				System.out.println("Odd");
			}

			// Ask the user for a number
			System.out.println("Type a number:");

			// Store the data in the var "num"
			num = reader.nextInt();

		}

		// The program has ended and I show a message on the screen
		System.out.println("End of the program");

		// Close the Scanner
		reader.close();

	}

}
