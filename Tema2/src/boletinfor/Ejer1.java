package boletinfor;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {

		/*
		 * Escribir una aplicación para aprender a contar, que pedirá un número n y
		 * mostrará todos los números del 1 al n
		 */

		// Creo la variable que almacenará el nº introducido por el usuario
		int num;

		// Creo el Scanner
		Scanner leer = new Scanner(System.in);

		// Le pido al usuario que introduzca un nº
		System.out.println("Introduzca un nº para aprender a contar hasta él");

		// Asigno el dato a la variable
		num = leer.nextInt();

		/*
		 * i vale 1 y para contar hasta el nº que indique el usuario tengo que
		 * establecer el tope como
		 * "mientras que i (que es 1) sea menor o igual que el nº introducido"
		 */
		for (int i = 1; i <= num; i++) {
			System.out.println(i);
		}

		// Cierro el Scanner
		leer.close();

	}

}
