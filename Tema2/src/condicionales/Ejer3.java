package condicionales;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {

		/*
		 * 1º: He hecho el código completo pero sin solucionar los errores que podría
		 * tener, por ejemplo introduciendo un nº inválido
		 */

		/*
		 * El DNI consta de un entero de 8 dígitos seguido de una letra que se obtiene a
		 * partir del número de la siguiente forma: letra = número DNI módulo 23
		 * Basándote en esta información, elige la letra a partir de la numeración de la
		 * siguiente tabla Diseña una aplicación en la que, dado un número de DNI,
		 * calcule la letra que le corresponde. Observa que un número de 8 dígitos está
		 * dentro del rango del tipo int.
		 */

		// nº de dni
		int numDNI;

		// almaceno el nº que me dirá la letra que es
		int numLetra;

		// Almacena la letra del DNI
		String letra = null;

		// Creo Scanner
		Scanner leer = new Scanner(System.in);

		// Le pido al usuario que introduzca el nº de DNI
		System.out.println("Introduzca las 8 cifras de su DNI:");

		// Almaceno el nº a la variable
		numDNI = leer.nextInt();

		// Hayo el resto del nº entre 23 para saber que letra le corresponde
		numLetra = numDNI % 23;

		if (numDNI > 8 || numDNI < 8) {

			System.out.println("Ha introducido un valor inválido");
		} else {
			// Hago un switch para asignarle la letra automaticamente
			switch (numLetra) {

			case 0 -> {
				letra = "T";
			}
			case 1 -> {
				letra = "R";
			}
			case 2 -> {
				letra = "W";
			}
			case 3 -> {
				letra = "A";
			}
			case 4 -> {
				letra = "G";
			}
			case 5 -> {
				letra = "M";
			}
			case 6 -> {
				letra = "Y";
			}
			case 7 -> {
				letra = "F";
			}
			case 8 -> {
				letra = "P";
			}
			case 9 -> {
				letra = "D";
			}
			case 10 -> {
				letra = "X";
			}
			case 11 -> {
				letra = "B";
			}
			case 12 -> {
				letra = "N";
			}
			case 13 -> {
				letra = "J";
			}
			case 14 -> {
				letra = "Z";
			}
			case 15 -> {
				letra = "S";
			}
			case 16 -> {
				letra = "Q";
			}
			case 17 -> {
				letra = "V";
			}
			case 18 -> {
				letra = "H";
			}
			case 19 -> {
				letra = "L";
			}
			case 20 -> {
				letra = "C";
			}
			case 21 -> {
				letra = "K";
			}
			case 22 -> {
				letra = "E";
			}
			default -> {
				System.out.println("Valor inválido");
			}

			}
			System.out.println(numDNI + letra);
		}

		// Cierro el Scanner
		leer.close();

	}

}
