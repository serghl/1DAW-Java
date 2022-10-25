/*
 * Training00.java             
 *
 * Copyright 2010-2012 Joaquim Laplana, Mònica Ramírez Arceda
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 *
 */

/**
 * Training text files queries.
 */
public class Training00 {

    /**
     * Calculates the average sales.
     * 
     * @return the average
     */
    public static double averageSales() {
        Reader r = new Reader("repventas.dat");
        int nFields = 0;
        double sum = 0;
        double average = 0;
        r.readLine(); // Skip fields header
        String readEntry = r.readLine();
        while (readEntry != null) {
            String[] fields = readEntry.split("\\s+");
            double sales = Double.parseDouble(fields[9]);
            nFields++;
            sum += sales;
            readEntry = r.readLine();
        }
        average = sum / nFields;
        r.close();
        return average;
    }

    /**
     * Counts the number of sales representatives that have sales greater than
     * the average sales.
     * 
     * @return the number of sales representatives with sales greater than
     *         average sales
     */
    public static int countRepExceedAvgSales() {
        Reader r = new Reader("repventas.dat");
        int nEntries = 0;
        double avgSales = Training00.averageSales();
        r.readLine(); // Skip header
        String readEntry = r.readLine();
        while (readEntry != null) {
            String[] fields = readEntry.split("\\s+");
            double sales = Double.parseDouble(fields[9]);
            if (avgSales < sales) {
                nEntries++;
            }
            readEntry = r.readLine();
        }
        r.close();
        return nEntries;
    }

    /**
     * Count the number of offices that have exceed their sales targets.
     * 
     * @return the number of offices that have exceed their sales targets.
     */
    public static int countSalesExceedTargets() {
        Reader r = new Reader("oficinas.dat");
        int nEntries = 0;
        r.readLine(); // Skip header
        String readEntry = r.readLine();
        while (readEntry != null) {
            String[] fields = readEntry.split("\\s+");
            double targets = Double.parseDouble(fields[4]);
            double sales = Double.parseDouble(fields[5]);
            if (targets < sales) {
                nEntries++;
            }
            readEntry = r.readLine();
        }
        r.close();
        return nEntries;
    }

    /**
     * Finds out of the value of products stock of a manufacturer identified by
     * idManufacturer.
     * 
     * @param idManufacturer the manufacturer ID
     * @return the stock value
     */
    public static double calculateStockValue(String idManufacturer) {
        Reader r = new Reader("productos.dat");
        double stockValue = 0;
        r.readLine(); // Skip header
        String readEntry = r.readLine();
        while (readEntry != null) {
            String[] fields = readEntry.split("\\s+");
            String currentIdManufacturer = fields[0];
            if (currentIdManufacturer.equals(idManufacturer)) {
                double price = Double.parseDouble(fields[3]);
                double stock = Double.parseDouble(fields[4]);
                stockValue += price * stock;
            }
            readEntry = r.readLine();
        }
        r.close();
        return stockValue;
    }

    /**
     * Finds out the name of the client who has placed the order with the
     * highest value.
     * 
     * @return the client's name
     */
    public static String clientNameHighestOrder() {
        Reader r = new Reader("pedidos.dat");
        double maxOrderValue = 0; // Highest order
        String idClientMaxOrder = ""; // Client's id with highest order
        String nameClientMaxOrder = ""; // Client's name with highest order
        // Find out the id of the client with highest order
        r.readLine(); // Skip header
        String readEntry = r.readLine();
        while (readEntry != null) {
            String[] fields = readEntry.split("\\s+");
            double orderValue = Double.parseDouble(fields[7]);
            if (maxOrderValue < orderValue) {
                String idClient = fields[2];
                maxOrderValue = orderValue;
                idClientMaxOrder = idClient;
            }
            readEntry = r.readLine();
        }
        r.close();
        // Find out the client name with the highest order 
        // from its id client (idClientMaxOrder)
        r = new Reader("clientes.dat");
        r.readLine(); // Skip header
        readEntry = r.readLine();
        while (readEntry != null) {
            String[] fields = readEntry.split("\\s+");
            String idClient = fields[0]; 
            if (idClient.equals(idClientMaxOrder)) {
                String nameClient = fields[1];
                nameClientMaxOrder = nameClient;
                break;
            }
            readEntry = r.readLine();
        }
        r.close();
        return nameClientMaxOrder;
    }

    /**
     * Creates the file repventas2.dat with repventas.dat entries ordered by age
     * of sales representatives.
     */
    public static void sortSalesRepByAge() {
        Files.createOrderedCsvFile("repventas.dat", "repventas2.dat", 3, 1, "\\s+");
    }

 
}
