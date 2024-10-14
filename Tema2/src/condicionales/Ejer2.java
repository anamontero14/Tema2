package condicionales;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {

		/*
		 * 1º: Al principio no sabia cómo poder hacerlo así que al nº que introduciría
		 * el usuario le haría el módulo de 10 y al resto lo multiplicaría por 2 así
		 * sabría el nº que hay que sumarle para que fuera entero y me diera el nº
		 * absoluto
		 */

		/*
		 * 2º: Me di cuenta que podía hacerlo simplemente poniéndole al número
		 * introducido un - delante si es negativo y no habría que hacer ningún tipo de
		 * cuenta
		 */

		/*
		 * Utiliza un operador ternario para calcular el valor absoluto de un número que
		 * se solicita al usuario por teclado
		 */

		// Nº que introducirá el usuario
		int num;

		// Almacenará el resultado del ternario
		int valAbs;

		// Activar Scanner
		Scanner leer = new Scanner(System.in);

		// Le digo al usuario lo que tiene que hacer
		System.out.println("Introduzca un nº:");

		// Almaceno el nº en la variable
		num = leer.nextInt();

		// Se le pone delante de num un - y así el nº se vuelve positivo si es que lo
		// fuera
		valAbs = num < 0 ? -num : num;

		System.out.println("El valor absoluto de " + num + " es " + valAbs);

		// Cierro el Scanner
		leer.close();

	}

}
