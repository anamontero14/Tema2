package ejerciciosexamenes;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {

		/* MARIO BROS saltando paredes */

		// altura de la pared
		int alt;

		// altura anterior
		int altAnterior = 1;

		int contArriba = 0;
		int contAbajo = 0;

		// Scanner
		Scanner leer = new Scanner(System.in);

		// preguntarle al usuario
		System.out.print("Introduzca la altura de la pared a la que saltará Mario: ");
		alt = leer.nextInt();

		// mientras que la altura introducida no sea un número negativo
		while (alt >= 0) {

			// si la altura introducida es mayor a la altura anterior entonces salta arriba
			if (alt > altAnterior) {
				contArriba++;
			}

			// si la altura introducida es menor a la altura anterior entonces salta abajo
			if (alt < altAnterior) {
				contAbajo++;
			}

			// igualar altura anterior a la altura para que se siga preguntando
			altAnterior = alt;

			// preguntar otra vez
			// preguntarle al usuario
			System.out.print("Introduzca la altura de la pared a la que saltará Mario: ");
			alt = leer.nextInt();

		}

		// resultado
		System.out.println("Mario ha saltado " + contArriba + " hacia arriba y " + contAbajo + " hacia abajo.");

		// Cerrar Scanner
		leer.close();

	}

}
