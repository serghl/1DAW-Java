/*
 * Program.java        30/11/21
 *
 * Determina si un número es primo
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program {
    
    /**
     * 
     * @param args not used
     * 
     */
    
    public boolean isPrime (int num) {
        // Declaramos la variable como true por defecto
        boolean primo = true;        
        // Hacemos la iteración hasta cambiar el booleano
        for (int i = 2; i <= num / 2; i++) {        
            if (num % i == 0) {
                primo = false;        
            }            
        }
        return primo;
    }
}
