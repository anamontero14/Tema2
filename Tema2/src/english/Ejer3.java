package english;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {

		// Variable to store the height
		double height;

		// Variable to store the lowest height
		double lowest;

		// Variable to store the maximum height
		double highest;

		// Initialize the Scanner
		Scanner reader = new Scanner(System.in);

		// I ask the user for the data
		System.out.println("Introduce your height:");

		// I sore the data in the variable
		height = reader.nextDouble();

		/*
		 * What i do here is store the data that is already in the var height and asign
		 * it to the var "lowest" and "highest". That way the minimum will be the lowest
		 * number introduced and the other way around for the maximum
		 */
		lowest = height;
		highest = height;

		/*
		 * If the height the user introduced a number different than 0 then the program
		 * will check if the data in the var "height" is bigger than the one in the var
		 * "highest" and it will do the same with the var "lowest" but the other way
		 * around
		 */
		while (height > 0) {

			if (height > highest) {
				highest = height;
			}

			if (height < lowest) {
				lowest = height;
			}

			// I ask the user for the data
			System.out.println("Introduce your height:");

			// I sore the data in the variable
			height = reader.nextDouble();

		}

		// I show the results
		System.out.println("Minimum height: " + lowest);
		System.out.println("Maximum height: " + highest);

		// Close the Scanner
		reader.close();

	}

}
