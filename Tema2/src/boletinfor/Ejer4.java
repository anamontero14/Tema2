package boletinfor;

public class Ejer4 {

	public static void main(String[] args) {

		// Diseñar un programa que muestre la suma de los 10 primeros números impares

		// Variable que almacenará la suma de los nº impares hasta 10
		int suma = 0;
		
		// PARA almacenar los nº impares
		int impar = 1;
		
		// Contar hasta 10
		for (int i = 1; i <= 10; i++) {

			suma += impar;
			impar += 2;

		}

		// Le muestro al usuario la suma
		System.out.println("La suma de los nº impares es " + suma);
	}

}
