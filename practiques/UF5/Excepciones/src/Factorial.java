
/*
	 * Program.java        17/11/21
	 *
	 * Calcula el factorial de un numero entero
	 * 
	 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
	 *
	 * This is free software, licensed under the GNU General Public License v3.
	 * See http://www.gnu.org/licenses/gpl.html for more information.
	 */

public class Factorial {

	/**
	 * @n1 an int to be add
	 * 
	 */
	public static int factorial(int n) {

		int fact = 1;

		for (int i = n; i != 0; i--) {
			// Aquí multiplicamos por i en cada caso
			fact = fact * i;
			// Lo imprimimos
			System.out.print(i + " * ");
		}
		// Añadimos el resultado al final
		return fact;
	}

}
