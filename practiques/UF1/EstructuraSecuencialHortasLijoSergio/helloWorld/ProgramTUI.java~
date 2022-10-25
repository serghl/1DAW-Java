/*
 * Program.java        19/10/21
 *
 * Intercambia el valor de dos variables introducidos por teclado, e imprime la salida
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
    public static void main (String args[]) {
        // Declaramos las variables
        double a;
        double b;
        double aux;
        // Aqui inciamos el scanner y solicitamos los parametros
        Scanner s = new Scanner(System.in);
        System.out.println("Valor de la variable A?");
        a = s.nextDouble();  
        System.out.println("Valor de la variable B?");
        b = s.nextDouble();
        // Mostramos los valores introducidos
        System.out.println("Los valores originales son : a = "+ a + " y b = " + b );
        // Ahora intercambiamos las variables utilizando una variable auxiliar
        aux = a;
        a = b;
        b = aux;
        // Ahora imprimimos los nuevos valores ya intercambiados
        System.out.println("Los valores intercambiados son : a = "+ a + " y b = " + b );
    }
}