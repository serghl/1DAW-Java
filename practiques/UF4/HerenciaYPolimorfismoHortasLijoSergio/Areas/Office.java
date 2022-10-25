/*
 * Program.java        10/4/22
 *
 * Crea la clase Office
 * 
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */


public class Office extends Area{
    
    /** Atributes */
    private int nTables;
    private boolean coffeeMachine;
    
    // CONSTRUCTORS
    
    /*
     * Constructor by default.
     *      
     */
    public Office() {
        super("",0,false,0);            
    }
    
    /*
     * Constructor 
     */
    
    public Office(String code, double surfaceArea, boolean naturalLight, double consumption, int nTables,
                 boolean coffeeMachine) {
        super(code,surfaceArea,naturalLight,consumption);
        this.nTables = nTables;
        this.coffeeMachine = coffeeMachine;
    }
       
    /**
     * Getters y setters
     */
    
    /**
     * Gets the number of tables
     *      
     */
    
    public int getNTables() {
        return this.nTables;
    }
    
    public void setNTables(int nTables) {
        this.nTables = nTables;
    }
    
    /**
     * Gets the Surface Area
     * 
     */
    
    public boolean isCoffeeMachine() {
        return this.coffeeMachine;
    }
    
    public void setCoffeeMachine (boolean coffeeMachine) {        
        this.coffeeMachine = coffeeMachine;
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
        return super.toString() + "\nnTables " + this.nTables + "\ncoffeeMachine : " + this.coffeeMachine;
    }
    
}

