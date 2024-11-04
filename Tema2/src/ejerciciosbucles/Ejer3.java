package ejerciciosbucles;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {

		/*
		 * Para dos números dados, a y b, es posible calcular el máximo común divisor
		 * (el número más grande que divide a ambos) mediante un algoritmo ineficiente
		 * pero sencillo: desde el menor de a y b, ir buscando, de forma decreciente
		 * (-1), el primer número que divide a ambos simultáneamente. Teniendo en cuenta
		 * lo que se acaba de explicar, realiza un programa que calcule el máximo común
		 * divisor de dos números
		 */

		// variable que almacenará el número 1
		int num1;

		// variable que almacenará el número 2
		int num2;

		// variable para almacenar el nº menor
		int min = 0;

		// variable para almacenar el nº menor
		int max = 0;

		// variable para poder salir del bucle
		boolean salir = false;

		int encontrar = 0;

		// variable que almacenará el valor del módulo entre el más pequeño
		int modulo1 = 0;

		// variable que almacenará el valor del módulo entre el más grande
		int modulo2 = 0;

		// variable que almacenará el número que es el máximo común divisor
		int maxcomdiv = 0;

		// Creación de Scanner
		Scanner leer = new Scanner(System.in);

		// Le digo al usuario lo que tiene que introducir
		System.out.println("Introduzca dos números para hayar su máximo común divisor:");

		// Almacenaré los datos introducidos en las variables respectivamente
		num1 = leer.nextInt();
		num2 = leer.nextInt();

		// hago un if para saber cuál es el nº menor de los dos
		// si num1 es mayor que num2
		if (num1 > num2) {
			// el mínimo es igual a num2
			min = num2;

			encontrar = min;

			// el máximo es igual a num1
			max = num1;

			// si num2 es mayor a num1
		} else if (num2 > num1) {
			// el mínimo es num1
			min = num1;

			encontrar = min;

			// el máximo es num2
			max = num2;

			// si num1 es igual que num2
		} else if (num1 == num2) {
			// el mínimo es num2 (por poner algo, pq como son iguales pues da igual)
			min = num2;

			encontrar = min;

			// el máximo es num1
			max = num1;
		}

		// contar descendientemente desde el mínimo hasta 1
		while (!salir) {

			// módulo del mínimo hasta encontrar el que de 0
			modulo1 = min % encontrar;

			// el módulo del máximo hasta encontrar el que llega a 0
			modulo2 = max % encontrar;

			// si el módulo es igual a 0
			if (modulo1 == 0 && modulo2 == 0) {

				// iguala la variable maxcomdiv al nº por el que ha dado el módulo 0
				maxcomdiv = encontrar;
				salir = true;
			}
			;
			
			encontrar--;

		};

		/*
		 * Si se introdujera 0 como nº el MCD debería de ser el otro número que es
		 * introducido pero el programa dice que ha de empezar a buscar desde el menor
		 * nº
		 */

		// le digo al usuario por pantalla la solución
		System.out.println("El máximo común divisor de " + num1 + " y de " + num2 + " es " + maxcomdiv);

		// Cerrar el Scanner
		leer.close();

	}

}
