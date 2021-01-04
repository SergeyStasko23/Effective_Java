package second_chapter.builder_pattern_1;

public class Main {
    public static void main(String[] args) {
        NutritionFacts nutritionFacts1 = new NutritionFacts.Builder(240, 300)
                .calories(500)
                .build();

        NutritionFacts nutritionFacts2 = new NutritionFacts.Builder(600, 1000)
                .calories(2000)
                .sodium(123)
                .fat(5000)
                .build();

        System.out.println(nutritionFacts1);
        System.out.println(nutritionFacts2);
    }
}
