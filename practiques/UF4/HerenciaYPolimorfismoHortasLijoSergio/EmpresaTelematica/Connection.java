/*
 * Program.java        19/4/22
 *
 * Crea la clase Connection
 * 
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
import java.time.LocalDateTime;

public class Connection {
    
    /** Atributes */
    private String iniDateTime;
    private String endDateTime;
        
    // CONSTRUCTORS
    
    /*
     * Constructor by default.
     *      
     */
    public Connection (String iniDateTime, String endDateTime) {
        this.iniDateTime = iniDateTime;
        this.endDateTime = endDateTime;
    }
    
    /*
     * 
     * OTHER METHODS
     *
     */
    
    // Calculate the minutes of the connection
    
    public long minutes() {
        long totalMin;
        LocalDateTime ini = JodaDT.parseDDMMYYYYhhmm(this.iniDateTime);
        LocalDateTime end = JodaDT.parseDDMMYYYYhhmm(this.endDateTime);
        totalMin = JodaDT.durationInSeconds(ini,end) / 60;
        return totalMin;
    }
    
}

