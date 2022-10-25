/*
 * Program.java        12/12/21
 *
 *  Muestra los elementos de un array, superiores a la media de la suma de ellos
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
    public void greaterThanMean (double[]a) {
        double suma = 0;
        double media = 0;
        int i = 0;
        int x = 0;
        System.out.print("\n\n MUESTRA LOS VALORES SUPERIORES A LA MEDIA \n\n");        
        // Iniciamos el bucle con la longitud del array
        while (i < a.length) {      
            // Vamos sumando cada valor a un contador
            suma = suma + a[i];
            i++;
        }
        // Finalmente calculamos la media y la printamos   
        media = suma / a.length;
        System.out.printf("La media del array es de %.2f\n\n",media);
        // Ahora imprimimos los superiores a la media
        while (x < a.length) {
            if (a[x] > media) {
                System.out.printf("%.2f es superior a la media\n",a[x]);
            }                
            x++;
        }
    }
   /* 
    public double percentageGreaterThanMean2 (double[] a) {
        double percentage = 0;
        int contadorMas;
        double mean = 0;
        contadorMas = 0;
        for (double x :a) {
            mean = mean + x;
        }
        mean = mean/ a.length;
        for (double x : a) {
            if (x > mean) {
                contadorMas = contadorMas +1;
            }
        }
    }
    */
}
