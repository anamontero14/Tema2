package boletinfor;

import java.util.Scanner;

public class Ejer8 {

	public static void main(String[] args) {

		/*
		 * Realiza un programa que pida dos números enteros A y B. Luego visualiza los
		 * números que hay entre A y B. Si A es menor que B, entonces debe mostrar los
		 * números desde A hasta B. Si B es menor que A, entonces debe mostrar los
		 * números desde B hasta A
		 */

		/*
		 * Variables que almacenarán los nº introducidos por el usuario, el primer nº y
		 * el segundo nº respectivamente
		 */
		int num1 = 0;
		int num2;

		// Creación del Scanner
		Scanner leer = new Scanner(System.in);

		// Le pido al usuario que introduzca los dos nº
		System.out.println("Introduzca los dos nº, el A y el B respectivamente:");

		// Asigno a las variables los nº introducidos
		num1 = leer.nextInt();
		num2 = leer.nextInt();

		if (num1 < num2) {

			for (num1 = num1; num1 < num2; num1++) {
				System.out.println(num1);
			}

		} else {
			for (num2 = num2; num2 < num1; num2++) {
				System.out.println(num2);
			}
		}

		// Cerrar el Scanner
		leer.close();

	}

}
