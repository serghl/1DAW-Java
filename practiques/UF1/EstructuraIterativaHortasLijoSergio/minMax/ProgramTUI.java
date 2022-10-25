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
        int n;
        int num;
        int min;
        int max;
        // Primero preguntamos cuantos números queremos comparar
        System.out.print("Cuántos números quieres comparar?");
        n = s.nextInt();
        // Ahora empezamos con la lista de números
        System.out.print("Cual es el primer número?");
        num = s.nextInt();
        // Asignamos tanto el mínimo como el máximo a la primera entrada
        min = num;
        max = num;
        // Hacemos la iteración entre la cantidad de números que hayamos elegido
        for (int i = 2; i <= n; i++){
        // Solicitamos el siguiente y se lo asignamos a la variable   
            System.out.printf("Cual es el %dº número??", i);
            num = s.nextInt();
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
        System.out.printf("El número más pequeño es %d , y el más grande es %d", min , max);
    }
}