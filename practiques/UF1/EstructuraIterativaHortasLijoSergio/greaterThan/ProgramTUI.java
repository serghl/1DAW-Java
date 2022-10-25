/*
 * Program.java        28/11/21
 *
 * Determina si una secuencia es superior a X e interrumpela si se da el caso
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
        int x = 0;
        int num = 0;
        System.out.print("\n\n GREATER THAN \n\n");        
        // Empezamos con la lista de números
        System.out.print("Cual es número X?");
        x = s.nextInt();
        // Hacemos la iteración entre la cantidad de números que hayamos elegido
        System.out.printf("Cual es el primer número?");
        num = s.nextInt();
        while (num != 0 && !found) {
            // Solicitamos el siguiente y comparamos que no sea mayor que x   
            if (num > x) {
                found = true;
            } else {
                System.out.printf("Cual es el siguiente número?");
                num = s.nextInt();       
            }
        }
        // Printamos un mensaje explicando
        System.out.printf("El valor %d es más grande que %d \n", num, x);
    }
}