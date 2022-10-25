/*
 * Program.java        19/10/21
 *
 * A partir de dos números reales, haz diferentes operaciones con ellos
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program {
    
    /**
     * 
     * @param a an double number
     * @param b an double number
     * @return the sum of a and b
     * 
     */
    public double add(double a, double b) {
        return a + b;
    }
    /**
     * 
     * @param a an double number
     * @param b an double number
     * @return the subtract of a minus b
     * 
     */
    public double subtract(double a, double b) {
        return a - b;
    }
    /**
     * 
     * @param a an double number
     * @param b an double number
     * @return the multiply of a and b
     * 
     */
    public double multiply(double a, double b) {
        return a * b;
    }
    /**
     * 
     * @param a an double number
     * @param b an double number
     * @return the subtract of a between b
     * 
     */
    public double divide(double a, double b) {
        return a % b;
    }
}