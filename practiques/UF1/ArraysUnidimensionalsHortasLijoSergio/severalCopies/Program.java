/*
 * Program.java        12/12/21
 *
 *  Determina si hay dos elementos repetidos en un array
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
    public void severalCopies (double[]a) {
        System.out.print("\n\n SEVERAL COPIES  \n\n");        
        // Iniciamos un recorrido del bucle
        for (int i = 0; i < a.length; i++) {
            // Aqui recorremos de nuevo el bucle pero dentro de cada posicion, creamos una busqueda
            for (int j = i + 1; j < a.length; j++) {
                // Aqui lo imprimimos si encontramos coincidencias
                if (a[i] == a[j]) {
                    System.out.printf("El número %.1f se repite\n",a[j]);
                }
            }   
        }
    }
}

