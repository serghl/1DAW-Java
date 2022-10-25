/*
 * Program.java        22/2/22
 *
 * Clase game, 
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Player {
    
    /** The position */
    private Position pos;
    /** The name */
    private int num;  
    
    // CONSTRUCTORS
    
    /*
     * Constructor by default.
     *      
     */
    public Player() {
        this.pos = new Position(0,0);
        this.num = 1;
    }
    
    /**
     * 
     * Constructor
     * 
     * @param positionX the x position
     * @param positionY the y position
     * 
     */
    
    public Player(Position pos, int num) {
        this.pos = pos;
        this.num = num;
    }
    
    /**
     * Getters y setters
     */
    
    /**
     * Set and Get the position
     * 
     * @return the x position
     */
    public Position getPos() {
        return this.pos;
    }
    
    public void setPos(Position pos) {
        this.pos = pos;
    }
    /*
     * Set and get the player number
     * 
     */
    
    public int getNum() {
        return this.num;
    }
    
    public void setNum(int num) {
        this.num = num;
    }
    
    // --------  MORE METHODS -----------
    
    // Move right
    
    public void moveRight() {
        this.pos.incX();
    }
    
    // Move left
    
    public void moveLeft() {
        this.pos.decX();
    }
    
    // Jump
    
    public void jump() {
        this.pos.incY();
    }
    
    // Fall
    
    public void fall() {
        this.pos.decY();
    }
    
     // TO STRING 
    
    public String toString() {
        return "El player se encuentra a la posicion " + this.getPos() ;        
    }
    
}
