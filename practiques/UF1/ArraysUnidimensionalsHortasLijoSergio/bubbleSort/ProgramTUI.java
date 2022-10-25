/*
 * Program.java        21/12/21
 *
 * Ordena un array con el método burbuja
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

import java.util.Scanner;

import java.util.Arrays;

public class ProgramTUI {
    
    /**
     * 
     * @param int[]a an array of int
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
    
    public static void main(String[] args) {  
        ProgramTUI p = new ProgramTUI();
        int longitud;
        int[] array;
        Scanner s = new Scanner(System.in);  
        // Definimos la longitud del array 
        System.out.println("¿Longitud del ARRAY a ordenar?");  
        longitud = s.nextInt();
        array = new int[longitud];
        // Ahora pedimos los  valores del array
        for (int i = 0; i < longitud; i++) {
            System.out.printf("¿%dº Elemento?", i + 1);  
            array[i] = s.nextInt();
        }
        // Lo procesamos con el método y lo printamos ,    
        p.bubbleSort(array);
        System.out.println("ARRAY ORDENADO = \n"); 
        System.out.println(Arrays.toString(array));  
    }
}


