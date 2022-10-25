/*
 * Program.java        12/12/21
 *
 * Busca el valor más alto en un array
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
        public double findMaxValue (double[]a) {
        double max = 0;
        int i = 0;
        System.out.print("\n\n BUSCA EL VALOR MÁS ALTO DE UN ARRAY \n\n");        
        // Iniciamos el bucle con la longitud del array
        while (i < a.length) {      
            // Si el valor pasado es mayor que el ultimo maximo, lo almacenamos
            if (a[i] > max) {
                max = a[i];
                i++;
                // De lo contrario simplemente avanzamos
            } else {
                i++;
            }
        }                            
        return max;
    }
}
