package boletinifelse;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {

		// Pedir dos números enteros y decir si son iguales o no

		// creo las variables:

		// creo la variable entera que almacenará el primer nº introducido por el
		// usuario
		int num1;

		// creo la variable entera que almacenará el segundo nº introducido por el
		// usuario
		int num2;

		// inicializo el scanner pq necesito que el usuario introduzca datos por la
		// consola
		Scanner leer = new Scanner(System.in);

		// le digo al usuario que debe introducir dos valores
		System.out.println("Por favor, introduzca a continuación dos números para compararlos");

		// abro el scanner para q el usuario introduzca los nº
		num1 = leer.nextInt();
		num2 = leer.nextInt();

		/*
		 * a continuación haré un if donde diré
		 * "Son las variables iguales? Si? entonces di que son iguales. No?" entonces di
		 * que no son iguales
		 */
		if (num1 == num2) {
			System.out.println("Los números son iguales");
		} else {
			System.out.println("Los números no son iguales");
		}

		// cierro el scanner pq ya ha acabado el programa
		leer.close();

	}

}
