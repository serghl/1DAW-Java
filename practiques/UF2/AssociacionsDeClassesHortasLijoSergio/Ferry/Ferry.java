/*
 * Program.java        19/3/22
 *
 * Crea la clase Ferry
 *
 * Copyright Sergio Hortas Lijó 2022 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */

import java.util.ArrayList;

public class Ferry {
    
    /** Atributes */
    private String regNumber;
    private String name;
    private String harbourName;
    private double pricePerAxle;
    private double pricePerTon;
    private double maxWeight;
    private ArrayList<Lorry> boardedLorries ;
    
    // CONSTRUCTORS
    
    /*
     * Constructor by default.
     *      
     */
    public Ferry() {
        this.regNumber = "";
        this.name = "";
        this.boardedLorries = new ArrayList<Lorry>();
    }
    
    /*
     * Constructor 
     */
    
    public Ferry(String regNumber) {
        this.regNumber = regNumber;
        this.boardedLorries = new ArrayList<Lorry>();
    }
    
    /*
     * Constructor 
     */
    public Ferry(String regNumber, String name, String harbourName, double pricePerAxle, double pricePerTon, 
                 double maxWeight) {
        this.regNumber = regNumber;
        this.name = name;
        this.harbourName = harbourName;
        this.pricePerAxle = pricePerAxle;
        this.pricePerTon = pricePerTon;
        this.maxWeight = maxWeight;
        this.boardedLorries = new ArrayList<Lorry>();
    }
    
    /**
     * Getters y setters
     */
    
    /**
     * Gets the regnumber
     *      
     */
    
    public String getRegNumber() {
        return this.regNumber;
    }
    
    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }
    
    /**
     * Gets the weight
     * 
     */
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {        
        this.name = name;
    }        
    
    /**
     * MORE METHODS
     *      
     */
    
    // Get the total weight of the boarded Lorrys
    
    public double totalWeight() {
        double total = 0;  
        for (int i = 0; i < this.boardedLorries.size(); i++) {          
            total += boardedLorries.get(i).getWeight();            
        }
        return total;
    }
    
    // Get if a lorry is boarded
    
    public boolean isBoarded (Lorry lorry) {
        boolean is = this.boardedLorries.contains(lorry);
        return is;
    }
    
    // Get if a lorry can board
    
    public boolean canBoard (Lorry lorry) {
        boolean can = false;
        if ((totalWeight() + lorry.getWeight()) <= this.maxWeight) {
            can = true;
        }
        return can;
    }
    
    // Board a lorry
    
    public boolean board (Lorry lorry) {
        if (canBoard(lorry)) {
            return this.boardedLorries.add(lorry);
        } else {
            System.out.println("Lorry can not board on this ferry");
            return false;
        }
    }
    
    // Determinate the "n" position of a ferry
    
    public Lorry lorryInPosition(int n) {
        Lorry position = this.boardedLorries.get(n);               
        return position;
    }
    
    // Determinate the toll price of a lorry
    
    public double tollPrice(Lorry lorry) {
        return (lorry.getWeight() * this.pricePerTon) + (lorry.getNAxles() * this.pricePerAxle);    
    }
    
    // Determinate the total of tolls collected
    
    public double collectedTolls() {
        double collected = 0;
        for (Lorry l : this.boardedLorries) {
            collected += tollPrice(l);
        }
        return collected;
    }
    
    // Print boarded Lorries
    
    public void showBoardedLorries() {
        for (Lorry l : this.boardedLorries) {
            System.out.println(l.getRegNumber());
        }
    }
    
// public     
    
    /*      
     public ArrayList sortPrice() {
     ArrayList<Lorry> tollBoardedLorries = new ArrayList<Lorry>();
     tollBoardedLorries = bubbleSort(boardedLorries);
     return tollBoardedLorries;
     }
     */
    
// Un metodo que retorna el arraylist ordenado por precio
    
    public void sortPrice() {
        ArrayList<Lorry> tollBoardedLorries = new ArrayList<Lorry>();
        tollBoardedLorries = this.boardedLorries;
        int n = tollBoardedLorries.size();
        Lorry temp = null;
        for (int i = 0 ; i < n; i++ ) {
            for (int j = 1; j < (n-i); j++) {          
                if (tollPrice(tollBoardedLorries.get(j-1)) > tollPrice(tollBoardedLorries.get(j))) {
                    temp = tollBoardedLorries.get(j-1);
                    tollBoardedLorries.set(j-1,tollBoardedLorries.get(j));
                    tollBoardedLorries.set(j,temp);
                }
            }
        }
        for (Lorry l : tollBoardedLorries) {
            System.out.println("--------------");
            System.out.println("RegNUmber - " +l.getRegNumber());
            System.out.println("TollPrice - "+ tollPrice(l));                        
        }
    }        
    
    // Equals & hashCode
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((regNumber == null) ? 0 : regNumber.hashCode());
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
        Ferry other = (Ferry) obj;
        if (regNumber == null) {
            if (other.regNumber != null)
                return false;
        } else if (regNumber != other.regNumber)
            return false;
        return true;
    }
    
    public String toString() {
        return "\nregNumber : " + this.regNumber + "\nname: " + this.name+ "\nharbourName : " + this.harbourName +
            "\npricePerAxle : " + this.pricePerAxle + "\npricePerTon : " +this.pricePerTon+ "\nmaxWeight : " 
            +this.maxWeight ;
    }
}

