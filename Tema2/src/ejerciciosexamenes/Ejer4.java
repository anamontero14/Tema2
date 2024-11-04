package ejerciciosexamenes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {

		// variable para recoger el número entero
		int num = 0;

		int numAste = 0;

		int sumar = 0;

		// creacion del Scanner
		Scanner leer = new Scanner(System.in);

		// comprobar el dato de entrada
		do {

			try {

				// Decirle al usuario lo que debe hacer
				System.out.print("Introduzca el tamaño del lado: ");

				// almacenarlo en la variable num
				num = leer.nextInt();

				numAste = num;

				sumar = num;

				// indicar el rango para la variable y el mensaje de error
				assert num > 0 : "El número debe ser mayor que 0.";

			} catch (AssertionError a) {
				System.err.println(a.getMessage());
			} catch (InputMismatchException e) {
				System.err.println("Introduzca un número.");
			} finally {

				// vaciar el buffer
				leer.nextLine();

			}

		} while (num == 0);

		// for para crear un triangulo de espacios

		for (int i = 1; i <= num - 1; i++) {

			// añado dos para saber por cuánto hacer la línea del medio
			sumar += 2;

			for (int j = num - 1; j >= i; j--) {
				System.out.print(" ");

			}

			// triángulo de *
			for (int k = 1; k <= numAste; k++) {
				System.out.print("*");
			}

			// añadir a num
			numAste += 2;

			System.out.println();

		}

		// línea del medio

		for (int i = 1; i <= sumar; i++) {
			System.out.print("*");
		}

		// salto de línea
		System.out.println();

		// for para crear un triángulo invertido de espacios
		for (int i = 1; i <= num - 1; i++) {

			// restar a num
			numAste -= 2;

			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}

			// triángulo de *
			for (int k = numAste; k >= 1; k--) {
				System.out.print("*");
			}

			System.out.println();
		}

		// cerrar Scanner
		leer.close();

	}

}
