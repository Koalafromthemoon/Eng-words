import java.io.FileInputStream;
import java.io.IOException;

public class Reader {
    public String read () throws IOException {
        FileInputStream stream = new FileInputStream("e:/forjava.txt");
        int length = stream.available();
        byte[] data = new byte[length];
        stream.read(data);

        return new String(data);
    }
}
