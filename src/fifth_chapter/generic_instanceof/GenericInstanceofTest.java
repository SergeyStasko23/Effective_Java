package fifth_chapter.generic_instanceof;

import java.util.HashSet;
import java.util.Set;

public class GenericInstanceofTest {
    public static void main(String[] args) {
        Set<? extends Number> set = new HashSet<>();
        if (checkInstance(set)) {
            System.out.println("IT'S HASH SET");
        } else {
            System.out.println("IT'S NOT HASH SET");
        }
    }

    // Корректное применение несформированного типа - оператор instanceof
    private static boolean checkInstance(Set o) {
        if (o instanceof HashSet) {
            Set<?> set = o;
            return true;
        }
        return false;
    }
}
