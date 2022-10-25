/*
 * Program.java        19/12/21
 *
 *  Separa un array en elementos pares e impares
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
     * @param int[]a an array of int
     * 
     * @return the join of both arrays
     */
    public void splitEvenOdd(int[] a) {
        System.out.print("\n\n SPLIT EVEN ODD \n\n");        
        int pares = 0;
        int impares = 0;
        int contadorPar = 0;
        int contadorImpar = 0;
        // Buscamos y contamos los pares e impares
        for (int i = 0;i < a.length; i++) {
            if (a[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }      
        // Creamos un array de pares y otro de impares con los respectivos tamaños
        int[] par;
        par = new int[pares];
        int[] impar;
        impar = new int[impares];
        // Volvemos a recorrer el array, esta vez clasificando los valores
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                par[contadorPar] = a[i];
                contadorPar++;
            } else {
                impar[contadorImpar] = a[i];
                contadorImpar++;
            }
        }
        // Finalmente printamos ambos arrays
        System.out.println(Arrays.toString(par));
        System.out.println(Arrays.toString(impar));
    }
}