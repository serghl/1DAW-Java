/*
 * Program.java        3/12/21
 *
 * Lee y muestra por pantalla un array unidimensional
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

import java.util.Scanner;

public class ProgramTUI {
    
    /**
     * 
     * @param args not used
     * 
     */
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("\n\n LECTURA Y ESCRITURA DE UN ARRAY \n\n");        
        // Empezamos con la lista de números
        System.out.print("Dimension?");
        int n = s.nextInt();
        // Create the array, allocate enough memory por n elements
        double[] a = new double[n];
        // Read n numbers and store them into the array
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d]=", i);
            a[i] = s.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d]= %.2f\n", i, a[i]);
        }
    }
}


/*        
 * 
 ESTO PARA CREAR UN ARRAY DE CARACTERES!
 
 Create the array, allocate enough memory por n elements
 char[] a = new char[n];    
 for (int i = 0; i < n; i++) {
 System.out.printf("a[%d]=", i);
 a[i] = s.next().charAt(0);
 */