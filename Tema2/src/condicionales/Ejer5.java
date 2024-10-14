package condicionales;

import java.util.Random;
import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {

		/*
		 * Realiza el “juego de la suma”, que consiste en que aparezcan dos números
		 * aleatorios (comprendidos entre 1 y 99) y el usuario tiene que sumarlos. La
		 * aplicación le pedirá al usuario que introduzca el resultado de la suma. La
		 * aplicación le indicará si el resultado es correcto o no
		 */

		// Respuesta
		int respuesta;

		// Para hacer el nº random
		Random rand = new Random();
		
		// 1º num random
		int rand1 = rand.nextInt(1, 100);
		
		// 2º num random
		int rand2 = rand.nextInt(1, 100);
		
		// Para almacenar la suma de los números
		int suma;
		
		// Inicializo el Scanner
		Scanner leer = new Scanner(System.in);
		
		// Se lo muestro al usuario por pantalla
		System.out.println("¿Cuál es el resultado de sumar " + rand1 + " y " + rand2 + "?");
		
		// Activo el Scanner para que me diga su respuesta
		respuesta = leer.nextInt();
		
		//Hago la suma de los números
		suma = rand1 + rand2;
		
		// Comparo la suma y la respuesta del usuario
		if (suma == respuesta) {
			System.out.println("Respuesta correcta");
		} else {
			System.out.println("Respuesta incorrecta, la solución era " + suma);
		}
		
		// Cierro el Scanner
		leer.close();

	}

}
