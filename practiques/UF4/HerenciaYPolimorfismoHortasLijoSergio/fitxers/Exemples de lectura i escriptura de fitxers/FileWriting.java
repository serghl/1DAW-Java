/*
 * EscripturaFitxer.java   
 *
 * Copyright 2010-2012 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

/**
 * An exampel of wrting to a file.
 * 
 */
public class FileWriting {
    public static void main(String[] args) {
        // Create a objecte that writes to a file
        Writer wr = new Writer("output.txt");
        // Write a string to the file
        wr.println("Escric aquest text en un fitxer.");
        wr.println("*******************************.");
        // Close the file writer
        wr.close();
    }

}
