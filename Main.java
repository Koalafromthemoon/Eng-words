import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Converter converter = new Converter();
        Reader reader = new Reader();
        Game game = new Game();

        String text = reader.read();
        String[] array = text.split("\n");
        List<String> lines = converter.arrayToList(array);

        game.start(lines);
    }
}