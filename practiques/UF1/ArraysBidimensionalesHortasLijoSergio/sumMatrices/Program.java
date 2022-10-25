/*
 * Program.java        19/1/22
 *
 * Suma dos arrays bidimensionales
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
    public void sumMatrices(int[][]a, int[][]b) {
        // Medimos la longitud de ambos arrays para calcular el mayor
        int mayor = (a.length >= b.length) ? a.length : b.length ;
        // Creamos el array a devolver con el tamaño del más grande
        int[][]c;
        c = new int[mayor][mayor];
        System.out.print("\n\n --- SUMA MATRICES --- \n\n");        
        // Primero hacemos un loop para printar las filas de los arrays originales (con el deep.toString imprime todo en una linea)
        System.out.print("\n ARRAYS ORIGINALES \n");
        // Con un forEach
        System.out.print("\n ARRAY A \n\n");
        for (int[]fila : a) {
            System.out.println(Arrays.toString(fila));
        }
        System.out.print("\n ARRAY B \n\n");
        for (int[]fila : b) {
            System.out.println(Arrays.toString(fila));
        }
        // Con un ciclo definimos las posiciones
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                c[i][j] = (a[i][j])+(b[i][j]);
            }
        }
        System.out.print("\n -- ARRAY C = RESULTADO DE LAS SUMAS -- \n\n");
        // Imprimimos el array c
        for (int[]fila : c) {
            System.out.println(Arrays.toString(fila));
        }
    }
}







