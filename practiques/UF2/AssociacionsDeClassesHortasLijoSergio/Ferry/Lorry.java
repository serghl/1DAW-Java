/*
 * Program.java        19/3/22
 *
 * Crea la clase Lorry
 *
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
import java.util.HashSet;

public class Lorry {
    
    /** Atributes */
    private String regNumber;
    private double weight;
    private int nAxles;
    
    
// CONSTRUCTORS
    
    /*
     * Constructor by default.
     * 
     * @param name the person's name
     */
    public Lorry() {
        this.regNumber = "";
        this.weight = 0;
        this.nAxles = 2;
    }
    
    /*
     * Constructor 
     */
    
    public Lorry(String regNumber) {
        this.regNumber = regNumber;
        this.weight = 0;
        this.nAxles = 2;
        }
    
    /*
     * Constructor 
     */
    public Lorry(String regNumber, double weight, int nAxles) {
        this.regNumber = regNumber;
        this.weight = weight;
        this.nAxles = nAxles;        
    }
    
    /**
     * Getters y setters
     */
    
    /**
     * Gets the regnumber
     *      
     */
    
    public String getRegNumber() {
        return this.regNumber;
    }
    
    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }
    
    /**
     * Gets the weight
     * 
     */
    
    public double getWeight() {
        return weight;
    }
    
    public void setWeight(double weight) {        
        this.weight = weight;
    }        
    
    /**
     * Gets the number of axles
     *      
     */
    
    public int getNAxles() {
        return nAxles;
    }
    
    public void setNAxles(int nAxles) {        
        this.nAxles = nAxles;
    }  
    
    // Equals & hashCode
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((regNumber == null) ? 0 : regNumber.hashCode());
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
        Lorry other = (Lorry) obj;
        if (regNumber == null) {
            if (other.regNumber != null)
                return false;
        } else if (regNumber != other.regNumber)
            return false;
        return true;
    }
    
    public String toString() {
        return "\nregNumber : " + this.regNumber + "\nweight: " + this.weight + "\nnAxles: " + this.nAxles ;
    }
}

