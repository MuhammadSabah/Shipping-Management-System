package pre_jdbc;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataController<T> {
    String path;

    public DataController(String path) {
        this.path = path;
    }

    public List<T> getList() {
        List<T> list = new ArrayList<>();
        try {
            FileInputStream fileIn = new FileInputStream(path);
            ObjectInputStream objIn = new ObjectInputStream(fileIn);
            list = (List<T>) objIn.readObject();

            fileIn.close();
            objIn.close();
        } catch (FileNotFoundException e) {
            System.err.println("Error" + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error" + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Error" + e.getMessage());
        }
        return list;
    }

    public boolean saveListToFile(List<T> items) {
        try {
            FileOutputStream fileOut = new FileOutputStream(path);
            ObjectOutputStream objIn = new ObjectOutputStream(fileOut);
            objIn.writeObject(items);
            System.out.println("---- List Saved to File ----");
            objIn.close();
            fileOut.close();

        } catch (FileNotFoundException e) {
            System.err.println("File not found" + e.getMessage());
            return false;
        } catch (IOException e) {
            System.err.println("Error with streams" + e.getMessage());
            return false;
        }
        return true;
    }
}
