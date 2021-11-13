package ui;
import java.util.*;
import entity.MenuItem;
import entity.Promotion;
import manager.OrderManager;
import manager.DatabaseManager;
import database.Menu;
import database.TableList;
import entity.Table;

public class OrderUI {

    public static void createOrder(){
        
        Menu menu = (Menu) DatabaseManager.fileRead("menu.bin"); 
        TableList tableList = (TableList) DatabaseManager.fileRead("table.bin");      
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        int selection = 0;
        MenuItem menuItem;
        Promotion promotion;
        ArrayList<MenuItem> menuItemArray = new ArrayList<MenuItem>();
        ArrayList<Promotion> promotionArray = new ArrayList<Promotion>();

        System.out.println("Input table number:");
        int tableNumber = sc.nextInt();
        sc.nextLine();
        int customerPhoneNumber = tableList.getTableList().get(tableNumber).getPhoneNumber();
        boolean isMember = tableList.getTableList().get(tableNumber).isIsMember();

        //havent't add price etc.
        
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
                        OrderManager.orderMenuItemPrintNamePrice(menuItemArray);
                        if(menuItemArray.size() == 0)break; //If no menu item break here
                        System.out.println("Choose menu item to remove from your order:");
                        selection = sc.nextInt();
                        sc.nextLine();
                        menuItem = menuItemArray.remove(selection-1);
                        System.out.println(menuItem.getFoodName() + " removed!");
                        break;
                    case 5: //Remove promotion
                        OrderManager.orderPromotionPrintNamePrice(promotionArray);
                        if(menuItemArray.size() == 0)break; //If no promotion break here
                        System.out.println("Choose promotion to remove from your order:");
                        selection = sc.nextInt();
                        sc.nextLine();
                        promotion = promotionArray.remove(selection-1);
                        System.out.println(promotion.getPromotionName() + " removed!");
                        break;
                    case 6: //Print order
                        OrderManager.orderMenuItemPrintNamePrice(menuItemArray);
                        System.out.println();
                        OrderManager.orderPromotionPrintNamePrice(promotionArray);
                        break;
                    case 7: //Insert in salesReport database
                        //Maywwwwwbe orderArray.add(this) or smth?
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
}
