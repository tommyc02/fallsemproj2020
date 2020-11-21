import javax.swing.JOptionPane;

/**
 * ------------------------------------------------------
 * File name: AdoptionDriver.java
 * Project name: Semester Project
 * ------------------------------------------------------
 * Creator's name and Email: Tommy Chandler, chandlert@etsu.edu
 * Course: CSCI 1250-941
 * Creation Date: 11/3/2020
 * ------------------------------------------------------
 */

 /**
 * This driver for the Adoption simulator contains 
 * a main method that displays a menu of options the user can 
 * choose from. This includes viewing and adopting animals.
 * 
 * 
 * Date created: 11/11/2020
 * 
 * @author Tommy Chandler
 */
public class AdoptionDriver
{
    private static Shelter shelter;
    
    public static void main(String[] args) 
    {
        shelter = new Shelter("787 Windy Ln, Johnson City, TN 37614", "423-989-6201");
        shelter.populateShelter();
        shelter.stockStore();

        int menuOptionChoice;
            
        do                                     // loops the menu until the cancel option is selected
        {
            menuOptionChoice = disMenu();
            mainMenuSelect(menuOptionChoice);

        }while(menuOptionChoice != 0);        

        System.exit(0);


    } // end main

/**
 * The display menu for the program. Allows for
 * user input. The menu takes the option selected
 * and returns it so the selection can be chosen.
 * 
 * Date created: 11/11/2020
 * 
 * @return option:int - the selected menu option
 */
    public static int disMenu()
    {
        String input;                  // This holds the input the user gives.

        input = JOptionPane.showInputDialog("                 |            Welcome to Astro Animal Shelter!             |" +
            "\n====================================================\nThese are our current options:     " +
            "\n\n| -----------------$ Shopping $-----------------                                       " +
            "\n|\n| 1. Choose an Animal.                                                                " +
            "\n| 2. View the Animals!                                                                   " +
            "\n| 3. Purchase something from our Gift Shop!                                              " +
            "\n| 4. View our Gift Shop items.                                                           " +
            "\n|\n| -----------------♥ Info/More ♥----------------                                       " +
            "\n|\n| 5. View our Shelter Information.                                                    " +
            "\n| 6. View a random fact about our animals!                                               " +
            "\n|\n| ----------------✿ Checkout ✿----------------                                       " +
            "\n|\n| 7. View Selected Pets/Accessories.                                                  " +
            "\n| 8. Take your new pet(s) and/or item(s) home! (Checkout)                                " +
            "\n|\n| -----------------⇤⇥ Exit ⇤⇥-----------------                                      " +
            "\n| 0. Exit                                                                                " +
            "\n=====================================================                                    " +
            "\nPlease select a menu option shown:");

        int option = Integer.parseInt(input);
    

        while(option < 0 || option > 8)     // this prevents invalid input
        {
            JOptionPane.showMessageDialog(null, "Please select a VALID Option.", "Uh oh!", JOptionPane.WARNING_MESSAGE);

            input = JOptionPane.showInputDialog("                 |            Welcome to Astro Animal Shelter!             |" +
                "\n====================================================\nThese are our current options:     " +
                "\n\n| -----------------$ Shopping $-----------------                                       " +
                "\n|\n| 1. Choose an Animal.                                                                " +
                "\n| 2. View the Animals!                                                                   " +
                "\n| 3. Purchase something from our Gift Shop!                                              " +
                "\n| 4. View our Gift Shop items.                                                           " +
                "\n|\n| -----------------♥ Info/More ♥----------------                                       " +
                "\n|\n| 5. View our Shelter Information.                                                    " +
                "\n| 6. View a random fact about our animals!                                               " +
                "\n|\n| ----------------✿ Checkout ✿----------------                                       " +
                "\n|\n| 7. View Selected Pets/Accessories.                                                  " +
                "\n| 8. Take your new pet(s) and/or item(s) home! (Checkout)                                " +
                "\n|\n| -----------------⇤⇥ Exit ⇤⇥-----------------                                      " +
                "\n| 0. Exit                                                                                " +
                "\n=====================================================                                    " +
                "\nPlease select a menu option shown:");

            option = Integer.parseInt(input);
        }
        
        return option;
    
    } // end disMenu

    /**
     * Takes the selection from the main method
     * and goes to the selected choice.
     * 
     * Date created: 11/11/2020
     * 
     * @param menuOptionChoice
     */
    public static void mainMenuSelect(int menuOptionChoice)
    {
        switch(menuOptionChoice)
        {
            case 1:
                shelter.chooseAnimal();
                break;
            
            case 2:
                shelter.viewAnimals();   
                break;
            
            case 3:
                shelter.addGift();
                break;
            
            case 4:
                shelter.viewGifts();
                break;
            
            case 5:
                JOptionPane.showMessageDialog(null, shelter.toString(), "Shelter Information", JOptionPane.PLAIN_MESSAGE);
                break;
            
            case 6:
                shelter.randomFact();
                break;    
            
            case 7:
                shelter.viewCart();
                break;

            case 8:
                shelter.checkOut();
                break;
            
            default:
                JOptionPane.showMessageDialog(null, "Thank you for coming to Astro Animal Shelter!", "Goodbye!", JOptionPane.PLAIN_MESSAGE);;
                break;
        
        }
    
    } // end mainMenuSelect



} // end AdoptionDriver