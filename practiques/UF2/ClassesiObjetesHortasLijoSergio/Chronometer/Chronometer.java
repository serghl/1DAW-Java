/*
 * Program.java        24/2/22
 *
 * Clase Ring
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
import java.time.LocalDateTime;

public class Chronometer {
    
    /** */
    private LocalDateTime t1;
    private LocalDateTime t2;
    
    // CONSTRUCTORS
    
    
    
    /**
     * 
     * Constructor 
     * 
     */
     public Chronometer() {
        
    }
        
    // --------  MORE METHODS -----------
    
    
    // Start
    
    public void start() { 
        this.t1 = LocalDateTime.now();
    }
    
    // Stop
    
    public void stop () { 
        this.t2 = LocalDateTime.now();
    }
    
    // Reset
    
    public void reset() {
        start();
    }
    
    // Returns the diference
    
    public String lapse () {
        long total = JodaDT.durationInSeconds(this.t1,this.t2);
        long horas = total / 3600;
        long minutes = total % 3600 / 60;
        long seconds = total % 3600 % 60;
        String s = horas +":"+ minutes +":"+ seconds;
        return s;
    }
}

