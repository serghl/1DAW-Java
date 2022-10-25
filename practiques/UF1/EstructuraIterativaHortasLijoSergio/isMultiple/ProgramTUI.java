/*
 * Program.java        29/11/21
 *
 * Identifica y corta una secuencia, encontrando multiplos
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
        int num = 0;
        int i = 0;
        int x;
        int sec = 0;
        boolean found = false;
        System.out.print("\n\n isMultiple \n\n");        
        // Empezamos con la lista de números
        System.out.print("Introduce el número X?");
        x = s.nextInt();
        System.out.print("Longitud de la secuencia?");
        sec = s.nextInt();
        // Creamos una iteracion con la longitud introducida
        while (i < sec) {
            System.out.printf("Cual es el siguiente número?");
            num = s.nextInt();
            // Le decimos que si el número es multiplo, lo imprima y corte la secuencia
            if ( num % x == 0) {
                System.out.printf("El número %d es múltiplo de %d\n4",num ,x);
                i = sec;
            } else {
                i++;    
            }
            
        }
        
    }
}
