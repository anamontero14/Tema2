package boletinswitch;

import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {

		/*
		 * Escribe un algoritmo para sumar dos tiradas de un dado de seis caras que
		 * haría el usuario. El algoritmo pregunta al usuario cuánto ha sacado en la
		 * primera tirada y el usuario le dará esa información pero en formato cadena
		 * (“UNO”, “DOS” … “SEIS”). Después el algoritmo volverá a preguntar al usuario
		 * cuánto ha sacado en la segunda tirada y el usuario también dará esa
		 * información en formato cadena. Por último, el algoritmo mostrará por pantalla
		 * la suma de las dos tiradas en formato numérico.
		 */

		// Creo las variables que almacenarán los números de las tiradas
		String tirada1;
		String tirada2;

		int num1tirada;
		int num2tirada;

		// Creo el Scanner para que se puedan introducir datos
		Scanner leer = new Scanner(System.in);

		// Le digo al usuario por pantalla lo que tiene que hacer
		System.out.println(
				"Introduzca el nº que ha sacado con la primera y segunda tirada respectivamente en formato cadena");

		// Le asigno el valor introducido a las variables
		tirada1 = leer.nextLine();
		tirada2 = leer.nextLine();

		/*
		 * A continuación haré lo siguiente: para hacer que los números introducidos
		 * como cadenas se puedan sumar como valores numéricos voy a hacer un switch y
		 * el resultado que de ese switch se lo voy a asignar a la cadena num1tiradas.
		 * Por ejemplo, si el usuario introduce "UNO" entonces el switch le asignará el
		 * nº 1 y viceversa, si hago lo mismo con la segunda tirada ya tendré los nº
		 * introducidos como valor numérico y los podré sumar
		 */
		num1tirada = switch (tirada1) {

		case "UNO" -> {
			yield 1;
		}
		case "DOS" -> {
			yield 2;
		}
		case "TRES" -> {
			yield 3;
		}
		case "CUATRO" -> {
			yield 4;
		}
		case "CINCO" -> {
			yield 5;
		}
		case "SEIS" -> {
			yield 6;
		}
		default -> {
			yield 0;
		}
		};

		num2tirada = switch (tirada2) {

		case "UNO" -> {
			yield 1;
		}
		case "DOS" -> {
			yield 2;
		}
		case "TRES" -> {
			yield 3;
		}
		case "CUATRO" -> {
			yield 4;
		}
		case "CINCO" -> {
			yield 5;
		}
		case "SEIS" -> {
			yield 6;
		}
		default -> {
			yield 0;
		}
		};

		System.out.println(num1tirada + num2tirada);

		// Cierro el Scanner
		leer.close();

	}

}
