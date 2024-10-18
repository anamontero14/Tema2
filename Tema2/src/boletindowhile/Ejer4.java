package boletindowhile;

import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {

		/*
		 * Realiza un programa que muestre la tabla de multiplicar de un número
		 * introducido por teclado. Por ejemplo, si se introduce el número 3 se debe
		 * imprimir lo siguiente: 3 x 1 = 3 3 x 2 = 6 3 x 3 = 9 3 x 4 = 12 3 x 5 = 15 3
		 * x 6 = 18 3 x 7 = 21 3 x 8 = 24 3 x 9 = 27 3 x 10 = 30
		 */

		// Variable para el nº introducido
		int num;

		// Variable para el nº por el que se va a ir multiplicando
		int contador = 1;

		// Variable para almacenar el resultado de las multiplicaciones
		int resultado;

		// Iniciar el Scanner
		Scanner leer = new Scanner(System.in);

		// Le digo al user lo que dee introducir
		System.out.println("Introduzca el nº del que hacer la tabla de multiplicar:");

		// Asigno el dato a la variable
		num = leer.nextInt();

		do {

			// A resultado le iguala el resultado después de multiplicar num por contador
			resultado = num * contador;

			// Muestra la multiplicacion por pantalla + el resultado
			System.out.println(num + " x " + contador + " = " + resultado);

			// El contador va aumentando para así hacer toda la tabla
			++contador;

		} while (contador <= 10);

		// Cerrar el Scanner
		leer.close();

	}

}
