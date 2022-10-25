/*
 * Program.java        19/1/22
 *
 * Crea un array con una matriz de dimension determinada
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
     * @param args not used
     * 
     */
    public void identity (int x) {
        int[][]a;
        a = new int[x][x]; 
        System.out.print("\n\n --- IDENTITY --- \n\n");        
        // Con un ciclo definimos las posiciones
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                // Rellenamos la matriz
                if (i == j) {
                    a[i][j] = 1;
                }
            }
        }
        // Imprimimos todo
        for (int[]fila : a) {
            System.out.println(Arrays.toString(fila));
        }
    }
}





