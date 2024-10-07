package boletinifelse;

import java.util.Scanner;

public class Ejer7 {

	public static void main(String[] args) {

		/*
		 * Escribir una aplicación que indique cuántas cifras tiene un número
		 * introducido por teclado, que está comprendido entre 0 y 99999
		 */

		// creo la variable que me va a servir para recoger el numero introducido por el
		// usuario
		int num;

		// creo el Scanner
		Scanner leer = new Scanner(System.in);

		// le indico al usuario que tiene que introducir un numero
		System.out.println("Introduzca un nº entre 0 y 99999:");

		// recojo el valor introducido en la variable num
		num = leer.nextInt();

		if (num > 99999 || num < 0) {

			// le digo al usuario que tiene que ser un nº dentro del rango
			System.out.println("El nº introducido debe estar dentro del rango");
		} else if (num <= 9) {
			
			//le digo que si numero es mayor o igual a 9 tendrá una cifra
			System.out.println("El nº introducido ("+ num + ") tiene 1 cifra");
		}

		// cierro el Scanner
		leer.close();

	}

}
