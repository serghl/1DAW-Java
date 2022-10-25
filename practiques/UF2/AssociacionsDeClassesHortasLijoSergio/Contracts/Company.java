/* 
 * Program.java        16/3/22 
 * 
 * Company
 * 
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com> 
 * 
 * This is free software, licensed under the GNU General Public License v3. 
 * See http://www.gnu.org/licenses/gpl.html for more information. 
 */
import java.time.LocalDateTime;

/**
 * Modelizes a company.
 */
public class Company {
    
    /** Atributos */
    private int cif;    
    private String name;
    private String sector;
    
    /**
     * Constructor by default.
     * 
     */
    public Company() {
        // Patient Name
        this.cif = 00000000;        
    }
    
    public Company(int cif) {
        this.cif = cif;                
    }
    
    public Company(int cif, String name, String sector) {
        this.cif = cif;                
        this.name = name;
        this.sector = sector;
    }
    
    // Getters and setters
    
    // CIF
    
    public int getCif() {
        return this.cif;
    }
    
    public void setcif(int cif) {
        this.cif = cif;
    }
    
    // Company Name
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    // Equals & hashCode
   
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cif == 0) ? 0 : cif % 5);
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
        Company other = (Company) obj;
        if (cif == 0) {
            if (other.cif != 0)
                return false;
        } else if (cif != other.cif)
            return false;
        return true;
    }
    
    @Override
    public String toString() {
        return "cif : " + this.cif + "\nname : " + this.name + "\nsector : " + this.sector;
    }
}
