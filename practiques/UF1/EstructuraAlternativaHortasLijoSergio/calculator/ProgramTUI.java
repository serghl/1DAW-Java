/*
 * Program.java        1.0 02/11/2011
 *
 * Models the program.
 *
 * Copyright 2011 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 *                Joaquim Laplana Tarragona <jlaplana@escoladeltreball.org>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

import java.util.Locale;
import java.util.Scanner;

public class ProgramTUI {
    
    /**
     * 
     * @param n1 an double
     * @param n2 an double
     * @return the abs
     * 
     */  
    public double add(double n1, double n2){
        // Creamos una variable que defina el valor absoluto
        double sum;
        // Asignamos el valor de x a la variable
        sum = n1 + n2;
        return sum;
    }
    
    /**
     * 
     * @param n1 an double
     * @param n2 an double
     * @return the min number
     * 
     */
    
    public double subtract(double n1, double n2){
        double resta;
        // Declaramos una variable a devolver y aquí hacemos la formula
        resta = n1 - n2;
        return resta;
    }
    /**
     * 
     * @param n1 an double
     * @param n2 an double
     * @return the min number
     * 
     */
    
    public double multiply(double n1, double n2){
        double mult;
        // Declaramos una variable a devolver y aquí hacemos la formula
        mult = n1 * n2;
        return mult;
    }
    /**
     * 
     * @param n1 an double
     * @param n2 an double
     * @return the min number
     * 
     */
    
    public double divide(double n1, double n2){
        double div;
        // Declaramos una variable a devolver y aquí hacemos la formula
        div = n1 / n2;
        return div;
    }
    
    /**
     * 
     * @param args Not used
     */
    public static void main(String[] args) {
        double n1;
        double n2;
        int op;
        ProgramTUI p = new ProgramTUI();
        Scanner s = new Scanner(System.in);
        // Imprime el menu
        System.out.print("\n\nMENÚ\n\n");
        System.out.print("1. Sumar \n");
        System.out.print("2. Restar \n");
        System.out.print("3. Multiplicar \n");
        System.out.print("4. Dividir \n");
        System.out.print("5. Salir \n");
        // Preguntamos que opcion ejecutamos
        System.out.print("\nOpción ? ");
        op = s.nextInt();
        // Dependiendo de la selección, ejecutamos el método correspondiente
        switch (op) {
            case 1:
                // Solicitamos valor y asignamos a la variable
                System.out.print(" ¿Primer número que quieres sumar?\n");
                n1 = s.nextDouble();
                System.out.print(" ¿Segundo número que quieres sumar?\n");
                n2 = s.nextDouble();                
                // Procesamos con el sum
                System.out.printf("La suma de ambos números es : %.2f ",p.add(n1,n2));
                break;
            case 2:
                // Solicitamos valores y asignamos
                System.out.print(" ¿Cual es el minuendo?\n");
                n1 = s.nextDouble();
                System.out.print(" ¿Cual es el sustraendo?\n");
                n2 = s.nextDouble();
                // Procesamos con el subtract
                System.out.printf("El resultado de la resta es %.2f",p.subtract(n1,n2));
                break;
            case 3:
                // Solicitamos valores y asignamos
                System.out.print(" ¿Cual es el multiplicando?\n");
                n1 = s.nextDouble();
                System.out.print(" ¿Cual es el multiplicador?\n");
                n2 = s.nextDouble();
                // Procesamos con el multipli
                System.out.printf("El resultado de la multiplicacion es %.2f",p.multiply(n1,n2));
                break;
            case 4:
                // Solicitamos valores y asignamos
                System.out.print(" ¿Cual es el dividendo?\n");
                n1 = s.nextDouble();
                System.out.print(" ¿Cual es el divisor?\n");
                n2 = s.nextDouble();
                // Procesamos con el subtract
                System.out.printf("El resultado de la division es %.2f",p.divide(n1,n2));
                break;
            case 5:
                // Retornamos un cordial mensaje de despedida
                System.out.println("Hasta luego Mari Carmen");
                break;
            default:
                // Asignamos una salida por default en caso de que no elegir una opción válida
                System.out.println("La opción introducida no es correcta");
                break;
        }
    }
}
