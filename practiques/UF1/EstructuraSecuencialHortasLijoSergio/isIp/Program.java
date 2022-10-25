/*
 * Program.java        14/10/21
 *
 * Determina si una secuencia de 4 números enteros, puede ser una dirección IP válida
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
     * @param d an int number
     * 
     */
    public boolean isIp (int a, int b, int c, int d) {
        boolean isIp = (a >= 0 && a <= 255) && (b >= 0 && b <= 255) &&
            (c >= 0 && c <= 255) && (d >= 0 && d <= 255);
        return isIp;
    }
}