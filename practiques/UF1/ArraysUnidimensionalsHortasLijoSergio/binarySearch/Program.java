/*
 * Program.java        13/1/22
 *
 * Ejecuta una búsqueda dicotómica
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
     * @param int[]a an array of Strings
     * 
     * @return a boolean
     */
    
    public void bubbleSort(int[] a) {
        int n = a.length;
        int temp = 0;
        // Variable para el swap
        System.out.print("\n BUBBLE SORT \n\n");                
        // Creamos un bucle de orden de burbuja
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n-i); j++) {
                if (a[j-1] > a[j]) {
                    // Swap los elementos
                    temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }                    
        }
    }
    
    public boolean binarySearch(int[] a, int x) {
        Program p = new Program();
        // Definimos las variables necesarias
        int bottom = 0;
        int top = a.length - 1;
        int middle = bottom + top / 2;        
        // Pasamos el array por el metodo bubblesort para ordenarlo, si no lo está
        a = p.bubbleSort(a);
        
        System.out.print("\n\n BINARY SEARCH \n\n");                
        // 
        }        
        return areSorted;
    }
}


