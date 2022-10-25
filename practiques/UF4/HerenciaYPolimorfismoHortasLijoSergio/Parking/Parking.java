/*
 * Program.java        11/4/22
 *
 * Crea la clase Fish
 * 
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */


public class Parking {
    
    /** Atributes */
    private int nSpaces;
    private Vehicle[] spaces;
    
    
    // CONSTRUCTORS
    
    /*
     * Constructor by default.
     *      
     */
    public Parking (int nSpaces) {
        this.nSpaces = nSpaces;
        this.spaces = new Vehicle[nSpaces];
    }
    
    /*
     * 
     * OTHER METHODS
     *
     */
    
    // Add a vehicle to the parking
    
    public boolean add(Vehicle v, int ns) {
        boolean succes = false;
        if (this.spaces[ns] == null) {
            this.spaces[ns] = v;
            succes = true;
        }
        return succes;
    }
    
    // Remove a vehicle from the parking
    
    public Vehicle remove (int ns) {
        Vehicle v = null;
        if (this.spaces[ns] != null) {
            v = this.spaces[ns];
            this.spaces[ns] = null;
            System.out.println("Se ha vaciado la plaza "+ns+" ocupada por :");
        }
        return v;
    }
    
    // Calculate the fee of a vehicle
    
    public double calculateFee (int ns) {
        return this.spaces[ns].calculateFee(); 
    }
    
    // Calculate the total fee of the parking 
    
    public double calculateTotal() {
        double totalCuota = 0;
        int i = 0;
        while (i < spaces.length) {
            if (spaces[i] == null) {
                i++;
            } else {
                totalCuota += this.spaces[i].calculateFee();
                i++;
            }
        }        
        return totalCuota;
    }
    // Return a report
    
    public void reportTotal(String pathReport) {
        System.out.println("REPORTE DEL PARKING");
        System.out.println("--------------------");
        for (int i = 0; i < this.spaces.length; i++) {
            if (spaces[i] == null) {
                System.out.println("Plaza "+ i + " -> VACIA");
            } else {
                System.out.println("Plaza "+ i + " -> " + spaces[i].getRegPlate() +
                                   " - " + spaces[i].getClass() + " - " + spaces[i].calculateFee());
            }
        }
    }
    
// Equals & hashCode    
    /*
     @Override
     public int hashCode() {
     final int prime = 31;
     int result = 1;
     result = prime * result + ((code == null) ? 0 : code.hashCode());
     return result;
     }
     
     @Override
     public boolean equals(Object obj) {
     if (this == obj)
     return true;
     if (obj == null)
     return false;
     if (getClass() != obj.getClass())
     return false;
     Area other = (Area) obj;
     if (code == null) {
     if (other.code != null)
     return false;
     } else if (code != other.code)
     return false;
     return true;
     }
     
     
     public String toString() {
     return super.toString() + "\norigin : " + this.origin + "\ndiet: " + dietType() + 
     "\nlength: " + this.length ;
     }
     */
}

