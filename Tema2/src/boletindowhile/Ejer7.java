package boletindowhile;

import java.util.Scanner;

public class Ejer7 {

	public static void main(String[] args) {

		// Variable que será la opción de salir
		String respuesta;

		// Variable que contendrá el primer nº
		int num1;

		// Variable que contendrá el segundo nº
		int num2;

		// Creación de Scanner
		Scanner leer = new Scanner(System.in);

		do {

			// Le digo al usuario lo que debe hacer
			System.out.println("Introduzca dos nº");
			num1 = leer.nextInt(); // Le asigno el dato introducido a la variable
			num2 = leer.nextInt(); // Le asigno el dato introducido a la variable

			// Consumir la línea residual después de leer el segundo número
			leer.nextLine();

			// Mostrar el menú de operaciones
			System.out.println("¿Qué desea hacer?\nA. Sumar\nB. Restar\nC. Multiplicar\nD. Dividir\nE. Salir");

			// Almaceno la respuesta en la variable
			respuesta = leer.nextLine();

			switch (respuesta) { // Hacer la comparación insensible a mayúsculas

			case "A" -> {
				System.out.println("Resultado: " + (num1 + num2));
			}
			case "B" -> {
				System.out.println("Resultado: " + (num1 - num2));
			}
			case "C" -> {
				System.out.println("Resultado: " + (num1 * num2));
			}
			case "D" -> {
				// Comprobar si el divisor es cero antes de dividir
				if (num2 != 0) {
					System.out.println("Resultado: " + (num1 / num2));
				} else {
					System.out.println("No se puede dividir por cero.");
				}
			}
			case "E" -> {
				System.out.println("Saliendo");
			}
			default -> {
				System.out.println("Opción no válida. Por favor, elija una opción válida.");
			}
			}

		} while (!respuesta.equalsIgnoreCase("E"));

		System.out.println("Fin del programa");

		// Cierre de Scanner
		leer.close();
	}
}
