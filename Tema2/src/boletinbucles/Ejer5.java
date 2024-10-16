package boletinbucles;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {

		/*
		 * Implementar una aplicación para calcular datos estadísticos de las edades de
		 * los alumnos de un centro educativo. Se introducirán datos hasta que uno de
		 * ellos sea negativo, y se mostrará: la suma de todas las edades introducidas,
		 * la media, el número de alumnos y cuántos son mayores de edad
		 */

		// Variable para la edad de los alumnos
		int edadAlumn;

		// Variable para la suma de todas las edades
		int sumaEdad = 0;

		// Media de las edades introducidas
		double media;

		// Nº de alumnos que han introducido su fecha
		int contadorAlumn = 0;

		// Variable que almacena cuántos son mayores de edad
		int mayor = 0;

		// Creación del Scanner
		Scanner leer = new Scanner(System.in);

		// Le digo al usuario los datos a introducir
		System.out.println("Introduzca su edad:");

		// Le asigno el dato introducido a la variable
		edadAlumn = leer.nextInt();

		while (edadAlumn > 0) {

			// Le incremento 1 a la variable contadorAlumn
			++contadorAlumn;

			// A sumaEdad le sumo el valor previamente introducido y asignado en edadAlumn
			sumaEdad += edadAlumn;

			/*
			 * Si la edad introducida en edadAlumn es igual o mayor a 18 entonces se le
			 * incrementa 1 a la variable mayor pq es mayor de edad
			 */
			if (edadAlumn >= 18) {
				++mayor;
			}

			// Le digo al usuario los datos a introducir
			System.out.println("Introduzca su edad:");

			// Le asigno el dato introducido a la variable
			edadAlumn = leer.nextInt();

		}

		if (sumaEdad <= 0) {
			System.out.println("Ha introducido un nº inválido");
		} else {
			// Le muestro al usuario la suma de las edades
			System.out.println("Suma de todas las edades introducidas: " + sumaEdad);

			// Hago la media de las edades
			media = sumaEdad / contadorAlumn;

			// Le muestro al usuario la media de las edades
			System.out.println("La media de la edad de los alumnos es :" + media);

			// El número de alumnos
			System.out.println("El nº de alumnos que hay es :" + contadorAlumn);

			// Los alumnos mayores de edad
			System.out.println("El nº de alumnos que son mayores de edad es :" + mayor);
		}
		// Cierro el Scanner
		leer.close();

	}

}
