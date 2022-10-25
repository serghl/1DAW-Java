/*
 * Exemple01.java       08/06/2021
 *
 *
 * ���Copyright 2021 Joan Seculi <jseculi@escoladeltreball.org>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
package teoria_joan_seculi;

import java.util.Scanner;

public class Exemple01Solucio {
    
    public static void main(String[] args) {
        int numerator, denominator;
        int div;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("numerator = ");
            numerator = Integer.parseInt(scanner.nextLine());
            System.out.print("denominator = ");
            denominator = Integer.parseInt(scanner.nextLine());
            div = div(numerator, denominator);
            System.out.println("division = " + div);
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            //e.printStackTrace();    // Veiem la pila d'errors 
            //throw e;
        } finally {
            System.out.println("The end!");
            scanner.close();
        }
        
    }
    
    //NO cal advertir, és RunTimeException
    
    public static int div(int numerator, int denominator)  { // throws ArithmeticException {
        return numerator / denominator;
    }
    
}
