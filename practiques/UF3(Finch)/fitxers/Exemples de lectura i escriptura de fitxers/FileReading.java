/*
 * FileReading.java            
 *
 * Copyright 2010-2012 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

/**
 * An example of reading text files.
 */
public class FileReading {

    public static void main(String[] args) {
        // Create an object that reads files
        Reader fr = new Reader("metamorphosis.txt");
        // Read the firast line
        String lf = fr.readLine();
        // While there are lines left, print the line and read another line
        while (lf != null) {
            // Print the read line
            System.out.printf("%s\n", lf);
            // Read a line
            lf = fr.readLine();
        }
        // Close the file reader
        fr.close();
    }
}
