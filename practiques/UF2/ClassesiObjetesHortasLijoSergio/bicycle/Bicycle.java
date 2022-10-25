/*
 * Program.java        24/2/22
 *
 * Crea la clase bicycle
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

public class Bicycle {
    
    /** The model of the bike*/
    private String model;
    /** The number of rear sprocket */
    private int rearSprocket;
    /** The number of front sprocket*/
    private int frontSprocket;
    /** The current rear sprocket*/
    private final int nRearSprockets;
    /** The current front sprocket*/
    private final int nFrontSprockets;
    /** The max Speed the model can achieve */
    private final static int maxSpeed = 100;
    /** The current speed*/
    private double speed;
    /** The increment of the speed */
    private final static int inc = 5;
    
    
    // CONSTRUCTORS
    
    /*
     * Constructor by default.
     */
    public Bicycle() {
        this.model = "Mountain Bike"; 
        this.nRearSprockets = 5;
        this.nFrontSprockets = 2;
        this.rearSprocket = 3;
        this.frontSprocket = 1;         
        this.speed = 0;
    }
    
    /**
     * 
     * Constructor
     * 
     * 
     */
    
    public Bicycle(String model, int nRearSprockets , int nFrontSprockets ,int rearSprocket, 
                   int fronSprocket, int speed) {
        this.model = model;
        this.nRearSprockets = nRearSprockets;
        this.nFrontSprockets = nFrontSprockets;
        this.rearSprocket = rearSprocket;
        this.frontSprocket = frontSprocket;
        this.speed = speed;
    }
    
    /**
     * -------- Getters y setters -------------
     */
    
    /**
     * Gets and set the speed
     * 
     * @return the speed
     */
    
    public String getModel() {
        return this.model;
    }
    
    public void setModel (String model) {        
        this.model = model;        
    }
    
    /**
     * Gets and set the CURRENT rear sprocket
     * 
     * @return the rear sprocket
     */
    
    public int getRearSprocket() {
        return this.rearSprocket;
    }    
    
    public void setRearSprocket(int nRearSprocket) {        
        this.rearSprocket = rearSprocket;        
    }
    
    /**
     * Gets and set the CURRENT front sprocket
     * 
     * @return the rear sprocket
     */
    
    public int getFrontSprocket() {
        return this.frontSprocket;
    }    
    
    public void setFrontSprocket(int frontSprocket) {
        this.frontSprocket = frontSprocket;       
    }
    
    
    /**
     * Gets and set the current speed
     * 
     * @return the speed
     */
    
    public double getSpeed() {
        return this.speed;
    }
    
    public void setSpeed (double speed) {
        this.speed = speed;        
    }
    
    // --------  MORE METHODS -----------
    
    /*
     * Stop the bicycle
     * 
     */
    public void stop() {
        this.speed = 0;
    }
    
    // Slow Down
    
    public void slowDown() {
        double newSpeed = this.speed - Bicycle.inc;
        if (newSpeed < 0)
            newSpeed = 0;
        this.speed = newSpeed;
    }
    
    // Speed up
    
    public void accelerate() {
        double newSpeed = this.speed + Bicycle.inc;
        if (newSpeed > Bicycle.maxSpeed)
            newSpeed = Bicycle.maxSpeed;
        this.speed = newSpeed;
    }
     
    /**
     * Changes the engaged front sprocket. Increases or decreases the front sprocket by 1. The bicycle can't be stopped.
     * 
     * @param n A number that indicates if the front sprocket must be increased or decreased. If n is positive the front
     *        sprocket will be increased. If n is negative the front sprocket will be decreased. If n is 0, the front
     *        sprocket won't be changed.
     * @return true if the front sprocket is changed, false otherwise.
     */
    
    public boolean changeFrontSprocket(int n) {
        boolean isChanged = true;
        if (this.frontSprocket < this.nFrontSprockets && n > 0 && this.speed > 0) {
            this.frontSprocket++;
        } else if (this.frontSprocket > 1 && n < 0 && this.speed > 0) {
            this.frontSprocket--;
        } else {
            isChanged = false;
        }
        return isChanged;
    }
    
    /**
     * Changes the engaged rear sprocket. Increases or decreases the rear sprocket by 1. The bicycle can't be stopped.
     * 
     * @param n A number that indicates if the rear sprocket must be increased or decreased. If n is positive the rear
     *        sprocket will be increased. If n is negative the rear sprocket will be decreased. If n is 0, the rear
     *        sprocket won't be changed.
     * @return true if the rear sprocket is changed, false otherwise.
     */
    public boolean changeRearSprocket(int num) {
        boolean isChanged = true;
        if (this.rearSprocket < this.nRearSprockets && num > 0 && this.speed > 0) {
            this.rearSprocket++;
        } else if (this.rearSprocket > 1 && num < 0 && this.speed > 0) {
            this.rearSprocket--;
        } else {
            isChanged = false;
        }
        return isChanged;
    }
    
    
    /*
     * 
     * Textual representation of the object
     * 
     */
    
    public String toString() {
        String s = "\nModel :" + this.model + "\nnFrontSprockets : " + this.nFrontSprockets + "\nnRearSprockets : " 
            + this.nRearSprockets + 
            "\nmaxSpeed : " + this.maxSpeed;
        return s;
    }
}

