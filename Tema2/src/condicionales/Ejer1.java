package condicionales;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {

		// 1º Solicitar al usuario un nº comprendido entre 0 y 9999
		// 2º Habrá que indicar si el nº es capicúa

		// Crear la variable donde se almacenará el nº que introduzca el usuario
		int num;
		int cifra1;
		int cifra2;
		int cifra3;
		int cifra4 = 0;

		// Crear el Scanner para que pueda introducir números por la entrada
		Scanner leer = new Scanner(System.in);

		// Decirle al usuario lo que ha de introducir una vez la entrada esté activa
		System.out.println("Introduzca un nº del 0 al 9999 para saber si es capicúa o no:");

		// Asigno el valor introducido a la variable num
		num = leer.nextInt();

		if (num > 9999 || num < 0) {

			// le digo al usuario que tiene que ser un nº dentro del rango
			System.out.println("El nº introducido debe estar dentro del rango");
		} else if (num <= 9) {

			// TIENE 1 CIFRA
			System.out.println("El nº es capicúa");
		} else if (num >= 10 && num <= 99) {

			// TIENE 2 CIFRAS

			// para saber la primera cifra
			cifra1 = num / 1000;

			// para saber la segunda cifra
			cifra2 = (num % 1000) / 100;

			if (cifra1 == cifra2) {
				System.out.println("El nº es capicúa");
			} else {
				System.out.println("El nº no es capicúa");
			}

		} else if (num >= 100 && num <= 999) {

			// para saber la primera cifra
			cifra1 = num / 1000;

			// para saber la segunda cifra
			cifra2 = (num % 1000) / 100;

			// para saber la tercera cifra
			cifra3 = (num % 1000) % 100 / 10;

			if (cifra1 == cifra3) {
				System.out.println("El nº es capicúa");
			} else {
				System.out.println("El nº no es capicúa");
			}
		} else {

			// para saber la primera cifra
			cifra1 = num / 1000;

			// para saber la segunda cifra
			cifra2 = (num % 1000) / 100;

			// para saber la tercera cifra
			cifra3 = (num % 1000) % 100 / 10;
			
			// para saber la cuarta cifra
			cifra3 = (num % 1000) % 100 % 10 / 1;

			if (cifra1 == cifra4 && cifra2 == cifra3) {
				System.out.println("El nº es capicúa");
			} else {
				System.out.println("El nº no es capicúa");
			}
		}

		// Cerrar el Scanner
		leer.close();

	}

}
