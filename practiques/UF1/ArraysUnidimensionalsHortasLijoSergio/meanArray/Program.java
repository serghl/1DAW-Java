/*
 * Program.java        12/12/21
 *
 *  Halla la media aritmetica de los elementos de un array
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */



public class Program {
    
    /**
     * 
     * @param args not used
     * 
     */
    public double meanArray (double[]a) {
        double suma = 0;
        double media = 0;
        int i = 0;
        System.out.print("\n\n HALLA LA MEDIA ARITMÉTICA \n\n");        
        // Iniciamos el bucle con la longitud del array
        for (int i = 0; i < a.length; i++) {      
            // Vamos sumando cada valor a un contador
            suma = suma + a[i];    
        }
        // Finalmente calculamos la media   
        media = suma / a.length;
        return media;
    }                                
}

/* Otra Opcion de hacerlo,buscar acerca "for each"
 * 
 *     public double meanArray(double[] a) {
 *     double sum = 0, mean;
 *     // Con esta sentencia recorremos todos los index del array
 *      for (double x: a) {
 *          sum += x;
 *          // sum = sum + x;
 *          }
 *      mean = sum / a.length;
 *      return mean;
 *      }

