/*
 * Program.java        21/3/22
 *
 * Crea la clase Plane
 *
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
import java.util.HashSet;

public class Plane {
    
    /** Atributes */
    private String code;
    private String model;
    private double v;
    
    
// CONSTRUCTORS
    
    /*
     * Constructor by default.
     * 
     * @param name the person's name
     */
    public Plane() {
        this.code = "";
        this.model = "";
        this.v = 100;
    }
    
    /*
     * Constructor 
     */
    
    public Plane(String code) {
        this.code = code;
        this.model = "";
        this.v = 100;
        }
    
    /*
     * Constructor 
     */
    public Plane(String code, String model, double v) {
        this.code = code;
        this.model = model;
        this.v = v;
        }
    
    /**
     * Getters y setters
     */
    
    /**
     * Gets the code
     *      
     */
    
    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    
    /**
     * Gets the model
     * 
     */
    
    public String getModel() {
        return model;
    }
    
    public void setModel(String model) {        
        this.model = model;
    }        
    
    /**
     * Gets the number of axles
     *      
     */
    
    public double getV() {
        return this.v;
    }
    
    public void setV(double v) {        
        this.v = v;
    }  
    
    // Equals & hashCode
    
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
        Plane other = (Plane) obj;
        if (code == null) {
            if (other.code != null)
                return false;
        } else if (code != other.code)
            return false;
        return true;
    }
    
    public String toString() {
        return "\ncode : " + this.code + "\nmodel: " + this.model + "\nv: " + this.v;
    }
}

