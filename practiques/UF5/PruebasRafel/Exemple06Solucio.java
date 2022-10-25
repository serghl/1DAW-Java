/*
 * Exemple06.java       09/06/2021
 *
 *
 * �Copyright 2021 Joan Seculi <jseculi@escoladeltreball.org>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
package teoria_joan_seculi;

public class Exemple06Solucio {
    
    
    public static int power(int base, int exp) throws Exception {
        if (exp < 0) throw new Exception("Exponent can't be negative!");
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        return result;
    }
    
    public static void main(String[] args) {
        int power = 0;
        try {
            power = power(2, -5);
            System.out.println("power: " + power);
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
    
}
