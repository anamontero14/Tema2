package ejerciciosexamenes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {

		/*
		 * Escribe un programa que pida por teclado un número entero mayor o igual que 0
		 * y determine cuántas de sus cifras son pares y cuántas son impares
		 */

		// variable que almacenará el número
		int num = -1;

		// variable para sacar las cifras del númeroç
		int cifras = 0;

		// variable contador para los números pares
		int pares = 0;

		// variable que almacenará la comprobación de si es par o no
		int comprobacion;

		// variable contador para los números impares
		int impares = 0;

		// creacion del scanner
		Scanner leer = new Scanner(System.in);

		/*
		 * Hará comprobaciones de los números que introduzca el usuario mientras que el
		 * número sea menor que 0
		 */
		do {

			try {

				// decirle al usuario lo que debe hacer
				System.out.print("Introduzca un número: ");

				// almaceno el dato introducido en la variable num
				num = leer.nextInt();

				// el número tiene que ser mayor o igual que 0
				assert num >= 0 : "Debe introducir un número mayor o igual que 0";
			} catch (AssertionError a) {
				System.err.println(a.getMessage());
			} catch (InputMismatchException e) {
				System.err.println("Debe introducir un número");
			} finally {
				leer.nextLine();
			}

		} while (num < 0);

		// si el número es 0 decir que es par
		if (num == 0) {

			// incremento a la variable par
			pares++;

		} else {

			// mientras que el número no sea 0:
			while (num != 0) {

				/*
				 * va haciendo el módulo de 10 al número para saber qué números construyen el
				 * número introducido cifra a cifra
				 */
				cifras = num % 10;

				/*
				 * a la variable comprobacion le voy a asignar el valor del módulo de 2 que le
				 * haré a lo que haya almacenado en la variable cifras
				 */
				comprobacion = cifras % 2;

				/*
				 * para que el número vaya disminuyendo al mismo tiempo que le vamos averiguando
				 * las cifras se divide entre 10
				 */
				num /= 10;

				if (comprobacion == 0) {

					/*
					 * Si comprobacion es igual a cero (es decir, si la cifra de número dividido
					 * entre 2 da de resto 0 entonces es una cifra par y por lo tanto he de
					 * incrementar el contador de las cifras pares
					 */
					pares++;
				} else {

					/*
					 * si al contrario, la comprobacion es igual a algo distinto de 0 entonces
					 * significará que esa cifra que hemos sacado es impar ya que al dividirla entre
					 * 2 no da exacto
					 */
					impares++;
				}

			}

		}

		// muestro la solucion
		System.out.println("El número introducido tiene " + pares + " cifras pares y " + impares + " cifras impares");

		// cerrar el Scanner
		leer.close();

	}

}
