package manager;
import java.io.*;

public class DatabaseManager {

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
