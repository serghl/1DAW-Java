/*
 * Exemple10.java       09/06/2021
 *
 *
 * Copyright 2021 Joan Seculi <jseculi@escoladeltreball.org>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
package teoria_joan_seculi;

public class Exemple10 {
    
    
    public static void genExcepcion() {
        // num has got more elements than denom
        int num[] = { 10, 5, 12, 15, 23, 256, 128, 32 };
        int denom[] = { 3, 0, 8, 4, 0, 3 };
        
        for (int i = 0; i < num.length; i++) {
            try {
                System.out.println(num[i] + " / " + denom[i] + " = " + num[i] / denom[i]);
            }catch (ArithmeticException e) {
                System.out.println("Divide by 0!.");
                //throw e; // Rellançament excepció
            }catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Element not found!");
                throw e; // Rellançament excepció
            }
        }
    }
    
    
    public static void main(String[] args) {
        try {
            genExcepcion();
        } catch (ArrayIndexOutOfBoundsException e) {
            // Recapturing exception
            System.out.println("ERROR - End of program! Error: " + e.getMessage());
        } //catch (ArithmeticException e) {
        // Recapturing exception
        //System.out.println("ERROR2 - End of program!");
        //}
    }
    
    
    
}

/* 
 * 
 public static void genExcepcion() {
 // num has got more elements than denom
 int num[] = { 10, 5, 12, 15, 23, 256, 128, 32 };
 int denom[] = { 3, 0, 8, 4, 0, 3 };
 
 for (int i = 0; i < num.length; i++) {
 try {
 System.out.println(num[i] + " / " + denom[i] + " = " + num[i] / denom[i]);
 }// catch (ArithmeticException e) {
 //System.out.println("Divide by 0!.");
 // throw e; // Rellançament excepció
 catch (ArrayIndexOutOfBoundsException e) {
 System.out.println("Element not found!");
 throw e; // Rellançament excepció
 }
 }
 }
 
 
 public static void main(String[] args) {
 try {
 genExcepcion();
 } catch (ArrayIndexOutOfBoundsException e) {
 // Recapturing exception
 System.out.println("ERROR - End of program! Error: " + e.getMessage());
 } catch (ArithmeticException e) {
 // Recapturing exception
 System.out.println("ERROR2 - End of program!");
 }
 }
 
 
 */
