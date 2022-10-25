/*
 * Program.java        19/1/22
 *
 * Imprime la matriz de un array2D
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
    public void trace (int[][] a) {
        System.out.print("\n\n --- TRACE --- \n\n");        
        // Primero hacemos un loop para printar las filas (con el deep.toString imprime todo en una linea)
        System.out.print("\n ARRAY ORIGINAL \n\n");
        // Con un forEach
        for (int[]fila : a) {
            System.out.println(Arrays.toString(fila));
        }        
        // Con un ciclo definimos las posiciones
        System.out.print("\n MATRIZ \n\n");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                // Ponemos unos en la matriz
                if (i == j) {
                    System.out.println(a[i][j]);
                }
            }
        }
    }
}




