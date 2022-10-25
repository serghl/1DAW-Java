/*
 * Program.java        11/10/21
 *
 * Crea un conversor de fahrenheit a celsius
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program {
    
    /**
     * 
     * @param fah an int
     * @return the conversion to celsius 
     */
    public int fahrenheit2celsius (int fah) {
        // Declaramos la variable
        int celsius;
        // Hacemos la conversion
        celsius = (fah - 32) / 9 * 5;
        return celsius;
    }
}