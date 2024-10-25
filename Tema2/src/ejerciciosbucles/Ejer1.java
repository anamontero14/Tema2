package ejerciciosbucles;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {

		/*
		 * Escribe un programa que incremente la hora de un reloj. Se pedirán por
		 * teclado: Hora Minutos Segundos Cantidad de segundos a incrementar La
		 * aplicación debe mostrar la nueva hora. Por ejemplo, si el usuario introduce
		 * hora=13, minutos=59 y segundos=51, y se desea incrementar en 10 segundos, el
		 * resultado a mostrar es 14:00:01.
		 */

		// Variable para las horas
		int horas;

		// Variable para los minutos
		int minutos;

		// Variable para los segundos
		int segundos;

		// Variable para los segundos A INCREMENTAR
		int segIncremento;

		// Variable para almacenar el cálculo de minutos
		int calculoMinuto;

		// Variable para almacenar el cálculo de horas
		int calculoHoras;

		// Activo el Scanner
		Scanner leer = new Scanner(System.in);

		// Le digo al usuario que introduzca una hora
		System.out.print("Introduzca una hora:");

		// Le asigno a la variable el valor introducido
		horas = leer.nextInt();

		// Le digo al usuario que introduzca unos minutos
		System.out.print("Introduzca unos minutos:");

		// Le asigno a la variable el valor introducido
		minutos = leer.nextInt();

		// Le digo al usuario que introduzca unos segundos
		System.out.print("Introduzca unos segundos:");

		// Le asigno a la variable el valor introducido
		segundos = leer.nextInt();

		// Le digo al usuario que introduzca el nº de segundos a incrementar
		System.out.println("Introduzca el número de segundos a incrementar:");

		// Le asigno a la variable el valor introducido
		segIncremento = leer.nextInt();

		

		for (int i = 0; i <= segIncremento; i++) {
			
			segundos += 1;
			
			if (segundos >= 60) {
				calculoMinuto = segundos / 60;
				segundos %= 60;
				minutos += calculoMinuto;
			}

			if (minutos >= 60) {
				calculoHoras = minutos / 60;
				minutos %= 60;
				horas += calculoHoras;
			}

			if (horas > 23) {
				horas = 00;
			}
			
			System.out.println(horas + ":" + minutos + ":" + segundos);
			
		}

		// Cierro el Scanner
		leer.close();

	}

}
