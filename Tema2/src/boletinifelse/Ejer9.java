package boletinifelse;

import java.util.Scanner;

public class Ejer9 {

	public static void main(String[] args) {

		/*
		 * Escribir un programa que simule el juego de PIEDRA, PAPEL, TIJERA, pidiendo a
		 * cada jugador que escriba PIEDRA, PAPEL o TIJERA. El juego debe mostrar por
		 * pantalla quién ha ganado el juego tras jugar una partida. Hay que contemplar
		 * el caso de que empaten
		 */
		
		// CREO VARIABLES
		
		// Variable que almacenará la opción del primer jugador
		String p1;
		
		// Variable que almacenará la opción del segundo jugador
		String p2;
		
		// Creo las constantes que usaré para comparar
		final String PIEDRA = "Piedra";
		final String PAPEL = "Papel";
		final String TIJERA = "Tijera";
		
		// Creo el Scanner
		Scanner leer = new Scanner(System.in);
		
		// Le digo al usuario lo que tiene que hacer
		System.out.println("Escoja piedra, papel o tijera");
		
		// Asigno el valor que introduzca el usuario a las variables
		p1 = leer.nextLine();
		p2 = leer.nextLine();
		
		if (p1.equals(PIEDRA) && p2.equals(TIJERA)) {
			System.out.println("Gana el player 1");
		} else if (p1.equals(PIEDRA) && p2.equals(PAPEL)) {
			System.out.println("Gana el player 2");
		} else if (p1.equals(PIEDRA) && p2.equals(PIEDRA)) {
			System.out.println("Empate");
		} else if (p1.equals(PAPEL) && p2.equals(PIEDRA)) {
			System.out.println("Gana el player 1");
		} else if (p1.equals(PAPEL) && p2.equals(PAPEL)) {
			System.out.println("Empate");
		} else if (p1.equals(PAPEL) && p2.equals(TIJERA)) {
			System.out.println("Gana el player 2");
		} else if (p1.equals(TIJERA) && p2.equals(PIEDRA)) {
			System.out.println("Gana el player 2");
		} else if (p1.equals(TIJERA) && p2.equals(PAPEL)) {
			System.out.println("Gana el player 1");
		} else {
			System.out.println("Empate");
		}
		
		// Cierro el Scanner
		leer.close();

	}

}
