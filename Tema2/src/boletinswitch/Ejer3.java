package boletinswitch;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {

		/*
		 * Escribe un algoritmo que le pida al usuario dos números. A continuación debe
		 * mostrar el siguiente menú por pantalla: SUMAR LOS NÚMEROS RESTAR LOS NÚMEROS
		 * MULTIPLICAR LOS NÚMEROS DIVIDIR LOS NÚMEROS
		 * 
		 * Después, el algoritmo debe pedirle al usuario que seleccione una opción y que
		 * haga la operación que marca esa opción, mostrando por último el resultado de
		 * la operación elegida por el usuario. Si el usuario elige una opción
		 * incorrecta, el algoritmo se lo hace saber al usuario y no haría nada.
		 */

		/* Creo las variables que almacenarán los datos que introduzca el usuario */
		int num1;
		int num2;
		int option;

		// Creo el Scanner para que el usuario pueda introducir datos
		Scanner leer = new Scanner(System.in);

		// Le digo al usuario lo que tiene que hacer mostrándolo por pantalla
		System.out.println("Introduzca 2 números:");

		/*
		 * Asigno los valores introducidos por el usuario a las variables
		 * correspondientes
		 */
		num1 = leer.nextInt();
		num2 = leer.nextInt();

		/*
		 * Le muestro al usuario por pantalla las opciones que tiene y las cuales podrá
		 * ejecutar si introduce X nº
		 */
		System.out.println("SUMAR LOS Nº (1)\nRESTAR LOS Nº (2)\nMULTIPLICAR LOS Nº (3)\nDIVIDIR LOS Nº(4)");

		// Asigno el valor introducido por el usuario a la variable correspondiente
		option = leer.nextInt();

		switch (option) {

		case 1 -> System.out.println(num1 + num2);
		case 2 -> System.out.println(num1 - num2);
		case 3 -> System.out.println(num1 * num2);
		case 4 -> System.out.println(num1 / num2);

		}

		// Cierro el Scanner
		leer.close();

	}

}
