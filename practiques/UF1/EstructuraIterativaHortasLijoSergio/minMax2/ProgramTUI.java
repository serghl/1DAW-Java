/*
 * Program.java        16/11/21
 *
 * Encuentra un mínimo y el máximo en una lista de números
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
        int min;
        int max;
        int i = 2;
        // Ahora empezamos con la lista de números
        System.out.print("Cual es el primer número?");
        num = s.nextInt();
        // Asignamos tanto el mínimo como el máximo a la primera entrada
        min = num;
        max = num;
        // Hacemos la iteración entre la cantidad de números que hayamos elegido
        while (num != 0){
        // Solicitamos el siguiente y se lo asignamos a la variable   
            System.out.printf("Cual es el %dº número??", i);
            num = s.nextInt();
            i++;
        // Y comparamos para ver si es menor o mayor que los anteriores
            if (num <= min) {
                min = num;
            } else if (num > max) {
                max = num;
            }
        /* Se podría hacer con el operador ternario
         * 
         * // Cambiar el maximo si encontramos un numero mayor
         * max = n > max ? n : max;
         * // Cambiar el minimo si encontramos un numero menor
         * min = n > min ? n : min;
         */
        }
        System.out.printf("El valor más pequeño es %d y el más grande es %d", min , max);
    }
}