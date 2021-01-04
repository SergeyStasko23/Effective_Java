package third_chapter.hashcode;

import third_chapter.PhoneNumber;

import java.util.HashMap;
import java.util.Map;

public class HashCodeTest {
    public static void main(String[] args) {
        // Два одинаковых по содержанию объекта
        PhoneNumber instanceForPutting = new PhoneNumber("+79998887766", "Alex");
        PhoneNumber instanceForGetting = new PhoneNumber("+79998887766", "Alex");

        Map<PhoneNumber, String> map = new HashMap<>();
        map.put(instanceForPutting, "Krasnodar");

        /*
           Возвращает null, когда PhoneNumber.hashCode() не переопределён.
           В таком случае два равных экземпляра (instanceForPutting и instanceForGetting) имеют разные hashCodes.
        */
        /*
           Возвращает 'Krasnodar', когда PhoneNumber.hashCode() переопределён.
           В таком случае два равных экземпляра (instanceForPutting и instanceForGetting) имеют одинаковые hashCodes.
        */
        System.out.println(map.get(instanceForGetting));
    }
}
