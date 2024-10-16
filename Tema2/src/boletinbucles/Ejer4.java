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
		
		// Variable que almcena el valor de la media de los negativos
		double media;

		// Variable que almacena el nº de 0
		int cuenta0 = 0;

		// Variable que almacena el CONTADOR DEL WHIle
		int contador = 1;

		// Scanner
		Scanner leer = new Scanner(System.in);

		while (contador <= 10) {

			// le digo al usuario lo que tiene que hacer
			System.out.println("Introduzca un número: ");

			// almaceno el nº introducido por teclado
			num = leer.nextInt();

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
				sumaNega += num;
			}

			++contador;

		}

		// Muestro el resultado de sumar los números positivos
		System.out.println("Suma de los números positivos: " + sumaPosi);

		if (cuentaNega == 0) {
			System.out.println("No se ha introducido ningún nº negativo");
		} else {
			
			// Hago la media
			media = (double) sumaNega / cuentaNega;
			
			// Muestro la media de los números negativos
			System.out.println("La media de los números negativos: " + media);
		}

		// Muestro el número de 0s introducidos
		System.out.println("Se han introducido " + cuenta0 + " ceros");

		// Cierro el scanner
		leer.close();

	}

}
