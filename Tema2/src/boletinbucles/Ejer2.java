package boletinbucles;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {

		/*
		 * Escribe un programa que vaya pidiendo al usuario números enteros positivos
		 * que debe ir contando. Cuando el usuario no quiera insertar más números,
		 * introducirá un número negativo y el algoritmo, antes de acabar, mostrará la
		 * cantidad de números positivos introducidos por el usuario
		 */

		// Variable para almacenar los nº introducidos
		int num;

		// Variable para ir contando
		int recuento = 0;

		// Scanner
		Scanner leer = new Scanner(System.in);

		// Le pido al usuario un dato
		System.out.println("Introduzca un nº");

		// Asigno el nº introducido a la variable
		num = leer.nextInt();

		while (num >= 0) {

			/*
			 * A la variable "recuento" se le irá incrementando 1 a medida que se vayan
			 * introduciendo números. Es decir, antes del bucle he introducido un nº para
			 * que así el bucle pueda ejecutarse correctamente. Una vez entre al bucle se le
			 * incrementará 1 a la variable "recuento" ya que he introducido un nº.
			 */
			++recuento;

			// Le pido al usuario un dato
			System.out.println("Introduzca un nº");

			// Asigno el nº introducido a la variable
			num = leer.nextInt();

		}

		System.out.println(recuento);

		// Cierro el Scanenr
		leer.close();

	}

}
