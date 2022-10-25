/*
 * Program.java        11/10/21
 *
 * Calcula el área de un trapecio a partir de sus bases y su altura
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program {
    
    /**
     * 
     * @param b1 an int
     * @param b2 an int
     * @param h the height
     * 
     */
    public int area (int b1, int b2, int h) {
        int area = (b1 + b2) / 2 * h;
        return area;
    }
}