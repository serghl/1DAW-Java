/*
 * Program.java        10/4/22
 *
 * Crea la clase Classroom
 * 
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */


public class Classroom extends Area{
    
    /** Atributes */
    private int capacity;
    private boolean chairTable;
    private int nComputers;
    private boolean networkConn;
    
    // CONSTRUCTORS
    
    /*
     * Constructor by default.
     *      
     */
    public Classroom(String code, double surfaceArea, boolean naturalLight, double consumption, 
    int capacity) {
        super(code, surfaceArea, naturalLight, consumption);
        this.capacity = capacity;
    }
    
    /*
     * Constructor by default.
     *      
     */
    public Classroom(String code, double surfaceArea, boolean naturalLight, double consumption, 
    int capacity, boolean chairTable, int nComputers, boolean networkConn) {
        super(code, surfaceArea, naturalLight, consumption);
        this.capacity = capacity;
        this.chairTable = chairTable;
        this.nComputers = nComputers;
        this.networkConn = networkConn;
    }
    
       
    /**
     * Getters y setters
     */
    
    /**
     * Gets the number of tables
     *      
     */
    
    public int getCapacity() {
        return this.capacity;
    }
    
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    /**
     * Gets the number of tables
     *      
     */
    
    public int getNComputers() {
        return this.nComputers;
    }
    
    public void setNComputers(int nComputers) {
        this.nComputers = nComputers;
    }
    
    /**
     * Gets the chair Table and the network
     * 
     */
    
    public boolean isChairTable() {
        return this.chairTable;
    }
    
    public boolean isNetworkConn() {
        return this.networkConn;
    }             
    
    /*
     * 
     * OTHER METHODS
     *
     */
    
    // Get the m2 surface per student
    
    public double surfaceAreaStudent() {
        return getSurfaceArea() / this.capacity;
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
        return super.toString() + "\ncapacity " + this.capacity + "\nchairTable : " + this.chairTable + 
            "\nnComputers : " + this.nComputers + "\nnetworkConn : " + this.networkConn;
    }
    
}

