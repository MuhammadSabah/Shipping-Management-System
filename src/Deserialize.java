import ser.Deserializer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Deserialize {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Deserializer deserializer = new Deserializer("storage\\data.ser");
        HashMap<String, ArrayList> stateData = new HashMap<>();
        stateData = deserializer.deserialize();
        deserializer.closeDeserializer();
        System.out.println(stateData.values());
    }
}
