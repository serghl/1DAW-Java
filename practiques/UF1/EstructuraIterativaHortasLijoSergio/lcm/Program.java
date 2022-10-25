/*
 * Program.java        1/12/21
 *
 * Calcula el mínimo comun multiplo de dos valores 
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
     * @return the lowest common mult
     * 
     */
    
    public int lcm (int num1, int num2) {
        // Declaramos variables
        boolean found = false;
        int temp;
        int minimocm = 0;
        // Primero establece el menor de los números
        if (num2 < num1) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        // Esta es la opcion más baja a ser lcm
        minimocm = num2;
        while (!found) {
        // Maximocd es el máximo comun divisor si divide a num1 y num2   
            found = minimocm % num1 == 0 && minimocm % num2 == 0;
            if (!found) {
                minimocm++;
            }
        }
        return minimocm;
    }
}
