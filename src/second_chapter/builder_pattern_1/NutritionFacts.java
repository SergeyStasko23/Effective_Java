package second_chapter.builder_pattern_1;

class NutritionFacts {
    // обязательные
    private final int servingSize;
    private final int servings;

    // необязательные
    private int calories;
    private int fat;
    private int sodium;
    private int carbohydrate;

    static class Builder {
        private NutritionFacts nutritionFacts;

        Builder(int servingSize, int servings) {
            nutritionFacts = new NutritionFacts(servingSize, servings);
        }

        Builder calories(int value) {
            nutritionFacts.setCalories(value);
            return this;
        }

        Builder fat(int value) {
            nutritionFacts.setFat(value);
            return this;
        }

        Builder sodium(int value) {
            nutritionFacts.setSodium(value);
            return this;
        }

        Builder carbohydrate(int value) {
            nutritionFacts.setCarbohydrate(value);
            return this;
        }

        NutritionFacts build() {
            return nutritionFacts;
        }
    }

    private NutritionFacts(int servingSize, int servings) {
        this.servingSize = servingSize;
        this.servings = servings;
    }

    void setCalories(int calories) {
        this.calories = calories;
    }

    void setFat(int fat) {
        this.fat = fat;
    }

    void setSodium(int sodium) {
        this.sodium = sodium;
    }

    void setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    @Override
    public String toString() {
        return "NutritionFacts{" +
                "servingSize=" + servingSize +
                ", servings=" + servings +
                ", calories=" + calories +
                ", fat=" + fat +
                ", sodium=" + sodium +
                ", carbohydrate=" + carbohydrate +
                '}';
    }
}
