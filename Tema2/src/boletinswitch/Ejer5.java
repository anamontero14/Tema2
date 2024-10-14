package boletinswitch;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {

		/*
		 * Queremos saber, una vez introducida la letra del tipo de carnet de conducir,
		 * se debe imprimir a qué tipo de vehículos corresponde: E: remolques. D:
		 * autobuses. C1-C5: camiones. A: motocicletas. B1-B2: automóviles. En caso de
		 * introducir uno distinto: “Categoría no contemplada”.
		 */

		// Creo las variables que almacenarán los datos
		String letra;

		// Creo el Scanner
		Scanner leer = new Scanner(System.in);

		// Le digo al usuario lo que debe de introducir por la entrada
		System.out.println("Introduzca la letra de su carnet de conducir:");

		// Le asigno a las variables el valor de la entrada
		letra = leer.nextLine();

		/*
		 * En este switch aparecerá por pantalla diferentes cosas dependiendo del nº de
		 * letra que se introduzca, con la diferencia de que si no se introduce uno de
		 * los valores indicados en el switch entonces aparecerá que es un calor
		 * inválido
		 */
		switch (letra) {

		case "E" -> System.out.println("La letra corresponde a los remolques");
		case "D" -> System.out.println("La letra corresponde a los autobuses");
		case "C1", "C2", "C3", "C4", "C5" -> System.out.println("La letra corresponde a los camiones");
		case "A" -> System.out.println("La letra corresponde a las motocicletas");
		case "B1", "B2" -> System.out.println("La letra corresponde a los automóviles");
		default -> System.out.println("Categoría no contemplada");

		}

		// Cierro el Scanner
		leer.close();

	}

}
