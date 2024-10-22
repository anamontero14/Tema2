package boletindowhile;

import java.util.Scanner;

public class Ejer8 {

	public static void main(String[] args) {

		/*
		 * Repetir el ejercicio de los dados del boletín de SWITCH. Mientras en la
		 * primera tirada no se introduzca un valor válido se le seguirá preguntando. Lo
		 * mismo con la segunda tirada
		 */

		 // Creo las variables que almacenarán los números de las tiradas
        String tirada1;
        String tirada2;

        int num1tirada;
        int num2tirada;

        // Creo el Scanner para que se puedan introducir datos
        Scanner leer = new Scanner(System.in);

        // Variable para controlar la repetición de las preguntas
        boolean validInput;

        do {
            validInput = false; // Reiniciamos la variable

            // Le digo al usuario por pantalla lo que tiene que hacer
            System.out.println("Introduzca el nº que ha sacado con la primera y segunda tirada respectivamente en formato cadena");

            // Le asigno el valor introducido a las variables
            tirada1 = leer.nextLine();
            tirada2 = leer.nextLine();

            // Verificamos si al menos una tirada no está vacía
            if (!tirada1.isEmpty() || !tirada2.isEmpty()) {
                validInput = true; // Hay datos válidos
            } else {
                System.out.println("Por favor, introduzca al menos un valor para las tiradas.");
            }

        } while (!validInput); // Repite hasta que haya entradas válidas

        /*
         * A continuación haré lo siguiente: para hacer que los números introducidos
         * como cadenas se puedan sumar como valores numéricos voy a hacer un switch y
         * el resultado que de ese switch se lo voy a asignar a la cadena num1tiradas.
         * Por ejemplo, si el usuario introduce "UNO" entonces el switch le asignará el nº 1 y viceversa,
         * si hago lo mismo con la segunda tirada ya tendré los nº introducidos como valor numérico y los podré sumar
         */
        num1tirada = switch (tirada1) {
            case "UNO" -> 1;
            case "DOS" -> 2;
            case "TRES" -> 3;
            case "CUATRO" -> 4;
            case "CINCO" -> 5;
            case "SEIS" -> 6;
            default -> 0;
        };

        num2tirada = switch (tirada2) {
            case "UNO" -> 1;
            case "DOS" -> 2;
            case "TRES" -> 3;
            case "CUATRO" -> 4;
            case "CINCO" -> 5;
            case "SEIS" -> 6;
            default -> 0;
        };

        System.out.println(num1tirada + num2tirada);

        // Cierro el Scanner
        leer.close();
    }
}