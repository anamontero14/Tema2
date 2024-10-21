package boletindowhile;

import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {

		/*
		 * Repetir el juego de PIEDRA - PAPEL - TIJERA pero con las siguientes
		 * consideraciones: Al jugador 1 se le pedirá que introduzca una opción válida:
		 * PIEDRA, PAPEL o TIJERA. Mientras no introduzca un valor válido se le seguirá
		 * preguntando.
		 * 
		 * Al jugador 2 se le pedirá que introduzca una opción válida: PIEDRA, PAPEL o
		 * TIJERA. Mientras no introduzca un valor válido se le seguirá preguntando.
		 * 
		 * Al terminar una partida se preguntará si se quiere seguir jugando. Mientras
		 * se pulse “S” se volverá a iniciar la partida.
		 */

		// Creo constantes para piedra, papel y tijera ya que son cadenas que no se van
		// a modificar en el código
		final String PIEDRA = "PIEDRA";
		final String PAPEL = "PAPEL";
		final String TIJERA = "TIJERA";

		// Variable para almacenar la respuesta del usuario
		String respuesta1;
		String respuesta2;

		// Variable para salir
		char salir = 'S';

		// Creación del Scanner
		Scanner leer = new Scanner(System.in);

		do {

			System.out.println("¿Piedra, papel o tijera? ¿J1?");
			respuesta1 = leer.nextLine();

			System.out.println("¿Piedra, papel o tijera? ¿J2?");
			respuesta2 = leer.nextLine();

			if (respuesta1.equalsIgnoreCase(PIEDRA) && respuesta2.equalsIgnoreCase(TIJERA)) {
				System.out.println("Gana el player 1");
			} else if (respuesta1.equalsIgnoreCase(PIEDRA) && respuesta2.equalsIgnoreCase(PAPEL)) {
				System.out.println("Gana el player 2");
			} else if (respuesta1.equalsIgnoreCase(PIEDRA) && respuesta2.equalsIgnoreCase(PIEDRA)) {
				System.out.println("Empate");
			} else if (respuesta1.equalsIgnoreCase(PAPEL) && respuesta2.equalsIgnoreCase(PIEDRA)) {
				System.out.println("Gana el player 1");
			} else if (respuesta1.equalsIgnoreCase(PAPEL) && respuesta2.equalsIgnoreCase(PAPEL)) {
				System.out.println("Empate");
			} else if (respuesta1.equalsIgnoreCase(PAPEL) && respuesta2.equalsIgnoreCase(TIJERA)) {
				System.out.println("Gana el player 2");
			} else if (respuesta1.equalsIgnoreCase(TIJERA) && respuesta2.equalsIgnoreCase(PIEDRA)) {
				System.out.println("Gana el player 2");
			} else if (respuesta1.equalsIgnoreCase(TIJERA) && respuesta2.equalsIgnoreCase(PAPEL)) {
				System.out.println("Gana el player 1");
			} else {
				System.out.println("Empate");
			}

			System.out.println("¿Quieres seguir jugando?");
			salir = leer.nextLine();

		} while (salir == 'S' );

		// Cierro el Scanner
		leer.close();

	}

}
