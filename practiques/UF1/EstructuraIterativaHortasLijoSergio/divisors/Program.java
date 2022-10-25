/*
 * Program.java        15/11/21
 *
 * A partir de un entero positivo, escribe sus divisores positivos
 * 
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program { 
    
    /** 
     * @n1 an int to be add
     *  
     */ 
    public void writeDivisors(int n1) {
        for (int i = 1; i <= n1 ; i++) {
            if (n1 % i == 0) {
                System.out.println(i);
            }
        }
    }
    public void writeDivisors2(int n1) {
        int i = 0;
        while ( i <= n1) {
            i++;
            if (n1 % i == 0) {
                System.out.println(i);
            }
        }
    }
}

