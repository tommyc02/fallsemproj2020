import java.text.DecimalFormat;

/**
 * ------------------------------------------------------
 * File name: Gift.java
 * Project name: Semester Project
 * ------------------------------------------------------
 * Creator's name and Email: Tommy Chandler, chandlert@etsu.edu
 * Course: CSCI 1250-941
 * Creation Date: 11/3/2020
 * ------------------------------------------------------
 */

 /**
 * This class sets up merchandise to be added
 * the shelter's giftshop. 
 * 
 * Date created: 11/11/2020
 * 
 * @author Tommy Chandler
 */
public class Gift 
{
    private String itemName;
    private String descrip;
    private double price;

    /**
     * Constructor for a gift. Consists of a name,
     * description, and price.
     * 
     * Date created: 11/19/2020
     * 
     * @param itemName
     * @param descrip
     * @param price
     */
    public Gift(String itemName, String descrip, double price)
    {
        this.itemName = itemName;
        this.descrip = descrip;
        this.price = price;
        
    } // end Gift

    /**
     * Sets the name of an item.
     * 
     * Date created: 11/19/2020
     * 
     * @param itemName
     */
    public void setItemName(String itemName) 
    {
        this.itemName = itemName;
    
    } // end setItemName

    /**
     * Sets the description of an item.
     * 
     * Date created: 11/19/2020
     * 
     * @param descrip
     */
    public void setDescrip(String descrip) 
    {
        this.descrip = descrip;
    
    } // end setItemName

    /**
     * Sets the price of an item
     * 
     * Date created: 11/19/2020
     * 
     * @param price
     */
    public void setPrice(double price) 
    {
        this.price = price;
    
    } // end setPrice

    /**
     * Gets the name of an item
     * that is later displayed for the user.
     * 
     * Date: 11/19/2020
     * 
     * @return itemName:String - an item's name
     */
    public String getItemName() 
    {
        return itemName;
    
    } // end getItemName

    /**
     * Gets an item's description that
     * will later be displayed to the user.
     * 
     * Date created: 11/19/2020
     * 
     * @return descrip:String - description of an item
     */
    public String getDescrip() 
    {
        return descrip;
    
    } // end getDescrip

    /**
     * Get the price of an item that is
     * to be displayed to the user.
     * 
     * Date created: 11/19/2020
     * 
     * @return price:double - price of an item
     */
    public double getPrice() 
    {
        return price;
    
    } // end getPrice

    /**
     * This gives a template for how an item is
     * displayed in the menu.
     * 
     * Date created: 11/19/2020
     * 
     * @return msg:String - the information for an item.
     */
    public String toString()
    {
        DecimalFormat formatter = new DecimalFormat("$#,##0.00");
        
        String msg = "";

        msg += "\nItem: " + getItemName();
        msg += "\nPrice: " + formatter.format(getPrice());
        msg += "\nDescription: " + getDescrip();

        return msg;
    
    } // end toString

} // end Gift
