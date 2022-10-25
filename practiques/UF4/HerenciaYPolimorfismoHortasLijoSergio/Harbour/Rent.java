/*
 * Program.java    14/4/22
 *
 * Crea la clase Rent
 *
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Rent {
    
    /** Atributes */
    private String dni;
    private String name;
    private String iniDate;
    private String endDate;
    private String wharfageCode;
    static final double FIXED_VALUE = 2;
    private Boat boat;
    
    // CONSTRUCTORS
        
    /*
     * Constructor 
     */
    
    public Rent(String dni, String name, String iniDate, String endDate, String wharfageCode, Boat boat) {
        this.dni = dni;
        this.name = name;
        this.iniDate = iniDate;
        this.endDate = endDate;
        this.wharfageCode = wharfageCode;
        this.boat = boat;
    }
    
    /**
     * Getters y setters
     */
    
    /**
     * Gets the dni
     *      
     */
    
    public String getDni() {
        return this.dni;
    }
    
     /**
     * Gets the name
     *      
     */
    
    public String getName() {
        return this.name;
    }
    
    /**
     * Gets the WharfageCode
     *      
     */
    
    public String getWharfageCode() {
        return this.wharfageCode;
    }
    
    /**
     * Gets the WharfageCode
     *      
     */
    
    public String getIniDate() {
        return this.iniDate;
    }
    
    /**
     * Gets the WharfageCode
     *      
     */
    
    public String getEndDate() {
        return this.endDate;
    }
       
    /*
     * 
     * OTHER METHODS
     *
     */
    
    // Get the days
    
    public long days() {
    long seconds = 0;
    long totalDays = 0;
    LocalDateTime ini = JodaDT.parseDDMMYYYY(this.iniDate); 
    LocalDateTime end = JodaDT.parseDDMMYYYY(this.endDate);  
    totalDays = ChronoUnit.DAYS.between(ini, end);
    return totalDays;
    }
    
    // Get the base amount
    
    public double amount() {
    return days() * boat.baseAmount() * FIXED_VALUE;
    }
         
    // Get the base amount per Day
    
    public double amountPerDay() {
    return amount() / days();
    }
    
    // Equals & hashCode    
        
     @Override
     public int hashCode() {
     final int prime = 31;
     int result = 1;
     result = prime * result + ((dni == null) ? 0 : dni.hashCode());
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
     Rent other = (Rent) obj;
     if (dni == null) {
     if (other.dni != null)
     return false;
     } else if (dni != other.dni)
     return false;
     return true;
     }
    
    // To String
     
    public String toString() {
        return "\ndni : " + this.dni + "\nname: " + this.name + "\niniDate : " + this.iniDate +
           "\nendDate : " + this.endDate + "\nwharfage: " + this.wharfageCode ;
    }
}

