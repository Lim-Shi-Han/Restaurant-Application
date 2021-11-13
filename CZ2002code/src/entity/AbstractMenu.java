package entity;

abstract class AbstractMenu {
    private String name;
    private String description;
    private double price;
    
    /*
    public AbstractMenu(String name, String description, double price){
        this.name = name;
        this.description = description;
        this.price = price;
    }
    */
    
    public abstract void setName(String name);
    public abstract void setDescription(String description);
    public abstract void setPrice(double price);

}
