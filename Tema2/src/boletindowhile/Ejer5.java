package boletindowhile;

import java.util.Random;
import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {

		/*
		 * Realiza un programa donde el usuario "piensa" un número del 1 al 100 y el
		 * ordenador intenta adivinarlo. Es decir, el ordenador irá proponiendo números
		 * una y otra vez hasta adivinarlo (el usuario deberá indicarle al ordenador si
		 * es mayor, menor o igual al número que ha pensado)
		 */
		
		// Inicializo el random
		Random rand = new Random();
		
		// Inicializo el Scanner
		Scanner leer = new Scanner(System.in);
		
		String respuesta = "si";
		
		
		
			// Variable que almacenará el nº random
		int nRandomMáquina = rand.nextInt(1, 101);
		
		
		
		// Cierro el Scanner
		leer.close();

	}

}
