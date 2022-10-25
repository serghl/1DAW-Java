/*
 * Program.java        7/4/22
 *
 * Crea la clase Underground
 *
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */


public class Underground extends Transport {
    
    /** Atributes */    
    private double ticketPrice;    
    
    // CONSTRUCTORS
    
    /*
     * Constructor by default.
     *      
     */
    public Underground(String id, double speed) {
        super(id, speed);
    }
    
    /*
     * Constructor 
     */
    
    public Underground(String id, double speed, double ticketPrice) {
        super(id, speed);
        this.ticketPrice = ticketPrice;        
    }
        
    /**
     * Getters y setters
     */
    
    /**
     * Gets the Speed
     *      
     */
    
    public double getTicketPrice() {
        return this.ticketPrice;
    }
    
    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
    
    /*
     * 
     * MORE METHODS
     * 
     */
                   
    // COST 
    @Override
    public double cost(double distance) {                            
        return getTicketPrice();
    }
        
    // Equals & hashCode
     /*
      
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
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
        Transport other = (Transport) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (id != other.id)
            return false;
        return true;
    }    
    */
    
    public String toString() {
        return super.toString();
    }
}

