package condicionales;

import java.util.Scanner;

public class Ejer7 {

	public static void main(String[] args) {

		/*
		 * Determinar el precio de un billete de tren, conociendo la distancia a
		 * recorrer, y sabiendo que si el número de días de estancia es superior a 7 y
		 * la distancia superior a 800 km el billete tiene una reducción del 30%. El
		 * precio por kilómetro es de 2,5€. La distancia a recorrer y el número de días
		 * de estancia los debes solicitar al usuario por teclado
		 */
		
		// Constante del descuento
		final double DESCUENTO = 0.30;
		
		// Constante con el precio por km
		final double PRECIO_KM = 2.5;
		
		// Distancia a recorrer
		double distancia;
		
		// Nº de días
		int dias;
		
		// Cuenta para hacer el descuento
		
		
		// Cuenta
		double cuenta;
		
		// Activar el Scanner
		Scanner leer = new Scanner(System.in);
		
		// Le solicito al usuario la información necesaria
		System.out.println("Introduzca a continuación la distancia a recorrer y el nº de días de estancia");
		
		// Asigno las respuestas a las correspondientes variables
		distancia = leer.nextDouble();
		dias = leer.nextInt();
		
		if (distancia >= 800 && dias >= 7) {
			
			cuenta = PRECIO_KM * distancia;
			
			System.out.println(cuenta * DESCUENTO + "€");
			
		} else {
			
			cuenta = PRECIO_KM * distancia;
			
			System.out.println(cuenta + "€");
			
		}
		
		// Cierro el Scanner
		leer.close();

	}

}
