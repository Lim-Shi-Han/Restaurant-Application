package manager;
import java.util.*;
import entity.MenuItem;
import entity.Promotion;
/**
 * This class contains methods to handle and print order items
 * @author Anant
 * @version 1.0
 * @since 2021-10-22
*/

public class OrderManager {

    
    /** 
     * This method prints order name and price
     * @param menuItemArray array of menu items to be printed
     */
    public static void orderMenuItemPrintNamePrice(ArrayList<MenuItem> menuItemArray){
        if(menuItemArray.size() == 0){
            System.out.println("You have no menu item in your order!");
            return;
        }
        int menuItemArraySize = menuItemArray.size();
		System.out.println("List of menu item in your order");
		for(int i = 0; i < menuItemArraySize; i++) {
			System.out.format("%-10d%-20s%16.2f\n",(i+1), menuItemArray.get(i).getName(), menuItemArray.get(i).getPrice());
		}
    }

    
    /** 
     * This method prints promotion name and price
     * @param promotionArray array of promotion to be printed
     */
    public static void orderPromotionPrintNamePrice(ArrayList<Promotion> promotionArray){
        if(promotionArray.size() == 0){
            System.out.println("You have no promotion in your order!");
            return;
        }
        int promotionArraySize = promotionArray.size();
		System.out.println("List of promotion in your order");
		for(int i = 0; i < promotionArraySize; i++) {
			System.out.format("%-10d%-50s%16.2f\n",(i+1), promotionArray.get(i).getName(), promotionArray.get(i).getPrice());
		}
    }
}
