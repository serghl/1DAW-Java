/*
 * Program.java        22/11/21
 *
 * Determina si un número es par o no
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
    public boolean isEven (int n1) {
        boolean even = true;
        // Arrancamos un bucle diciendo que 0 es par y que cambie el boleano a cada iteracion hasta llegar a n1
        for (int i = 1; i <= n1 ; i++) {
            even = !even;
        }
        return even;
    }
    
}


