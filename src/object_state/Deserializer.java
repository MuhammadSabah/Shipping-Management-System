package object_state;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;

public class Deserializer {
    private ObjectInputStream deserializer;

    public Deserializer(String filename) throws FileNotFoundException, IOException {
        deserializer = new ObjectInputStream(new FileInputStream(filename));
    }

    public HashMap deserialize() throws ClassNotFoundException, IOException {
        return (HashMap) deserializer.readObject();
    }

    public void closeDeserializer() throws IOException {
        deserializer.close();
    }
}
