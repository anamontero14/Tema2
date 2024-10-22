package boletinfor;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {

		/*
		 * Realiza un programa que cuente los múltiplos de 3 desde el 1 hasta un número
		 * que introducimos por teclado
		 */

		// Creo la variable que almacenará el nº introducido por el usuario
		int num;

		// Creo el Scanner
		Scanner leer = new Scanner(System.in);

		// Le pido al usuario que introduzca un nº
		System.out.println("Introduzca un nº para aprender a contar hasta él");

		// Asigno el dato a la variable
		num = leer.nextInt();

		for (int i = 1; i <= num; i *= 3) {
			System.out.println(i);
		}

		// Cierro el Scanner
		leer.close();

	}

}
