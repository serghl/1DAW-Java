/*
 * Program.java        22/2/22
 *
 * Crea un contador de dos digitos
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */


public class Counter2 {
    
    // Atributos
    
    /** The number */
    
    private Counter1 counterUnits;
    private Counter1 counterTens;
    
    
// CONSTRUCTORS
    
    
    /*
     * Constructor by default.
     */
    public Counter2() {
        this.counterUnits = new Counter1();
        this.counterTens = new Counter1();
    }
    
    /**
     * 
     * Constructor
     * 
     * @param counterUnits an object of units
     * @param counterTens an object of tens
     * 
     * 
     */
    
    public Counter2(Counter1 counterUnits,Counter1 counterTens) {
        this.counterUnits = counterUnits;
        this.counterTens = counterTens;
    }
    
    /**
     * 
     * Constructor pasando dos enteros 
     * @param units an int
     * @param tens an int
     * 
     */
    
    public Counter2 (int tens, int units) {
        this.counterUnits = new Counter1(units);
        this.counterTens = new Counter1(tens);
    }
    
    /**
     * Getters y setters
     */
    
    /**
     * Gets and set the units
     * 
     * @return the units
     */
    
    public Counter1 getCounterUnits() {
        return this.counterUnits;
    }
    public void setCounterUnits(Counter1 counterUnits) {
        this.counterUnits = counterUnits;
    }
    
    /**
     * Gets and set the tens
     * 
     * @return the tens
     */
    
    
    public Counter1 getCounterTens() {
        return this.counterTens;
    }
    public void setCounterTens(Counter1 counterTens) {
        this.counterTens = counterTens;
    }
    
    // --------  MORE METHODS -----------
    
    /*
     * Incrementa, si el retorno es 0 reinicia e incrementa el valor de tens
     * 
     */
    public void increment() {
        this.counterUnits.increment();
        if ( this.counterUnits.getDigit() == 0) {
            this.counterTens.increment();            
        }
    }
    
    /*
     * Metodos para resetear
     * 
     * Uno llamando al metodo de Counter1, el otro poniendolo a 0 y el ultimo creando un nuevo objeto vacio
     * 
     */
    public void reset() {
        this.counterUnits.reset();
        this.counterTens.reset();
    }   
    
    // Con el setDigit lo pongo a 0 
    public void reset2() {
        this.counterUnits.setDigit(0);
        this.counterTens.setDigit(0);
    }
    // Aqui creo un nuevo objeto vacio    
    public void reset3() {
        this.counterUnits = new Counter1();
        this.counterTens = new Counter1();
    }
    
    /*
     * 
     * Textual representation of the object
     * 
     */
    
    public String toString() {
        return "Numero = " + this.counterTens.getDigit() + this.counterUnits.getDigit() ;
    }
}