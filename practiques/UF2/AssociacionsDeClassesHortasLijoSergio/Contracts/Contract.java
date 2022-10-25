/* 
 * Program.java        16/3/22 
 * 
 * Contract
 * 
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com> 
 * 
 * This is free software, licensed under the GNU General Public License v3. 
 * See http://www.gnu.org/licenses/gpl.html for more information. 
 */
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.HashSet;
import java.time.temporal.ChronoUnit;

/**
 * Modelizes a Company contract system.
 */
public class Contract {
    
    
    /** Atributos */
    private int code;
    private String initialDate;
    private String endDate;
    private Company company;
    
    /**
     * Constructor.
     */
    
    public Contract(int code) {
        this.code = code;        
    }
    
    /**
     * Constructor.
     */
    public Contract(int code, String initialDate, String endDate, Company company) {
        this.code = code;
        this.initialDate = initialDate;
        this.endDate = endDate;
        this.company = company;
    }
    
    
    // Getters and setters
    
    /**
     * Gets the contract code
     *      
     */
    
    public int getCode() {
        return this.code;
    }
    
    public void setCode(int code) {
        this.code = code;
    }
    
    /**
     * Gets the contract initialDate
     *      
     */
    
    public String getInitialDate() {
        return this.initialDate;
    }
    
    public void setInitialDate(String initialDate) {
        this.initialDate = initialDate;
    }
    
    /**
     * Gets the contract endDate
     *      
     */
    
    public String getEndDate() {
        return this.endDate;
    }
    
    public void setEndDate(String endDate) {
        this.endDate= endDate;
    }
    
    /**
     * Gets the company
     *      
     */
    
    public Company getCompany() {
        return this.company;
    }
    
    public void setCompany(Company company) {
        this.company= company;
    }
    
    /**
     *
     * OTHER METHODS
     */ 
    
    
    /* 
     * 
     * Return an int with the duration of the contract (in days)
     * 
     */
    public long duration () {
        long totalDaysLong = 0;
        int totalDaysInt = 0;
        // Primero hacemos un cast de las fechas a localDate
        LocalDate start = (JodaDT.parseDDMMYYYY(getInitialDate())).toLocalDate();
        LocalDate end = (JodaDT.parseDDMMYYYY(getEndDate())).toLocalDate();                               ;
        // Luego calculamos el periodo        
        totalDaysLong = ChronoUnit.DAYS.between(start, end);
        totalDaysInt = (int)totalDaysLong;
        return totalDaysInt;
    }
         
    // Equals & hashCode
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((code == 0) ? 0 : code % 5);
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
        Contract other = (Contract) obj;
        if (code == 0) {
            if (other.code!= 0)
                return false;
        } else if (code != code)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "code : " + this.code + "\ninitialDate: " + this.initialDate +"\nendDate: " + this.endDate + 
            "\nCompany: " + this.company ;
    }
}
