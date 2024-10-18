package english;

import java.util.Random;
import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {

		// Variable that will contain the number typed by the user
		int num;

		// I create the Scanner
		Scanner reader = new Scanner(System.in);

		// I create the random number
		Random random = new Random();

		// I store the random number created in this var
		int rand = random.nextInt(1, 101);

		// I tell the user what they have to do
		System.out.println("Guess the random number");

		// I store the data in the var
		num = reader.nextInt();

		// While "num" isnt either -1 or the random number the while will continue
		while (num != -1 && num != rand) {

			if (num > rand) {
				System.out.println("This number is greater than the number to guess");
			}

			if (num < rand) {
				System.out.println("This number is less than the number to guess");
			}

			// I tell the user what they have to do
			System.out.println("Guess the random number");

			// I store the data in the var
			num = reader.nextInt();

		}

		if (num == -1) {
			System.out.println("You gave up :(");
		} else {
			System.out.println("Congratulations! You win!");
		}

		// Scanner closed
		reader.close();

	}

}
