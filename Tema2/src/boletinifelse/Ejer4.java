package boletinifelse;

import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {

		// Pedir dos números y mostrarlos ordenados de menor a mayor

		// creo la variable donde se almacenara el primer valor introducido por el
		// usuario
		int num1;

		// creo la variable donde se almacenara el segundo valor introducido por el
		// usuario
		int num2;

		// creo el scanner para que el usuario pueda introducir los valores
		Scanner leer = new Scanner(System.in);

		// le pido al usuario que introduzca dos numeros
		System.out.println("Por favor, introduzca dos números a continuación");

		// asigno el valor que introducirá el usuario a la variable
		num1 = leer.nextInt();
		num2 = leer.nextInt();

		/*
		 * el if lo hago de la siguiente manera: si el n1 es mayor o igual que el n2
		 * pues imprimira el n2 que se supone que sera menor y asi al reves
		 */
		if (num1 >= num2) {
			System.out.println(num2 + " < " + num1);
		} else {
			System.out.println(num1 + " < " + num2);
		}

		// cierro el scanenr
		leer.close();

	}

}
