/*
 * Program.java        16/11/21
 *
 * Calcula la suma de las elevaciones al cuadrado de los números dentro de un intervalo
 * 
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program { 
    
    /** 
     * @n1 an int to be add
     * @n2 an int to be add
     *  
     */ 
    public void sumSquares(int n1, int n2) {
        int intervalo = 0;
        for (int i = n1; i <= n2 ; i++) {
            intervalo = intervalo + (int)(Math.pow(i,2));
            }
        System.out.println(intervalo);
        }
    }

