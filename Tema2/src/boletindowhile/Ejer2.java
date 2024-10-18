package boletindowhile;

public class Ejer2 {

	public static void main(String[] args) {

		/*
		 * Realiza un programa que muestre los números pares comprendidos entre el 1 y
		 * el 200
		 */
		
		// Inicio la variable que valdrá 2
		int num = 2;
		
		/*Muestra */
		do {
			System.out.println(num);
			++num;
			++num;
		} while (num <= 200);

	}

}
