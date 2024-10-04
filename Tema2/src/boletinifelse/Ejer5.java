package boletinifelse;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {

		// Pedir tres números y mostrarlos ordenados de mayor a menor

		// creo la variable donde se almacenara el primer valor introducido por el
		// usuario
		int num1;

		// creo la variable donde se almacenara el segundo valor introducido por el
		// usuario
		int num2;

		// creo la variable donde se almacenara el tercer valor introducido por el
		// usuario
		int num3;

		// creo el scanner para que el usuario pueda introducir los valores
		Scanner leer = new Scanner(System.in);

		// le pido al usuario que introduzca dos numeros
		System.out.println("Por favor, introduzca tres números a continuación");

		// asigno el valor que introducirá el usuario a la variable
		num1 = leer.nextInt();
		num2 = leer.nextInt();
		num3 = leer.nextInt();

		if (num1 <= num2 && num2 <= num3) {
			System.out.println(num3 + " > " + num2 + " > " + num1);
		} else if (num2 <= num1 && num1 <= num3) {
			System.out.println(num3 + " > " + num1 + " > " + num2);
		} else if (num1 <= num3 && num3 <= num2) {
			System.out.println(num2 + " > " + num3 + " > " + num1);
		} else if (num3 <= num1 && num1 <= num2) {
			System.out.println(num2 + " > " + num1 + " > " + num2);
		} else if (num3 <= num2 && num2 <= num1) {
			System.out.println(num1 + " > " + num2 + " > " + num3);
		} else if (num2 <= num3 && num3 <= num1) {
			System.out.println(num1 + " > " + num3 + " > " + num2);
		}

		// cierro el scanenr
		leer.close();

	}

}
