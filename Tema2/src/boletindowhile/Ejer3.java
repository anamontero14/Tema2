package boletindowhile;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {

		/*
		 * Realiza un programa que sume los números desde el 1 hasta un número N que se
		 * introducirá por teclado. Si el usuario introduce un 5, el programa debe
		 * devolver la suma de 1+2+3+4+5
		 */

		// Variable que almacenará los nº
		int num = 1;

		// Variable que almacenará el nº introducido
		int hasta;

		// Variable que almacenará la suma de todos los nº
		int suma = 1;

		// Inicializar el Scanner
		Scanner leer = new Scanner(System.in);

		System.out.println("Introduzca un nº:");
		hasta = leer.nextInt();

		if (hasta == 0) {
			System.out.println("La suma de todos los números hasta " + hasta + " es " + 0);
		} else {

			/* Imprime "Introduzca un nº" mientras que el num sea menor o igual que N */
			do {

				++num;

				suma += num;

			} while (num < hasta && hasta != 0);

			System.out.println("La suma de todos los números hasta " + hasta + " es " + suma);

		}

		// Cerrar el Scanner
		leer.close();

	}

}
