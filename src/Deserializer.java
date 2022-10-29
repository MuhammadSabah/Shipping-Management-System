import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserializer {
    private ObjectInputStream deserializer;

    public Deserializer(String filename) throws FileNotFoundException, IOException {
        deserializer = new ObjectInputStream(new FileInputStream(filename));
    }

    public Object deserialize() throws ClassNotFoundException, IOException {
        return (Object) deserializer.readObject();
    }

    public void closeDeserializer() throws IOException {
        deserializer.close();
    }
}
