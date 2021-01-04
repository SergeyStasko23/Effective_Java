package second_chapter.di;

import java.util.LinkedHashMap;
import java.util.Map;

public class EnglishAlphabet implements Alphabet {
    private static final Map<Integer, String> ALPHABET;

    static {
        ALPHABET = new LinkedHashMap<>();
        ALPHABET.put(1, "A");
        ALPHABET.put(2, "B");
        ALPHABET.put(3, "C");
        ALPHABET.put(4, "D");
        ALPHABET.put(5, "E");
    }

    private EnglishAlphabet() {

    }

    static EnglishAlphabet newInstance() {
        return new EnglishAlphabet();
    }

    @Override
    public Map<Integer, String> getAlphabet() {
        return ALPHABET;
    }
}
