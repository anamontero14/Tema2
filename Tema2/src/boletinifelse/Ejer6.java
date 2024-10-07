package boletinifelse;

import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {

		// Pedir los coeficientes de una ecuación de segundo grado y mostrar sus
		// soluciones reales

		// Si no existen, habrá que indicarlo

		// a b y c

		// creo las variables que usaré en el programa

		// esta sera la variable que contendrá el valor de a
		double valorA;

		// esta sera la variable que contendrá el valor de b
		double valorB;

		// esta sera la variable que contendrá el valor de c
		double valorC;

		// esta sera la variable que contendrá el valor de x
		double valorX;

		// esta sera la variable que contendrá el valor del discriminante
		double discriminante;

		// variable que almacenará el resultado de operaciones para averiguar x (una de
		// las soluciones)
		double x1;

		// variable que almacenará el resultado de operaciones para averiguar x (una de
		// las soluciones)
		double x2;

		// variable que almacenará el resultado de operaciones para averiguar x
		double x;

		// creo el Scanner para que el usuario doubleroduzca los valores por el teclado
		Scanner leer = new Scanner(System.in);

		// le pido al usuario que doubleroduzca los valores
		System.out.println("Introduzca el valor de a, b y c respectivamente:");

		// almaceno el valor que ha doubleroducido el usuario en las variables para
		// tener
		// almacenado ese valor, en este caso en la variable valorA
		valorA = leer.nextDouble();

		// en esta en la variable valorB
		valorB = leer.nextDouble();

		// y en esta en la variable valorC
		valorC = leer.nextDouble();

		// hago esto para averiguar el valor que hay en la raiz (el discriminante)
		discriminante = valorB * valorB - 4 * valorA * valorC;

		// a continuacion hago un if para saber si hay una solucion o mas de una
		// solucion
		// en este caso, si el discriminante es mayor que 0 habra dos soluciones
		if (discriminante > 0) {

			// dos soluciones distintas
			x1 = (-valorB + Math.sqrt(discriminante)) / (2 * valorA);

			x2 = (-valorB - Math.sqrt(discriminante)) / (2 * valorA);

			System.out.println("x1 es igual a : x1 = " + x1 + " y x2 es igual a : x2 = " + x2);

			// en este caso si el discriminante es igual a 0 solo habrá una solucion
			// entonces hago la operacion matematica y simplemente se lo asigno a la
			// variable previamente especificada como x
		} else if (discriminante == 0) {

			// hay una solucion

			x = -valorB / (2 * valorA);

			System.out.println("x es igual a : x = " + x);

		} else {

			// no hay soluciones sin numeros reales
			System.out.println("No hay soluciones reales");
		}

		// cierro el Scanner
		leer.close();

	}

}
