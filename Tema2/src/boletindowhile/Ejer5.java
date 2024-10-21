package boletindowhile;

import java.util.Random;
import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {

		/*
		 * Realiza un programa donde el usuario "piensa" un número del 1 al 100 y el
		 * ordenador intenta adivinarlo. Es decir, el ordenador irá proponiendo números
		 * una y otra vez hasta adivinarlo (el usuario deberá indicarle al ordenador si
		 * es mayor, menor o igual al número que ha pensado)
		 */

		// Variable que contendrá la respuesta del usuario
		String respuesta;

		// Variable para decirle a la máquina si el nº es mayor o menor que el que ha
		// adivinado
		// String mayorOmenor;

		// Variable para almacenar el mínimo
		int min = 1;

		// Variable para almacenar el mayor
		int max = 101;

		// Inicializo el random
		Random rand = new Random();

		// Inicializo el Scanner
		Scanner leer = new Scanner(System.in);

		do {

			// Variable para almacenar el primer nº aleatorio de la máquina
			int nRandomMaq = rand.nextInt(min, max);

			// Pregunta la máquina si el nº es el siguiente
			System.out.println("¿Es el nº " + nRandomMaq + " ?");

			// Recojo la respuesta en una variable
			respuesta = leer.nextLine();

			if (respuesta.equals("menor")) {
				max = nRandomMaq + 1;
			}

			if (respuesta.equals("mayor")) {
				min = nRandomMaq;
			}

			// VUELVE A EMPEZAR

		} while (!respuesta.equals("igual"));

		System.out.println("¡Has acertado!");

		// Cierro el Scanner
		leer.close();

	}

}
