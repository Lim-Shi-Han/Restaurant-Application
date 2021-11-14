package manager;
import java.io.*;
/**
 * This class contains methods that aid in the read/write of .bin files
 * @author Sahaj
 * @version 1.1
 * @since 2021-10-22
*/
public class DatabaseManager {

    
    /** 
     * This method writes instances of the class into the database
     * @param object name of class instance to be written into file
     * @param fileName file in which it is being written into
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
     * This method reads instances of the class from the database
     * @param fileName name of file to be read from
     * @return object name of object to be read into
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
