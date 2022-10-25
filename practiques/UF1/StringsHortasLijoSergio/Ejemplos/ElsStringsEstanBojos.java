/*
 * ElsStringsEstanBojos.java        2.0 23/01/2020
 *
 * Juguem amb la crida explícita i implícita del constructor de Strings.
 * Volem esbrinar com es crean a memòria els objectes de tipus String.
 *
 * Copyright 2020 Rafel Botey  <rbotey@escoladeltreball.org>
 * Copyright 2020 Julio Amorós <jamoros@escoladeltreball.org>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class ElsStringsEstanBojos {
    public static void main(String[] args) {
        // Construïm 3 objectes Strings amb crides implícites i explícites
        String str1 = "hola";
        String str2 = new String("hola");
        String str3 = "hola";
        
        System.out.println("\nEls Strings estan bojos...\n");
        System.out.println("Hem fet: \nString str1 = \"hola\";\nString str2 = new String(\"hola\");\nString str3 = \"hola\";\n");
        System.out.println("i obtenim:");
        
        // Ens preguntem si els objectes són iguals a memòria
        // És a dir, la referència és la mateixa
        if ( str1 == str2 ) {
            System.out.println("str1 i str2 són el mateix objecte");
        } else {
            System.out.println("str1 i str2 no són el mateix objecte");
        }
        if ( str1 == str3 ) {
            System.out.println("str1 i str3 són el mateix objecte"); 
        } else {
            System.out.println("str1 i str3 no són el mateix objecte");
        }
        if ( str2 == str3 ) {
            System.out.println("str2 i str3 són el mateix objecte");
        } else {
            System.out.println("str2 i str3 no són el mateix objecte");
        }
        
        // Ens preguntem si els objectes són iguals segons el criteri de la classe String
        if ( str1.equals(str2) ) {
            System.out.println("Amb equals : str1 i str2 iguals");
        } else {
            System.out.println("Amb equals : str1 i str2 diferents");
        }
        if ("hola" == "hola" ) {
            System.out.println("Hola!!!!");
        }
    }
}
