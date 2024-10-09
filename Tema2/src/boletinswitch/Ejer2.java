package boletinswitch;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {

		/*
		 * Idear un programa que solicite al usuario un número comprendido entre 1 y 7,
		 * correspondiente a un día de la semana. Se debe mostrar el nombre del día de
		 * la semana al que corresponde. Por ejemplo, el número 1 corresponde a “Lunes”
		 * y el 6 a “Sábado”
		 */

		// Variable que almacenará el nº introducido por el usuario
		int dia;

		// Creo el Scanner para que se puedan meter datos por la entrada
		Scanner leer = new Scanner(System.in);

		// Le digo al usuario lo que tiene que introducir
		System.out.println("Introduzca un nº del 1 al 7:");

		// Almaceno el dato que el usuario introduce en la variable
		dia = leer.nextInt();

		switch (dia) {

		case 1 -> System.out.println("Lunes");
		case 2 -> System.out.println("Marte");
		case 3 -> System.out.println("Miércoles");
		case 4 -> System.out.println("Jueves");
		case 5 -> System.out.println("Viernes");
		case 6 -> System.out.println("Sábado");
		case 7 -> System.out.println("Domingo");
		}

		// Cierro el Scanner
		leer.close();

	}

}
