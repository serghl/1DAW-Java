/*
 * Program.java        14/10/21
 *
 * Determina si un número es entero, no fraccionado
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
     * 
     */
    public boolean isInteger (double a) {
        boolean x = a % 1 == 0 ;
        return x;
    }
}