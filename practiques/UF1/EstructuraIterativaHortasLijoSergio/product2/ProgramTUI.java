/*
 * Program.java        1/12/21
 *
 * Escribe el producto de dos valores introducidos
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
        int num2;
        int total = 0;
        // Solicitamos los valores y los asignamos
        System.out.print("Cual es el primer número?");
        num = s.nextInt();
        System.out.print("Cual es el segundo número?");
        num2 = s.nextInt();
        // Imprimimos una vez el valor a multiplicar
        System.out.printf("%d + ", num);
        // Asignamos el total inicial al valor a multiplicar
        total = num;
        // Hacemos la iteración entre el valor elegido
        for (int i = 1; i < num2; i++){
            total = total + num;
        // Lo printamos
            System.out.printf("%d + ", num);
        }
        System.out.print(total);
    }
}