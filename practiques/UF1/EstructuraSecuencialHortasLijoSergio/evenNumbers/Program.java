/*
 * Program.java        13/10/21
 *
 * Determina si un número es par
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
     * @return true or false
     * 
     */
    public boolean isEven (int a) {
        boolean isEven = a % 2 == 0;
        return isEven;
    }
}