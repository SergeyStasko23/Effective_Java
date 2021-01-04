package second_chapter.uninstantiation_class;

import exceptions.UtilityException;

// Неинстанцируемый служебный класс
public class UtilityClass {
    // Подавление создания конструктора по умолчанию для достижения неинстанцируемости
    private UtilityClass() {
        throw new UtilityException("You can't create an instance of this class");
    }
}
