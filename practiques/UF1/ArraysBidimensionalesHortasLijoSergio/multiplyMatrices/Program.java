/*
 * Program.java        24/1/22
 *
 * Multiplica dos arrays bidimensionales
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
    public void multiplyMatrices(int[][]a, int[][]b) {
        // En una multiplicación de matrices el numero de columnas de la primera matriz, tiene que ser equivalente
        // al número de filas de la segunda
        // -------------------------------------
        // Definimos con variables las filas y columnas, ayudará despues en el triple FOR
        int aFilas = a.length;
        int aColumnas = a[0].length;
        int bFilas = b.length;
        int bColumnas = b[0].length;
        // Declaramos el tamaño del nuevo array con las filas de a y las columnas de b
        int[][]c = new int[aFilas][bColumnas];
        System.out.print("\n\n --- MULTIPLY MATRICES --- \n\n");
        System.out.print("\n FACTORES : \n");
        // Mostramos los arrays originales
        System.out.print("\n MULTIPLICANDO \n\n");
        for (int[]fila : a) {
            System.out.println(Arrays.toString(fila));
        }
        System.out.print("\n MULTIPLICADOR \n\n");
        for (int[]fila : b) {
            System.out.println(Arrays.toString(fila));
        }
        // Ahora ejecutamos el recorrido, con un ciclo anidado
        // Recorremos filas de A
        for (int i = 0; i < aFilas; i++) { 
         // Recorremos columnas de B   
            for (int j = 0; j < bColumnas; j++) { 
         // Recorremos columnas de A
                for (int k = 0; k < aColumnas; k++) {
         // Asignamos el valor de la suma de los productos de cada fila de A multiplicado por columna de B
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        System.out.print("\n -- PRODUCTO -- \n\n");
        // Imprimimos el array c
        for (int[]fila : c) {
            System.out.println(Arrays.toString(fila));
        }
    }
}







