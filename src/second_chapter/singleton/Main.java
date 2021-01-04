package second_chapter.singleton;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ElvisClass> elvisClassList =
                Arrays.asList(ElvisClass.getInstance(), ElvisClass.getInstance(), ElvisClass.getInstance());
        System.out.println(checkObjectsAreSingletons(elvisClassList, ElvisClass.getInstance()));

        List<ElvisEnum> elvisEnumList =
                Arrays.asList(ElvisEnum.INSTANCE, ElvisEnum.INSTANCE, ElvisEnum.INSTANCE);
        System.out.println(checkObjectsAreSingletons(elvisEnumList, ElvisEnum.INSTANCE));
    }

    private static boolean checkObjectsAreSingletons(List<? extends Singleton> objects, Singleton singleton) {
        return objects.stream().allMatch(o -> o.equals(singleton));
    }
}
