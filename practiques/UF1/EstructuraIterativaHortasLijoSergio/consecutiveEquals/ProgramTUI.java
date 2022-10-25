/*
 * Program.java        26/11/21
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
        boolean found = false;
        int num;
        int num2 = 0;
        int i = 2;
        System.out.print("\n\n NUMEROS CONSECUTIVOS IGUALES \n\n");        
        // Empezamos con la lista de números
        System.out.print("Cual es el primer número?");
        num = s.nextInt();
        System.out.printf("Cual es el siguiente número?");
        num2 = s.nextInt();
        // Hacemos la iteración entre la cantidad de números que hayamos elegido
        while (num2 != 0 && !found) {
            // Solicitamos el siguiente y se lo asignamos a la variable   
            if (num == num2) {
                found = true;
            } else {
                num = num2;
                System.out.printf("Cual es el siguiente número?");
                num2 = s.nextInt();
            }
        }
        if (found) {
            System.out.print("\n\n SE HAN ENCONTRADO DOS NUMEROS CONSECUTIVOS IGUALES \n\n");        
        } else {
            System.out.print("\n\n NO SE HAN ENCONTRADO DOS NUMEROS CONSECUTIVOS IGUALES \n\n");
        }
    }
}