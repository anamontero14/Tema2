package english;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {

		// Variable that will store the number the user will introduce
		int num;
		
		// Variable to multiply the number
		int multiply;

		// Variable to count
		int count = 0;

		// Initialize the Scanner
		Scanner reader = new Scanner(System.in);

		// I ask the user for data
		System.out.print("Introduce a number:");

		// I store the data introduced in the var num
		num = reader.nextInt();

		while (count <= 10) {
			++count;
			
			
						
			System.out.println("");
		}

		// Close the Scanner
		reader.close();

	}

}
