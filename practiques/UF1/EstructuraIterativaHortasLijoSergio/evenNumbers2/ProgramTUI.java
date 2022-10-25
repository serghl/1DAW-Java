/*
 * Program.java        28/11/21
 *
 * Determina e interrumpe una secuencia si hay dos numeros consecutivos iguales
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
        int num;
        int pair = 0;
        System.out.print("\n\n Even Numbers \n\n");        
        // Empezamos con la lista de números
        System.out.print("Cual es el primer número?");
        num = s.nextInt();
        // Hacemos que la iteracion corte si hay un cero
        while (num != 0) {
            // Solicitamos el siguiente y se lo asignamos a la variable   
            if (num % 2 == 0) {
                pair++;
                System.out.printf("Cual es el siguiente número?");
                num = s.nextInt();
            } else {
                System.out.printf("Cual es el siguiente número?");
                num = s.nextInt();
            }
        }
        System.out.printf("\n\n SE HAN ENCONTRADO %d NÚMEROS PARES \n\n", pair);                
    }
}