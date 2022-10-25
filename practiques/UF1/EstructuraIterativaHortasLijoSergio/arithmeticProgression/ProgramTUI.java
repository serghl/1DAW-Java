/*
 * Program.java        26/11/21
 *
 * Determina si es una progresion aritmetica
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
        boolean arith = false;
        int num;
        int num2;
        int num3;
        int dif = 0;
        System.out.print("\n\n Progresión Aritmética \n\n");        
        // Empezamos con la lista de números
        System.out.print("Cual es el primer número?");
        num = s.nextInt();
        System.out.printf("Cual es el siguiente número?");
        num2 = s.nextInt();
        dif = num2 - num;
        // Hacemos la iteración entre la cantidad de números que hayamos elegido
        while (num != 0) {
            System.out.printf("Cual es el siguiente número?");
            num3 = s.nextInt();
            if ( num3 - num2 == dif) {
                arith = true;
            
            }
        }        
    }
}
