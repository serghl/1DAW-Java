/*
 * Program.java        19/12/21
 *
 *  Determina si dos arrays son iguales, en tamaño y contenido
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
import java.util.Arrays;

public class Program {
    
    /**
     * 
     * @param int[]a an array of int
     * @param int[]b an array of int
     * 
     * @return the join of both arrays
     */
    public boolean equals (int[] a, int[] b) {
        
        System.out.print("\n\n EQUALS \n\n");        
        // De inicio declaramos que no son iguales
        boolean equal = false;
        // Comenzamos a comparar, primero la medida
        if (a.length == b.length) {
            // Luego los elementos
            for (int i = 0; i < a.length; i++) {
                // Si encontramos alguno diferente, rompemos el ciclo
                if (a[i] == b[i]) {
                    equal = true;                        
                }
            }
        }
        return equal;
    }
}