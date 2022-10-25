/*
 * Exemple14.java       10/06/2021
 *
 *
 * �Copyright 2021 Joan Seculi <jseculi@escoladeltreball.org>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
package teoria_joan_seculi;

public class Exemple14b {
	public static void main(String[] args) {
		try {
			first();
		} catch (NullPointerException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	public static void first() {
		second();
	}

	// NullPointerException hereta de
	// RunTimeException i es propaga
	// automoticament.
	public static void second() { 			
		throw new NullPointerException("Text exception."); 
										
	}

}
