package ejerciciosexamenes;

import java.io.ObjectInputStream.GetField;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {

		/*
		 * Escribe un programa que lea un número entero (lado) y a partir de él cree un
		 * cuadrado de asteriscos con ese tamaño. Los asteriscos sólo se verán en el
		 * borde del cuadrado, no en el interior
		 */

		// variable para almacenar el número entero que será el lado
		int lado = 0;

		// creación de Scanner
		Scanner leer = new Scanner(System.in);

		// haz:
		do {

			// prueba:
			try {

				// le pido al usuario el dato por pantalla
				System.out.print("Introduzca un número para hacer un rectángulo de esas dimensiones: ");

				// almaceno el dato en la variable
				lado = leer.nextInt();

				// el número debe ser mayor que uno y si no lo es pon este mensaje
				assert lado > 1 : "Debe introducir un número mayor que 1.";

				// hay error de assertion?
			} catch (AssertionError a) {

				/*
				 * si? entonces muestra como ERROR el mensaje almacenado antes si hay un error
				 * de assertion
				 */
				System.err.println(a.getMessage());

				// hay un error en el input?
			} catch (InputMismatchException e) {

				// si? pues di que se tiene que introducir un número como ERROR
				System.err.println("Debe introducir un número.");

				// finalmente
			} finally {
				// borra el buffer si se ha introducido una cadena para que no sea infinito
				leer.nextLine();
			}

			// hazlo mientras que lado sea menor O IGUAL que 1
		} while (lado <= 1);

		// for para contar el ancho de arriba
		for (int ladoArriba = 1; ladoArriba <= lado; ladoArriba++) {
			System.out.print("*");
		}

		/*
		 * Ya que he estado haciendo syso sin slato de línea he de poner esto para que
		 * lo que sigue del código salte de línea y no siga en la misma
		 */
		System.out.println();

		// for para ir contando la altura (el lado) del rectángulo
		/*
		 * la variable de la altura siempre estará inicializada en 3 ya que hay que
		 * quitarle el * que se pondrá al hacer la línea del lado de arriba y el * de la
		 * línea del lado de abajo
		 */
		for (int alturaIzq = 3; alturaIzq <= lado; alturaIzq++) {
			System.out.print("*");

			/*
			 * en vez de inicializar la variable espacios a 3 como en altura la inicializo a
			 * 1 y le digo que se repida mientras que espacios sea menor O IGUAL a lado
			 * MENOS 2, quitandole así los * de la izquierda y de la derecha, así solo
			 * rellenará lo de adentro
			 */
			for (int espacios = 1; espacios <= lado - 2; espacios++) {
				System.out.print(" ");
			}

			/*
			 * para los * del lado derecho no es necesario hacer un for ya que si haces un
			 * syso sin salto de línea siempre aparecerán a la derecha cuando los espacios
			 * acaben sus iteraciones
			 */
			System.out.print("*");

			/*
			 * uso un syso con salto de línea para que se haga en líneas diferentes y no en
			 * la misma
			 */
			System.out.println("");
		}

		// for para contar el ancho
		for (int ladoAbajo = 1; ladoAbajo <= lado; ladoAbajo++) {
			System.out.print("*");
		}

		// cerrar el Scanner
		leer.close();

	}

}
