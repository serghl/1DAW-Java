/*
 * Program.java        16/11/21
 *
 * Calcula una potencia sin usar el Math.pow
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
    public void myPow(int n1, int n2) {
        // Variable de resultado
        int resultado = n1;
        for (int i = 1; i < n2 ; i++) {
            resultado = resultado * n1;
        }
        System.out.println(resultado);
    }
    
}


