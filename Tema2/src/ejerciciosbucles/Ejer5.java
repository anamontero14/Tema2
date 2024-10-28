package ejerciciosbucles;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que pida un número entero N entre 0 y 20 y luego muestre
		 * por pantalla los números desde 1 hasta N, uno en cada línea, repitiendo cada
		 * número tantas veces como su valor. Ejemplo
		 */

		// variable que almacenará el nº entero introducido por el usuario
		int num;

		// Inicializar el Scanner
		Scanner leer = new Scanner(System.in);

		// le digo al usuario lo que debe introducir
		System.out.println("Introduzca un nº entero entre 0 y 20:");

		// le asigno el valor a la variable num
		num = leer.nextInt();

		// comprobar si el valor está fuera del rango o no
		if (num < 0 || num > 20) {
			System.out.println("Has introducido un número fuera del rango");
		} else {

			// para contar desde el nº introducido hasta el 20
			for (int i = 1; i <= num; i++) {

				/*
				 * mostrará desde el valor de la j hasta el valor de la i (como sus valores
				 * siempre van a ser los mismos mostrará siempre el nº de números que tiene el
				 * valor de los números [yo lo entiendo])
				 */
				for (int j = 1; j <= i; j++) {
					System.out.print(i);

				}
				;
				/*
				 * le añado una línea de un syso en blanco para que aparezcan cada secuencia de
				 * números en una línea distinta
				 */
				System.out.println("");
			}
			;

		}
		;

		// cerrar Scanner
		leer.close();

	}

}
