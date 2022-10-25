/*
 * Program.java        18/1/22
 *
 * Printa una matriz a raiz de una tabla bidimensional cuadrada
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
    public void trace (int[][]...a) {
        
        System.out.print("\n\n TRACE \n\n");        
        // Partiendo de cero trazamos una matriz, sumando un elemento a cada vuelta        
        for (int x = 0; x < a.length; x++) {
            for (int y = 0; y < a.length; y++) {
                System.out.println(a[x][y]);
            }          
        }
    }
}

