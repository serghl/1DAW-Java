/*
 * Program.java    11/4/22
 *
 * Crea la clase Organism
 *
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */


public abstract class Organism {
    
    /** Atributes */
    private String name;
    private String family;
    private char light;
    private double minTemp;
    private double maxTemp; 
    private double minPH;
    private double maxPH;
    
    
    // CONSTRUCTORS
    
    
    /*
     * Constructor 
     */
    
    public Organism(String name, String family, char light, double minTemp, double maxTemp, double minPH
                        , double maxPH) {
        this.name = name;
        this.family = family;
        this.light = light;
        this.minTemp = minTemp;
        this.maxTemp = maxTemp;
        this.minPH = minPH;
        this.maxPH = maxPH;
        
    }
    
    /**
     * Getters y setters
     */
    
    /**
     * Gets the name
     *      
     */
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Gets the family
     *      
     */
    
    public String getFamily() {
        return this.family;
    }
    
    public void setFamily(String family) {
        this.family = family;
    }
    
    /**
     * Gets the Light
     * 
     */
    
    public char getLight() {
        return this.light;
    }
    
    public void setLight(char light) {        
        this.light = light;
    }            
    
    
    /*
     * 
     * OTHER METHODS
     *
     */
    
    // Get the levels of acidity
    
    public String acidity() {
        return "Los niveles MIN/MAX son " + this.minPH + " y " + this.maxPH;
    }    
    
    // Get the temperature range
    
    public String temperature() {
        return "Los márgenes MIN/MAX son entre " + this.minTemp + " y " + this.maxTemp;
    }  
    
    // Get the String of light Type
    
    public String lightType() {
        String light = "";
        if (this.light == 'H') {
            light = "Necesidad alta de luz";
        } else if (this.light == 'M') {
            light = "Necesidad mitjana de luz";
        } else {
            light = "Necesidad baja de luz";
        }
        return light;
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
     */
    
    public String toString() {
        return "\nname : " + this.name + "\nfamily : " + this.family + "\nlight : " + 
            lightType() + "\nTemperatura : " + temperature() +
            "\nAcidez : " + acidity();
    }
}

