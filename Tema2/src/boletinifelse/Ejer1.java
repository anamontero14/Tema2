package boletinifelse;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {

		// Diseñar una aplicación que solicite al usuario un número e indique si es par
		// o impar

		// creo una variable que guarde el número que introducirá el usuario
		int num;

		// creo una variable para almacenar el resultado de una operación donde sabré si
		// el número es par o no
		int resultado;

		// inicializo el scanner para que el usuario pueda introducir datos por la
		// pantalla
		Scanner leer = new Scanner(System.in);

		// le digo al usuario que tiene que introducir un valor
		System.out.println("Por favor, introduzca un número:");

		// le dejo al usuario introducir el número
		num = leer.nextInt();

		/*
		 * para saber si el número es par o no voy a dividirlo entre 2 y si da de resto
		 * 0 pues significará que es múltiplo de 2 y por ende un número par
		 */
		resultado = num % 2;

		/*
		 * haré un if donde diré: si el nº introducido por el usuario es igual a 0 dirá
		 * que el número es par y si no lo es dirá que es impar
		 */
		if (resultado == 0) {
			System.out.println("El número es par");
		} else {
			System.out.println("El número es impar");
		}

		// cierro el scanner porque ya ha acabado el programa
		leer.close();

	}

}
