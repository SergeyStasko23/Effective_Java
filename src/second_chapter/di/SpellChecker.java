package second_chapter.di;

import java.util.Map;
import java.util.Objects;

// Внедрение зависимостей обеспечивает гибкость и тестируемость
class SpellChecker {
    private static final String DOT = ".";
    private static final String COMMA = ", ";

    private final Alphabet alphabet;

    SpellChecker(Alphabet alphabet) {
        this.alphabet = Objects.requireNonNull(alphabet);
    }

    void print() {
        printTitle();
        Map<Integer, String> map = alphabet.getAlphabet();
        map.forEach((k, v) -> printRow(k, v, map.size()));
    }

    private void printTitle() {
        if (alphabet instanceof EnglishAlphabet) {
            System.out.println("ENGLISH");
        }
        if (alphabet instanceof RussianAlphabet) {
            System.out.println("RUSSIAN");
        }
    }

    private void printRow(int itemIndex, String itemValue, int collectionSize) {
        String mark = getPunctuationMarkAfterEveryAlphabetSymbol(collectionSize, itemIndex);
        System.out.print(itemValue + mark);
        if (mark.equals(DOT)) {
            System.out.println();
            System.out.println();
        }
    }

    private String getPunctuationMarkAfterEveryAlphabetSymbol(int collectionSize, int currentIndexOfValue) {
        boolean isLastSymbol = collectionSize == currentIndexOfValue;
        return isLastSymbol ? DOT : COMMA;
    }
}
