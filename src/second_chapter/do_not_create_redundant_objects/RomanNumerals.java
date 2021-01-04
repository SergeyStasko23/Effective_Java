package second_chapter.do_not_create_redundant_objects;

import java.util.regex.Pattern;

class RomanNumerals {
    // Повторное использование дорогостоящего объекта для повышения производительности
    private static final Pattern ROMAN = Pattern.compile(
            "^M{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$"
    );

    static boolean isRomanNumeral(String s) {
        return ROMAN.matcher(s).matches();
    }
}
