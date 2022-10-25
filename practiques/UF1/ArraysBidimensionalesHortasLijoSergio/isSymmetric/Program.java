/*
 * Program.java        24/1/22
 *
 * Calcula si un array bidimensional es simetrico
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
     * @param a an 2d Array
     * 
     * @return a boolean, true if is symmetric, false otherwise
     */
    public boolean isSymmetric (int[][]a) {
        boolean isSym = true;
        System.out.print("\n\n --- IS SYMMETRIC --- \n\n");        
        // Primero hacemos un loop para printar las filas de los arrays originales (con el deep.toString imprime todo en una linea)
        System.out.print("\n ARRAY A \n\n");
        for (int[]fila : a) {
            System.out.println(Arrays.toString(fila));
        }
        // Comparamos hasta encontrar un no simétrico, por defecto el array es simetrico
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[0].length; j++) {
                    if (a[i][j] != a[j][i]) {
                        isSym = false;
                }        
            }            
        }
        return isSym;
    }
}







