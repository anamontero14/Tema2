package ejerciciosbucles;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {

		/*
		 * Realiza un programa que nos pida un número n y nos diga cuántos números hay
		 * entre 1 y n que sean primos
		 */

		// Variable para almacenar el nº introducido
		int num;

		// Almacenar el nº de divisores
		int divisores = 0;

		// Iniciar el Scanner
		Scanner leer = new Scanner(System.in);

		// Le pido al usuario que introduzca un nº
		System.out.println("Introduzca un nº");

		// Almaceno el nº en la variable
		num = leer.nextInt();

		// Cuento desde 2 hasta un nº por debajo del nº introducido

		for (int i = 1; i < num; i++) {

			for (int j = 2; j < num; i++) {

				// Si el resto de dividir el nº entre i es 0
				if (num % i == 0) {

					// Le incremento 1 a la variable divisores
					++divisores;

				}

			}
		}
		/*
		 * Si la variable divisores es igual a 0 significa que ningún número desde 2
		 * hasta num - 1 es divisible por el nº introducido lo que significa que ES
		 * PRIMO en cambio si la variable no es igual a cero significará que sí tiene
		 * divisores dentro de ese rango y que por lo tanto NO ES PRIMO
		 */
		if (divisores == 0) {

			System.out.println("El número es primo");

		} else {

			System.out.println("El número NO es primo");

		}

		// Cerrar el Scanner
		leer.close();

	}

}
