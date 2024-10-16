package boletinbucles;

import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {

		/*
		 * Un centro de investigación de la flora urbana necesita una aplicación que
		 * muestre cuál es el árbol más alto. Para ello se introducirá por teclado la
		 * altura (en centímetros) de cada árbol (terminando la introducción de datos
		 * cuando se utilice -1 como altura). La aplicación debe devolver la altura del
		 * árbol más alto
		 */
		
		// Altura de árbol
		double altura;
		
		// Árbol más alto
		double  másAlto;
		
		// Inicialización de Scanner
		Scanner leer = new Scanner(System.in);
		
		// Le digo al usuario lo que tiene que hacer
		System.out.println("Introduzca la altura del árbol:");
		
		// Le asigno el dato introducido a la variable altura
		altura = leer.nextDouble();
		
		// Le asigno el valor de la variable altura a másAlto
		másAlto = altura;
		
		while (altura > -1) {
			
			if (altura > másAlto) {
				másAlto = altura;
			}
			
			// Le digo al usuario lo que tiene que hacer
			System.out.println("Introduzca la altura del árbol:");
			
			// Le asigno el dato introducido a la variable altura
			altura = leer.nextInt();
			
		}
		
		System.out.println("El árbol más alto mide: " + másAlto + "cm");
		
		// Cierre Scanner
		leer.close();

	}

}
