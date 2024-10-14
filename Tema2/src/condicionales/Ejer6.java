package condicionales;

import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {

		/*
		 * Dada una hora por teclado, (horas, minutos y segundos) realiza un algoritmo
		 * que muestre la hora después de incrementar un segundo
		 */

		// Variable para almacenar las horas
		int horas;

		// Para almacenar los minutos
		int min;

		// Para almacenar los segundos
		int seg;

		// Aquí se almacenará el resultado en forma de cadena
		String resul = null;

		// Activo el Scanner
		Scanner leer = new Scanner(System.in);

		// Le digo al usuario lo que tiene que hacer
		System.out.println("Introduzca un nº de horas, minutos y segundos");

		// Le asigno el valor introducido a la variable horas
		horas = leer.nextInt();

		// Le asigno el 2º valor introducido a la variable min
		min = leer.nextInt();

		// Y lo mismo con la variable seg para los segundos
		seg = leer.nextInt();

		// Le incremento 1 a los segundos
		seg++;

		/*
		 * Si los segundos son igual que 60 entonces se le asigna el valor 0 a los
		 * segundos y se le incrementa 1 a los segundos. Si los minutos son igual que 60
		 * se le incrementa 1 a las horas
		 */
		if (seg >= 60) {
			seg = 0;
			min++;

			if (min >= 60) {
				min = 0;
				horas++;
				if (horas >= 24) {
					horas = 0;
				}
			}
		}
		

		System.out.println(horas + ":" + min + ":" + seg);
		leer.close();

	}

}
