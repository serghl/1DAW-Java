/*
 * Program.java        24/2/22
 *
 * Clase Clock , un reloj que muestra la data i hora del sistema en format dd/MM/aaaa-hh : mm : ss
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
import java.time.LocalDateTime;

public class Clock {
    
    /** Atributos */
    private static LocalDateTime now;
    
    // CONSTRUCTORS
    
    /*
     * Constructor by default.
     *      
     */
    public Clock() {
        this.now = LocalDateTime.now();        
    }
    
    /**
     * 
     * Constructor
     * 
     * @param positionX the x position
     * @param positionY the y position
     * 
     */
    
    
    
    /**
     * Getters y setters
     */
    
    /**
     * Set and Get the model
     * 
     * @return the x position
     */
    
    
    /*
     * Set and get the pass of finger
     * 
     */
    
    
    
    /*
     * Set and get the ring diameter
     * 
     */
    
    
    
    // --------  MORE METHODS -----------
    
    /*
     * Metodo que me pausa 1 segundo
     * 
     */
    public static void wait(int ms)
    {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
    
    //
    // Metodo del reloj
        
    static void reloj() {  
        boolean found = false;                
        while (!found) { 
            LocalDateTime now = LocalDateTime.now();
            System.out.println(JodaDT.formatDDMMYYYYhhmmss(now));
            wait(1000);   
        }
    }
        
    /*
     * 
     * Textual representation of the object
     * 
     */
    
    public String toString() {
        String s = "";
        
        return s;
    }
}

