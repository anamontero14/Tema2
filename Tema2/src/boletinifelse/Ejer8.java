package boletinifelse;

import java.util.Scanner;

public class Ejer8 {

	public static void main(String[] args) {

		/*
		 * Escribir una aplicación que pida al usuario un número real y muestre por
		 * pantalla la nota del alumno, teniendo en cuenta: 
		 * [0-5) es INSUFICIENTE (0 inclusive) 
		 * [5-6) es SUFICIENTE (5 inclusive) 
		 * [6-7) es BIEN (6 inclusive)
		 * [7-9) es NOTABLE (7 inclusive) 
		 * [9-10] es SOBRESALIENTE (9 y 10 inclusives)
		 */
		
		// Creo una variable que almacenará el número real que el usuario introduzca
		double nota;
		
		// Creo el Scanner
		Scanner leer = new Scanner(System.in);
		
		// Le digo al usuario lo que tiene que introducir por la entrada a continuación
		System.out.println("Introduzca su nota");
		
		// Activo la entrada de datos por teclado
		nota = leer.nextDouble();
		
		if (nota >= 0 && nota < 5) {
			System.out.println("INSUFICIENTE");
		} else if (nota >= 5 && nota < 6) {
			System.out.println("SUFICIENTE");
		} else if (nota >= 6 && nota < 7) {
			System.out.println("BIEN");
		} else if (nota >= 7 && nota < 9) {
			System.out.println("NOTABLE");
		} else {
			System.out.println("SOBRESALIENTE");
		}
		
		// Cierro el Scanner
		leer.close();

	}

}
