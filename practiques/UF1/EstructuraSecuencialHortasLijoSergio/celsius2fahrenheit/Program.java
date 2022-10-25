/*
 * Program.java        11/10/21
 *
 * Crea un conversor de celsius a fahrenheit
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program {
    
    /**
     * 
     * @param Celsius an in
     * @return the conversion to fahrenheit 
     */
    public int celsius2fahrenheit (int celsius) {
        // Declaramos la variable
        int fah;
        // Hacemos la conversion
        fah = celsius / 5 * 9 + 32;
        return fah;
    }
}