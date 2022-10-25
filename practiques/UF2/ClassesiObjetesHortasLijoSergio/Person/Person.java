/*
 * Program.java        19/12/21
 *
 * Crea la clase Person
 *
 * Copyright Sergio Hortas Lijó 2021 <1hiaw.hortaslijosergio@gmail.com>
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */


public class Person {
    
    /** The person's name */
    private String name;
    /** The person's age */
    private int age;
    /** The person's height */
    private double height;
    /** The person's sex. It can be 'M' man or 'W' woman */
    private char sex;
    /** Sets whether the person is married or not */
    private boolean married;
    
    
// CONSTRUCTORS
    
    /*
     * Constructor by default.
     * 
     * @param name the person's name
     */
    public Person() {
        this.married = true;
    }
    
    /*
     * Constructor by default.
     */
    public Person(String name) {
        this.name = name;
    }
    
    /**
     * 
     * Constructor
     * 
     * @param name the person's name
     * @param age thye person's age
     * @param height the person's height
     * @param sex the person's sex
     * @param married true if the person is married, false otherwise
     * 
     */
    
    public Person(String name, int age, double height, char sex, boolean married) {
        this.name = name;
        this.setAge(age);
        this.height = height;
        this.sex = sex;
        this.married = married;
    }
    
    
    /**
     * Getters y setters
     */
    
    /**
     * Gets the personn name
     * 
     * @return the person name
     */
    
    public String getName() {
        return this.name;
    }
    
    /**
     * Set the personn name
     * 
     * @return the person name
     */
    
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Gets the personn age
     * 
     * @return the person name
     */
    
    public int getAge() {
        return age;
    }
       /**
     * Set the person age
     * 
     * @return the person name
     */
    
    public void setAge(int age) {
        if (age >= 0)
        this.age = age;
    }
    
    /**
     * Gets the personn name
     * 
     * @return the person name
     */
    
    public double getHeight() {
        return this.height;
    }
    
    /**
     * Sets the personn name
     * 
     * @return the person name
     */
    
    public void setHeight(double height) {
        this.height = height;
    }
    
    /**
     * Gets the personn name
     * 
     * @return the person name
     */
    
    public char getSex() {
        return this.sex;
    }
 
    /**
     * Set the person age
     * 
     * @return the person name
     */
    
    public void setSex(char sex) {
        if (sex == 'H' || sex == 'M')
        this.sex = sex;
    }
    
    /**
     * Gets the personn name
     * 
     * @return the person name
     */
    
    public boolean getMarried() {
        return this.married;
    }
 
    /**
     * Set the person age
     * 
     * @return the person name
     */
    
    public void setMarried(boolean married) {        
        this.married = married;
    }
    
    // --------  MORE METHODS -----------
    
    /*
     * IS MARRIED
     * 
     */
    public boolean isMarried() {
        return this.married;
    }
    
    // Birthday, suma uno a la edad
    
    public void birthday() {
        this.age++;
    }
    
    /*
     * 
     * Textual representation of the object
     * 
     */
    
    public String toString() {
        String s = "El meu nom es " + this.name + " y soy " + this.sex;
        return s;
    }
}

