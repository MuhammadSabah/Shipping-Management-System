package controller.server;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataController<T> {
    String path;

    public DataController(String path) {
        this.path = path;
    }

    public List<T> openList() {
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

    //
    public Map<String, List<T>> openMap() {
        Map<String, List<T>> map = new HashMap<>();
        try {
            FileInputStream fileIn = new FileInputStream(path);
            ObjectInputStream objIn = new ObjectInputStream(fileIn);
            map = (Map<String, List<T>>) objIn.readObject();
            fileIn.close();
            objIn.close();

        } catch (FileNotFoundException e) {
            System.err.println("Error" + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error" + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Error" + e.getMessage());
        }
        return map;
    }

    public boolean saveMapToFile(Map<String, List<T>> map) {
        try {
            FileOutputStream fileOut = new FileOutputStream(path);
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(map);
            System.out.println("---- Map Saved to File ----");
            objOut.close();
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
