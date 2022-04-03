import java.util.List;
import java.util.Scanner;

public class Game {
    public void start(List<String> lines) {
        Scanner scanner = new Scanner(System.in);
        for (String line : lines){
            String[] words = line.split("-");
            String en = words[0];
            String ru = words[1];

            System.out.println(ru);
            System.out.println("Введите перевод:");
            String input = scanner.next();

            if (en.equals(input)) {
                System.out.println("Верно");
            } else {
                System.out.println("Не верно");
            }
        }
    }
}
