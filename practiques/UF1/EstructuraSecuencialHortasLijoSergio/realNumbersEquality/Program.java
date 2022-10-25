/*
 * Program.java        14/10/21
 *
 * Determina si dos números son iguales con una tolerancia de error
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program {
    
    /**
     * 
     * @param a an int number
     * @param b an int number
     * @param c an int number
     * @return an boolean
     * 
     */
    public boolean areEquals(double a, double b, double c) {
        boolean equals = ((a + c) < b && (b - c) > a) || ((a - c) > b) && (b + c) < a;
        return equals;
    }
}