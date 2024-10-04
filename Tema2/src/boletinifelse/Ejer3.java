package boletinifelse;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {

		// 1º pedir un nº decimal
		// 2º decir si es un nº casi-cero o no
		/*
		 * un número casi-cero es el que se encuentra en el intervalo (-1, 1), donde se
		 * excluye el -1, el 0 y el 1
		 */

		// primero creo la variable que va a guardar el valor que introducirá el usuario
		// por la entrada
		double num;

		/*
		 * a continuación creo dos variables las cuales guardarán un valor booleano que
		 * me servirá para decir si el nº es un casi-cero o no, en la variable de
		 * menosQue se me guardará si es 1 mayor que el nº y en masQue me dirá si el nº
		 * es mayor que -1
		 */

		boolean masQue;
		boolean menosQue;

		// inicializo el scanner para que el usuario pueda introducir el nº
		Scanner leer = new Scanner(System.in);

		// le digo al usuario que introduzca el nº
		System.out.println("Introduzca un nº decimal y le diré si es un nº casi-cero o no");

		// le dejo al usuario introducir un valor y le asigno ese valor a la variable
		// previamente inicializada
		num = leer.nextDouble();

		/*
		 * ahora hago un ternario para asignarle un valor a la variable menosQue donde
		 * digo: Es num menor que 1? entonces asignale a la variable menosQue true y si
		 * no false
		 */
		menosQue = num < 1 ? true : false;

		/*
		 * hago otro ternario para asignarle un valor a la variable masQue donde digo:
		 * Es num mayor que -1? entonces asignale a la variable masQue true y si no
		 * false
		 */
		masQue = num > -1 ? true : false;

		/*
		 * entonces como he asignado los valores booleanos a las variables puedo hacer
		 * un && para saber si es casi-cero o no. En el if pregunto: masQue y menosQue
		 * son igual a true? si? pues es casi cero. no? pues entonces no es
		 */
		if (masQue && menosQue == true) {
			System.out.println("El nº es un nº casi-cero");
		} else {
			System.out.println("El nº no es un nº casi-cero");
		}

		// cierro el scanner
		leer.close();

	}

}
