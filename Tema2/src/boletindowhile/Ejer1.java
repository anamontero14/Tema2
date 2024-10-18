package boletindowhile;

public class Ejer1 {

	public static void main(String[] args) {

		/*
		 * Realiza un programa que muestre por pantalla los 20 primeros números
		 * naturales (1, 2, 3... 20)
		 */

		// Creación de la variable que mostrará los números
		int num = 1;

		/*
		 * Hago un do while que seguirá mostrando el valor de la variable num e
		 * incrementandole 1 a num MIENTRAS la variable num sea menor O igual que 20
		 */
		do {
			System.out.println(num);
			++num;
		} while (num <= 20);
	}

}
