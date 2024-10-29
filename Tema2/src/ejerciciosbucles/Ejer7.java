package ejerciciosbucles;

import java.util.Scanner;

public class Ejer7 {

	public static void main(String[] args) {

		/*
		 * Escribe un programa que lea un número n e imprima una pirámide de números con
		 * n filas como en la siguiente figura: 1 121 12321 1234321
		 */

		// variable que almacenará el nº introducido
		int num;

		// creación de Scanner
		Scanner leer = new Scanner(System.in);

		// le pido al usuario un dato
		System.out.println("Introduzca un nº: ");

		// almaceno el dato en la variable
		num = leer.nextInt();
		
		/*try {
			num = leer.nextInt();
		} catch (ArithmeticException e) {
			System.out.println("Introduzca un número a partir del 1");
		}*/

		// bucle para hacer las líneas
		for (int i = 1; i <= num; i++) {

			/*
			 * cuento los números desde el 1 hasta el valor de la i que será la línea en la
			 * que estamos así que cuando esté en la línea 1 imprima "1", cuando esté el la
			 * línea 2 "12"...
			 */
			for (int j = 1; j < i; j++) {

				System.out.print(j);

			}

			/*
			 * contará los números desde el valor de la i hasta el 1 RESTANDO, entonces si
			 * estamos en la línea 3 hará "12321" y etc
			 */
			for (int k = i; k >= 1; k--) {
				System.out.print(k);
			}

			// para que salte de línea
			System.out.println("");
		}

		// cierre de Scanenr
		leer.close();

	}

}
