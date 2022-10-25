/*
 * EqualStrings.java
 * 
 * Copyright 2010 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

package equalsHashcodeToString;

import java.util.Scanner;

/**
 * Test strings equals method.
 * 
 * @author Monica Ramírez Arceda
 * @version 10/02/2010
 */
public class EqualStrings {
 
    public static void main(String[] args) {
        String name1;
        String name2;
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        System.out.print("Introdueix el primer nom: ");
        name1 = sc.next();
        System.out.print("Introdueix el segon nom: ");
        name2 = sc.next();
        // Check if name1 and name2 are ==
        System.out.print("\n\nnom1 == nom2 ? -> ");
        if (name1 == name2) {
            System.out.println("iguals");
        } else {
            System.out.println("diferents");
        }
        // Check if name1 and name2 are equals
        System.out.print("\n\nnom1.equals(nom2) ? -> ");
        if (name1.equals(name2)) {
            System.out.println("iguals");
        } else {
            System.out.println("diferents");
        }
        sc.close();

    }
}
