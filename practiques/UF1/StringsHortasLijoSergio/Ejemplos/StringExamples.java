/*
 * StringExamples.java        2.0 09/01/2012
 *
 * Examples of String class and its methods.
 *
 * Copyright 2010-2012 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

import java.util.Scanner;

public class StringExamples {
    
    /**
     * Prints the program menu.
     */
    public void menu() {
        System.out.print("\n\nEXEMPLES MÈTODES String\n");
        System.out.print("-----------------------\n");
        System.out.print("1. s1.equals(s2)\n");
        System.out.print("2. s.charAt(i)\n");
        System.out.print("3. s.indexOf(c)\n");
        System.out.print("4. s1.indexOf(s2)\n");
        System.out.print("5. s1.compareTo(s2)\n");
        // IMPORTANTE SI SE USA ESTE METODO 6 EN UN BUCLE; APLICARLO A UNA VARIABLE PRIMERO
        System.out.print("6. s.length()\n");
        System.out.print("7. s.substring(i,j)\n");
        System.out.print("8. s.trim()\n");
        System.out.print("0. Sortir\n\n");
        System.out.print("Escull opció (0-8) ? ");
    }
    
    /**
     * Main.
     * 
     * @param args not used.
     */
    public static void main(String[] args) {
        String s, s1, s2;
        int i, j, op, n;
        char c;
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        // Create an object to print the menu
        StringExamples es = new StringExamples();
        // Print the menu and ask for an option.
        es.menu();
        op = sc.nextInt();
        // Execute each example until the user wants to quit.
        while (op != 0) {
            switch (op) {
                case 1:
                    System.out.print("\n\nEXEMPLE: s1.equals(s2)\n\n");
                    System.out.print("String ? ");
                    s1 = sc.next();
                    System.out.print("String ? ");
                    s2 = sc.next();
                    if (s1.equals(s2)) {
                        System.out.print("s1 i s2 són iguals.");
                    } else {
                        System.out.print("s1 i s2 són diferents.");
                    }
                    break;
                case 2:
                    System.out.print("\n\nEXEMPLE: s.charAt(i)\n\n");
                    System.out.print("String ? ");
                    s = sc.next();
                    System.out.print("Nombre ? ");
                    i = sc.nextInt();
                    c = s.charAt(i);
                    System.out.printf("A la posició %d de la cadena %s hi ha el caràcter %c", i, s, c);
                    break;
                case 3:
                    System.out.print("\n\nEXEMPLE: s.indexOf(c)\n\n");
                    System.out.print("String ? ");
                    s = sc.next();
                    System.out.print("Caràcter ? ");
                    c = sc.next().toCharArray()[0];
                    i = s.indexOf(c);
                    System.out.printf("El caràcter %c està a la posició %d de la cadena %s", c, i, s);
                    break;
                case 4:
                    System.out.print("\n\nEXEMPLE: s1.indexOf(s2)\n\n");
                    System.out.print("String ? ");
                    s1 = sc.next();
                    System.out.print("String ? ");
                    s2 = sc.next();
                    i = s1.indexOf(s2);
                    System.out.printf("La cadena %s està a la posició %d de la cadena %s", s2, i, s1);
                    break;
                case 5:
                    System.out.print("\n\nEXEMPLE: s1.compareTo(s2)\n\n");
                    System.out.print("String ? ");
                    s1 = sc.next();
                    System.out.print("String ? ");
                    s2 = sc.next();
                    if (s1.compareTo(s2) > 0) {
                        System.out.print("La primera cadena és més gran que la segona.");
                    } else if (s1.compareTo(s2) < 0) {
                        System.out.print("La primera cadena és més petita que la segona.");
                    } else{
                        System.out.print("Les cadenes són iguals.");
                    }
                    break;
                case 6:
                    System.out.print("\n\nEXEMPLE: s.length()\n\n");
                    System.out.print("String ? ");
                    s = sc.next();
                    n = s.length();
                    System.out.printf("La cadena té %d caràcters", n);
                    break;
                case 7:
                    // ESTO AGARRA DESDE I HASTA J-1 ( J NO INCLUIDA)
                    System.out.print("\n\nEXEMPLE: s.substring(i,j)\n\n");
                    System.out.print("String ? ");
                    s1 = sc.next();
                    System.out.print("Nombre ? ");
                    i = sc.nextInt();
                    System.out.print("Nombre ? ");
                    j = sc.nextInt();
                    s2 = s1.substring(i, j);
                    System.out.printf("Subcadena = %s", s2);
                    break;
                case 8:
                    // SOLO LOS ESPACIOS DEL PRINCIPIO Y DEL FINAL
                    System.out.print("\n\nEXEMPLE: s.trim()\n\n");
                    System.out.print("String ? ");
                    s1 = sc.next();
                    s2 = s1.trim();
                    System.out.printf("Cadena sense espais davant/darrera = +%s+", s2);
                    break;
                default:
                    System.out.print("\nOpció incorrecta!!!\n");
            }
            // Print the menu and ask for an option.
            es.menu();
            op = sc.nextInt();
        }
        
    }
}
