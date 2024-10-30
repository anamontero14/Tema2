package ejerciciosbucles;

import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {

		// variable que almacena el número introducido por el suuario
		int num = 0;

		// variable que almacena el número original introducido
		int original;

		// almacena el valor del número invertido
		int invertido = 0;

		// variable que almacenará los dígitos
		int digito;

		// variable para ejecutar el bucle de comprobacion
		boolean error = true;

		// Crear Scanner al inicio
		Scanner leer = new Scanner(System.in);

		while (error) {

			// Solicitar al usuario que introduzca un número entero no negativo
			System.out.print("Introduce un número para verificar si es capicúa: ");

			// almacenar el dato en la variable
			num = leer.nextInt();
		}

		// Verificar que el número sea mayor o igual a 0
		if (num >= 0) {
			// Guardar el número original para la comparación final
			original = num;

			// Invertir el número utilizando un ciclo while
			while (num > 0) {
				digito = num % 10; // Obtener el último dígito
				invertido = invertido * 10 + digito; // Construir el número invertido
				num /= 10; // Eliminar el último dígito de num
			}

			// Comprobar si el número invertido es igual al original
			if (original == invertido) {
				System.out.println("El número " + original + " es capicúa.");
			} else {
				System.out.println("El número " + original + " no es capicúa.");
			}
		} else {
			System.out.println("Error, debe introducir un número mayor o igual que 0");
		}

		// Cerrar Scanner al final
		leer.close();
	}
}
