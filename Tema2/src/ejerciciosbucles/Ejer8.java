package ejerciciosbucles;

import java.util.Scanner;

public class Ejer8 {

	public static void main(String[] args) {

		/*
		 * Realiza un programa que lea y acepte únicamente aquellos que sean mayores que
		 * el último dado. La introducción de números finaliza con la introducción de un
		 * 0. Al final se mostrará: a. El total de números introducidos, excluido el 0.
		 * b. El total de números fallados.
		 */

		// variable que almacenará el número introducido
		int num;

		// variable que contendrá los números que se le van solapando;
		int almacenNumeros = 0;

		// variable que almacenará el número de números introducidos MENOS el 0
		int contadorAciertos = 0;

		// variable que almcenará los números que no me valen
		int contadorFallos = 0;

		// creación del Scanner
		Scanner leer = new Scanner(System.in);

		// haz las instrucciones mientras que num no sea 0
		do {

			// le digo al usuario lo que debe hacer
			System.out.print("Introduzca un nº: ");

			// almacena la respuesta en la variable num
			num = leer.nextInt();

			// si almacenNumeros es menor o igual que el número introducido
			if (almacenNumeros <= num && num != 0) {
				// incrementa contadorAciertos
				contadorAciertos++;

				// igualo la variable que almacena los números al dato introducido
				almacenNumeros = num;

				// si no
			} else if (almacenNumeros >= num && num != 0) {
				// incrementa contadorFallos
				contadorFallos++;

				// Le digo al usuario que ha cometido un fallo
				System.out.println("Fallo, el número introducido es menor");
			}
			;

		} while (num != 0);

		// muestro el nº de números acertados y registrados
		System.out.println("Total de números introducidos: " + contadorAciertos);

		// muestro el nº de números fallados y registrados
		System.out.println("Total de números fallados: " + contadorFallos);

		// cerrar el Scanner
		leer.close();

	}

}
