/*
 * Program.java        19/12/21
 *
 * Realiza la contraccion de dos arrays
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
    public int contraction(int[] a, int[] b) {
        System.out.print("\n\n CONTRACTION \n\n");        
        int i = 0;
        int j = 0;
        int resultadoa = 0;
        int resultadob = 0;
        int resultadoTotal = 0;
        // Primero comparamos que los dos arrays sean iguales
        if (a.length == b.length) {
            // Luego sumamos los elementos del array A
            for (int x : a) {
                resultadoa += a[i];
                i++;
            } 
            // Luego sumamos los elementos del array B
            for (int x : b) {
                resultadob += b[j];
                j++;
            } 
            resultadoTotal = resultadoa + resultadob;
        } else {
            System.out.println("ERROR : Los arrays no tienen la misma longitud \n");
        }
        return resultadoTotal;
    }
}


