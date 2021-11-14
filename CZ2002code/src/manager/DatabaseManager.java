package manager;
import java.io.*;
/**
 * @author Sahaj
 * @version 1.1
 * @since 2021-10-22
*/
public class DatabaseManager {

    
    /** 
     * this writes instances of the class into the database
     * @param object
     * @param fileName
     */
    public static void fileWrite(Object object, String fileName) {//general write method
		try {	
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fileName));
			os.writeObject(object);
			os.close();
		} catch (FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}
	}

	
    /** 
     * this reads instances of the class from the database
     * @param Object(
     * @return Object
     */
    public static Object fileRead(String fileName) {//general read method
		Object object = new Object();
        try{
            ObjectInputStream is = new ObjectInputStream(new FileInputStream(fileName));
            object = is.readObject();
            is.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            System.out.println("No menu found. Creating new menu...");
        }
        return object;
	}

    
    
}
