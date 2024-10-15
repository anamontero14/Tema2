package boletinbucles;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {

		/*
		 * Escribe un programa que vaya pidiendo al usuario números enteros positivos
		 * que debe ir sumando. Cuando el usuario no quiera insertar más números,
		 * introducirá un número negativo y el algoritmo, antes de acabar, mostrará la
		 * media de los números positivos introducidos por el usuario
		 */

		// Variable del nº introducido por el usuario
		int num = 0;

		// Variable que contendrá la suma
		int suma = 0;

		// Variable para ir contando
		int recuento = 0;
		
		// Variable que contendrá la media
		double media;

		// Activar Scanner
		Scanner leer = new Scanner(System.in);

		// Le pido al usuario el nº
		System.out.println("Introduzca un número para sumarlo:");

		// Le asigno el nº introducido a la variable
		num = leer.nextInt();

		while (num >= 0) {
			
			++recuento;
			
			/*
			 * A suma le asigno el valor del numero introducido SUMADO POR EL Nº QUE ESTÉ EN
			 * SUMA. Por lo tanto una vez el bucle se repita, la variable "suma" ya tendrá
			 * asignado el nº que le introduje en la primera vuelta por lo que aquí SÍ que
			 * ejecutará una suma y no sumará por 0
			 */
			suma += num;

			// Le pido al usuario el nº
			System.out.println("Introduzca un número para sumarlo:");

			// Le asigno el nº introducido a la variable
			num = leer.nextInt();

		}
		
		// Hago la media
		media = (double) suma / recuento;

		// Muestro la suma de los nº enteros por pantalla
		System.out.println(media);

		// Cerrar Scanner
		leer.close();

	}

}
