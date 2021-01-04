package second_chapter.builder_pattern_2;

import static second_chapter.builder_pattern_2.Pizza.Size.MEDIUM;
import static second_chapter.builder_pattern_2.Pizza.Size.SMALL;
import static second_chapter.builder_pattern_2.Pizza.Topping.ONION;
import static second_chapter.builder_pattern_2.Pizza.Topping.SAUSAGE;

public class Main {
    public static void main(String[] args) {
        NewYorkPizza newYorkPizza = new NewYorkPizza
                .Builder(SMALL).addTopping(SAUSAGE).addTopping(ONION).build();

        MiamiPizza miamiPizza = new MiamiPizza
                .Builder(MEDIUM).sauceInside().build();

        System.out.println(newYorkPizza);
        System.out.println(miamiPizza);
    }
}
