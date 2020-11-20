import java.text.DecimalFormat;

/**
 * ------------------------------------------------------
 * File name: Animal.java
 * Project name: Semester Project
 * ------------------------------------------------------
 * Creator's name and Email: Tommy Chandler, chandlert@etsu.edu
 * Course: CSCI 1250-941
 * Creation Date: 11/3/2020
 * ------------------------------------------------------
 */

 /**
 * This class sets up an animal to be added to
 * the shelter. 
 * 
 * Date created: 11/11/2020
 * 
 * @author Tommy Chandler
 */
public class Animal 
{
    private String name;
    private String breed;
    private String animalType;    // ex: dog, cat, lizard, etc.
    private int age;
    private double price;


    /**
     * Creates an animal, with a specific set
     * of information.
     * 
     * Date created: 11/17/2020
     * 
     * @param name
     * @param breed
     * @param animalType
     * @param age
     * @param price
     */
    public Animal(String name, String breed, String animalType, int age, double price)
    {
        this.name = name;
        this.breed = breed;
        this.animalType = animalType;
        this.age = age;
        this.price = price;

    } // end Animal

    /**
     * Sets an animal's name.
     * 
     * Date created: 11/17/2020
     * 
     * @param name
     */
    public void setName(String name)
    {
        this.name = name;
    
    } // end setName

    /**
     * Sets the breed of an animal.
     * 
     * Date created: 11/17/2020
     * 
     * @param breed
     */
    public void setBreed(String breed) 
    {
        this.breed = breed;
    
    } // end setBreed

    /**
     * Sets the type of animal.
     * 
     * Date created: 11/17/2020
     * 
     * @param animalType
     */
    public void setAnimalType(String animalType) 
    {
        this.animalType = animalType;
    
    } // end setAnimalType

    /**
     * Sets the age of an animal.
     * 
     * Date created: 11/17/2020
     * 
     * @param age
     */
    public void setAge(int age)
    {
        this.age = age;
    
    } // end setAge

    /**
     * Sets the price of an animal.
     * 
     * 
     * Date created: 11/17/2020
     * 
     * @param price
     */
    public void setPrice(double price) 
    {
        this.price = price;
    
    } // end setPrice

    /**
     * Displays the name of an animal.
     * 
     * Date created: 11/17/2020
     * 
     * @return name:String - the animal's name 
     */
    public String getName() 
    {
        return name;
    
    } // end getName

    /**
     * Displays the breed of an animal.
     * 
     * Date created: 11/17/2020
     * 
     * @return breed:String - the animal's breed
     */
    public String getBreed() 
    {
        return breed;
    
    } // end getBreed

    /**
     * Displays the type of an animal.
     * 
     * Date created: 11/17/2020
     * 
     * @return animalType - the animal's type (dog, cat, etc.)
     */
    public String getAnimalType() 
    {
        return animalType;
    
    } // end getAnimalType

    /**
     * Displays the age of an animal.
     * 
     * Date created: 11/17/2020
     * 
     * @return age:int - animal's age
     */
    public int getAge() 
    {
        return age;
    
    } // end getAge

    /**
     * Displays the price of an animal.
     * 
     * Date created: 11/17/2020
     * 
     * @return price:double - the price of an animal
     */
    public double getPrice() 
    {
        return price;
    
    } // end getPrice

    /**
     * This toString displays information about a specific animal
     * to the user.
     * 
     * Date created: 11/17/2020
     * 
     * @return msg:String - a list of details about an animal.
     */
    public String toString()
    {
        DecimalFormat formatter = new DecimalFormat("$#,##0.00");
        
        String msg = "";

        msg += getName() + " the " + getAnimalType();
        msg += "\nBreed: " + getBreed();
        msg += "\nAge: " + getAge();
        msg += "\nPrice: " + formatter.format(getPrice());



        return msg;
    
    } // end toString



} // end Animal
