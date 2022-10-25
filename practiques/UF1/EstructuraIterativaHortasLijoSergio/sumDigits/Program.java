/*
 * Program.java        28/11/21
 *
 * A partir de un número entero positivo, suma sus dígitos
 * 
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program { 
    
    /** 
     * @n an int to be add
     * 
     */ 
    public int sumDigits (int n) {
        // Declaramos las variables
        int total = 0;
        int t = n;
        int t2 ;
        // Iniciamos un ciclo que se para la llegar a 0
        while (t > 0) {
        // Sacamos el último dígito y se lo asignamos a la variable t2
        t2 = t % 10;    
        // Se la sumamos al total
        total = total + t2;
        // Sacamos el dígito del número
        t = t / 10;                              
        }
        return total;
    }
}




