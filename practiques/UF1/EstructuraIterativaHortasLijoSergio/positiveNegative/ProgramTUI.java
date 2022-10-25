/*
 * Program.java        16/11/21
 *
 * Determina, en una secuencia, si hay más número positivos o negativos
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
        int num = 1;
        int pos = 0;
        int neg = 0;
        // Empezamos con la lista de números
        while (num != 0){
            // Solicitamos el siguiente y se lo asignamos a la variable   
            System.out.printf("Cual es el siguiente número??");
            num = s.nextInt();
            
            // Y comparamos para ver si es menor o mayor que los anteriores
            if (num > 0) {
                pos++;
            } else if (num < 0) {
                neg++;
            }
        }
        if (pos > neg) {
            System.out.println("Hay más números positivos");
        }else if (pos == neg) {
            System.out.println("Hay los mismos negativos que positivos");
        } else {
            System.out.println("Hay más números negativos");
        }
    }
}