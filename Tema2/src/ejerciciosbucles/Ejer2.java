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

		int resto;

		int primos = 0;

		// Iniciar el Scanner
		Scanner leer = new Scanner(System.in);

		// Le pido al usuario que introduzca un nº
		System.out.println("Introduzca un nº");

		// Almaceno el nº en la variable
		num = leer.nextInt();

		// Cuento desde 2 hasta un nº por debajo del nº introducido

		// CUENTA DESDE 1 HASTA EL Nº INTRODUCIDO
		for (int i = 1; i < num; i++) {

			/*
			 * VA COMPROBANDO DESDE EL Nº 1 HASTA EL Nº INTRODUCIDO SI LOS Nº SON PRIMOS O
			 * NO: AL SABER EL RESTO DE LA DIVISION ENTRE EL Nº DEL PRIMER FOR Y ESTE IREMOS
			 * SABIENDO SI SU RESTO ES 0 O NO, SI EL RESTO ES 0 SE LE VA AÑADIENDO UNO A LOS
			 * DIVISORES
			 */
			for (int j = 1; j < num; j++) {

				/*
				 * Nº QUE ESTE EN EL PRIMER FOR MÓDULO DEL Nº QUE VA AUMENTANDO EN EL SEGUNDO
				 * FOR
				 */
				resto = i % j;

				if (resto == 0) {

					// Le incremento 1 a la variable divisores
					++divisores;

				}

			}

			if (divisores == 2) {
				primos++;
			}

			divisores = 0;
		}
		/*
		 * Si la variable divisores es igual a 0 significa que ningún número desde 2
		 * hasta num - 1 es divisible por el nº introducido lo que significa que ES
		 * PRIMO en cambio si la variable no es igual a cero significará que sí tiene
		 * divisores dentro de ese rango y que por lo tanto NO ES PRIMO
		 */
		System.out.println("Entre 1 y " + num + " hay " + primos + " números primos");

		// Cerrar el Scanner
		leer.close();

	}

}
