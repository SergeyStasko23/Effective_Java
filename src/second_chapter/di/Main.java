package second_chapter.di;

public class Main {
    public static void main(String[] args) {
        SpellChecker russianSpellChecker = new SpellChecker(RussianAlphabet.newInstance());
        russianSpellChecker.print();

        SpellChecker englishSpellChecker = new SpellChecker(EnglishAlphabet.newInstance());
        englishSpellChecker.print();
    }
}
