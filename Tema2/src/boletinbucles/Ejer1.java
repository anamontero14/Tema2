package boletinbucles;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {

		/*
		 * Escribe un programa que vaya pidiendo al usuario números enteros positivos
		 * que debe ir sumando. Cuando el usuario no quiera insertar más números,
		 * introducirá un número negativo y el algoritmo, antes de acabar, mostrará la
		 * suma de los números positivos introducidos por el usuario
		 */

		// Variable del nº introducido por el usuario
		int num = 0;

		// Variable que contendrá la suma
		int suma = 0;

		// Activar Scanner
		Scanner leer = new Scanner(System.in);

		// Le pido al usuario el nº
		System.out.println("Introduzca un número para sumarlo:");

		// Le asigno el nº introducido a la variable
		num = leer.nextInt();

		while (num >= 0) {

			/*
			 * A suma le asigno el valor del numero introducido SUMADO POR EL Nº QUE ESTÉ EN
			 * SUMA. Por lo tanto una vez el bucle se repita, la variable "suma" ya tendrá
			 * asignado el nº que le introduje en la primera vuelta por lo que aquí SÍ que
			 * ejecutará una suma y no sumará por 0
			 */
			suma += num;

			// Muestro el valor de la variable suma
			System.out.println(suma);

			// Le pido al usuario el nº
			System.out.println("Introduzca un número para sumarlo:");

			// Le asigno el nº introducido a la variable
			num = leer.nextInt();

		}
		
		// Muestro la suma de los nº enteros por pantalla
		System.out.println(suma);

		// Cerrar Scanner
		leer.close();

	}

}
