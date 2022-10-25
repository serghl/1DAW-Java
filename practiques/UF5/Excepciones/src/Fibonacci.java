
public class Fibonacci {
	/*
	 * Program.java 28/11/21
	 *
	 * Escribe la secuencia fibonacci hasta llegar a un tope establecido
	 * 
	 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
	 *
	 * This is free software, licensed under the GNU General Public License v3. See
	 * http://www.gnu.org/licenses/gpl.html for more information.
	 */

	/**
	 * @n an int to be add
	 * 
	 */
	public static void fibonacci(int n) {
		int t = 0;
		int t2 = 1;
		int t3 = 0;
		// Imprimimos 0 y 1 que siempre estarán en la secuencia
		if (n == 0) {
			System.out.printf("%d ", n);
		} else {
			System.out.printf("%d ", t);
			System.out.printf("%d ", t2);
			// Luego para el bucle definimos que si la suma de los temporales no supera N,
			// repetimos
			while (t3 < n) {
				// Damos el valor de la suma a una nueva variables
				t3 = t + t2;
				System.out.printf("%d ", t3);
				// Reasignamos
				t = t2;
				t2 = t3;
			}
		}
	}
}
