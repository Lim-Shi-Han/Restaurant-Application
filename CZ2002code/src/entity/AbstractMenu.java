package entity;

import java.io.Serializable;
/**
 * This abstract class stores all the common attributes and methods of MenuItem and Promotion classes
 * @author Xin Kai
 * @version 1.1
 * @since 2021-10-22
 */
abstract class AbstractMenu implements Serializable{
    /**
     * name of food
     */
    private String name;
    /**
     * description of food
     */
    private String description;
    /**
     * price of food
     */
    private double price;
    
    
    public abstract void setName(String name);
    public abstract void setDescription(String description);
    public abstract void setPrice(double price);
    public abstract String getName();
    public abstract String getDescription();
    public abstract double getPrice();

}
