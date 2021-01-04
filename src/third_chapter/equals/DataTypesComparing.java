package third_chapter.equals;

import third_chapter.PhoneNumber;

import java.util.Arrays;
import java.util.Objects;

public class DataTypesComparing {
    public static void main(String[] args) {
        System.out.println("Сравнение примитивов через '=='");
        System.out.println(1 == 1);
        System.out.println(1L == 1L);
        System.out.println((short) 1 == (short) 1);
        System.out.println();

        System.out.println("Не использовать equals(), т.к. выполняется автоматическая упаковка");
        System.out.println(Float.compare(1.01F, 1.01F));
        System.out.println(Double.compare(1.01, 1.01));
        System.out.println();

        System.out.println("Сравнение массивов");
        System.out.println(Arrays.equals(new int[]{1, 2, 3}, new int[]{1, 2, 3}));
        System.out.println(Arrays.equals(new int[]{6, 6, 6}, new int[]{6, 6, 7}));
        System.out.println();

        System.out.println("Сравнение ссылок на объекты, которые могут содержать null");
        System.out.println(
                Objects.equals(null, null)
        );
        System.out.println(
                Objects.equals(new PhoneNumber("1", "1"), null)
        );
    }
}
