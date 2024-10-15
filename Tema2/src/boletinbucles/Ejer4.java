package boletinbucles;

import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {

		/*
		 * Escribe un algoritmo que pida al usuario 10 números enteros (pueden ser
		 * positivos, negativos o cero). Cuando acabe de insertar los números, el
		 * algoritmo debe mostrar la suma de los números positivos, la media de los
		 * números negativos y el número de ceros que ha introducido el usuario
		 */

		// Variable que almacena el número
		int num;

		// Variable que almacena LA SUMA DE LOS NÚMEROS POSITIVOS
		int sumaPosi = 0;

		// Variable que almacena la SUMA DE LOS N NEGATIVOS
		int sumaNega = 0;

		// Variable que almacena el contador de los nº que sean negarivos
		int cuentaNega = 0;

		// Variable que almacena el nº de 0
		int cuenta0 = 0;

		// Variable que almacena el CONTADOR DEL WHIle
		int contador = 0;

		// Scanner
		Scanner leer = new Scanner(System.in);

		// le digo al usuario lo que tiene que hacer
		System.out.println("Introduzca 10 números");

		// almaceno el nº introducido por teclado
		num = leer.nextInt();

		while (contador < 10) {

			/*
			 * Compruebo si el nº es positivo o no y SI ES POSITIVO entonces le sumo y
			 * asigno el nº a la variable "sumaPosi"
			 */
			if (num > 0) {
				sumaPosi += num;
			}

			// Si el nº es igual que 0 entonces se le incrementa 1 a la variable "cuenta0"
			if (num == 0) {
				++cuenta0;
			}

			if (num < 0) {
				++cuentaNega;
			}

		}

		// Cierro el scanner
		leer.close();

	}

}
