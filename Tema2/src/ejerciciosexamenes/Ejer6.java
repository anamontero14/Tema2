package ejerciciosexamenes;

import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {

		// Variables
		int precio = 0;
		int pago = 0;
		int devolver = 0;
		int tipoMoneda = 200;
		int cantidadMonedas = 0;

		// Creación del Scanner
		Scanner leer = new Scanner(System.in);

		// Preguntar el precio en céntimos
		System.out.print("¿Cuánto cuesta el producto en céntimos? ");
		precio = leer.nextInt();

		// Preguntar el pago del cliente en céntimos
		System.out.print("¿Cuánto ha dado el cliente en céntimos? ");
		pago = leer.nextInt();

		// Calcular la cantidad a devolver
		if (pago == precio) {
			System.out.println("No hay que devolver nada, el pago ha sido exacto.");
		} else if (pago < precio) {
			System.out.println("Al usuario le falta dinero.");
		} else {
			devolver = pago - precio;
			System.out.printf("Debe devolver %d céntimos.\n", devolver);

			// Desglose de monedas
			while (devolver > 0) {
				
				cantidadMonedas = devolver / tipoMoneda;
				if (cantidadMonedas > 0) {
					switch (tipoMoneda) {
					case 200 -> System.out.println("Monedas de 2 euros: " + cantidadMonedas);
					case 100 -> System.out.println("Monedas de 1 euro: " + cantidadMonedas);
					case 50 -> System.out.println("Monedas de 50 céntimos: " + cantidadMonedas);
					case 20 -> System.out.println("Monedas de 20 céntimos: " + cantidadMonedas);
					case 10 -> System.out.println("Monedas de 10 céntimos: " + cantidadMonedas);
					case 5 -> System.out.println("Monedas de 5 céntimos: " + cantidadMonedas);
					case 2 -> System.out.println("Monedas de 2 céntimos: " + cantidadMonedas);
					case 1 -> System.out.println("Monedas de 1 céntimo: " + cantidadMonedas);
					}
					devolver %= tipoMoneda;
				}

				// Cambiar al siguiente tipo de moneda
				switch (tipoMoneda) {
				case 200 -> tipoMoneda = 100;
				case 100 -> tipoMoneda = 50;
				case 50 -> tipoMoneda = 20;
				case 20 -> tipoMoneda = 10;
				case 10 -> tipoMoneda = 5;
				case 5 -> tipoMoneda = 2;
				case 2 -> tipoMoneda = 1;
				default -> tipoMoneda = 0;
				}
			}
		}

		// Cerrar el Scanner
		leer.close();
	}
}
