/*
 * Program.java        18/12/21
 *
 *  Devuelve los valores pares, mayores a 50
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
    public int[] evenGreaterThan50(int[]a) {
        // Creamos un array donde almacenar los pares mayores de 50
        int greaterLongitud = 0;
        int greaterContador = 0;
        int[] greater;
        System.out.print("\n\n EVEN GREATER THAN 50 \n\n");        
        // Iniciamos un recorrido del array, buscando pares mayores a 50
        for (int i = 0; i < a.length; i++) {
            // Con un metodo de "cerca" definimos el tamaño que tendŕa el array de greater
            if (a[i] >= 50 &&  a[i] % 2 == 0) {
                greaterLongitud++;
            }
        }       
        // Ahora declaramos el array greater, con la longitud de los elementos encontrados        
        greater = new int[greaterLongitud];     
        // Y vamos añadiendo cada uno de ellos
        for (int i = 0 ; i < a.length; i++) {                    
            if (a[i] >= 50 && a[i] % 2 == 0) {        
                // Almacenamos el valor par mayor de 50, en la posicion del array
                greater[greaterContador] = a[i];
                greaterContador++;                 
            }
        }
        // Luego retornamos el array       
        return greater;
    }
}

