package boletinfor;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {

		/*
		 * Pedir un número y calcular su factorial. Por ejemplo, el factorial de 5 se
		 * denota 5! y es igual a 5x4x3x2x1 = 120
		 */

		// Variable que almacenará el nº introducido
		int num;

		// Variable para almacenar la multi. del factorial
		long multiplicacion = 1;

		// Creacion del Scanner
		Scanner leer = new Scanner(System.in);

		// Le digo al usuario lo que debe de hacer
		System.out.print("Introduzca un nº para calcular su factorial: ");

		// Le asigno el dato introducido a la variable num
		num = leer.nextInt();

		/*
		 * Contar hasta el nº introducido (tiene que ser al revés, empezar en el nº y //
		 * acabar en 1)
		 */
		for (int i = 1; i <= num; i++) {

			multiplicacion *= i;

		}

		System.out.println("5! = " + multiplicacion);

		// Cerrar el Scanner
		leer.close();

	}

}
