/*
 * Program.java        7/11/21
 *
 * Encuentra cuantas parejas hay en una secuencia de numeros
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Program { 
    
    /** 
     *  
     * @param n1 an int 
     * @param n2 an int 
     */ 
    
    public void numberOfEvenNumbers(int n1, int n2) { 
        // Creamos una variable donde ir sumando los número pares
        int pair = 0;
        for (int i = n1; i <= n2 ; i++) { 
        // Aqui sumamos cada vez que pasa por un número par
            if (i % 2 == 0) {
                pair++;
            }
        }
        System.out.printf("El numero de parejas en el intervalo es %d", pair);
    }
}