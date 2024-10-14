package boletinswitch;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {

		/*
		 * Pedir una nota entera de 0 a 10 y mostrarla de la siguiente forma:
		 * insuficiente (de 0 a 4), suficiente (5), bien (6), notable (7 y 8) y
		 * sobresaliente (9 y 10).
		 */

		// Creo la variable que almacenará el nº entero que el usuario introducirá
		int nota;

		// Creo el Scanner para que el usuario pueda introducir datos por la entrada
		Scanner leer = new Scanner(System.in);

		// Le digo al usuario por pantalla lo que tiene que hacer
		System.out.println("Introduzca su nota");

		/*
		 * Almaceno lo que el usuario introduce por entrada en la variable previamente
		 * establecida
		 */
		nota = leer.nextInt();

		switch (nota) {
		case 0, 1, 2, 3, 4 -> System.out.println("INSUFICIENTE");
		case 5 -> System.out.println("SUFICIENTE");
		case 6 -> System.out.println("BIEN");
		case 7, 8 -> System.out.println("NOTABLE");
		case 9, 10 -> System.out.println("SOBRESALIENTE");

		}

		// Cierro el Scanner
		leer.close();

	}

}
