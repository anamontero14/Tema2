package condicionales;

import java.util.Scanner;

public class Ejer8 {

	public static void main(String[] args) {

		/*
		 * Pedir al usuario el número de un mes y el año (comprobando si es o no
		 * bisiesto). Debe imprimir por pantalla el número de días que tiene el mes
		 */

		// Variable que almacenará el nº del mes
		int mes;

		// Variable que almacenará el nº del año
		int año;

		// Variable que almacenará el nº de días
		int dias = 0;

		// Variable que almacena un boleano para saber si es bisiesto o no
		boolean esBisiesto;

		// Creación del Scanner
		Scanner leer = new Scanner(System.in);

		// Solicitar el número del mes
		System.out.println("Introduce el número del mes (1-12): ");
		mes = leer.nextInt();

		// Solicitar el año
		System.out.print("Introduce el año: ");
		año = leer.nextInt();

		// Comprobar si el año es bisiesto
		esBisiesto = (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);

		// Determinar el número de días del mes
		switch (mes) {
		case 1: // Enero
		case 3: // Marzo
		case 5: // Mayo
		case 7: // Julio
		case 8: // Agosto
		case 10: // Octubre
		case 12: // Diciembre
			dias = 31;
			break;
		case 4: // Abril
		case 6: // Junio
		case 9: // Septiembre
		case 11: // Noviembre
			dias = 30;
			break;
		case 2: // Febrero
			if (esBisiesto) {
				dias = 29;
			} else {
				dias = 28;
			}
			break;
		default:
			System.out.println("Mes no válido. Debe ser un número entre 1 y 12.");
		}

		// Mostrar el número de días del mes
		System.out.println("El mes " + mes + " del año " + año + " tiene " + dias + " días.");

		// Cierro el Scanner
		leer.close();
	}
}