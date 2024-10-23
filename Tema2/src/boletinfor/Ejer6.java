package boletinfor;

import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {

		// Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso

		// Variable que almacena la nota introducida
		int nota;

		// Variable que almacenará los suspensos
		int suspensos = 0;

		// Inicializar el Scanner
		Scanner leer = new Scanner(System.in);

		// Contar hasta 5
		for (int i = 1; i <= 5; i++) {

			// Pedirle al usuario la nota
			System.out.print("Introduzca su nota: ");

			// Asigno la nota a la variable nota
			nota = leer.nextInt();

			// Si la nota está por debajo del 5 se le añade un 1 a la variable suspensos
			if (nota < 5) {

				// Se le incrementa 1 a suspensos
				++suspensos;

			}

			// Si no es suspenso no hace nada y vuelve a contar

		}

		System.out.println("Hay " + suspensos + " suspensos");

		// Cerrar el Scanner
		leer.close();

	}

}
