package second_chapter.di;

import java.util.LinkedHashMap;
import java.util.Map;

public class RussianAlphabet implements Alphabet {
    private static final Map<Integer, String> ALPHABET;

    static {
        ALPHABET = new LinkedHashMap<>();
        ALPHABET.put(1, "А");
        ALPHABET.put(2, "Б");
        ALPHABET.put(3, "В");
        ALPHABET.put(4, "Г");
        ALPHABET.put(5, "Д");
    }

    private RussianAlphabet() {

    }

    static RussianAlphabet newInstance() {
        return new RussianAlphabet();
    }

    @Override
    public Map<Integer, String> getAlphabet() {
        return ALPHABET;
    }
}
