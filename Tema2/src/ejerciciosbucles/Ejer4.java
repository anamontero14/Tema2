package ejerciciosbucles;

import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {

		/*
		 * De forma similar a la actividad 4, realiza un programa que calcule el mínimo
		 * común múltiplo de dos números dados. En este caso, habrá que partir del
		 * máximo de los dos e ir incrementando hasta encontrar el primer número que sea
		 * múltiplo de los dos números.
		 */

		// variable que almacenará el número 1
		int num1;

		// variable que almacenará el número 2
		int num2;

		// variable para almacenar el nº menor
		int min = 0;

		// variable para almacenar el nº menor
		int max = 0;

		// variable que almacenará el valor del módulo entre el más pequeño
		int modulo1 = 0;

		// variable que almacenará el valor del módulo entre el más grande
		int modulo2 = 0;

		// variable que almacenará el número que es el máximo común divisor
		int mincommul = 0;

		// Creación de Scanner
		Scanner leer = new Scanner(System.in);

		// Le digo al usuario lo que tiene que introducir
		System.out.println("Introduzca dos números para hayar su mínimo común múltiplo:");

		// Almacenaré los datos introducidos en las variables respectivamente
		num1 = leer.nextInt();
		num2 = leer.nextInt();

		// hago un if para saber cuál es el nº menor de los dos
		// si num1 es mayor que num2
		if (num1 > num2) {
			// el mínimo es igual a num2
			min = num2;

			// el máximo es igual a num1
			max = num1;

			// si num2 es mayor a num1
		} else if (num2 > num1) {
			// el mínimo es num1
			min = num1;

			// el máximo es num2
			max = num2;

			// si num1 es igual que num2
		} else if (num1 == num2) {
			// el mínimo es num2 (por poner algo, pq como son iguales pues da igual)
			min = num2;

			// el máximo es num1
			max = num1;
		}

		// contar de forma creciente desde el máximo hasta 9999
		for (int i = max; i <= 9999; i++) {

			// módulo del mínimo hasta encontrar el que de 0
			modulo1 = i % max;

			// el módulo del máximo hasta encontrar el que llega a 0
			modulo2 = i % min;

			// si el módulo es igual a 0
			if (modulo1 == 0 && modulo2 == 0) {

				// iguala la variable mincommul al nº por el que ha dado el módulo 0
				mincommul = i;
				break;
			}
			;

		}

		// le digo al usuario por pantalla la solución
		System.out.println("El mínimo común múltiplo de " + num1 + " y de " + num2 + " es " + mincommul);

		// Cerrar el Scanner
		leer.close();

	}

}
