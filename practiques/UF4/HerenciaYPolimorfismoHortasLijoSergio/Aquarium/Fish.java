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


public class Fish extends Organism {
    
    /** Atributes */
    private String origin;
    private char diet;
    private double length;
    
    
    // CONSTRUCTORS
    
    /*
     * Constructor by default.
     *      
     */
    public Fish (String name, String family, char light, double minTemp, double maxTemp, double minPH
                     , double maxPH) {
        super(name, family, light, minTemp, maxTemp, minPH, maxPH);
    }
    
    /*
     * Constructor by default.
     *      
     */
    public Fish (String name, String family, char light, double minTemp, double maxTemp, double minPH
                     , double maxPH, String origin, char diet, double length) {
        super(name, family, light, minTemp, maxTemp, minPH, maxPH);
        this.origin = origin;
        this.diet = diet;
        this. length = length;
    }
    
    
    /**
     * Getters y setters
     */
    
    /**
     * Gets the origin
     *      
     */
    
    public String getOrigin() {
        return this.origin;
    }
    
    public void setOrigin(String origin) {
        this.origin = origin;
    }
    
    /**
     * Gets the length
     *      
     */
    
    public double getLength() {
        return this.length;
    }
    
    public void setLength(double length) {
        this.length = length;
    }
    
    /**
     * Set the diet
     * 
     */
    
    public void setDiet(char diet) {
        this.diet = diet;
    }             
    
    /*
     * 
     * OTHER METHODS
     *
     */
    
    // Get the String of the diet type
    
    public String dietType() {
        String diet = "";
        if (this.diet == 'W') {
            diet = "Algues";
        } else if (this.diet == 'O') {
            diet = "Omnivor";
        } else {
            diet = "Fulles";
        }
    return diet;
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
    return super.toString() + "\norigin : " + this.origin + "\ndiet: " + dietType() + 
        "\nlength: " + this.length ;
}

}

