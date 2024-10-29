package ejerciciosbucles;

import java.util.Scanner;

public class Ejer9 {

	public static void main(String[] args) {

		/*
		 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido
		 * por teclado. El número introducido debe ser mayor que 0.
		 */

		// Variable que almacenará el número introducido por el usuario
		int num;

		int digitos = 0;

		// Inicialización del Scanner
		Scanner leer = new Scanner(System.in);

		// Pedir al usuario que introduzca el número
		System.out.print("Introduzca un número para saber cuántos dígitos tiene: ");
		num = leer.nextInt();

		// Verificar que el número sea mayor que 0
		if (num > 0) {

			// Contar los dígitos dividiendo sucesivamente entre 10
			while (num > 0) {

				// Reducir el número dividiendo entre 10
				num /= 10;

				// Incrementar el contador de dígitos
				digitos++;
			}

			// Mostrar el resultado
			System.out.println("El número tiene " + digitos + " dígitos.");

		} else {
			System.out.println("Error, debe introducir un número mayor que 0");
		}

		// Cerrar el Scanner
		leer.close();
	}
}
