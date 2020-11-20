import java.util.ArrayList;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * ------------------------------------------------------
 * File name: Shelter.java
 * Project name: Semester Project
 * ------------------------------------------------------
 * Creator's name and Email: Tommy Chandler, chandlert@etsu.edu
 * Course: CSCI 1250-941
 * Creation Date: 11/3/2020
 * ------------------------------------------------------
 */

 /**
 * The Shelter class sets up an animal shelter for animals
 * to be stored in. It consists of 2 collections, one for animals
 * in the shelter, and one for animals selected for adoption.
 * 
 * Date created: 11/17/2020
 * 
 * @author Tommy Chandler
 */
public class Shelter 
{
    private String address;
    private String phoneNumber;
    private ArrayList<Animal> animals;
    private ArrayList<Animal> animalCart;
    private ArrayList<Gift> gifts;
    private ArrayList<Gift> giftCart;

    /**
     * Constructor for an Animal Shelter.
     * contains an address and a phone number.
     * Creates 4 collections for animals, gifts, and 2 carts.
     * 
     * Date created: 11/17/2020
     * 
     * @param address
     * @param phoneNumber
     */
    public Shelter(String address, String phoneNumber)
    {
        this.address = address;
        this.phoneNumber = phoneNumber;

        animals = new ArrayList<>();
        animalCart = new ArrayList<>();
        gifts = new ArrayList<>();
        giftCart = new ArrayList<>();
    
    } // end Shelter

    /**
     * Sets the address of the animal
     * shelter.
     * 
     * Date created: 11/17/2020
     * 
     * @param address
     */
    public void setAddress(String address) 
    {
        this.address = address;       
    
    } // end setAddress

    /**
     * Sets the phone number of the animal
     * shelter.
     * 
     * Date created: 11/17/2020
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) 
    {
        this.phoneNumber = phoneNumber;
    
    } // end setPhoneNumber

    /**
     * This retrieves the address of the animal
     * shelter and returns it.
     * 
     * Date created: 11/17/2020
     * 
     * @return address:String - the address of the animal shelter
     */
    public String getAddress() 
    {
        return address;
    
    } // end getAddress

    /**
     * This retrieves the phone number of the 
     * animal shelter and returns it.
     * 
     * Date created: 11/17/2020
     * 
     * @return phoneNumber:String - the animal shelter's phone number
     */
    public String getPhoneNumber() 
    {
        return phoneNumber;
    
    } // end getPhoneNumber

    /**
     * This method creates many different animals
     * and adds them to the animals collection.
     * These will then be displayed in the driver menu later.
     * 
     * Date created: 11/17/2020
     */
    public void populateShelter()
    {
        Animal animal1 = new Animal("Connor", "Tree Frog", "Frog", 4, 100);
        Animal animal2 = new Animal("Crista", "Common Possum", "Possum", 7, 95);
        Animal animal3 = new Animal("Elliot", "Tabby", "Cat", 6, 80);
        Animal animal4 = new Animal("Arihant", "Emperor Penguin", "Penguin", 1, 200);
        Animal animal5 = new Animal("Sonic", "Desert Hedgehog", "Hedgehog", 3, 120);
        Animal animal6 = new Animal("Almond", "Shih Tzu/Yorkie Mix", "Dog", 5, 75);

        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);
        animals.add(animal4);
        animals.add(animal5);
        animals.add(animal6);
    
    } // end populateShelter

    /**
     * This allows the user to choose an animal
     * to add to their animal checkout list.
     * The animal is then removed from the display, as
     * it is now with the user.
     * 
     * Date created: 11/17/2020
     */
    public void chooseAnimal()
    {
        int i = 0;

        String msg = "Which adorable animal caught your eye?";
        msg += "\n==========================";
        
        for(i = 0; i < animals.size(); i++)
        {
            msg += "\n" + (i + 1) + ". " + animals.get(i).toString();
            msg += "\n===========================";
        }
    
        String input = JOptionPane.showInputDialog(msg);
        int choice = Integer.parseInt(input);
        
        while(choice < 1 || choice > i)
        {
            JOptionPane.showMessageDialog(null, "Please select a VALID Option.", "Uh oh!", JOptionPane.WARNING_MESSAGE);
            input = JOptionPane.showInputDialog(msg);
            choice = Integer.parseInt(input);
        }
        
        JOptionPane.showMessageDialog(null, "Your new pet is ready to be checked out!", "Yay!", JOptionPane.PLAIN_MESSAGE);
        
        animalCart.add(animals.get(choice - 1));
        animals.remove(animals.get(choice - 1));
    
    } // end chooseAnimal
    
    /**
     * This allows the user to view a list of
     * available animals without input. This gives
     * a user time to make a decision before adopting.
     * 
     * Date created: 11/17/2020
     */
    public void viewAnimals()
    {
        String msg = "-=-=-=-=-=-= Animals =-=-=-=-=-=-";
        msg += "\n==========================";
        
        for(int i = 0; i < animals.size(); i++)
        {
            msg += "\n" + animals.get(i).toString();
            msg += "\n===========================";
        }
    
        JOptionPane.showMessageDialog(null, msg);

    } // end viewAnimals

    /**
     * Adds items to the gift shop for the
     * user to add to their cart.
     * 
     * Date created: 11/17/2020
     */
    public void StockStore()
    {
        Gift gift1 = new Gift("Collar", "These stylish collars make any animal look precious! (Comes in all Colors!)", 5.00);
        Gift gift2 = new Gift("Squeaky Toy", "They may be irritating to you, but your pets will love them!", 7.00);
        Gift gift3 = new Gift("Food/Water Bowl", "Pets gotta eat, right?", 3.00);
        Gift gift4 = new Gift("Pet Sweater", "Keeps your pet warm in the Winter, guaranteed!", 10.00);
        Gift gift5 = new Gift("Treats", "These come in all varieties for all types of pets!", 2.00);
        Gift gift6 = new Gift("Animal Shampoo", "For your furriest, stinkiest pets.", 6.00);

        gifts.add(gift1);
        gifts.add(gift2);
        gifts.add(gift3);
        gifts.add(gift4);
        gifts.add(gift5);
        gifts.add(gift6);

    } // end StockStore

    
    /**
     * Allows the user to add one or multiple
     * items to their cart for checkout.
     * 
     * Date Created: 11/19/2020
     */
    public void addGift()
    {
        int quantity = 0;
        int i = 0;

        String msg = "Which product(s) interests you?";
        msg += "\n==========================";
        
        for(i = 0; i < gifts.size(); i++)
        {
            msg += "\n" + (i + 1) + ". " + gifts.get(i).toString();
            msg += "\n===========================";
        }
    
        String input = JOptionPane.showInputDialog(msg);
        int choice = Integer.parseInt(input);
        
        while(choice < 1 || choice > i)
        {
            JOptionPane.showMessageDialog(null, "Please select a VALID Option.", "Uh oh!", JOptionPane.WARNING_MESSAGE);
            input = JOptionPane.showInputDialog(msg);
            choice = Integer.parseInt(input);
        }

        input = JOptionPane.showInputDialog("Enter the quantity of the item you want:");
        quantity = Integer.parseInt(input);

        for(int j = 0; j < quantity; j++)
        {
            giftCart.add(gifts.get(choice - 1));
        }
        
        while(quantity < 1)
        {
            input = JOptionPane.showInputDialog("Please enter a VALID amount." + "\nEnter the quantity of the item you want:");
            quantity = Integer.parseInt(input);

            for(int j = 0; j < quantity; j++)
            {
                giftCart.add(gifts.get(choice - 1));
            }

        }


        JOptionPane.showMessageDialog(null, "Your item(s) have been added to the cart!", "Item Added", JOptionPane.PLAIN_MESSAGE);
        
    } // end addGift

    /**
     * Allows the user to view all the gift shop
     * items in stock. Takes the user back to the 
     * main menu when they are done viewing.
     * 
     * Date created: 11/19/2020
     */
    public void viewGifts()
    {
        String msg = "-=-=-=-=-=-= Our Merchandise =-=-=-=-=-=-";
        
        for(int i = 0; i < gifts.size(); i++)
        {
            msg += "\n" + gifts.get(i).toString();
            msg += "\n***********************************";
        }
    
        JOptionPane.showMessageDialog(null, msg);
    
    } // viewGifts

    /**
     * Shows the user all of the items in
     * their cart. Includes prices of each
     * of the pets/items.
     * 
     * Date created: 11/19/2020
     */
    public void viewCart()
    {
        String msg = "Your Pets and/or Accessories:";
        msg += "\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=";

        for(Animal animal : animalCart)
        {
            msg += "\n" + animal.toString();
            msg += "\n===========================";
        }

        for(Gift gifts : giftCart)
        {
            msg += "\n" + gifts.toString();
            msg += "\n===========================";
        }
    
        JOptionPane.showMessageDialog(null, msg, "Your Pets/Items:", JOptionPane.PLAIN_MESSAGE);
    
    } // end viewCart
    
    /**
     * This method calculates what the user will
     * be paying in the end, based on which city (TN or VA)
     * they live in.
     * 
     * Date created: 11/17/2020
     */
    public void checkOut()
    {
        double subtotal = 0;
        double tax = 0;
        double grandTotal = 0;
        String city;
        String input;

        for(Animal animals : animalCart)
        {
            subtotal += animals.getPrice();
        }

        for(Gift gifts : giftCart)
        {
            subtotal += gifts.getPrice();
        }

        input = JOptionPane.showInputDialog("Are you from TN or VA?");
        city = input;

        while(!city.toUpperCase().equals("TN") && !city.toUpperCase().equals("VA"))
        {
            input = JOptionPane.showInputDialog("Please Enter a VALID state (TN or VA):");
            city = input;
        }

        if(city.toUpperCase().equals("TN"))
        {
            tax = subtotal * 0.095;
        }
        else
        {    
            tax = subtotal * 0.046;
        }

        grandTotal = subtotal + tax;

        receipt(subtotal, tax, grandTotal);
        animalCart.removeAll(animalCart);
        giftCart.removeAll(giftCart);
    
    } // end checkOut

    /**
     * The receipt method prints out a summary of the animal(s)
     * and/or item(s) the user adopted.
     * 
     * Date created: 11/17/2020
     * 
     * @param subtotal
     * @param tax
     * @param grandTotal
     */
    public void receipt(double subtotal, double tax, double grandTotal)
    {
        DecimalFormat formatter = new DecimalFormat("##0.00");
        JOptionPane.showMessageDialog(null, "Subtotal: $" + formatter.format(subtotal) + "\nTax: $" + formatter.format(tax) + "\nGrand total: $" 
                        + formatter.format(grandTotal) + "\nPets adopted today: " + animalCart.size() +"\nItems bought today: "
                        + giftCart.size() , "Thank you for adopting today!", JOptionPane.INFORMATION_MESSAGE);
    
    } //end receipt
    
    /**
     * This is a display that shows all the
     * information about the animal shelter.
     * This includes the address and phone number.
     * 
     * Date created: 11/17/2020
     * 
     *  @return msg:String - displays the animal shelter info.
     */
    public String toString()
    {
        String msg = "";

        msg += "--------------ASTRO ANIMAL SHELTER--------------";
        msg += "\n=====================================";
        msg += "\nAddress: " + getAddress();
        msg += "\nPhone Number: " + getPhoneNumber();
        msg += "\n=====================================";
        msg += "\nWe are an Animal Shelter built on the pure love" +
               "\nfor animals. Don't ever hestitate to give us a \ncall if " + 
               "you think an animal may be in trouble!";
        
        return msg;
    
    } // end toString



} // end Shelter
