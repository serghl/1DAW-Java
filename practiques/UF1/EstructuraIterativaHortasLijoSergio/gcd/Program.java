/*
 * Program.java        30/11/21
 *
 * Calcula el máximo comun divisor de dos valores 
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program {
    
    /**
     * 
     * @param num1 an integer number
     * @param num2 an integer number 
     * @return the greatest common divisor
     * 
     */
    
    public int gcd (int num1, int num2) {
        // Declaramos variables
        boolean found = false;
        int temp;
        int maximocd = 0;
        // Primero establece el menor de los números
        if (num2 < num1) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        // Esta es la opcion más alta a ser gcd
        maximocd = num1;
        while (maximocd >= 1 && !found) {
        // Maximocd es el máximo comun divisor si divide a num1 y num2   
            found = num1 % maximocd == 0 && num2 % maximocd == 0;
            if (!found) {
                maximocd--;
            }
        }
        return maximocd;
    }
}
