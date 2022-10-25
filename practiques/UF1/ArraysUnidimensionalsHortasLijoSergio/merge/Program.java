/*
 * Program.java        19/12/21
 *
 * Donados dos arrayy int ordenador, crea un tercero con la suma de ambos, tambien ordenado
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
     * @return the sum of both arrays
     * 
     public int[] merge(int[] a, int[] b) {
     System.out.print("\n\n MERGE \n\n");
     int i1 = 0, i2 = 0, j = 0;
     // Creamos el array de retorno
     int [] a3;
     a3 = new int[a.length + b.length];            
     // Ahora medimos los elementos y los colocamos ordenadamente
     while (j < a3.length) {
     if (a[i1] <= b[i2]) {
     a3[j] = a[i1];
     i1++;
     } else {
     a3[j] = b[i2];
     i2++;                
     } 
     j++;
     }
     return a3;
     }
     */
    
// FORMA RAFEL
    
    public int[] merge(int[] a1, int[] a2) {
        System.out.print("\n\n MERGE \n\n");
        int i1 = 0, i2 = 0, j = 0, k = 0;
        // Creamos el array de retorno
        int [] a3;
        a3 = new int[a1.length + a1.length];            
        // Ahora medimos los elementos y los colocamos ordenadamente
        while (i1 < a1.length && i2 < a2.length) {
            if (a1[i1] <= a2[i2]) {
                a3[j] = a1[i1];
                i1++;
            } else {
                a3[j] = a2[i2];
                i2++;                
            } 
            j++;
        }        
        // Coloca los elementos restantes
        // Miramos si hemos llegado al final de a1, de ser asi colocamos todo al final
        if (i1 < a1.length) {
            for (k = j; k < a3.length ; k++) {
                a3[k] = a1[i1];
                i1++;
            }
        // De otra forma, sería a2
        } else {
            for (k = j; k < a3.length ; k++) {
                a3[k] = a2[i2];
                i2++;
            }                      
        }
        return a3;
    }
}


