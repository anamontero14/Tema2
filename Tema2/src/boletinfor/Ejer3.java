package boletinfor;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {

		/* Pedir diez números por teclado y mostrar la media */

		// Variables que almacenará los 10 nº
		int num;

		// Variable que recojerá todos los nº introducidos y sumados por el usuario
		int sumar = 0;

		// Variable que almacenará la media de los nº
		double media;

		// Inicializar el Scanner
		Scanner leer = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {

			// Le digo al usuario lo que debe hacer
			System.out.println("Introduzca un nº:");

			// Recojo la respuesta del usuario en la variable num
			num = leer.nextInt();

			// Le sumo y asigno el nº introducido a la variable num
			sumar += num;

		}

		// Hago la media de todos los nº
		media = sumar / 10;

		// Muestro la media
		System.out.println("La media de todos los nº es: " + media);

		// Cerrar Scanner
		leer.close();

	}

}
