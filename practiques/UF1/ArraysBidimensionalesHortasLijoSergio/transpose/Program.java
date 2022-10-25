/*
 * Program.java        19/1/22
 *
 * Cambia los elementos de una matriz
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
    public void transpose(int[][]a) {
        int[][]b;
        b = new int[a.length][a.length]; 
        System.out.print("\n\n --- TRANSPOSE --- \n\n");        
        // Primero hacemos un loop para printar las filas (con el deep.toString imprime todo en una linea)
        System.out.print("\n ARRAY ORIGINAL \n\n");
        // Con un forEach
        for (int[]fila : a) {
            System.out.println(Arrays.toString(fila));
        }
        // Con un ciclo anidado lo recorremos
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
        // Luego cambiamos las filas con las columnas y las almacenamos en el nuevo array
                b[i][j] = a[j][i];
            }
        }
        // Repetimos el proceso para imprimir el array modificado
        System.out.print("\n ARRAY TRANSPUESTO \n\n");
        for (int[]fila : b) {
            System.out.println(Arrays.toString(fila));
        }
    }
}        


