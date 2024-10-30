package ejerciciosbucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer9 {

	public static void main(String[] args) {

		/*
		 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido
		 * por teclado. El número introducido debe ser mayor que 0.
		 */

		// Variable que almacenará el número introducido por el usuario
		int num = 0;

		// variable para almacenar los dígitos del número
		int digitos = 0;
		
		boolean error = true;

		// Inicialización del Scanner
		Scanner leer = new Scanner(System.in);

		// comprobar si el usuario introduce una cadena
		// do-while para ir repitiendo el bucle
		while (error) {

			// comprobacion
			try {

				// Pedir al usuario que introduzca el número
				System.out.print("Introduzca un número para saber cuántos dígitos tiene: ");

				// almacena el dato en la variable num
				num = leer.nextInt();

				// si el número es menor o igual que 0 le da un mensaje de error
				assert num >= 0 : "Introduce un número mayor que 0";
				
				error = false;
				
			} catch (AssertionError a) {
				// recoje el mensaje de error que le he especificado en el assert de arriba
				System.err.println(a.getMessage());

			} catch (InputMismatchException e) {
				// manda el mensaje de error en rojo
				System.err.println("Debe introducir un número, no una cadena.");

			} finally {

				// limpio el buffer
				leer.nextLine();
			}
		}

		// comprobar que el número sea mayor que 0
		if (num > 0) {

			// Contar los dígitos dividiendo sucesivamente entre 10
			while (num > 0) {

				// Reducir el número dividiendo entre 10
				num /= 10;

				// Incrementar la variable digitos
				digitos++;
			}

			// Mostrar el resultado
			System.out.println("El número tiene " + digitos + " dígitos.");

		} else {

			// le digo que ha cometido un error y que introduza un nº mayor que 0
			System.out.println("Error, debe introducir un número mayor que 0");
		}

		// Cerrar el Scanner
		leer.close();
	}
}
