import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializer {
    ObjectOutputStream serializer;

    public Serializer(String filename) throws FileNotFoundException, IOException {
        serializer = new ObjectOutputStream(new FileOutputStream(filename));
    }

    public void serialize(Object o) throws IOException {
        serializer.writeObject(o);
    }

    public void closeSerializer() throws IOException {
        serializer.close();
    }
}