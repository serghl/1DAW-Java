/*
 * Program.java        18/1/22
 *
 * Lee una tabla bidimensional y escríbela
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

import java.util.Arrays;
import java.util.Scanner;

public class ProgramTUI2 {
    
    /**
     * Read and write an array 2D.
     * 
     * @param args Not used.
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numFiles, numColumnes, i, j;
        int n = 0, m = 0;
        int[][] matriu;
        System.out.printf("\n\nMATRIU\n\n");
        System.out.printf("Nombre de files ? ");
        numFiles = s.nextInt();
        System.out.printf("Nombre de columnes ? ");
        numColumnes = s.nextInt();
        matriu = new int[numFiles][numColumnes];
        // Read the array 2D.
        for (i = 0; i < numFiles; i++) {
            for (j = 0; j < numColumnes; j++) {
                System.out.printf("t[%d][%d] = ", i, j);
                matriu[i][j] = s.nextInt();
            }
        }
        // Write the array 2D  ????
        
        // Metode per printar un array en 2D
        // System.out.println(Arrays.deepToString(matriu));
        
        //Printar un array2D amb while.
        /*
        while (n != matriu.length) {
            while (m != matriu[n].length) {
                System.out.print(matriu[n][m] + " ");
                m++;
            }
            m = 0;68
            n++;
            System.out.println("");
        }
        */
        
        //Printar un array2D amb for.
        for (n = 0; n < matriu.length; n++) {
            for (m = 0; m < matriu[0].length; m++) {
                System.out.print(matriu[n][m] + " ");
            }
            System.out.println("");
        }
    }
}