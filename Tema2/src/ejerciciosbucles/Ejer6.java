package ejerciciosbucles;

import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {

		/*
		 * Solicita al usuario un número n y dibuja un triángulo de base y altura n. Por
		 * ejemplo para n=4 debe dibujar lo siguiente
		 */

		// variable para recoger el número introducido por el usuario
		int num;

		// inicialización del Scanner
		Scanner leer = new Scanner(System.in);

		//le digo al usuario lo que tiene que introducir
		System.out.println("Introduzca un número para crear un triángulo de esa altura y anchura:");
		
		//asigno el valor a la variable
		num = leer.nextInt();
		
		for (int i = 1; i <= num; i++) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
				System.out.println("");
		}
		
		// cierro el Scanner
		leer.close();

	}

}
