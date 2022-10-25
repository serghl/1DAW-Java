/* 
 * Program.java        15/3/22 
 * 
 * Surgery
 * 
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com> 
 * 
 * This is free software, licensed under the GNU General Public License v3. 
 * See http://www.gnu.org/licenses/gpl.html for more information. 
 */
import java.time.LocalDateTime;

/**
 * Modelizes a book.
 */
public class Visit {
    
    /** Date and hour of the visit */
    private String visitDateTime;
    /** Name of the patient */
    private String patientName;
    
    /**
     * Constructor by default.
     * 
     */
    public Visit() {
        // Patient Name
        this.patientName = "Patient";
        // VisitDateTime        
        this.visitDateTime = "";
    }
    
    /**
     * Constructor with all fields.
     * 
     * @param code the book copy identifier code
     * @param isbn the book's ISBN
     * @param title the book's title
     * @param writer the book's writer
     */
    public Visit(String visitDateTime, String patientName) {
        this.visitDateTime = visitDateTime;
        this.patientName = patientName;
        
    }
    
    // Getters and setters
    
    // Visit Date Time
    
    public String getVisitDateTime() {
        return this.visitDateTime;
    }
    
    public void setVisitDateTime(String visitDateTime) {
        this.visitDateTime = visitDateTime;
    }
    
    // Patient Name
    
    public String getPatientName() {
        return this.patientName;
    }
    
    public void setPatientName(String PatientName) {
        this.patientName = patientName;
    }
    
    // Equals & hashCode
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((visitDateTime == null) ? 0 : visitDateTime.hashCode());
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
        Visit other = (Visit) obj;
        if (visitDateTime == null) {
            if (other.visitDateTime != null)
                return false;
        } else if (!visitDateTime.equals(other.visitDateTime))
            return false;
        return true;
    }
    
    @Override
    public String toString() {
        return "visitDateTime : " + this.visitDateTime + " PatientName : " + this.patientName ;
    }
}