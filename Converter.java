import java.util.ArrayList;
import java.util.List;

public class Converter {


    public List<String> arrayToList(String[] array) {

        List<String> words = new ArrayList<>();

        for (String word : array){
            words.add(word);
        }

        return words;
    }

}
