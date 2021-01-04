package third_chapter.equals;

import third_chapter.PhoneNumber;

public class EqualsAndCompareTest {
    public static void main(String[] args) {
        PhoneNumber pn1 = new PhoneNumber("89996667766", "Bob");
        PhoneNumber pn2 = new PhoneNumber("89996667766", "Bob");
        PhoneNumber pn3 = new PhoneNumber("89996667766", "Bob");

        comparingTest(pn1, pn2, pn3);
        equalsTest(pn1, pn2, pn3);
    }

    private static void comparingTest(PhoneNumber pn1, PhoneNumber pn2, PhoneNumber pn3) {
        System.out.println("Рефлексивность (0, 0, 0)");
        System.out.println(pn1.compareTo(pn1));
        System.out.println(pn2.compareTo(pn2));
        System.out.println(pn3.compareTo(pn3));
        System.out.println();

        System.out.println("Симметричность (0, 0)");
        System.out.println(pn1.compareTo(pn2));
        System.out.println(pn2.compareTo(pn1));
        System.out.println();

        System.out.println("Транзитивность (0, 0, 0)");
        System.out.println(pn1.compareTo(pn2));
        System.out.println(pn2.compareTo(pn3));
        System.out.println(pn1.compareTo(pn3));
        System.out.println();

        System.out.println("Непротиворечивость (всегда должно возвращаться одинаковое значение)");
        System.out.println(pn1.compareTo(pn2));
        System.out.println(pn1.compareTo(pn2));
        System.out.println(pn1.compareTo(pn2));
        System.out.println();
    }

    private static void equalsTest(PhoneNumber pn1, PhoneNumber pn2, PhoneNumber pn3) {
        System.out.println("Рефлексивность (true, true, true)");
        System.out.println(pn1.equals(pn1));
        System.out.println(pn2.equals(pn2));
        System.out.println(pn3.equals(pn3));
        System.out.println();

        System.out.println("Симметричность (true, true)");
        System.out.println(pn1.equals(pn2));
        System.out.println(pn2.equals(pn1));
        System.out.println();

        System.out.println("Транзитивность (true, true, true)");
        System.out.println(pn1.equals(pn2));
        System.out.println(pn2.equals(pn3));
        System.out.println(pn1.equals(pn3));
        System.out.println();

        System.out.println("Непротиворечивость (всегда должно возвращаться одинаковое значение)");
        System.out.println(pn1.equals(pn2));
        System.out.println(pn1.equals(pn2));
        System.out.println(pn1.equals(pn2));
        System.out.println();

        System.out.println("Ненулевая (false, false, false)");
        System.out.println(pn1.equals(null));
        System.out.println(pn2.equals(null));
        System.out.println(pn3.equals(null));
        System.out.println();
    }
}
