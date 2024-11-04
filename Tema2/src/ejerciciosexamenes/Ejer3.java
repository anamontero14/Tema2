package ejerciciosexamenes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {

		/*
		 * Escribe un programa que lea un número entero (lado del triángulo) y a partir
		 * de él cree un triángulo invertido de asteriscos con ese tamaño. Los
		 * asteriscos sólo se verán en el borde del triángulo, no en el interior. Por
		 * ejemplo, para el tamaño=5. Nótese que en la primera fila (la base) hay un
		 * espacio entre cada dos asteriscos
		 */

		// variable que almacenará el tamaño que introducirá el usuario
		int num = 0;

		// creación de Scanner
		Scanner leer = new Scanner(System.in);

		// comprobación
		do {

			try {

				// le digo al usuario lo que tiene que introducir
				System.out.print("Introduzca un número para crear un triángulo invertido: ");

				// recojo el valor en la variable tamaño
				num = leer.nextInt();

				// establezco el valor que debe tener el dato introducido
				assert num > 0 : "Debe introducir un número mayor que 0.";

			} catch (AssertionError a) {

				// recojo el mensaje de assertion y lo muestro como error
				System.err.println(a.getMessage());

			} catch (InputMismatchException e) {

				// le comunico al usuario el error en rojo
				System.err.println("Debe introducir un número.");

			} finally {

				// limpieza del buffer por si introduce una cadena
				leer.nextLine();

			}
			// mientras que tamaño sea 0
		} while (num <= 0);

		// para la linea de arriba
		for (int k = 1; k <= num; k++) {
			System.out.print("* ");
		}

		System.out.println();

		// para el alto
		for (int i = 1; i < num; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(" ");

			}

			System.out.print("*");

			for (int l = 1; l <= (num - i - 1) * 2 - 1; l++) {

				System.out.print(" ");

			}

			if (i == num - 1) {

				System.out.println(" ");

			} else {
				System.out.println("*");
			}

		}

		// salto de línea
		System.out.println();

		// cerrar el Scanner
		leer.close();
	}
}