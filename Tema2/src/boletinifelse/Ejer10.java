package boletinifelse;

import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {

		/*
		 * Escribir un programa que pida al usuario tres números enteros, y que muestre
		 * por pantalla si la suma de dos de esos números da como resultado el otro
		 * número
		 */

		// CREO LAS VARIABLES

		// Variable donde se guardará el valor del nº introducido por el usuario
		int num1;
		int num2;
		int num3;

		// Variable que albergará la suma de dos de los números
		int suma;

		// Variable que almacenará el valor de la media

		// Creo el Scanner
		Scanner leer = new Scanner(System.in);

		// Le digo al usuario lo que tiene que hacer por pantalla
		System.out.println("Introduzca 3 números a continuación");

		// Asigno el valor introducido a las variables
		num1 = leer.nextInt();
		num2 = leer.nextInt();
		num3 = leer.nextInt();

		// Hago la suma a dos de los números introducidos y se lo asigno a la variable
		suma = num1 + num2;

		if (suma == num3) {
			System.out.println("La suma de los dos primeros números es igual que el tercer número introducido");
		} else {
			System.out.println("La suma de los dos primeros números NO es igual que el tercer número introducido");
		}

		// Cierro el Scanner
		leer.close();

	}

}
