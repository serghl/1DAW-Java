/*
 * Program.java        30/11/21
 *
 * Encuentra el máximo divisor de un numero entero positivo
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

import java.util.Scanner;

public class ProgramTUI {
    
    /**
     * 
     * @param args not used
     * 
     */
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean found = false;
        int num = 0;
        int divisor;
        System.out.print("\n\n MAX DIVISOR \n\n");        
        // Empezamos con la lista de números
        System.out.print("Cual es número a calcular?");
        num = s.nextInt();
        divisor = num - 1;
        // Hacemos la iteración hasta cambiar el booleano
        while (!found) {
        // Hacemos la busqueda hasta que el residuo sea 0   
            if (num % divisor == 0) {
                System.out.printf(" El máximo divisor es : %d", divisor);
                found = true;
        // De no ser cero, restamos al divisor
            } else {
                divisor--;              
            }            
        }        
    }
}
