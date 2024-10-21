package boletindowhile;

import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {

		/*
		 * Repetir el juego de PIEDRA - PAPEL - TIJERA pero con las siguientes
		 * consideraciones:
		 * 
		 * Al jugador 1 se le pedirá que introduzca una opción válida: PIEDRA, PAPEL o
		 * TIJERA. Mientras no introduzca un valor válido se le seguirá preguntando.
		 * 
		 * Al jugador 2 se le pedirá que introduzca una opción válida: PIEDRA, PAPEL o
		 * TIJERA. Mientras no introduzca un valor válido se le seguirá preguntando.
		 * 
		 * Al terminar una partida se preguntará si se quiere seguir jugando. Mientras
		 * se pulse “S” se volverá a iniciar la partida.
		 */

		/*
		 * Creación de las constantes PIEDRA, PAPEL y TIJERA que guardarán las 3 //
		 * opciones que tendrá el juego y las cuales no se modificarán a medida que //
		 * avance el código
		 */
		final String PIEDRA = "PIEDRA";
		final String PAPEL = "PAPEL";
		final String TIJERA = "TIJERA";

		/*
		 * variable que almacenará el dato que tiene que introducir el usuario para //
		 * salir
		 */
		String salir;

		// Cadenas que almacenarán las respuestas del J1 y el J2 respectivamente
		String respuestaJ1;
		String respuestaJ2;

		// Creación del Scanner
		Scanner leer = new Scanner(System.in);

		do {
			
			do {
			// Se le pregunta al usuario
			System.out.println("J1, ¿piedra, papel o tijera?");

			// El usuario me responde y lo almaceno en la variable respuestaJ1
			respuestaJ1 = leer.nextLine();

			// Se le pregunta al usuario
			System.out.println("J2, ¿piedra, papel o tijera?");

			// El usuario me responde y lo almaceno en la variable respuestaJ2
			respuestaJ2 = leer.nextLine();
			
			} while (respuestaJ1.isEmpty() && respuestaJ2.isEmpty());
			
			if (respuestaJ1.equalsIgnoreCase(PIEDRA) && respuestaJ2.equalsIgnoreCase(TIJERA)) {
				System.out.println("Gana el player 1");
			} else if (respuestaJ1.equalsIgnoreCase(PIEDRA) && respuestaJ2.equalsIgnoreCase(PAPEL)) {
				System.out.println("Gana el player 2");
			} else if (respuestaJ1.equalsIgnoreCase(PIEDRA) && respuestaJ2.equalsIgnoreCase(PIEDRA)) {
				System.out.println("Empate");
			} else if (respuestaJ1.equalsIgnoreCase(PAPEL) && respuestaJ2.equalsIgnoreCase(PIEDRA)) {
				System.out.println("Gana el player 1");
			} else if (respuestaJ1.equalsIgnoreCase(PAPEL) && respuestaJ2.equalsIgnoreCase(PAPEL)) {
				System.out.println("Empate");
			} else if (respuestaJ1.equalsIgnoreCase(PAPEL) && respuestaJ2.equalsIgnoreCase(TIJERA)) {
				System.out.println("Gana el player 2");
			} else if (respuestaJ1.equalsIgnoreCase(TIJERA) && respuestaJ2.equalsIgnoreCase(PIEDRA)) {
				System.out.println("Gana el player 2");
			} else if (respuestaJ1.equalsIgnoreCase(TIJERA) && respuestaJ2.equalsIgnoreCase(PAPEL)) {
				System.out.println("Gana el player 1");
			} else {
				System.out.println("Empate");
			}
			
			// Le pregunto al usuario si quiere seguir jugando
			System.out.println("¿Quiere seguir?");
			
			// Almaceno la respuesta en la variable salir
			salir = leer.nextLine();
			
		} while (salir.equalsIgnoreCase("S"));
		
		// Anuncio el fin del programa
		System.out.println("Fin del programa");

		// Cierre de Scanner
		leer.close();

	}

}
