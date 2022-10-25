/*
 * FormattedFileReading.java            
 *
 * Copyright 2010 Mònica Ramírez Arceda <mramirez@escoladeltreball.org>
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

/**
 * An example of reading CSV text files.
 */
public class FormattedFileReading {

    public static void main(String[] args) {
        // // Create an object that reads files.
        Reader fr = new Reader("sales.dat");
        // Read a line
        String lf = fr.readLine();
        // Print the first line (header)
        System.out.printf("%s\n", lf);
        System.out.print("================================================\n");
        int tLorries = 0, tVans = 0, tCars = 0;
        // Read a line
        lf = fr.readLine();
        // While there are lines left, print the line
        while (lf != null) {
            // Get each field of the line
            String camps[] = lf.split("\\s+");
            // Month
            String month = camps[0];
            // Two last digits of the year
            String any = camps[1].substring(2);
            // Two first characters of the region
            String region = camps[2].substring(0, 1);
            // Number of lorries
            int lorries = Integer.parseInt(camps[3]);
            // Number of vans
            int vans = Integer.parseInt(camps[4]);
            // Number of cars
            int cars = Integer.parseInt(camps[5]);
            tLorries += lorries;
            tVans += vans;
            tCars += cars;
            // Imprimim la línia llegida
            System.out.printf("%2s\t%s\t  %s\t%7d\t%7d\t%7d\n",
                              month,
                              any,
                              region,
                              lorries,
                              vans,
                              cars);
            // Read a line
            lf = fr.readLine();
        }
        // Close the file reader
        fr.close();
        // Print totals
        System.out.print("================================================\n");
        System.out.printf("TOTALS\t\t\t%7d\t%7d\t%7d\n\n", tLorries, tVans, tCars);
    }
}
