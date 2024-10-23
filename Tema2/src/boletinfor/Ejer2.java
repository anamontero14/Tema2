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
		System.out.println("Introduzca un nº para mostrar cuáles múltiplos de 3 hay hasta el nº que introducirá usted:");

		// Asigno el dato a la variable
		num = leer.nextInt();

		for (int i = 1; i * 3 <= num; i++) {
			System.out.println(i * 3);
		}

		// Cierro el Scanner
		leer.close();

	}

}
