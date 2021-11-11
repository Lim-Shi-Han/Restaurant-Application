package order;
import menu.*;
import java.util.*;

public class Order {
    private ArrayList<MenuItem> menuItemArray = new ArrayList<>();
	private ArrayList<Promotion> promotionArray = new ArrayList<>();
    String customerName;
    String staffName;
    int tableNumber;
    double totalPrice;
    Calendar date;

    Order(Menu menu){
        
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        int selection = 0;
        MenuItem menuItem;
        Promotion promotion;
        
        do{
            try{
                System.out.println("(1) Print Menu\n"
                                + "(2) Add Menu Item\n"
                                + "(3) Add Promotion\n"
                                + "(4) Remove Menu Item\n"
                                + "(5) Remove Promotion\n"
                                + "(6) View Order\n"
                                + "(7) Submit Order\n"
                                + "(8) Cancel Order\n"
                                + "Enter the number of your choice: ");
                choice = sc.nextInt();
                sc.nextLine();
                
                switch(choice){
                    case 1: //Print menu
                        MenuDisplay.menuPrintName(menu);
                        break;
                    case 2: //Add menu item
                        MenuDisplay.menuItemPrintName(menu);
                        System.out.println("Choose menu item to add to your order:");
                        selection = sc.nextInt();
                        sc.nextLine();
                        menuItem = menu.getMenuItemArray().get(selection-1);
                        menuItemArray.add(menuItem);
                        System.out.println(menuItem.getFoodName() + " added to your order!");
                        break;
                    case 3: //Add promotion
                        MenuDisplay.promotionPrintName(menu);
                        System.out.println("Choose promotion to add to your order:");
                        selection = sc.nextInt();
                        sc.nextLine();
                        promotion = menu.getPromotionArray().get(selection-1);
                        promotionArray.add(promotion);
                        System.out.println(promotion.getPromotionName() + " added to your order!");
                        break;
                    case 4: //Remove menu item
                        orderMenuItemPrintNamePrice();
                        if(menuItemArray.size() == 0)break; //If no menu item break here
                        System.out.println("Choose menu item to remove from your order:");
                        selection = sc.nextInt();
                        sc.nextLine();
                        menuItem = menuItemArray.remove(selection-1);
                        System.out.println(menuItem.getFoodName() + " removed!");
                        break;
                    case 5: //Remove promotion
                        orderPromotionPrintNamePrice();
                        if(menuItemArray.size() == 0)break; //If no promotion break here
                        System.out.println("Choose promotion to remove from your order:");
                        selection = sc.nextInt();
                        sc.nextLine();
                        promotion = promotionArray.remove(selection-1);
                        System.out.println(promotion.getPromotionName() + " removed!");
                        break;
                    case 6: //Print order
                        orderMenuItemPrintNamePrice();
                        System.out.println();
                        orderPromotionPrintNamePrice();
                        break;
                    case 7: //Insert in salesReport database
                        //Maybe orderArray.add(this) or smth?
                        break;
                    case 8:
                        break;
                    default:
                        System.out.println("Input is out of range. Please try again...");
                }
            }catch(InputMismatchException e){
				System.out.println("Invalid choice (not an integer). Please try again...");
				if(sc.hasNextLine())sc.nextLine();
			}
        }while (choice != 8);
    }

    public void orderMenuItemPrintNamePrice(){
        if(menuItemArray.size() == 0){
            System.out.println("You have no menu item in your order!");
            return;
        }
        int menuItemArraySize = menuItemArray.size();
		System.out.println("List of menu item in your order");
		for(int i = 0; i < menuItemArraySize; i++) {
			System.out.format("%-10d%-50s%16.2f\n",(i+1), menuItemArray.get(i).getFoodName(), menuItemArray.get(i).getFoodPrice());
		}
    }

    public void orderPromotionPrintNamePrice(){
        if(promotionArray.size() == 0){
            System.out.println("You have no promotion in your order!");
            return;
        }
        int promotionArraySize = promotionArray.size();
		System.out.println("List of promotion in your order");
		for(int i = 0; i < promotionArraySize; i++) {
			System.out.format("%-10d%-50s%16.2f\n",(i+1), promotionArray.get(i).getPromotionName(), promotionArray.get(i).getPromotionPrice());
		}
    }
    
    public Calendar getDate() {
        return this.date;
    }

    public double getTotalPrice() {
        return this.totalPrice;
    }

    public ArrayList<MenuItem> getMenuItemArray() {
        return this.menuItemArray;
    }

    public ArrayList<Promotion> getPromotionArray() {
        return this.promotionArray;
    }
}
